package ke_thua.baitap.point2d_point3d;

import java.util.Arrays;

public class Point2D {
    private float x=1.0f;
    private float y=2.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
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
        return "Point2D: "
                + Arrays.toString(getXY());
    }
}
