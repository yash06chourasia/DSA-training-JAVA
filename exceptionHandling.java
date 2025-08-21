import java.util.Scanner;

public class exceptionHandling {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Numerator : ");
        int n=inp.nextInt();
        System.out.print("Enter Denominator : ");
        int d=inp.nextInt();
        try {
            int div=n/d;
            System.out.printf("Integer Division is %d",div);
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            // System.out.printf("%s",e.getMessage());
           
        }
    }
}
