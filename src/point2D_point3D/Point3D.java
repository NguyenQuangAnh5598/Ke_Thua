package point2D_point3D;

public class Point3D extends Point2D{
    private float z = 0.0f;
    public Point3D(){
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
    public void setXY(float x,float y,float z) {
        setX(x);
        setY(y);
        this.z = z;
    }
    public float[] getXYZ() {
        float[] getXYZ = {getX(),getY(),z};
        return getXYZ;
    }

    @Override
    public String toString() {
        return "Point3D { " +
               super.toString() +
                "z = " + z +
                " }";
    }
}
