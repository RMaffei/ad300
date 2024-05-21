import java.util.function.Predicate;
import java.util.function.Function;

public class BuiltInInterfaces {
    public static void useBuiltInInterfaces() {
        // use predicate to check if string is empty
        Predicate<String> isEmpty = str -> str.isEmpty();
        System.out.println("Is empty: " + isEmpty.test(""));

        // use function to convert a string to uppercase
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        System.out.println("Uppercase: " + toUpperCase.apply("formula one"));
    }
}