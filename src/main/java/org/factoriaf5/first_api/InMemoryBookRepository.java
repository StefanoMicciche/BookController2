package org.factoriaf5.first_api;

import java.util.*;

public class InMemoryBookRepository implements BookRepository {
    private final static List<Book> booksDB = new ArrayList<>();

    public InMemoryBookRepository() {
        booksDB.add(new Book("autor", "title", "A123"));
    }

    @Override
    public List<Book> findAll() {
        return Collections.unmodifiableList(booksDB);
    }

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        for (Book book : booksDB) {
            if (book.getIsbn().equals(isbn)) return Optional.of(book);
        }
        return null;
    }

    @Override
    public Book save(Book book) {
        booksDB.add(book);
        return null;
    }

    @Override
    public void deleteIsbn(String isbn) {
        booksDB.removeIf(book -> book.getIsbn().equals(isbn));
    }

}
