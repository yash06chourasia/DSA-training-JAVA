import java.util.Scanner;

public class exceptionHandling {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Numerator : ");
        int n=inp.nextInt();
        System.out.print("Enter Denominator : ");
        int d=inp.nextInt();
        try {
            double div=(double)n/d;
            System.out.printf("Division is %.3f",div);
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            // System.out.printf("%s",e.getMessage());
           
        }
    }
}
