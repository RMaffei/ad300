import java.util.Scanner;
public class PercentToGPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Percentage: ");
        int percentage = scanner.nextInt();
        double GPA = getGPA(percentage);

        if (GPA != -1) {
            System.out.println("Percentage: " + percentage + "%, Your GPA is: " + GPA);
        } else {
            System.out.println("Invalid % entered.");
        }
        scanner.close();
    }
    private static double getGPA(int percentage) {
        double GPA;
        if (percentage >= 95) {
            GPA = 4.0;
        } else if (percentage >= 65) {
            GPA = 1 + (percentage - 65) / 10.0;
        } else if (percentage == 0) {
            GPA = 0.0; // Set GPA to 0.0 for 0%
        } else {
            GPA = -1; // throw error if invalid
        }
        return GPA;
    }
}
