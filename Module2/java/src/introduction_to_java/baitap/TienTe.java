package introduction_to_java.baitap;

import java.util.Scanner;

public class TienTe {
    public static void main(String[] args) {
        Double usd;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập usd: ");
        usd=sc.nextDouble();
        System.out.println("Số tiền sau khi quy đổi là  VND "+(usd*23000));
    }
}
