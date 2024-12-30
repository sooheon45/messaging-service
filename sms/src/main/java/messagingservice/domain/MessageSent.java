package messagingservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import messagingservice.domain.*;
import messagingservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class MessageSent extends AbstractEvent {

    private Long id;

    public MessageSent(Agency aggregate) {
        super(aggregate);
    }

    public MessageSent() {
        super();
    }
}
//>>> DDD / Domain Event
