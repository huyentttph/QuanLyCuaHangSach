/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlchs.entity;

import java.util.Date;

/**
 *
 * @author Đức Toàn
 */
public class CTPhieuNhap {
    private int MaHD;
    private String MaNV;
    private int MaKH;
    private Date NgayXuat;
    private double Tongtien;

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public Date getNgayXuat() {
        return NgayXuat;
    }

    public void setNgayXuat(Date NgayXuat) {
        this.NgayXuat = NgayXuat;
    }

    public double getTongtien() {
        return Tongtien;
    }

    public void setTongtien(double Tongtien) {
        this.Tongtien = Tongtien;
    }

    public CTPhieuNhap(int MaHD, String MaNV, int MaKH, Date NgayXuat, double Tongtien) {
        this.MaHD = MaHD;
        this.MaNV = MaNV;
        this.MaKH = MaKH;
        this.NgayXuat = NgayXuat;
        this.Tongtien = Tongtien;
    }
}
