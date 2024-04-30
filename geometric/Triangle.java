package geometric;

public class Triangle extends Shape {
    private final double side1;
    private final double side2;
    private final double base;

    public Triangle(double side1, double side2, double base) {
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
    }
    // heron's formula
    @Override
    public double calcArea() {
        double s = (side1 + side2 + base) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - base));
    }

    @Override
    public double calcPerimeter() {
        return side1 + side2 + base;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }
}