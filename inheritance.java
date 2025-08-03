class Vehicle {
    public void display() {
        System.out.println("I'm in Vehicle class");
    }
}

class TwoWheeler extends Vehicle {
}

public class inheritance {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        TwoWheeler two = new TwoWheeler();
        two.display(); 
    }
}

