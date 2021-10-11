package lop_va_doi_tuong.baitap;

public class Fan {
    private int SLOW=1;
    private int MEDIUM=2;
    private int FAST=3;
    private int speed=SLOW;
    private boolean on=false;
    private double radius=5.0d;
    private String color= "Blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSLOW(int SLOW) {
        this.SLOW = SLOW;
    }

    public void setMEDIUM(int MEDIUM) {
        this.MEDIUM = MEDIUM;
    }

    public void setFAST(int FAST) {
        this.FAST = FAST;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

   public Fan(){

   }
    public String toString() {
        if(this.on){
           return "Fan{" +
                    "fan is on" +
                    ", speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }else return "Fan{" +
                "fan is off" +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Fan fan1=new Fan();
        fan1.setOn(true);
        fan1.setSpeed(3);
        fan1.setColor("Yellow");
        fan1.setRadius(10);
        System.out.println(fan1.toString());

        Fan fan2=new Fan();
        fan2.setOn(false);
        fan2.setSpeed(2);
        fan2.setColor("Blue");
        fan2.setRadius(5);
        System.out.println(fan2.toString());
    }
}
