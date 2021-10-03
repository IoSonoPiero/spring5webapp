package run.myapps.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import run.myapps.spring5webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
