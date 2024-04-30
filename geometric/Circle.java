package geometric;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }
}