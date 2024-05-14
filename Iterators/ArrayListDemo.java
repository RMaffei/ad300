// ArrayListDemo.java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
// add or remove elements in array in dynamic way
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> randomIntegers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomIntegers.add(random.nextInt(100));
        }

        System.out.println("Random Integers:");
        Iterator<Integer> iterator = randomIntegers.iterator();
        int sum = 0;
        while (iterator.hasNext()) {
            int num = iterator.next();
            sum += num;
            System.out.println(num);
        }
        System.out.println("Total Sum: " + sum);
    }
}