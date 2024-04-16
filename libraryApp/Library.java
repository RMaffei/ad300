package libraryApp;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private final ArrayList<Book> books;    // collection of books in the library

    // constructor to initialize the library with an empty list of books
    public Library() {
        this.books = new ArrayList<>();
    }
    // method to add book to library
    public void addBook(Book book) {
        books.add(book);
    }
    // Method to display all available books in the library
    public void displayAvailableBooks() {
        for (Book book : books) {
            if (!book.isCheckedOut()) { // if book not checked out, show available
                System.out.println(book);
            }
        }
    }
    // Method to search for books by title or author
    public void searchBook(String keyword) {
        boolean found = false;
        for (Book book : books) {
            String title = book.getTitle().toLowerCase();
            String author = book.getAuthor().toLowerCase();
            if (title.contains(keyword.toLowerCase()) || author.contains(keyword.toLowerCase())) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found matching search term '" + keyword + "'.");
        }
    }
    // Method to checkout a book by title
    public void checkoutBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.checkoutCopy();
                return;
            }
        }
        System.out.println("Book with title '" + title + "' not found.");
    }

    // Method to return a book by title
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) { // results can be case-sensitive, ignore these
                book.returnCopy();
                return; // exit method if book is found & returned
            }
        }
        System.out.println("Book with name '" + title + "' not found.");
    }
}
