import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // filter out even numbers
        System.out.println("Even numbers:");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        // map list of numbers to their squares and print squared values
        System.out.println("Squared values:");
        numbers.stream()
                .map(n -> n * n)
                .forEach(System.out::println);

        // filter out odd numbers and then map them to their cubes
        System.out.println("Odd numbers cubed:");
        numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n * n)
                .forEach(System.out::println);

        // sum all the numbers in the list using reduce
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        // gather all even numbers into a new list using collect
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // 'flatten' list of lists into a single list using flatMap
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("Flattened List: " + flattenedList);

        // group numbers by even/odd using groupingBy
        Map<Boolean, List<Integer>> groupedByEvenOdd = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));
        System.out.println("Grouped by Even/Odd: " + groupedByEvenOdd);

        // stream with names / custom objects
        List<Person> people = Arrays.asList(
                new Person("Doug", 27),
                new Person("James", 29),
                new Person("Violet", 25),
                new Person("Morgan", 36),
                new Person("Mallory", 33)
        );

        // filter out people >25 and print their names
        System.out.println("People older than 25:");
        people.stream()
                .filter(person -> person.getAge() > 25)
                .map(Person::getName)
                .forEach(System.out::println);

        // find oldest person in list
        Person oldestPerson = people.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .orElseThrow(NoSuchElementException::new);
        System.out.println("Oldest Person: " + oldestPerson.getName() + ", Age: " + oldestPerson.getAge());
    }
}