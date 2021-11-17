package BinaryFile_Serialization.BaiTap.Product;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List <Product> products= new ArrayList<>();
    private static int id;
    private static String name;
    private static String menufacturer;
    private static double price;
    private static String desciption;

    public static void add(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập id:");
        id=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name:");
        name=scanner.nextLine();
        System.out.println("Nhập hãng:");
        menufacturer=scanner.nextLine();
        System.out.println("Nhập giá:");
        price=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập mô tả :");
        desciption=scanner.nextLine();
        products.add(new Product(id,name,menufacturer,price,desciption));
        writeToFile(products);
    }

    public static List<Product> read(List<Product> products){
        try {
            FileInputStream fis = new FileInputStream("WirteProduct.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            System.out.println(products);
        }catch (Exception e){
            e.printStackTrace();
        }
        return products;
    }
    public static void writeToFile(List<Product> products){
        try {
            FileOutputStream fos= new FileOutputStream("WirteProduct.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        int chose;
        Scanner scanner= new Scanner(System.in);

        do{
            System.out.println("Nhập lựa chọn");
            chose=scanner.nextInt();
            switch (chose){
                case 1:
                    add();
                    break;
                case 2:
                    read(products);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Nhập sai");
            }
        }while (chose!=3);
    }
}
