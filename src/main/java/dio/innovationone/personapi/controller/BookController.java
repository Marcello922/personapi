package dio.innovationone.personapi.controller;

import dio.innovationone.personapi.entity.Book;
import dio.innovationone.personapi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/people")
public class BookController {

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    private BookRepository bookRepository;

    @PostMapping
    public String createBook(@RequestBody Book book){
        bookRepository.save(book);
        return "Hello DIO!";
    }
}
