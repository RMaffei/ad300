package geometric;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(3, 4);
        Shape triangle = new Triangle(3, 4, 5);

        displayShapeDetails(circle);
        displayShapeDetails(rectangle);
        displayShapeDetails(triangle);
    }
    public static void displayShapeDetails(Shape shape) {
        System.out.println("Shape: " + shape.getShapeName());
        System.out.printf("Area: %.3f\n", shape.calcArea());
        System.out.printf("Perimeter: %s\n\n", (shape instanceof Circle ? String.format("%.3f", shape.calcPerimeter()) : shape.calcPerimeter()));
    }
}
