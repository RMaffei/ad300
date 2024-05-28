import java.util.ArrayList;
import java.util.Collections;

public class SortHelper {
    public static <T extends Comparable<T>> void sortList(ArrayList<T> list) {
        Collections.sort(list);
    }
}