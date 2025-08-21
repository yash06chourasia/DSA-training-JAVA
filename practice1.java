
// import java.util.Arrays;
// import java.util.Scanner;

// public class practice1 {
//     public static void linearSearch(int[] arr,int target){
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==target){
//                 System.out.println("Element found at index: "+i);
//                 return;
//             }
//         }
//        System.out.println("Element not found"); 

//     }


//     public static void binarySearch(int[] arr,int target){
//         int low=0;
//         int high=arr.length-1;
//         Arrays.sort(arr);
//         System.out.println("sorted array is ");
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);

//         }
//        while(low<=high){
//         int mid=(low+high)/2;
//         if(arr[mid]==target){
//             System.out.println("Element found at index : "+mid);
//             return;
//         }
//         else if (target<arr[mid]){
//             high=mid-1;
//         }
//         else {
//             low=mid+1;
//         }
//        }
//        System.out.println("Element not found");

//     }


//     public static void bubbleSort(int[] arr){
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[j]<arr[i]){
//                     int temp=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;
//                 }
//             }
//         }
//     }


//     public static void selectionSort(int[] arr){
//         for(int i=0;i<arr.length-1;i++){
//             int min=i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[j]<arr[min]){
//                     min=j;
//                 }
//             }
//             int temp=arr[i];
//             arr[i]=arr[min];
//             arr[min]=temp;
            
//         }
//     }
//     public static void main(String[] args) {

//         int arr[]={3,7,2,6,1,9,5,2};
//         // Scanner in=new Scanner(System.in);
//         // System.out.println("Enter target to find : ");
//         // int target=in.nextInt();
//         // linearSearch(arr,target);
//         // binarySearch(arr,target);
//         // bubbleSort(arr);
//         // selectionSort(arr);
//         System.out.println("Sorted array is : ");

//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
        
    
// }
// }

// Maximum Consecutive 1's

public class practice1 {
     public static void main(String[] args) {
        int[]arr={0,0,1,1,1,0,0};
        int max=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                 if(count>max){
                max=count;
            }
            }else{
                count=0;
            } 
        }
        System.out.println("Maximum Consecutive 1's is : "+max);
     }
}