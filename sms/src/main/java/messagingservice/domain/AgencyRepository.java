package messagingservice.domain;

import messagingservice.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "agencies", path = "agencies")
public interface AgencyRepository
    extends PagingAndSortingRepository<Agency, Long> {}
