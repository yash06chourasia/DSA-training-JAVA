// public class day2 {
//     public static void main(String[] args) {
        
//     }
// }

//WAP to obtain total sum of two arrays

// public class day2 {
//     public static void main(String[] args) {
//       int[] arr1={1,2,3,4,5};
//       int[] arr2={6,7,8,9};
//       int sum1=0,sum2=0;
//       for(int i=0;i<arr1.length;i++){
//         sum1+=arr1[i];
//       }
//       for(int i=0;i<arr2.length;i++){
//         sum2+=arr2[i];
//       }
//       int total=sum1+sum2;
//       System.out.println("Total sum is "+total);
//     }
// }

//WAP to merge two arrays

// public class day2 {
//     public static void main(String[] args) {
//         int[]arr1={1,2,3,4,5};
//         int[]arr2={1,2,3,4,5,6};
//         int size1=arr1.length;
//         int size2=arr2.length;
//         int totalsize=size1+size2;
//         int arr[]=new int[totalsize];
//         for(int i=0;i<totalsize;i++){
//             if(i<size1){
//                 arr[i]=arr1[i];
//             }
//             else{
//                 arr[i]=arr2[i-size1];
//             }
//         }
//         for(int i=0;i<totalsize;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }

// WAP to find common from two array

// public class day2 {
//     public static void main(String[] args) {
//         int arr1[]={1,2,3,4};
//         int arr2[]={2,0,1,4};

//         for(int i=0;i<arr1.length;i++){
//             for(int j=0;j<arr2.length;j++){
//                 if(arr1[i]==arr2[j]){
//                     System.out.println(arr1[i]);
//                     break;
//                 }
//             }
//         }
//     }
// }

// WAP to display Unique from two array


// public class day2 {
//     public static void main(String[] args) {
//         int arr1[]={1,2,2,3,4};
//         int arr2[]={2,0,1,6,5,4};
//         System.out.println("Unique elements are : ");
//         for(int i=0;i<arr1.length;i++){
//             int count=0;
//             for(int j=0;j<arr2.length;j++){
//                 if(arr1[i]==arr2[j]){
//                     count++;
//                     break;
//                 }
//             }
//             if(count==0){
//                     System.out.println(arr1[i]);
//                 }
//         }
//         for(int i=0;i<arr2.length;i++){
//             int count=0;
//             for(int j=0;j<arr1.length;j++){
//                 if(arr2[i]==arr1[j]){
//                     count++;
//                     break;
//                 }
//             }
//             if(count==0){
//                     System.out.println(arr2[i]);
//                 }
//         }
//     }
// }

// WAP to check whether two arrays are equal


// public class day2 {
//     public static void main(String[] args) {
//         int arr1[]={1,2,3};
//         int arr2[]={3,2,1};
//         boolean equal=false;
//         if(arr1.length==arr2.length){
//             for(int i=0;i<arr1.length;i++){
//                  if(arr1[i]==arr2[i]){
//                     equal=true;
//                  }
//                     break;
//           }
           
//         }
//         if(equal){
//             System.out.println("Equal");
//         }
//         else{
//             System.out.println("Not Equal");
//         }
//      }
// }

// 2D ARRAY


// public class day2 {
//     public static void main(String[] args) {
//     int arr[][]={{1,2,3},{4,5,6/*,7*/},{8,9,0}};

//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                     System.out.print(arr[i][j]+" ");
//                 }
//                 System.out.println();
//             }
//         }
// }

//Sum of elements in 2D array

// public class day2 {
//     public static void main(String[] args) {
//     int arr[][]={{1,2,3},{4,5,6},{8,9,0}};
//     int sum=0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                    sum+=arr[i][j];
//                 }
//             }
//         System.out.println("Sum is "+sum);  
//         }
// }

//Row wise sum in 2D array

// public class day2 {
//     public static void main(String[] args) {
//     int arr[][]={{1,2,3},{4,5,6},{8,9,0}};
//         for(int i=0;i<arr.length;i++){
//             int sum=0;
//             for(int j=0;j<arr[i].length;j++){
//                    sum+=arr[i][j];
//                 }
//         System.out.println("Sum of "+(i+1)+" row is "+sum);  
//             }
//         }
// }

// Column wise sum in 2D array

// public class day2 {
//     public static void main(String[] args) {
//     int arr[][]={{1,2,3},{4,5,6},{8,9,0}};
//         for(int i=0;i<arr.length;i++){
//             int sum=0;
//             for(int j=0;j<arr[i].length;j++){
//                    sum+=arr[j][i];
//                 }
//                  System.out.println("Sum of column "+(i+1)+" is "+sum); 
//             }
        
//         }
// }

