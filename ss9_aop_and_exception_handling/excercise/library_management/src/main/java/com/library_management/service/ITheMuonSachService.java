package com.library_management.service;

import com.library_management.model.TheMuonSach;

public interface ITheMuonSachService  {
    void save(TheMuonSach theMuonSach);

    TheMuonSach findById(Integer maMuonSachInteger);
}
