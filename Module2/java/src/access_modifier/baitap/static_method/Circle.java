package access_modifier.baitap.static_method;

import javafx.scene.input.KeyCode;

public class Circle {
    private double radius=1.0d;
    private String color="red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.pow(this.radius,2)*3.14;
    }
}
