package vong_lap_trong_java.baitap;

public class Display20SNT {
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
        int count=0;
        int i=0;
        while(count!=20){
            if (check(i)){
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        printout();
    }
}
