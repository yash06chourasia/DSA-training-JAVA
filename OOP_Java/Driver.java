public class Driver {
    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.fuelAvailable=15;
        myCar.driving();
        System.out.println(myCar.getFuelAvialability());
    }
}

