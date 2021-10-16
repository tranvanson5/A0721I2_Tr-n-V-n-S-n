package ke_thua.baitap.point2d_point3d;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float z=3.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }


    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        float []a= new float[]{getX(),getY(), getZ()};
        return  a;
    }
    @Override
    public String toString(){
        final String s = super.toString()
                + " Point3D: "
                + Arrays.toString(getXYZ());
        return s;
    }
}
