package geometric;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // take input for calculations
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);

        // rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);

        // triangle
        System.out.print("Enter the first side of the triangle: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the second side of the triangle: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        Triangle triangle = new Triangle(side1, side2, base);
        // print results
        displayShapeDetails(circle);
        displayShapeDetails(rectangle);
        displayShapeDetails(triangle);
        scanner.close();
    }

    public static void displayShapeDetails(Shape shape) {
        System.out.println("\nShape: " + shape.getShapeName());
        System.out.printf("Area: %.3f%n", shape.calcArea());
        System.out.printf("Perimeter: %.3f%n", shape.calcPerimeter());
    }
}