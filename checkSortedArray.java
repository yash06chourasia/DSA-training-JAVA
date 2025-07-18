import java.util.Scanner;

public class checkSortedArray {
    public static void main(String[] args) {
        System.out.print("Enter the size of array : ");
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter "+(i+1)+" element : ");
            arr[i]=in.nextInt();
        }
        boolean incre=isIncrease(arr);
        boolean decre=isDecrease(arr);
        if(incre||decre){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
    public static boolean isIncrease(int []arr){
        int i=1;
        while(i<arr.length){
            if(arr[i]<arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
     public static boolean isDecrease(int []arr){
        int i=1;
        while(i<arr.length){
            if(arr[i]>arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
