import java.util.Scanner;

public class GPAtoPercent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter GPA: ");
        double GPA = scanner.nextDouble();
        int percentage = getPercentage(GPA);
        // create print exceptions for 0.0, 0.1-0.9, and 4.0 GPAs
        if (percentage != -1 && GPA != 4.0 && GPA != 0.0 && GPA >= 1.0) {
            // take calculated percentage from getPercentage, +1 for range
            System.out.println("GPA: " + GPA + ", Your Grade is between: " + percentage + "% to " + (percentage + 1) + "%");
        } else if (GPA >= 4.0) {
            System.out.println("GPA: 4.0 " + "Your Grade is between: " + "95% to 100%");
        } else if (GPA == 0.0) {
            System.out.println("GPA: 0.0 " + "Your Grade is between: " + "0% to 65%");
        } else {
            // exception for GPAs 0.1-0.9 as they do not exist
            System.out.println("Invalid GPA entered.");
        }
        scanner.close();
    }

    private static int getPercentage(double GPA) {
        int percent;
        switch ((int) GPA) {
            // percent = store % based on GPA value calculated within range of 65=95%
            case 4:
                percent = 95;
                break;
            case 0:
                percent = 0;
                break;
            default:
                if (GPA >= 1 && GPA <= 3.9) {
                    percent = 65 + (int) ((GPA - 1) * 10);
                } else {
                    // throw error if invalid percentage calculated
                    percent = -1;
                }
                break;
        }
        return percent;
    }
}
