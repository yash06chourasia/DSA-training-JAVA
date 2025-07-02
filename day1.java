
public class day1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        // int max=arr[0];
        // int min=arr[0];
        int sum=0;
        // System.out.println("Hello World");
        
      
        //  for(int i=1;i<arr.length;i++){
        //      if(arr[i]>max){
        //         max=arr[i];
        //      }
        //      if(arr[i]<min){
        //         min=arr[i];
        //      }
        //  }
        //  System.out.println("Maximum is "+max);
        //    for(int i=arr.length-1;i>=0;i--){
        //     System.out.println(arr[i]);
        // }
        //  System.out.println("Minimum is "+min);
         for(int i=0;i<arr.length;i++){
              sum=sum+arr[i];
         }
        //  System.out.println("sum is "+sum);
         int count=arr.length;
         float avg=(float)sum/count;
         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
         System.out.println("Average is "+avg);
    }
}
