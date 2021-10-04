package introduction_to_java.thuchanh;

import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float height;
        float width;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter width:");
        width=sc.nextFloat();
        System.out.println("Enter height:");
        height=sc.nextFloat();
        System.out.println("Area is: "+(width*height));
    }
}
