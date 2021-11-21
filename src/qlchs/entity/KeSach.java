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
public class KeSach {
    private String MaKS;
    private String MaTL;

    public String getMaKS() {
        return MaKS;
    }

    public void setMaKS(String MaKS) {
        this.MaKS = MaKS;
    }

    public String getMaTL() {
        return MaTL;
    }

    public void setMaTL(String MaTL) {
        this.MaTL = MaTL;
    }

    public KeSach(String MaKS, String MaTL) {
        this.MaKS = MaKS;
        this.MaTL = MaTL;
    }
}
