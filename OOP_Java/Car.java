public class Car{
    // Instance variable
    int noOfSeats;
    float fuelCapacity;
    float fuelAvailable;
    String color;
    float maxSpeed;

    // Instance methods
    public void driving(){
        System.out.println("Car is driving");
        fuelAvailable--;
    }
    public void addFuel(float fuel){
        fuelAvailable+=fuel;
    }
    public float getFuelAvialability(){
        return fuelAvailable;
    }

}