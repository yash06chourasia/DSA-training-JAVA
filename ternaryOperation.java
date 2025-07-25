import java.util.Scanner;

public class ternaryOperation {
    public static void main(String[] args) {
        System.out.print("Enter your age :");
        Scanner inp=new Scanner(System.in);
        int age=inp.nextInt();
        String var= age>=18 ?"Eligible to vote" : "Not Eligible to vote" ;
        System.out.println(var);
        System.out.print("Enter n1: ");
        int n1=inp.nextInt();
        System.out.print("Enter n2: ");
        int n2=inp.nextInt();
        int greater=n1>n2?n1:n2;
        System.out.println(greater+" is greater");
    }
}
