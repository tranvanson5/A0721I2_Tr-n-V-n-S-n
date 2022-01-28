package model;

public class TComplex {
    private int id;
    private double area;
    private String status;
    private int floor;
    private String type;
    private String description;
    private double price;
    private String date_start;
    private  String date_end;

    public TComplex() {
    }

    public TComplex(double area, String status, int floor, String type, String description, double price, String date_start, String date_end) {
        this.area = area;
        this.status = status;
        this.floor = floor;
        this.type = type;
        this.description = description;
        this.price = price;
        this.date_start = date_start;
        this.date_end = date_end;
    }

    public TComplex(int id, double area, String status, int floor, String type, String description, double price, String date_start, String date_end) {
        this.id = id;
        this.area = area;
        this.status = status;
        this.floor = floor;
        this.type = type;
        this.description = description;
        this.price = price;
        this.date_start = date_start;
        this.date_end = date_end;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate_start() {
        return date_start;
    }

    public void setDate_start(String date_start) {
        this.date_start = date_start;
    }

    public String getDate_end() {
        return date_end;
    }

    public void setDate_end(String date_end) {
        this.date_end = date_end;
    }
}
