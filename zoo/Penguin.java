package zoo;

public class Penguin extends Animal {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Squawk");
    }
}