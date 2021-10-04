package vong_lap_trong_java.thuchanh;

public class TinhTienLaiChoVay {
    static double tinh(double money, int month, double interestRate){
        for (int i=0;i<month;i++){
            money= money+(money*(interestRate/100));
        }
        return money;
    }
    public static void main(String[] args) {
        System.out.println("Tổng tiền cho vay là: "+tinh(10000,1,1));
    }
}
