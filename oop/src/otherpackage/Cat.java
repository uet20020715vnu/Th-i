package otherpackage;

// Cat.java
public class Cat extends abstractAnimal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating.");
    }

    @Override
    public void sound() {
        System.out.println(name + " is meowing.");
    }

    @Override
    public void move() {
        System.out.println(name + " is jumping.");
    }
}
