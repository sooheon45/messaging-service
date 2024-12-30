package messagingservice.domain;

import messagingservice.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "applications",
    path = "applications"
)
public interface ApplicationRepository
    extends PagingAndSortingRepository<Application, Long> {}
