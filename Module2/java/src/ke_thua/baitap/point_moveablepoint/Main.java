package ke_thua.baitap.point_moveablepoint;

import java.util.Arrays;

class Point {
    private float x=0.0f;
    private float y=0.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX() {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
        float []a={getX(),getY()};
        return  a;
    }
    @Override
    public String toString(){
        return "Point: "
                + Arrays.toString(getXY());
    }
}
class MoveablePoint extends Point{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;

    public MoveablePoint() {

    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float []a={xSpeed,ySpeed};
        return  a;
    }

    @Override
    public String toString(){
        return "Point: "
                + Arrays.toString(getXY())
                +" Speed "
                + Arrays.toString(getSpeed())
                +" Moveable Point "
                +Arrays.toString(move());
    }
    public float[] move(){
        float x= getxSpeed() + getX();
        float y=getY()+getySpeed();
        float []a= {x,y};
        return a;
    }
}
class Main{
    public static void main(String[] args) {
        MoveablePoint moveablePoint=new MoveablePoint();
        System.out.println(moveablePoint);
        moveablePoint= new MoveablePoint(1,2,3,4);
        System.out.println(moveablePoint);
    }
}
