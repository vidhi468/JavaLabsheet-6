// Q6: Abstract Animal with Lion and Tiger subclasses
abstract class Animal {
    abstract void sound();
}

class Lion extends Animal {
    @Override
    void sound() {
        System.out.println("Lion: Roar!");
    }
}

class Tiger extends Animal {
    @Override
    void sound() {
        System.out.println("Tiger: Grrr!");
    }
}

public class AnimalAbstractMain {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        lion.sound();
        tiger.sound();
    }
}
