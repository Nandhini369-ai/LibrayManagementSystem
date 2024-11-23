package com.Nandhini.LibrayManagementSystem.DAO;

import com.Nandhini.LibrayManagementSystem.Model.Borrow;

import java.util.List;

public interface BorrowDAO {
    Borrow addBorrow(Borrow borrow);
    Borrow updateBorrow(Borrow borrow);
    Borrow getBorrow(String isbn);
    List<Borrow> getAllBorrows();
    Borrow removeBorrow(String isbn);
}

