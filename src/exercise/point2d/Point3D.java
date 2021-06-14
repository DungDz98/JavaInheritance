package exercise.point2d;

public class Point3D extends Point2D{
    private float z = 0.0f;
    Point3D() {

    }
    Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ() {
        float[] arr1 = {super.getX(), super.getY(), this.getZ()};
        return arr1;
    }

    @Override
    public String toString() {
        return "(" + this.getX() + ", " + this.getY() + ", " + this.getZ() + ")";
    }
}
