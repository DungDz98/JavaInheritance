package exercise.circlecylinder;

public class Cylinder extends Circle{
    private double height;

    Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + Math.PI * this.getRadius() * this.getHeight() * 2;
    }

    @Override
    public String toString() {
        return "A cylinder with height = " + this.getHeight() + " and with area = " + this.getArea() + " , which is a sub class of " + super.toString();
    }
}
