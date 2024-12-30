package messagingservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import messagingservice.domain.*;
import messagingservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class MessageReserved extends AbstractEvent {

    private Long id;
    private String phonenumber;
    private String type;
    private Date senddate;

    public MessageReserved(Message aggregate) {
        super(aggregate);
    }

    public MessageReserved() {
        super();
    }
}
//>>> DDD / Domain Event
