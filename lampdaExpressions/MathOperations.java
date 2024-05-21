public class MathOperations {
    public static void performOperations() {
        // use lambda expressions to implement mathoperation;
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        // test the operations:
        System.out.println("Addition: " + addition.operate(12, 6));
        System.out.println("Subtraction: " + subtraction.operate(7, 5));
        System.out.println("Multiplication: " + multiplication.operate(3, 5));
        System.out.println("Division: " + division.operate(25, 5));
    }
}