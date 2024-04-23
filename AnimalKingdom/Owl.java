package AnimalKingdom;

public class Owl extends Animal {
    public Owl(String name, int age) {
        super(name, age); // call constructor to add name + age to animal
    }
    @Override

    public void makeSound() {
        System.out.println(name + " says Hoot Hoot!");
    }
    public void fly() {
        System.out.println(name + " is flying and surveying the area.");
    }
}
