// Maximum subarray sum bruteforce

// public class day6 {
//     static public int maxSubArray(int[] nums) {
//         int current=nums[0];
        
//        for(int i=0;i<nums.length;i++){
//             int update=0;
//             for(int j=i;j<nums.length;j++){
//                 update+=nums[j];
//                 current=Math.max(current,update);
//             }
           
//          }
//      return current;   
//     }
//     public static void main(String[] args) {
//         int []nums={5,4,-1,7,8};
//         int res=maxSubArray(nums);
//         System.out.println(res);
//     }
// } 
    


// Container with most water optimal solution
// class day6 {
//     static public int maxArea(int[] height) {
//         int right=height.length-1;
//         int left=0;
//         int max=0;
//         while(left<right){
//         int h=Math.min(height[left],height[right]);
     
//         int width=right-left;
//         int area=h*width;
      
//         max=Math.max(max,area);
//         if(height[left]<height[right]){
//             left++;
//         }
//         else{
//             right--;
//         }
         
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         int[] height={1,8,6,2,5,4,8,3,7};
//         int capacity=maxArea(height);
//         System.out.println(capacity);

//     }
// }

// maximum subarray sum of the given size brute force

public class day6 {
//     static public int maxSubArray(int[] nums,int size) {
//         int current=nums[0];
//        for(int i=0;i<=nums.length-size;i++){
//             int update=0;
//             for(int j=i;j<i+size;j++){
//                 update+=nums[j];
//                 current=Math.max(current,update);
//             }
           
//          }
//      return current;   
//     }
//     public static void main(String[] args) {
//         int []nums={-5,8,8,7,-8,8,-8};
//         int size=3;
//         int res=maxSubArray(nums,size);
//         System.out.println(res);
//     }
// } 

// maximum subarray sum of the given size by sliding window

// static public int maxSubArray(int[] nums,int size) {
//       int maxsum=0;
//       int windowsum=0;
//       for(int i=0;i<size;i++){
//         windowsum+=nums[i];
//       }
//        for(int i=size;i<nums.length;i++){
//             windowsum+=nums[i]-nums[i-size];
//            maxsum=Math.max(windowsum,maxsum);
//         }
//      return maxsum;   
//     }
//     public static void main(String[] args) {
//         int []nums={-5,8,8,7,-8,8,-8};
//         int size=3;
//         int res=maxSubArray(nums,size);
//         System.out.println(res);
//     }
// } 

// Max subarray sum using kadanes

// static public int maxSubArray(int[] nums) {
//       int cursum=0;
//         int maxsum= nums[0];
//         for(int num :nums){
//             cursum=Math.max(num,cursum+num);
//             maxsum=Math.max(maxsum,cursum);
//         }
//       return maxsum;   
//     }
//     public static void main(String[] args) {
//         int []nums={-5,8,8,7,-8,8,-8};
//         int res=maxSubArray(nums);
//         System.out.println(res);
//     }
// } 


// Maximum subarray
// static public int maxSubArray(int[] nums) {
//       int cursum=0;
//         int maxsum= nums[0];
//         for(int i=0;i<nums.length;i++){
//             cursum+=nums[i];
//             maxsum=Math.max(maxsum,cursum);
//             if(cursum<0){
//               cursum=0;
//             }
//         }
//       return maxsum;   
//     }
//     public static void main(String[] args) {
//         int []nums={-5,8,8,7,-8,8,-8};
//         int res=maxSubArray(nums);
//         System.out.println(res);
//     }
// } 