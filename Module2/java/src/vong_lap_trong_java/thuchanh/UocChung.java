package vong_lap_trong_java.thuchanh;

public class UocChung {
    static int UCLN(int a,int b){
        while (a!=b){
            if(a>b){
                a=a-b;
            } else b=b-a;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println( "UCLN là: "+UCLN(27,45) );
    }
}
