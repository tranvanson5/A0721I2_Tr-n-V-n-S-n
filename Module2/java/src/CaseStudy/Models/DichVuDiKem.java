package CaseStudy.Models;

import java.io.Serializable;

public class DichVuDiKem implements Serializable {
    private String dichVuDiKem;
    private String donVi;
    private double chiPhi;

    public DichVuDiKem(String dichVuDiKem, String donVi, double chiPhi) {
        this.dichVuDiKem = dichVuDiKem;
        this.donVi = donVi;
        this.chiPhi = chiPhi;
    }

    public String getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setDichVuDiKem(String dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public double getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(double chiPhi) {
        this.chiPhi = chiPhi;
    }

    @Override
    public String toString() {
        return "DichVuDiKem{" +
                "dichVuDiKem='" + dichVuDiKem + '\'' +
                ", donVi='" + donVi + '\'' +
                ", chiPhi=" + chiPhi +
                '}';
    }
}
