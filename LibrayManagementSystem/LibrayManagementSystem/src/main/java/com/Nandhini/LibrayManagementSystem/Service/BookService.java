package com.Nandhini.LibrayManagementSystem.Service;

import com.Nandhini.LibrayManagementSystem.DAO.BookDAO;
import com.Nandhini.LibrayManagementSystem.Model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService {
    private final BookDAO bookDAO; // Instance of BookDAO

    @Autowired
    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO; // Constructor to inject the BookDAO
    }

    public Book addBook(Book book) {
        return bookDAO.addBook(book); // Add a book
    }

    public Book updateBook(Book book) {
        return bookDAO.updateBook(book); // Update a book
    }

    public Book getBook(String isbn) {
        return bookDAO.getBook(isbn); // Retrieve a book by ISBN
    }

    public List<Book> getAllBooks() {
        return bookDAO.getAllBooks(); // Retrieve all books
    }

    public Book removeBook(String isbn) {
        return bookDAO.removeBook(isbn); // Remove a book by ISBN
    }
}
