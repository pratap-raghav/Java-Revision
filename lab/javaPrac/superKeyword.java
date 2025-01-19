class Parent {
    void display() {
        System.out.println("Parent's display method");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child's display method");
        super.display(); // Calling parent class's display method
    }
}

public class superKeyword {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
