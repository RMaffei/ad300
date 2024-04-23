package AnimalKingdom;

public class Fox extends Animal {
    public Fox(String name, int age) {
        super(name, age);
    }
    @Override

    public void makeSound() {
        System.out.println(name + " starts to yip!");
    }
    public void jump() {
        System.out.println(name + " starts to jump.");
    }
}
