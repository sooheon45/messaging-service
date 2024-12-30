package messagingservice.infra;

import messagingservice.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class AgencyHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Agency>> {

    @Override
    public EntityModel<Agency> process(EntityModel<Agency> model) {
        return model;
    }
}
