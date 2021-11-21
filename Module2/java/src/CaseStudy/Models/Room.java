package CaseStudy.Models;

import java.io.Serializable;

public  class Room extends Services implements Serializable {
    public Room(int id, String tenDichVu, double dienTich, double chiPhi, int soLuongToiDa, String kieuthue, DichVuDiKem dichVuDiKem) {
        super(id, tenDichVu, dienTich, chiPhi, soLuongToiDa, kieuthue, dichVuDiKem);
    }

    @Override
    public String showInfor() {
        return "Room{" +
                "id=" + id +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", dienTich=" + dienTich +
                ", chiPhi=" + chiPhi +
                ", soLuongToiDa=" + soLuongToiDa +
                ", kieuthue='" + kieuthue + '\'' +
                ", dichVuDiKem=" + dichVuDiKem +
                '}';
    }
}
