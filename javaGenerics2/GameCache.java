import java.util.HashMap;
import java.util.Map;

public class GameCache<Item> {
    private Map<String, Item> cache = new HashMap<>();

    public void addItem(String key, Item value) {
        cache.put(key, value);
    }

    public Item getItem(String key) {
        return cache.get(key);
    }

    public void clearCache() {
        cache.clear();
    }

    public void addAllItems(GameCache<? extends Item> otherCache) {
        for (Map.Entry<String, ? extends Item> entry : otherCache.cache.entrySet()) {
            this.cache.put(entry.getKey(), entry.getValue());
        }
    }
}