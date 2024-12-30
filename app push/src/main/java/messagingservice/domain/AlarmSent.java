package messagingservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import messagingservice.domain.*;
import messagingservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class AlarmSent extends AbstractEvent {

    private Long id;

    public AlarmSent() {
        super();
    }
}
//>>> DDD / Domain Event
