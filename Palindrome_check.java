import java.util.Scanner;

public class Palindrome_check {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter String to check Palindrome :");
        String str= inp.nextLine();
        boolean check=true;
        for(int i=0;i<str.length()/2;i++){
            
              if(str.charAt(i)!=str.charAt(str.length()-1-i)){
              check=false;
              break;
             }
            
        }
        if(check==false){
                System.out.println("Not a Palindrome");
        }
        else{
            System.out.println("Palindrome");
        }
    }

}
