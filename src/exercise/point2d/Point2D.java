package exercise.point2d;

import java.awt.*;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    Point2D() {

    }

    Point2D(float x, float y) {
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

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = {this.x, this.y};
        return arr;
    }
    @Override
    public String toString() {
        return "(" +this.getX() + ", " + this.getY() + ")";
    }
}
