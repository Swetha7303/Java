final class Vehicle {
    void display() {
        System.out.println("This is a vehicle.");
    }
}
public class FinalKeyword{
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.display();
    }
}