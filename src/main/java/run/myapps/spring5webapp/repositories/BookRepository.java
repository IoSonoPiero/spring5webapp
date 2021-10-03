package run.myapps.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import run.myapps.spring5webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
