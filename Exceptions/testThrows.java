package Exceptions;
public class testThrows {
     static public void printName(String name)throws IllegalArgumentException{
        if(name.contains("-")||name.contains(" ")){
            throw new IllegalArgumentException();
        }
            System.out.println(name);
        
    }
    public static void main(String[] args) {
        try{
            printName("Yash Chourasia");
        }catch(IllegalArgumentException e){
            System.out.println("Name cannot contain hyphens and space ");
        }finally{
            System.out.println("Im in finally block");
        }
        
    }
}
