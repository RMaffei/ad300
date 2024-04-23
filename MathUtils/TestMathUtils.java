public class TestMathUtils {
    public static void main(String[] args) {
        // test addition method
        System.out.println("Addition of 1 + 2: " + MathUtils.add(1,2));
        System.out.println("Addition of 3 + 6: " + MathUtils.add(3,6));

        // test the subtraction method
        System.out.println("Subtracting 8 from 12: " + MathUtils.sub(12,8));
        System.out.println("Subtracting 18 from 16: " + MathUtils.sub(16,18));

        // test the multiplication method
        System.out.println("Multiplying 5 and 3: " + MathUtils.multiply(5,3));
        System.out.println("Multiplying 0 and 6: " + MathUtils.multiply(0,6));

        // test the division method
        System.out.println("Dividing 0 from 12: " + MathUtils.divide(12,0));
        System.out.println("Dividing 3 from 12: " + MathUtils.divide(12,3));
    }
}