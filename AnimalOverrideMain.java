// Q1: Method overriding — Animal and Cat
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        // The question specifically asks Cat to bark.
        System.out.println("Bark!");
    }
}

public class AnimalOverrideMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        animal.makeSound();
        cat.makeSound();
    }
}
