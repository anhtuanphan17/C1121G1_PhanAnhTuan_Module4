package com.saving.saving_book_management.service;

import com.saving.saving_book_management.dto.SavingBookDto;
import com.saving.saving_book_management.model.SavingBook;
import com.saving.saving_book_management.repository.ISavingBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SavingBookService implements ISavingBookService{

    @Autowired
    ISavingBookRepository savingBookRepository;

    @Override
    public List<SavingBook> findAll() {
        return savingBookRepository.findAll();
    }

    @Override
    public void save(SavingBook savingBook) {
        savingBookRepository.save(savingBook);
    }

    @Override
    public SavingBook findById(int id) {
        return savingBookRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(SavingBook savingBook) {
        savingBookRepository.delete(savingBook);
    }

    @Override
    public void deleteById(Integer savingBookId) {
        savingBookRepository.deleteById(savingBookId);
    }
}
