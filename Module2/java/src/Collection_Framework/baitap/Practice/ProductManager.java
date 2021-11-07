package Collection_Framework.baitap.Practice;

import java.util.ArrayList;
import java.util.Scanner;

class ProductManager {
    ArrayList <Product> arrayList =new ArrayList<Product>();
    Scanner scanner=new Scanner(System.in);
    int id;
    String name;
    double price;
    void add(){
        System.out.println("Id: ");
        id=Integer.parseInt(scanner.nextLine());
        System.out.println("Name: ");
        name=scanner.nextLine();
        System.out.println("Price: ");
        price=Integer.parseInt(scanner.nextLine());
        arrayList.add(new Product(id,name,price));
    }
    public String toString(){
        return super.toString();
    }
}