package messagingservice.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import messagingservice.SmsApplication;
import messagingservice.domain.MessageSent;

@Entity
@Table(name = "Agency_table")
@Data
//<<< DDD / Aggregate Root
public class Agency {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        MessageSent messageSent = new MessageSent(this);
        messageSent.publishAfterCommit();
    }

    public static AgencyRepository repository() {
        AgencyRepository agencyRepository = SmsApplication.applicationContext.getBean(
            AgencyRepository.class
        );
        return agencyRepository;
    }

    //<<< Clean Arch / Port Method
    public static void requestMessage(MessageReserved messageReserved) {
        //implement business logic here:

        /** Example 1:  new item 
        Agency agency = new Agency();
        repository().save(agency);

        */

        /** Example 2:  finding and process
        

        repository().findById(messageReserved.get???()).ifPresent(agency->{
            
            agency // do something
            repository().save(agency);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void requestMessage(MessagePushed messagePushed) {
        //implement business logic here:

        /** Example 1:  new item 
        Agency agency = new Agency();
        repository().save(agency);

        */

        /** Example 2:  finding and process
        

        repository().findById(messagePushed.get???()).ifPresent(agency->{
            
            agency // do something
            repository().save(agency);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
