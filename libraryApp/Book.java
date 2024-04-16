package libraryApp;
public class Book {
    private String title;            // title of book
    private String author;           // author of book
    private int yearPublished;       // year book was published
    private boolean isCheckedOut;    // boolean if the book is checked out
    private int totalCopies;         // total # of copies of the book
    private int copiesAvailable;     // # of copies currently available

    // constructor to initialize the book with title, author, yearPublished, and totalCopies
    public Book(String title, String author, int yearPublished, int totalCopies) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.totalCopies = totalCopies;
        this.copiesAvailable = totalCopies;    // by default all copies are available
        this.isCheckedOut = false;             // by default book not checked out
    }

    // getter methods for title, author, yearPublished, checkedout, and copies
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    public boolean isCheckedOut() {
        return isCheckedOut;
    }
    public int getTotalCopies() {
        return totalCopies;
    }
    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    // method to checkout a copy of the book
    public void checkoutCopy() {
        if (copiesAvailable > 0) {
            copiesAvailable--; // remove 1 if checked out
            isCheckedOut = true; // set to true when checked out
            System.out.println("One copy of " + title + " has been checked out.");
        } else {
            System.out.println("No copies of " + title + " are currently available.");
        }
    }

    // method to return copy of the book
    public void returnCopy() {
        if (copiesAvailable < totalCopies) {
            copiesAvailable++; // add+1 avail since returned
            isCheckedOut = false; // set to false after checked out
            System.out.println("One copy of " + title + " has been returned.");
        } else {
            System.out.println("All copies of " + title + " have been returned.");
        }
    }

    // method to convert book info to easy-to-read string output
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year Published: " + yearPublished + ", Total Copies: "
                + totalCopies + ", Copies Available: " + copiesAvailable;
    }
}
