package vong_lap_trong_java.baitap;

public class DisplaySNTNhoHon100 {
    static boolean check(int n){
        int count=0;
        for (int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if (count==2){
            return true;
        }
        else return false;
    }
    static void printout(){
        for(int i=0;i<100;i++){
            if (check(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        printout();
    }
}
