package dio.innovationone.personapi.repository;

import dio.innovationone.personapi.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
