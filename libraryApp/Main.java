package libraryApp;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Library library = new Library(); //
        // add books to the library
        library.addBook(new Book("Stargazing", "Jen Wang", 2019, 6));
        library.addBook(new Book("The Book of Essie", "Meghan MacLean Weir", 2018, 2));
        library.addBook(new Book("The Secret Keeper", "Kate Morton", 2013, 1));

        // display available books
        System.out.println("Available Books:");
        library.displayAvailableBooks();

        // search for books
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter keyword to search for book:");
        String keyword = scanner.nextLine();
        System.out.println("\nSearch results for '" + keyword + "':");
        library.searchBook(keyword);

        // check out a book
        System.out.println("\nEnter the title of the book you want to check out:");
        String checkoutTitle = scanner.nextLine();
        library.checkoutBook(checkoutTitle);

        // display availalbe books after checkout
        System.out.println("\nAvailable Books after Checkout:");
        library.displayAvailableBooks();

        // return the book
        System.out.println("\nEnter the title of the book you want to return:");
        String returnTitle = scanner.nextLine();
        library.returnBook(returnTitle);

        // display available books after return
        System.out.println("\nAvailable Books after return:");
        library.displayAvailableBooks();
        scanner.close();
    }
}
