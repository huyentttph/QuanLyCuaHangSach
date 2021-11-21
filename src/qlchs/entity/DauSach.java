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
public class DauSach {
    private String MaDauSach;
    private String TenDauSach;
    private String MaTG;
    private String MaTL;

    public DauSach(String MaDauSach, String TenDauSach, String MaTG, String MaTL) {
        this.MaDauSach = MaDauSach;
        this.TenDauSach = TenDauSach;
        this.MaTG = MaTG;
        this.MaTL = MaTL;
    }

    public String getMaDauSach() {
        return MaDauSach;
    }

    public void setMaDauSach(String MaDauSach) {
        this.MaDauSach = MaDauSach;
    }

    public String getTenDauSach() {
        return TenDauSach;
    }

    public void setTenDauSach(String TenDauSach) {
        this.TenDauSach = TenDauSach;
    }

    public String getMaTG() {
        return MaTG;
    }

    public void setMaTG(String MaTG) {
        this.MaTG = MaTG;
    }

    public String getMaTL() {
        return MaTL;
    }

    public void setMaTL(String MaTL) {
        this.MaTL = MaTL;
    }
    
}
