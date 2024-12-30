package messagingservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import messagingservice.domain.*;
import messagingservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class MessagePushed extends AbstractEvent {

    private Long id;
    private String phonenumber;
    private String type;
    private Date senddate;

    public MessagePushed(Message aggregate) {
        super(aggregate);
    }

    public MessagePushed() {
        super();
    }
}
//>>> DDD / Domain Event
