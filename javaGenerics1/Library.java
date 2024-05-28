import java.util.ArrayList;
import java.util.List;

class Library<T extends LibraryItem> {
    private final List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public T findItemByName(String name) {
        for (T item : items) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public void listItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}