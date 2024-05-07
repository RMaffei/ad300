package frequencyCounter;
import java.util.*;

public class WordFreqCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> wordFrequencyMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        while (true) {
            // ask user to input line of text
            System.out.println("Enter text (or enter 'exit' to close):");
            String line = scanner.nextLine();
            // ask if user wants to exit / end program
            if (line.equalsIgnoreCase("exit")) {
                break;
            }
            // split inputted text into words
            String[] words = line.split("\\s+");
            // calculate the frequency of each word using hashmap
            for (String word : words) {
                word = word.toLowerCase();
                wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
            }
        }
        // print the resulting word frequency
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}