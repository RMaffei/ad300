// HashMapSamples.java
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
// class to store and manage collection of media
public class HashMapSamples {
    public static void main(String[] args) {
        HashMap<String, Integer> itemCategories = new HashMap<>();
        itemCategories.put("Books", 12);
        itemCategories.put("Movies", 8);
        itemCategories.put("Music", 15);
        itemCategories.put("Games", 5);
        itemCategories.put("Electronics", 10);
        System.out.println("Item Categories:");
        Iterator<Map.Entry<String, Integer>> iterator = itemCategories.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}