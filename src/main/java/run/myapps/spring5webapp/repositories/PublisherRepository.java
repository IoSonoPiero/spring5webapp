package run.myapps.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import run.myapps.spring5webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
