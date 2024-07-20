class Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("This is the child class.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}