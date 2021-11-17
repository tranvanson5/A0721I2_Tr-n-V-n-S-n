package BinaryFile_Serialization.BaiTap.Product;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String menufacturer;
    private double price;
    private String desciption;

    public Product() {
    }

    public Product(int id, String name, String menufacturer, double price, String desciption) {
        this.id = id;
        this.name = name;
        this.menufacturer = menufacturer;
        this.price = price;
        this.desciption = desciption;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMenufacturer() {
        return menufacturer;
    }

    public void setMenufacturer(String menufacturer) {
        this.menufacturer = menufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", menufacturer='" + menufacturer + '\'' +
                ", price=" + price +
                ", desciption='" + desciption + '\'' +
                '}';
    }
}
