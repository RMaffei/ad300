public class MathUtils {
    // addition method (2 integers & return sum)
    public static int add(int a, int b) {
        return a + b;
    }
    // subtraction method (a-b)
    public static int sub(int a, int b) {
        return a - b;
    }
    // multiplication method (a * b)
    public static int multiply(int a, int b) {
        return a * b;
    }
    // division method (a / b)
    public static double divide(int a, int b) {
        if (b == 0) {
            return Double.NaN; // 0 is indivisible / return NaN
        }
        return (double) a / b;
    }
}

