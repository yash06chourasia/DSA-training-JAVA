public class Driver {
    static int minAge=18;
    // Static can be used outside scope without creating object
    String name="Ram";
    String dateOfLicense;
    // For above two object creation is necessary to use
    public static void main(String[] args) {
        Car myCar=new Car();
        // myCar.fuelAvailable=15;
        myCar.driving();
        System.out.println(myCar.getFuelAvialability());
        myCar.addFuel(6);
        myCar.driving();
        System.out.println(myCar.getFuelAvialability());
        System.out.println(minAge);
        Driver myDriver=new Driver();
        // Object created to use non static member of a class
        System.out.println(myDriver.name);
    }
}

