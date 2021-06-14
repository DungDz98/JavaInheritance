package exercise.circlecylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(10, "red");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(5, "yellow", 10);
        System.out.println(cylinder);
    }
}
