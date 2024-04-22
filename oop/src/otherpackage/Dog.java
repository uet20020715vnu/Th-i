package otherpackage;

// Dog.java
public class Dog extends abstractAnimal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating.");
    }

    @Override
    public void sound() {
        System.out.println(name + " is barking.");
    }

    @Override
    public void move() {
        System.out.println(name + " is running.");
    }
}
