import java.util.Scanner;

// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dog d = new Dog();

        System.out.println("Inheritance Demo");
        d.sound();   // Inherited method
        d.bark();    // Child class method

        sc.close();
    }
}
