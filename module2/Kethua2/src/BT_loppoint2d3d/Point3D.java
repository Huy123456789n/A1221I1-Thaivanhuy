package BT_loppoint2d3d;

public class Point3D extends Point2D{
    private float z = 0.0f;
    public Point3D(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }
    public Point3D() {

    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float z,float x,float y) {
        this.z = z;
        setXY(x, y);
    }
    public float[] getXYZ() {
        float [] arr = getXY();
        arr[0x2] = z;
        return arr;
    }

    @Override
    public String toString() {
        return "x"
                + getX()
                + "y" + getY()
                + "z =" + getZ() +"array :"
                 + super.toString();

    }
}
