package com.Nandhini.LibrayManagementSystem.Service;

import com.Nandhini.LibrayManagementSystem.DAO.BorrowDAO;
import com.Nandhini.LibrayManagementSystem.Model.Borrow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowService {
    private final BorrowDAO borrowDAO; // Instance of BorrowDAO

    @Autowired
    public BorrowService(BorrowDAO borrowDAO) {
        this.borrowDAO = borrowDAO; // Constructor injection of BorrowDAO
    }

    public Borrow addBorrow(Borrow borrow) {
        return borrowDAO.addBorrow(borrow); // Add a new borrow record
    }

    public Borrow updateBorrow(Borrow borrow) {
        return borrowDAO.updateBorrow(borrow); // Update an existing borrow record
    }

    public Borrow getBorrow(String isbn) {
        return borrowDAO.getBorrow(isbn); // Retrieve a borrow record by ISBN
    }

    public List<Borrow> getAllBorrows() {
        return borrowDAO.getAllBorrows(); // Retrieve all borrow records
    }

    public Borrow removeBorrow(String isbn) {
        return borrowDAO.removeBorrow(isbn); // Remove a borrow record by ISBN
    }
}


