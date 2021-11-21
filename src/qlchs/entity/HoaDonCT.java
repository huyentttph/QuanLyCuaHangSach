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
public class HoaDonCT {
    private int MaHDCT;
    private int MaHD;
    private String MaSach;
    private int SoLuong;
    private double GiaBan;
    private double ThanhTien;

    public int getMaHDCT() {
        return MaHDCT;
    }

    public void setMaHDCT(int MaHDCT) {
        this.MaHDCT = MaHDCT;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(double GiaBan) {
        this.GiaBan = GiaBan;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public HoaDonCT(int MaHDCT, int MaHD, String MaSach, int SoLuong, double GiaBan, double ThanhTien) {
        this.MaHDCT = MaHDCT;
        this.MaHD = MaHD;
        this.MaSach = MaSach;
        this.SoLuong = SoLuong;
        this.GiaBan = GiaBan;
        this.ThanhTien = ThanhTien;
    }
}
