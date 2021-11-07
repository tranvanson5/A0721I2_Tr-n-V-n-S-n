package xulingoailevadebug.baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        double a,b,c;
        Scanner scanner=new Scanner(System.in);
        IllegalTriangleException triangleException = new IllegalTriangleException();
        try {
            System.out.println("Nhập cạnh thứ nhất: ");
            a = scanner.nextInt();
            System.out.println("Nhập cạnh thứ hai: ");
            b = scanner.nextInt();
            System.out.println("Nhập cạnh thứ ba: ");
            c = scanner.nextInt();
            try {
                triangleException.check(a,b,c);
            }catch (IllegalTriangleException e){
                System.out.println(e);
            }
        } catch (Exception e){
            System.out.println("Lỗi định dạng: "+e);
        }

    }
}
