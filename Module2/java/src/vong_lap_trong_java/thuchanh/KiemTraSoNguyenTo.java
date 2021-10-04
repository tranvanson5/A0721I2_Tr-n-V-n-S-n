package vong_lap_trong_java.thuchanh;

public class KiemTraSoNguyenTo {
    static boolean checkSNT(int n){
        int count=0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        } else return false;
    }
    public static void main(String[] args) {
        if(checkSNT(11)==true){
            System.out.println(" is a prime");
        } else System.out.println(" is not a prime");
    }
}
