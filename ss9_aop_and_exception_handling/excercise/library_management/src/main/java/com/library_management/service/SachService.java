package com.library_management.service;

import com.library_management.model.Sach;
import com.library_management.repository.ISachRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SachService implements ISachService {

    @Autowired
    ISachRepo sachRepo;

    @Override
    public Page<Sach> findAllPaging(Pageable pageable) {
        return sachRepo.findAll(pageable) ;
    }

    @Override
    public Sach findById(int id) {
        return sachRepo.findById(id).orElse(null);
    }

    @Override
    public void save(Sach sach) {
        sachRepo.save(sach);
    }


}

