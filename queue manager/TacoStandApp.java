import java.util.Scanner;

public class TacoStandApp {
    private QueueManager manager;
    private Scanner scanner;

    public TacoStandApp() {
        manager = new QueueManager();
        scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            displayMenu();
            int option = getUserInput();
            handleOption(option);
        }
    }

    private void displayMenu() {
        System.out.println("\nOptions:");
        System.out.println("1. Add customer to waiting list");
        System.out.println("2. Serve customer");
        System.out.println("3. Check for name on list");
        System.out.println("4. Display number of people in queue");
        System.out.println("5. Display queue");
        System.out.println("6. Exit");
        System.out.print("Choose an option: ");
    }

    private int getUserInput() {
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    private void handleOption(int option) {
        switch (option) {
            case 1:
                addCustomer();
                break;
            case 2:
                serveCustomer();
                break;
            case 3:
                checkCustomerInList();
                break;
            case 4:
                displayListSize();
                break;
            case 5:
                displayWaitingList();
                break;
            case 6:
                exit();
                break;
            default:
                System.out.println("Invalid input. Please try again.");
        }
    }

    private void addCustomer() {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        manager.addCustomer(name);
    }

    private void serveCustomer() {
        System.out.println(manager.serveCustomer());
    }

    private void checkCustomerInList() {
        System.out.print("Enter customer name to check: ");
        String name = scanner.nextLine();
        if (manager.isCustomerInList(name)) {
            System.out.println(name + " is on the waiting list.");
        } else {
            System.out.println(name + " is not on the waiting list.");
        }
    }

    private void displayListSize() {
        System.out.println("Number of people queued: " + manager.getWaitingListSize());
    }

    private void displayWaitingList() {
        manager.displayWaitingList();
    }

    private void exit() {
        System.out.println("Exiting program...");
        scanner.close();
        System.exit(0);
    }

    public static void main(String[] args) {
        TacoStandApp tacoStandApp = new TacoStandApp();
        tacoStandApp.run();
    }
}