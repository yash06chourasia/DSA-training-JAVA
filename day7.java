
// Using Sliding Window , Calculate even count of each window of size 3

// public class day7 {
//     public static void main(String[] args) {
//         int[] arr={2,3,4,5,6,9,2};
//         int wsize=3;
//         int count=0;
//         int window=1;
//         for(int i=0;i<wsize;i++){
//             if(arr[i]%2==0){
//                 count++;
//             }
//         }

//         System.out.println("Even Count for window "+window+" : "+count);
        
//         for(int i=wsize;i<arr.length;i++){
//               window++;
//             if(arr[i]%2==0){
//                 count++;
//             }
//             if(arr[i-wsize]%2==0){
//                 count--;
//             }
//             System.out.println("Even Count for window "+window+" : "+count);
           

//         }
//     }
// }

// prefix sum

// public class day7 {

//     public static void main(String[] args) {
//         int[]arr={2,4,6,5,7};
//         System.out.println("Array is :");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+"\t");
//         }
//         int[]ar=new int[arr.length];
//         ar[0]=arr[0];
//         for(int i=1;i<arr.length;i++){
//             ar[i]=arr[i-1]+arr[i];
//         }
//         System.out.println();
//         System.out.println("Array after prefix sum is :");
//         for(int i=0;i<ar.length;i++){
//             System.out.print(ar[i]+"\t");
//         }
        
            
//     }
// }

// Postfix Sum
// public class day7 {

//     public static void main(String[] args) {
//         int[]arr={2,4,6,5,7};
//         System.out.println("Array is :");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+"\t");
//         }
//         int[]ar=new int[arr.length];
//         for(int i=0;i<arr.length-1;i++){
//             ar[i]=arr[i+1]+arr[i];
//         }
//         ar[arr.length-1]=arr[arr.length-1];
//         System.out.println();
//         System.out.println("Array after prefix sum is :");
//         for(int i=0;i<ar.length;i++){
//             System.out.print(ar[i]+"\t");
//         }
        
            
//     }
// }
  
import java.util.*;
//  Longest Substring Without Repeating Characters
// class day7 {
//     static public int lengthOfLongestSubstring(String s) {
//         int maxlen=0;
//         for(int i=0;i<s.length();i++){
//             HashSet<Character>set=new HashSet<>();
//             for(int j=i;j<s.length();j++){
//                 char ch=s.charAt(j);
//                 if(set.contains(ch)){
//                     break;
//                 }
//                 else{
//                     set.add(ch);
//                     maxlen=Math.max(maxlen,j-i+1);
//                 }
//             }
//         }
//         return maxlen;
//     }
//     public static void main(String[] args) {
//         String s="abcabcdbb";
//         int maxlen=lengthOfLongestSubstring(s);
//         System.out.println("Length of Longest Substring Without Repeating Characters is "+maxlen);
//     }
// }


// class day7 {
//     static public int lengthOfLongestSubstring(String s) {
//         int maxlen=0;
//         int i=0;
//         HashSet<Character>set=new HashSet<>();
//         for(int j=0;j<s.length();j++){
//            char ch=s.charAt(j);
//            while(set.contains(ch)){
//               set.remove(s.charAt(i));
//               i++;
//            }
//            set.add(ch);
//            maxlen=Math.max(maxlen,j-i+1);
//         }
//         return maxlen;
//     }
//     public static void main(String[] args) {
//         String s="abcabcdbb";
//         int maxlen=lengthOfLongestSubstring(s);
//         System.out.println("Length of Longest Substring Without Repeating Characters is "+maxlen);
//     }
// }
