// AbstractExample.java

abstract class Animal {

    // Abstract method
    abstract void sound();

    // Concrete method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

public class AbstractExample {

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.sound();
        dog.eat();
    }
}
