package AnimalKingdom;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override

    public void makeSound() {
        System.out.println(name + " says Woof!");
    }
    public void wag() {
        System.out.println(name + " wags their tail");
    }
}