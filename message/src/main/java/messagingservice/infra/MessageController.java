package messagingservice.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import messagingservice.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/messages")
@Transactional
public class MessageController {

    @Autowired
    MessageRepository messageRepository;

    @RequestMapping(
        value = "/messages/sendmessage",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public Message sendMessage(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody SendMessageCommand sendMessageCommand
    ) throws Exception {
        System.out.println("##### /message/sendMessage  called #####");
        Message message = new Message();
        message.sendMessage(sendMessageCommand);
        messageRepository.save(message);
        return message;
    }
}
//>>> Clean Arch / Inbound Adaptor
