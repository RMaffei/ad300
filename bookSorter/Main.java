import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Gone Girl", "Gillian Flynn", 2012));
        books.add(new Book("Life of Pi", "Yann Martel", 2001));
        books.add(new Book("The Hunger Games", "Suzanne Collins", 2008));
        books.add(new Book("Dune", "Frank Herbert", 1965));
        books.add(new Book("The Da Vinci Code", "Dan Brown", 2003));

        System.out.println("Books before sorting:");
        books.forEach(System.out::println);

        System.out.println("\nBooks after sorting by title:");
        Collections.sort(books, new TitleComparator());
        books.forEach(System.out::println);

        System.out.println("\nBooks after sorting by author:");
        Collections.sort(books, new AuthorComparator());
        books.forEach(System.out::println);

        System.out.println("\nBooks after sorting by year:");
        Collections.sort(books, new YearComparator());
        books.forEach(System.out::println);

        System.out.println("\nBooks after sorting by author, then title:");
        Collections.sort(books, new AuthorTitleComparator(new AuthorComparator(), new TitleComparator()));
        books.forEach(System.out::println);
    }
}