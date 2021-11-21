package CaseStudy.Models;

import java.io.Serializable;

public class House extends Services implements Serializable {
    private String tieuChuan;
    private String moTaTienNghi;
    private int soTang;

    public House(int id, String tenDichVu, double dienTich, double chiPhi, int soLuongToiDa, String kieuthue, String tieuChuan, String moTaTienNghi, int soTang, DichVuDiKem dichVuDiKem) {
        super(id, tenDichVu, dienTich, chiPhi, soLuongToiDa, kieuthue, dichVuDiKem);
        this.tieuChuan = tieuChuan;
        this.moTaTienNghi = moTaTienNghi;
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

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String showInfor() {
        return "House{" +
                "id=" + id +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", dienTich=" + dienTich +
                ", chiPhi=" + chiPhi +
                ", soLuongToiDa=" + soLuongToiDa +
                ", kieuthue='" + kieuthue + '\'' +
                ", tieuChuan='" + tieuChuan + '\'' +
                ", moTaTienNghi='" + moTaTienNghi + '\'' +
                ", soTang=" + soTang +
                ", dichVuDiKem=" + dichVuDiKem +
                '}';
    }
}
