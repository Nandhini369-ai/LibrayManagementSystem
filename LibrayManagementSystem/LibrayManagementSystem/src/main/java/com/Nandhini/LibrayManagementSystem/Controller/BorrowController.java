package com.Nandhini.LibrayManagementSystem.Controller;

import com.Nandhini.LibrayManagementSystem.Model.Borrow;
import com.Nandhini.LibrayManagementSystem.Service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/borrows") // Base URL for borrow operations
public class BorrowController {
    private final BorrowService borrowService; // Instance of BorrowService

    @Autowired
    public BorrowController(BorrowService borrowService) {
        this.borrowService = borrowService; // Constructor injection of BorrowService
    }

    @PostMapping // Add a new borrow record
    public ResponseEntity<Borrow> addBorrow(@RequestBody Borrow borrow) {
        Borrow createdBorrow = borrowService.addBorrow(borrow);
        return new ResponseEntity<>(createdBorrow, HttpStatus.CREATED); // Return created borrow with 201 status
    }

    @PutMapping("/{isbn}") // Update an existing borrow record
    public ResponseEntity<Borrow> updateBorrow(@PathVariable String isbn, @RequestBody Borrow borrow) {
        borrow.setIsbn(isbn); // Set ISBN from the path variable
        Borrow updatedBorrow = borrowService.updateBorrow(borrow);
        return new ResponseEntity<>(updatedBorrow, HttpStatus.OK); // Return updated borrow with 200 status
    }

    @GetMapping("/{isbn}") // Get a borrow record by ISBN
    public ResponseEntity<Borrow> getBorrow(@PathVariable String isbn) {
        Borrow borrow = borrowService.getBorrow(isbn);
        return borrow != null ?
                new ResponseEntity<>(borrow, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND); // Return 404 if not found
    }

    @GetMapping // Get all borrow records
    public ResponseEntity<List<Borrow>> getAllBorrows() {
        List<Borrow> borrows = borrowService.getAllBorrows();
        return new ResponseEntity<>(borrows, HttpStatus.OK); // Return list of borrows with 200 status
    }

    @DeleteMapping("/{isbn}") // Remove a borrow record by ISBN
    public ResponseEntity<Void> removeBorrow(@PathVariable String isbn) {
        Borrow removedBorrow = borrowService.removeBorrow(isbn);
        return removedBorrow != null ?
                new ResponseEntity<>(HttpStatus.NO_CONTENT) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND); // Return 204 or 404
    }
}
