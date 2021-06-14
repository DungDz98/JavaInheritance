package exercise.triangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter the second side: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter the third side: ");
        double side3 = sc.nextDouble();
        System.out.print("Enter the color: ");
        String nothing = sc.nextLine();
        String color = sc.nextLine();
        Triangle triangle = new Triangle(side1, side2, side3, color);
        System.out.println(triangle);
    }
}
