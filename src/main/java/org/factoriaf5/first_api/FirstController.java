package org.factoriaf5.first_api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class FirstController {

    private final BookRepository bookRepository;

    public FirstController() {
        this.bookRepository = new InMemoryBookRepository();
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return this.bookRepository.findAll();
    }


    @GetMapping("/{isbn}")
    public ResponseEntity<Book> getBookByIsbn(@PathVariable String isbn) {
        Optional<Book> optionalBook = bookRepository.findByIsbn(isbn);

        if (optionalBook.isPresent()){
            return new ResponseEntity<>(optionalBook.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        Optional<Book> existingBook = this.bookRepository.findByIsbn(book.getIsbn());
            if (existingBook.isPresent()){
                return ResponseEntity.badRequest().build();
            }
            Book savedBook = bookRepository.save(book);
            return ResponseEntity.ok(savedBook);
    }

    @DeleteMapping("/isbn/{isbn}")
    public ResponseEntity<Void> deleteBook(@PathVariable String isbn) {
        Optional<Book> book = null;
        if (book.isPresent()) {
            book = bookRepository.findByIsbn(isbn);
            return ResponseEntity.ok().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
//UPDATE => Modiifcar un libro por su isbn(Put)



