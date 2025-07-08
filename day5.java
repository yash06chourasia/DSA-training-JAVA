// // import java.util.Arrays;


// Find the median of the sorted array
// public class day5 {
//         static public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int len1=nums1.length;
//         int len2=nums2.length;
//         int arr[]=new int[len1+len2];
//         for(int i=0;i<len1+len2;i++)
//         {
//             if(i<len1){
//                 arr[i]=nums1[i];
//             }
//             else{
//                 arr[i]=nums2[i-len1];
//             }
//         }
//         System.out.println("Merged array :");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+"\t");
//         }
//         System.out.println();
//         // Arrays.sort(arr);
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]>=arr[j]){
//                     int temp=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;
//                 }
//             }
//         }
//         System.out.println("Sorted Merged array :");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+"\t");
//         }
//         int count=arr.length;
        
//         if(count%2==0){
//             int val=count/2;
//             return (arr[val]+arr[val-1])/2.0;
//         }
//         else{
//             return (arr[count/2]);
//         }
//     }
// public static void main(String[] args) {
//         int []nums1={2,1};
//         int []nums2={4,3};
//         double value=findMedianSortedArrays(nums1,nums2);
//         System.out.println();
//         System.out.println("The median of the sorted array is : "+value);
//     }
// }

// Container with most water

public class day5 {
    static public int maxArea(int[] height) {
        int h=height.length;
        int max=0;
        for(int i=0;i<h-1;i++){
            for(int j=i+1;j<h;j++){
                int min=0;
                if(height[i]<height[j]){
                    min=height[i];
                }
                else{
                    min=height[j];
                }
                min*=j-i;
                if(max<min){
                    max=min;
                }

            }
        }
        return max;
    }
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        int capacity=maxArea(height);
        System.out.println("Container with most water : "+capacity);
    }
}