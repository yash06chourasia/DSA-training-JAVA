// // import java.util.Arrays;

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