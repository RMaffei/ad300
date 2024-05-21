package zoo;

public class Giraffe extends Animal {
    public Giraffe(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Grunt");
    }
}