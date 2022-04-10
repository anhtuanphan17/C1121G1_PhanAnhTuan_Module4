package com.saving.saving_book_management.repository;

import com.saving.saving_book_management.model.SavingBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISavingBookRepository extends JpaRepository<SavingBook, Integer> {

    Page<SavingBook> findAllByCustomer_CustomerNameContainingOrderByStartDay(String keyWordValue, Pageable pageable);
}
