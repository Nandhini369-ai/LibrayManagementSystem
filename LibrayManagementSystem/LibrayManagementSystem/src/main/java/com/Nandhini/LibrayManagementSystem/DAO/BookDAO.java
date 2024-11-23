package com.Nandhini.LibrayManagementSystem.DAO;

import com.Nandhini.LibrayManagementSystem.Model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BookDAO {
    Book addBook(Book book);
    Book updateBook(Book book);
    Book getBook(String isbn);
    List<Book> getAllBooks();

    Book removeBook(String isbn);
}
