/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlchs.entity;

/**
 *
 * @author Đức Toàn
 */
public class TacGia {
    private String MaTG;
    private String TenTG;
    private String GhiChu;

    public String getMaTG() {
        return MaTG;
    }

    public void setMaTG(String MaTG) {
        this.MaTG = MaTG;
    }

    public String getTenTG() {
        return TenTG;
    }

    public void setTenTG(String TenTG) {
        this.TenTG = TenTG;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public TacGia(String MaTG, String TenTG, String GhiChu) {
        this.MaTG = MaTG;
        this.TenTG = TenTG;
        this.GhiChu = GhiChu;
    }
}
