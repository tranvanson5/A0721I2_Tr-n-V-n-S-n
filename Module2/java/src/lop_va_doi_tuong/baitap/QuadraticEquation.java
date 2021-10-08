package lop_va_doi_tuong.baitap;

import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void getRefult(){
        double delta;
        delta=this.b*this.b-4*this.a*this.c;
        if(delta<0){
            System.out.println("vô nghiệm");
        } else if(delta==0){
            System.out.println("Pt 1 nghiệm: x="+ -(b/2/a));
        } else {
            System.out.println("x1= "+(-(b+Math.sqrt(delta))/2/a));
            System.out.println("x1= "+(-(b-Math.sqrt(delta))/2/a));
        }
    }
    public String display() {
        return  a+"x^2 +" + b + "x +" + c + "}";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a:");
        double a = scanner.nextDouble();
        System.out.print("Nhập b:");
        double b = scanner.nextDouble();
        System.out.print("Nhập c:");
        double c = scanner.nextDouble();
        QuadraticEquation QuadraticEquation=new QuadraticEquation(a,b,c);
        System.out.println("Phương trinh bậc 2 : "+QuadraticEquation.display());
        QuadraticEquation.getRefult();
    }
}
