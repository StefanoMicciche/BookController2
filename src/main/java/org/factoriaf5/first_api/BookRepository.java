package org.factoriaf5.first_api;

import java.util.List;
import java.util.Optional;

public interface BookRepository {
    List<Book> findAll();

    Optional<Book> findByIsbn(String isbn);

    Book save(Book book);

    void deleteBtIsbn(String isbn);
}
