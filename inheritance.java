class Vehicle {
    protected void display() {
        System.out.println("I'm in Vehicle class");
    }
}
// Inheritance can work with default public protected access modifier easily

class TwoWheeler extends Vehicle {
}

public class inheritance {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.display();
        TwoWheeler two = new TwoWheeler();
        two.display(); 
    }
}

