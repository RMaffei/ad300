import java.util.ArrayList;
import java.util.List;

class GameLibrary<T extends Game> {
    private final List<T> games = new ArrayList<>();

    public void addItem(T game) {
        games.add(game);
    }

    public void removeItem(T game) {
        games.remove(game);
    }

    public T findItemByName(String name) {
        for (T game : games) {
            if (game.getName().equals(name)) {
                return game;
            }
        }
        return null;
    }

    public void listItems() {
        for (T game : games) {
            System.out.println(game);
        }
    }
}