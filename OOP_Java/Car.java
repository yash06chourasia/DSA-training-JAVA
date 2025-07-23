public class Car{
    // Instance variable
    int noOfSeats;
    float fuelCapacity;
    float fuelAvailable;
    String color;
    float maxSpeed;

    // Instance methods
    public void driving(){
        if(fuelAvailable==0){
            System.out.println("Car is out of fuel");
            return;
        }
        System.out.println("Car is driving");
        fuelAvailable--;
    }
    public void addFuel(float fuelAvailable){
        this.fuelAvailable+=fuelAvailable;
        // this resolves naming conflicts as well as used in constructor.It is also used to access instance variable of one class to another
    }
    public float getFuelAvialability(){
        return fuelAvailable;
    }

}