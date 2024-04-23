package AnimalKingdom;

public class Animal {
    public static void main(String[] args) {
        Animal owl = new Owl("Simon", 20); // an owl named Simon
        Animal fox = new Fox("Tod", 14); // fox from Fox and the Hound
        Animal dog = new Dog("Copper", 14); // and his trusty companion

        // call methods for owl
        System.out.println("---Owl---");
        owl.eat();
        owl.sleep();
        owl.makeSound();
        // cast the owl object to an Owl then call fly method
        ((Owl) owl).fly();
        owl.displayInfo(); // print animal details

        // call methods for fox
        System.out.println("---Fox---");
        fox.eat();
        fox.sleep();
        fox.makeSound();
        ((Fox) fox).jump();
        fox.displayInfo();

        // call methods for dog
        System.out.println("---Dog---");
        dog.eat();
        dog.sleep();
        dog.makeSound();
        ((Dog) dog).wag();
        dog.displayInfo();
    }
    public String name;
    public int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void makeSound() {
    }

    public void displayInfo() {
        System.out.println("Name: " + name + " is " + age + " years old.");
    }
}
