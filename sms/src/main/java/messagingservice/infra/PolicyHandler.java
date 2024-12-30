package messagingservice.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import messagingservice.config.kafka.KafkaProcessor;
import messagingservice.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    AgencyRepository agencyRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='MessageReserved'"
    )
    public void wheneverMessageReserved_RequestMessage(
        @Payload MessageReserved messageReserved
    ) {
        MessageReserved event = messageReserved;
        System.out.println(
            "\n\n##### listener RequestMessage : " + messageReserved + "\n\n"
        );

        // Sample Logic //
        Agency.requestMessage(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='MessagePushed'"
    )
    public void wheneverMessagePushed_RequestMessage(
        @Payload MessagePushed messagePushed
    ) {
        MessagePushed event = messagePushed;
        System.out.println(
            "\n\n##### listener RequestMessage : " + messagePushed + "\n\n"
        );

        // Sample Logic //
        Agency.requestMessage(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
