package CaseStudy.Models;

import java.io.Serializable;

public abstract class Services implements Serializable {
    protected int id;
    protected String tenDichVu;
    protected double dienTich;
    protected double chiPhi;
    protected int soLuongToiDa;
    protected String kieuthue;
    protected DichVuDiKem dichVuDiKem;

    public Services(int id, String tenDichVu, double dienTich, double chiPhi, int soLuongToiDa, String kieuthue, DichVuDiKem dichVuDiKem) {
        this.id = id;
        this.tenDichVu = tenDichVu;
        this.dienTich = dienTich;
        this.chiPhi = chiPhi;
        this.soLuongToiDa = soLuongToiDa;
        this.kieuthue = kieuthue;
        this.dichVuDiKem = dichVuDiKem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public double getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(double chiPhi) {
        this.chiPhi = chiPhi;
    }

    public int getSoLuongToiDa() {
        return soLuongToiDa;
    }

    public void setSoLuongToiDa(int soLuongToiDa) {
        this.soLuongToiDa = soLuongToiDa;
    }

    public String getKieuthue() {
        return kieuthue;
    }

    public void setKieuthue(String kieuthue) {
        this.kieuthue = kieuthue;
    }

    public DichVuDiKem getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setDichVuDiKem(DichVuDiKem dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }
    public abstract String showInfor();
}
