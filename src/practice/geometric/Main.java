package practice.geometric;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(5.0);
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}
