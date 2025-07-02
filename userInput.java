import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n=inp.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements ");
        for(int i=0;i<n;i++){
          arr[i]=inp.nextInt();
        }
        System.out.println("The array elements are ");
        for(int i=0;i<n;i++){
          System.out.println(arr[i]);
        }
        int max=arr[0];
        for(int i=1;i<n;i++){
          if(arr[i]>max){
            max=arr[i];
          }
        }
        System.out.println("Maximum is "+max);
        System.out.println("Hello");
    }
}
