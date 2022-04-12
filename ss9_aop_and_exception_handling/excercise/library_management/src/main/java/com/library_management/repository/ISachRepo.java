package com.library_management.repository;

import com.library_management.model.Sach;
import com.library_management.model.TheMuonSach;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISachRepo extends JpaRepository<Sach,Integer> {

}
