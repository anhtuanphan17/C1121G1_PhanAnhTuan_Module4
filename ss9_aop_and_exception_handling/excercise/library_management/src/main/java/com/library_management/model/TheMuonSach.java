package com.library_management.model;

import javax.persistence.*;

@Entity
public class TheMuonSach {
    @Id
    private Integer maMuonSach ;
    private Boolean trangThai;
    private String ngayMuon;
    private String ngayTra;

    @ManyToOne
    @JoinColumn(name = "ma_sach", referencedColumnName = "ma_sach")
    private Sach sach;

    public TheMuonSach() {
    }

    public Integer getMaMuonSach() {
        return maMuonSach;
    }

    public void setMaMuonSach(Integer maMuonSach) {
        this.maMuonSach = maMuonSach;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }
}