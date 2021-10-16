package ke_thua.baitap.circle;

public class Circle {
    private double radius=1.0d;
    private String color="red";
    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }
  @Override
    public String toString(){
        return  "Hình tròn có bán kinh là : "
                + getRadius()
                + " , màu : "
                + getColor()
                +" , diện tích : "
                +getArea()
                ;
    }
}
