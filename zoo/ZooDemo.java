package zoo;

import java.util.ArrayList;

public class ZooDemo {
    public static void main(String[] args) {
        Animal tiger = new Tiger("Sam");
        Animal giraffe = new Giraffe("Otto");
        Animal penguin = new Penguin("Eva");

        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(tiger);
        zoo.add(giraffe);
        zoo.add(penguin);

        for (Animal animal : zoo) {
            System.out.println(animal.getName() + " says: ");
            animal.makeSound();
            animal.makeSound(2);  // overloaded method
            System.out.println();
        }
    }
}