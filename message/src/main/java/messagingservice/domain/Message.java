package messagingservice.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import messagingservice.MessageApplication;
import messagingservice.domain.MessagePushed;
import messagingservice.domain.MessageReserved;

@Entity
@Table(name = "Message_table")
@Data
//<<< DDD / Aggregate Root
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String phoneNumber;

    private String type;

    private Date sendDate;

    @PostPersist
    public void onPostPersist() {
        MessagePushed messagePushed = new MessagePushed(this);
        messagePushed.publishAfterCommit();

        MessageReserved messageReserved = new MessageReserved(this);
        messageReserved.publishAfterCommit();
    }

    public static MessageRepository repository() {
        MessageRepository messageRepository = MessageApplication.applicationContext.getBean(
            MessageRepository.class
        );
        return messageRepository;
    }

    //<<< Clean Arch / Port Method
    public void sendMessage(SendMessageCommand sendMessageCommand) {
        //implement business logic here:

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
