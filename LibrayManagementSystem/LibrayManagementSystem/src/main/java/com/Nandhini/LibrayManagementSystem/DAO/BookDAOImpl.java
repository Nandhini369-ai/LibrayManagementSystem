package com.Nandhini.LibrayManagementSystem.DAO;

import com.Nandhini.LibrayManagementSystem.Model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BookDAOImpl implements BookDAO {
    private final Map<String, Book> bookStore = new HashMap<>();

    @Override
    public Book addBook(Book book) {
        bookStore.put(book.getIsbn(), book);
        return book; // Return the added book
    }

    @Override
    public Book updateBook(Book book) {
        bookStore.put(book.getIsbn(), book);
        return book; // Return the updated book
    }

    @Override
    public Book getBook(String isbn) {
        return bookStore.get(isbn); // Retrieve the book by ISBN
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(bookStore.values()); // Return all books
    }

    @Override
    public Book removeBook(String isbn) {
        return bookStore.remove(isbn); // Remove the book by ISBN
    }
}
