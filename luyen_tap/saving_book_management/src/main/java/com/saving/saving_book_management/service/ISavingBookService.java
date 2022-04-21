package com.saving.saving_book_management.service;

import com.saving.saving_book_management.dto.SavingBookDto;
import com.saving.saving_book_management.model.SavingBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ISavingBookService {

    Page<SavingBook> findAll(Pageable pageable);

    void save(SavingBook savingBook);

    SavingBook findById(int id);

    void delete(SavingBook savingBook);

    void deleteById(Integer savingBookId);


    Page<SavingBook> findAllPaging(String keyWordValue, Pageable pageable);

    Page<SavingBook> findAllByCustomerNameAndStartDay(String customerNameValue, String depositDatevalue, String maturityDateValue, Pageable pageable);
}
