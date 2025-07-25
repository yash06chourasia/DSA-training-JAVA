class Orange{
    String flavour;
    int price;
    String color;
    String name;
    // Static block execute once when class created
    static{
        System.out.println("This is Static Block");
    }
    // Initialization block execute everytime when every object is create
    {
        System.out.println("This is Initialization Block");
    }


    // Parameterized  Constructor
    Orange(String color){
        flavour="tangy";
        price=100;
        this.color=color;
    }
// Constructor Chaining is linking of one constructor to another by using this statement as first statement and ensuring no deadlocks
     Orange(){
        this("Orange");
        price=120;
    }

}

public class parameterizeConstructor {
    public static void main(String[] args) {
        Orange o= new Orange("Bright Orange");
        System.out.println(o.color);
        Orange or=new Orange();
        System.out.println(or.color);
        System.out.println(or.price);

        
    }
}
