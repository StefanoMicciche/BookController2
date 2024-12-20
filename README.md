﻿# BookController2
InMemoryBookRepository
This repository contains the InMemoryBookRepository class, which provides basic CRUD functionalities for managing books in an in-memory database (ArrayList).

Functionality
This repository offers the following functionalities for managing books:

Find all books: Retrieves a list of all books currently stored.
Find book by ISBN: Searches for a book based on its unique ISBN number.
Save book: Adds a new book to the in-memory database.
Delete book by ISBN: Removes a book from the in-memory database based on its ISBN number.
Usage
This repository is designed to be used within a Java application. It implements the BookRepository interface, which defines the functionalities mentioned above.

Technologies Used
Java
Testing Functionality with Postman
While this repository uses an in-memory database, you can leverage tools like Postman to simulate API calls and test the functionalities provided by the InMemoryBookRepository.

Here's an example of how you can test the functionalities using Postman:

1. Find all books:

Method: GET
URL: http://localhost:yourPort/books (Replace "yourPort" with the actual port your application is running on)
2. Find book by ISBN:

Method: GET
URL: http://localhost:yourPort/books/isbn/{isbn} (Replace "{isbn}" with the actual ISBN number of the book)
3. Save book:

Method: POST
URL: http://localhost:yourPort/books
Body: Set the body type to "raw" and provide JSON data representing the book object. (e.g., {"title": "New Book", "author": "John Doe", "isbn": "A456"})
4. Delete book by ISBN:

Method: DELETE
URL: http://localhost:yourPort/books/isbn/{isbn} (Replace "{isbn}" with the actual ISBN number of the book)
