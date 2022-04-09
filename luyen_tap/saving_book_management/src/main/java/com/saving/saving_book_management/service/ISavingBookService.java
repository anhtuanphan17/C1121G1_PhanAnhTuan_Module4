package com.saving.saving_book_management.service;

import com.saving.saving_book_management.dto.SavingBookDto;
import com.saving.saving_book_management.model.SavingBook;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISavingBookService {

    List<SavingBook> findAll();

    void save(SavingBook savingBook);

    SavingBook findById(int id);
}
