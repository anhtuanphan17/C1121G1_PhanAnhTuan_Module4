package com.saving.saving_book_management.repository;

import com.saving.saving_book_management.model.SavingBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISavingBookRepository extends JpaRepository<SavingBook,Integer> {
}