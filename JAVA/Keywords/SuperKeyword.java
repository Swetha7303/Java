class Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void display() {
        super.display(); // calling parent class method
        System.out.println("This is the child class.");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}