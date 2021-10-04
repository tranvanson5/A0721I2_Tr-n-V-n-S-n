package vong_lap_trong_java.baitap;

import javax.xml.transform.sax.SAXSource;

public class DisplayHinh {
    static void  rectangle(int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void triangle(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void triangle1(int n){
        for (int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void triangle2(int n){
        for (int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void triangle3(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Print the rectangle");
        rectangle(4,5);
        System.out.println("Print the square triangle botton-left");
        triangle(5);
        System.out.println("Print the square triangle top-left  ");
        triangle1(5);
        System.out.println("Print the square triangle botton-right");
        triangle2(5);
        System.out.println("Print the square triangle top-right");
        triangle3(5);
    }
}
