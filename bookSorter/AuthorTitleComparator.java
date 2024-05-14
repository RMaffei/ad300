import java.util.Comparator;

public class AuthorTitleComparator implements Comparator<Book> {
    private Comparator<Book> authorComparator;
    private Comparator<Book> titleComparator;

    public AuthorTitleComparator(Comparator<Book> authorComparator, Comparator<Book> titleComparator) {
        this.authorComparator = authorComparator;
        this.titleComparator = titleComparator;
    }

    @Override
    public int compare(Book book1, Book book2) {
        int authorComparison = authorComparator.compare(book1, book2);
        if (authorComparison == 0) {
            return titleComparator.compare(book1, book2);
        }
        return authorComparison;
    }
}