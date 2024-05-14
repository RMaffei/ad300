import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

// use treemap to store and manage data via sorting
public class TreeMapUse {
    public static void main(String[] args) {
        TreeMap<String, String> booksMap = new TreeMap<>();
        booksMap.put("978-1455586691", "Gone Girl");
        booksMap.put("978-1400032716", "Life of Pi");
        booksMap.put("978-0547928210", "The Hunger Games");
        booksMap.put("978-0441172719,", "Dune");
        booksMap.put("978-1400034772", "The Da Vinci Code");
        booksMap.put("978-0062073488", "Of Mice and Men");
        System.out.println("Books in Library:");
        Iterator<Map.Entry<String, String>> iterator = booksMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("ISBN: " + entry.getKey() + ", Title: " + entry.getValue());
        }
    }
}