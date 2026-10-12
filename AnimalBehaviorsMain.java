// Q9: Abstract Animal with eat() and sleep()
abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("Lion eats meat.");
    }

    @Override
    void sleep() {
        System.out.println("Lion rests in its territory.");
    }
}

class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger hunts and eats meat.");
    }

    @Override
    void sleep() {
        System.out.println("Tiger sleeps in a sheltered area.");
    }
}

class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("Deer eats grass and leaves.");
    }

    @Override
    void sleep() {
        System.out.println("Deer rests in a safe, sheltered place.");
    }
}

public class AnimalBehaviorsMain {
    public static void main(String[] args) {
        Animal[] animals = { new Lion(), new Tiger(), new Deer() };
        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();
            animals[i].sleep();
        }
    }
}
