package ke_thua.baitap.circle;

public class Cylinder extends Circle{
    private double hight=2.0d;

    public Cylinder() {

    }

    public Cylinder(double hight) {
        this.hight = hight;
    }

    public Cylinder(double radius, String color, double hight) {
        super(radius, color);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
    public double getVolume(){
        return getArea()*hight;
    }
    @Override
    public String toString(){
        return super.toString()
                +" , chiều cao : "
                + getHight()
                +" , thể tích là : "
                +getVolume()
                ;
    }
}
