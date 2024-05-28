import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // multi-type generic pair
        KeyValuePair<String, Integer> agePair = new KeyValuePair<>("Age", 30);
        System.out.println(agePair);
        agePair.setValue(31);
        System.out.println(agePair);

        // generic stack - game stack
        GameStack<String> stringStack = new GameStack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());

        // gen sort utility
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9));
        SortHelper.sortList(intList);
        System.out.println("Sorted Integers: " + intList);

        ArrayList<String> strList = new ArrayList<>(Arrays.asList("banana", "apple", "cherry"));
        SortHelper.sortList(strList);
        System.out.println("Sorted Strings: " + strList);

        // wildcard Usage in methods
        CollectionHelper.printAllItems(intList);
        CollectionHelper.printAllItems(strList);

        ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3));
        double sum = CollectionHelper.sumNumbers(doubleList);
        System.out.println("Sum of Double List: " + sum);

        // using generic cache
        GameCache<Integer> intCache = new GameCache<>();
        intCache.addItem("One", 1);
        intCache.addItem("Two", 2);
        System.out.println("Cache One: " + intCache.getItem("One"));
        System.out.println("Cache Two: " + intCache.getItem("Two"));

        GameCache<Number> numberCache = new GameCache<>();
        numberCache.addAllItems(intCache);
        System.out.println("Number Cache One: " + numberCache.getItem("One"));
        System.out.println("Number Cache Two: " + numberCache.getItem("Two"));

        // video game library
        GameLibrary<Game> gameLibrary = new GameLibrary<>();
        gameLibrary.addItem(new VideoGame("The Legend of Zelda", "Nintendo"));
        gameLibrary.addItem(new VideoGame("Cyberpunk 2077", "CD Projekt"));
        gameLibrary.addItem(new VideoGame("Stray", "BlueTwelve Studio"));

        System.out.println("Game Library:");
        gameLibrary.listItems();

        Game foundGame = gameLibrary.findItemByName("Cyberpunk 2077");
        if (foundGame != null) {
            System.out.println("Found: " + foundGame.getName());
            foundGame.borrowItem();
        }

        System.out.println("Game Library after borrowing 'Cyberpunk 2077':");
        gameLibrary.listItems();

        if (foundGame != null) {
            foundGame.returnItem();
        }

        System.out.println("Game Library after returning 'Cyberpunk 2077':");
        gameLibrary.listItems();
    }
}