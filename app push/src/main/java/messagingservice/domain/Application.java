package messagingservice.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import messagingservice.AppPushApplication;

@Entity
@Table(name = "Application_table")
@Data
//<<< DDD / Aggregate Root
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static ApplicationRepository repository() {
        ApplicationRepository applicationRepository = AppPushApplication.applicationContext.getBean(
            ApplicationRepository.class
        );
        return applicationRepository;
    }

    //<<< Clean Arch / Port Method
    public static void requestMessage(MessagePushed messagePushed) {
        //implement business logic here:

        /** Example 1:  new item 
        Application application = new Application();
        repository().save(application);

        */

        /** Example 2:  finding and process
        

        repository().findById(messagePushed.get???()).ifPresent(application->{
            
            application // do something
            repository().save(application);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void requestMessage(MessageReserved messageReserved) {
        //implement business logic here:

        /** Example 1:  new item 
        Application application = new Application();
        repository().save(application);

        */

        /** Example 2:  finding and process
        

        repository().findById(messageReserved.get???()).ifPresent(application->{
            
            application // do something
            repository().save(application);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
