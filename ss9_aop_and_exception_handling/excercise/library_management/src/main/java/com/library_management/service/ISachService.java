package com.library_management.service;

import com.library_management.model.Sach;
import com.library_management.model.TheMuonSach;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ISachService {

    Page<Sach> findAllPaging(Pageable pageable);

    Sach findById(int id);

    void save(Sach sach);
}
