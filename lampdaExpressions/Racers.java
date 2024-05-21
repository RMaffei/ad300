import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Racers {
    public static void showRacers() {
        // list of formula one racers:
        List<String> names = new ArrayList<>();
        names.add("M. Verstappen");
        names.add("L. Norris");
        names.add("C. Leclerc");
        names.add("O. Piastri");
        names.add("C. Sainz Jr.");

        // sort the list of names:
        Collections.sort(names, (name1, name2) -> name1.compareTo(name2));
        System.out.println("Starting Order: " + names);

        // predicate to filter out names with <12 characters
        Predicate<String> lessThanTwelveChars = name -> name.length() < 12;

        // filtering the list
        List<String> filteredNames = names.stream()
                .filter(lessThanTwelveChars.negate()) // keeping names with >12 characters
                .collect(Collectors.toList());

        System.out.println("Names with 12 (or more) characters: " + filteredNames);

        // filter list of #s:
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // remove even numbers:
        numbers.removeIf(number -> number % 2 == 0);
        System.out.println("Odd Numbers: " + numbers);
    }
}