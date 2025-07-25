class Fruit{
    String flavour;
    int price;
    String color;
    // Default Constructor
    Fruit(){
        flavour="Sweet";
        price=100;
    }

}

public class defaultConstructor {
    public static void main(String[] args) {
        Fruit myFruit=new Fruit();
        System.out.println(myFruit.flavour);
        System.out.println(myFruit.price);
        System.out.println(myFruit.color);
        // Since color is not initialized it gives null
        
    }
}
