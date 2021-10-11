package access_modifier.baitap.static_method;

import access_modifier.thuchanh.static_property.Car;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println("Radius: "+circle.getRadius());
        System.out.println("Arena: "+circle.getArea());

        Circle circle1=new Circle(2);
        System.out.println("Radius: "+circle1.getRadius());
        System.out.println("Arena: "+circle1.getArea());
    }
}
