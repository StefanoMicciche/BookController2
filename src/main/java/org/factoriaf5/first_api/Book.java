package org.factoriaf5.first_api;

public class Book {
    private String isbn;
    private String title;
    private String autor;

    public Book(String autor, String title, String isbn) {
        this.isbn = isbn;
        this.title = title;
        this.autor = autor;

    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

}
