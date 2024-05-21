package zoo;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();

    // overload method:
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            makeSound();
        }
    }
}