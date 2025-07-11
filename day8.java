
// Remove Duplicates from Sorted Array

// public class day8 {

//     static public int removeDuplicates(int[] nums){
//         int i=0;
//         for(int j=1;j<nums.length;j++){
//             if(nums[i]!=nums[j]){
//                 i++;
//                 nums[i]=nums[j];
//             }
//         }
//         return i+1;

//     }
//     public static void main(String[] args) {
//         int nums[]={0,0,1,1,2,3,3,4,5,6,6};
//         int res= removeDuplicates(nums);
//         System.out.println("Total unique elements count is : "+res);
//         System.out.println("Array elements are : ");
//         for(int i=0;i<res;i++){
//             System.out.print(nums[i]+ " ");
//         }   
//     }
// }


// WAP using sliding window to count negative elements for given array with every window size k
// public class day8 {

//     public static void main(String[] args) {
//         int arr[]={1,2,-5,-5,-1,5,9};
//         int k=3;
//         int count=0;
//         int frm=1;
//         for(int i=0;i<k;i++){
//             if(arr[i]<0){
//                 count++;
//             }
//         }
//         System.out.println("window "+frm+" contains total "+count+" negative elements");
//         for(int i=k;i<arr.length;i++){
//             if(arr[i]<0){
//                 count++;
//             }
//             if(arr[i-k]<0){
//                 count--;
//             }
//             frm++;
//             System.out.println("window "+frm+" contains total "+count+" negative elements");
//         }
//     }
// }