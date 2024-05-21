public class LambdaIntegers {
    public static void executeTask() {
        // use lambda expression to create a simple task
        Task task = () -> {
            System.out.println("Here are some mathmetical expressions:");
        };
        new Thread(task).start();
    }
}