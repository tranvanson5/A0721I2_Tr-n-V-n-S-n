package CaseStudy.Models;

import java.io.Serializable;

public class Villa extends Services implements Serializable {
    private String tieuChuan;
    private String moTaTienNghi;
    private double dienTichHoBoi;
    private int soTang;

    public Villa(int id, String tenDichVu, double dienTich, double chiPhi, int soLuongToiDa, String kieuthue, String tieuChuan, String moTaTienNghi, double dienTichHoBoi, int soTang, DichVuDiKem dichVuDiKem) {
        super(id, tenDichVu, dienTich, chiPhi, soLuongToiDa, kieuthue, dichVuDiKem);
        this.tieuChuan = tieuChuan;
        this.moTaTienNghi = moTaTienNghi;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuan() {
        return tieuChuan;
    }

    public void setTieuChuan(String tieuChuan) {
        this.tieuChuan = tieuChuan;
    }

    public String getMoTaTienNghi() {
        return moTaTienNghi;
    }

    public void setMoTaTienNghi(String moTaTienNghi) {
        this.moTaTienNghi = moTaTienNghi;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String showInfor() {
        return "Villa{" +
                "id=" + id +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", dienTich=" + dienTich +
                ", chiPhi=" + chiPhi +
                ", soLuongToiDa=" + soLuongToiDa +
                ", kieuthue='" + kieuthue + '\'' +
                ", tieuChuan='" + tieuChuan + '\'' +
                ", moTaTienNghi='" + moTaTienNghi + '\'' +
                ", dienTichHoBoi=" + dienTichHoBoi +
                ", soTang=" + soTang +
                ", dichVuDiKem=" + dichVuDiKem +
                '}';
    }
}
