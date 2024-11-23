package com.Nandhini.LibrayManagementSystem.DAO;

import com.Nandhini.LibrayManagementSystem.Model.Borrow;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BorrowDAOImpl implements BorrowDAO {
    private final Map<String, Borrow> borrowStore = new HashMap<>(); // HashMap to store borrow records
    @Override
    public Borrow addBorrow(Borrow borrow) {
        borrowStore.put(borrow.getIsbn(), borrow); // Add borrow record to the map
        return borrow; // Return the added borrow record
    }

    @Override
    public Borrow updateBorrow(Borrow borrow) {
        borrowStore.put(borrow.getIsbn(), borrow); // Update existing borrow record
        return borrow; // Return the updated borrow record
    }

    @Override
    public Borrow getBorrow(String isbn) {
        return borrowStore.get(isbn); // Retrieve borrow record by ISBN
    }

    @Override
    public List<Borrow> getAllBorrows() {
        return new ArrayList<>(borrowStore.values()); // Return a list of all borrow records
    }

    @Override
    public Borrow removeBorrow(String isbn) {
        return borrowStore.remove(isbn); // Remove borrow record by ISBN and return it
    }
}
