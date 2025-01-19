interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class simpleInterface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
