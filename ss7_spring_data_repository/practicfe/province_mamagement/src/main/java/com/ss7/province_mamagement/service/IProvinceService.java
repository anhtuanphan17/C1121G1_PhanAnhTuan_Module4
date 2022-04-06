package com.ss7.province_mamagement.service;

import com.ss7.province_mamagement.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProvinceService  {
    List<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
