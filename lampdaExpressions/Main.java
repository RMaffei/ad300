public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1: Using Simple Lambda Expressions");
        LambdaIntegers.executeTask();

        System.out.println("\nTask 2: Using Lambda Expressions with Functional Interfaces");
        MathOperations.performOperations();

        System.out.println("\nTask 3: Using Lambda Expressions with Collections");
        Racers.showRacers();

        System.out.println("\nTask 4: Using Built-in Functional Interfaces");
        BuiltInInterfaces.useBuiltInInterfaces();
    }
}