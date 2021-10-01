package bai_1.ThucHanh;

import java.util.Scanner;

public class BacMot {
    public static void main(String[] args) {
        float a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("ax+b=0");
        System.out.println("a: ");
        a=sc.nextFloat();
        System.out.println("b: ");
        b=sc.nextFloat();
        if(a==0){
            if (b==0){
                System.out.println("phương trình vô số nghiệm");
            } else System.out.println("phương vô nghiệm");
        } else {
            System.out.println("phương trình có nghiệm là: "+(-b/a));
        }
    }
}
