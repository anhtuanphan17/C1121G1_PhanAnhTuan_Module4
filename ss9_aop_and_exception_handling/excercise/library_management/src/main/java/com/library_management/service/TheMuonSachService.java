package com.library_management.service;

import com.library_management.model.TheMuonSach;
import com.library_management.repository.ITheMuonSachRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheMuonSachService implements ITheMuonSachService{

    @Autowired
    ITheMuonSachRepo theMuonSachRepo;

    @Override
    public void save(TheMuonSach theMuonSach) {
        theMuonSachRepo.save(theMuonSach);
    }

    @Override
    public TheMuonSach findById(Integer maMuonSachInteger) {
        return theMuonSachRepo.findById(maMuonSachInteger).orElse(null);
    }
}
