package DevLewi.Apache_producer.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class WikimediaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msg) {
        // log.info(format("Sending message to wanjohi Topic:: %s", msg));
        kafkaTemplate.send("wikimedia-stream", msg);
    }
}