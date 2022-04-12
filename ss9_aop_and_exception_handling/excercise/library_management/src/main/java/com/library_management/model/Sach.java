package com.library_management.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Sach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_sach")
    private Integer maSach;
    private String tenSach;
    private String tacGia;
    private Integer soLuong;
    private String moTa;

    @OneToMany(mappedBy = "sach",cascade = CascadeType.ALL)
    private Set<TheMuonSach> sachSet;

    public Sach() {
    }

    public Integer getMaSach() {
        return maSach;
    }

    public void setMaSach(Integer maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Set<TheMuonSach> getSachSet() {
        return sachSet;
    }

    public void setSachSet(Set<TheMuonSach> sachSet) {
        this.sachSet = sachSet;
    }
}
