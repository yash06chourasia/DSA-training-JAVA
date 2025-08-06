
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog says: Woof Woof");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat says: Meow Meow");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}
