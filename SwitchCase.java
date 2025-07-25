import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.print("Enter day number between 1 to 7 : ");
        Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        // switch (num) {
        //     case 1:
        //         System.out.println("Sunday");
        //         break;
        //     case 2:
        //         System.out.println("Monday");
        //         break;
        //     case 3:
        //         System.out.println("Tuesday");
        //         break;
        //     case 4:
        //         System.out.println("Wednesday");
        //         break;
        //     case 5:
        //         System.out.println("Thursday");
        //         break;
        //     case 6:
                //     Fall through
                // // System.out.println("Friday");
                // // break; 
        //     case 7:
        //         System.out.println("Saturday");
        //         break;  
        //     default:
        //         System.out.println("Day number is out of bound");
        // }

        String day=switch(num){
            case 1 ->"Sunday";
            case 2 ->"Monday";
            case 3 ->"Tuesday";
            case 4 ->"Wednesday";
            case 5 ->"Thursday";
            case 6 ->"Friday";
            case 7 ->"saturday";
            default ->"Invalid";
        };
        System.out.println(day);
    }
}
