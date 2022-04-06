package com.ss7.province_mamagement.repository;

import com.ss7.province_mamagement.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProvinceRepository extends JpaRepository<Province,Long> {
}
