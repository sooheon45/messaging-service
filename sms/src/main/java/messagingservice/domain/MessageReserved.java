package messagingservice.domain;

import java.util.*;
import lombok.*;
import messagingservice.domain.*;
import messagingservice.infra.AbstractEvent;

@Data
@ToString
public class MessageReserved extends AbstractEvent {

    private Long id;
    private String phonenumber;
    private String type;
    private Date senddate;
}
