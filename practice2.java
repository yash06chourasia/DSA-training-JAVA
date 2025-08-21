package Practice;
// public class practice2 {
    
//     public static void main(String[] args) {
//         //  WAP to take two number from user and perform arthimetic operation
//         // int n1,n2;
//         // Scanner inp=new Scanner(System.in);
//         // System.out.print("Enter first number : ");
//         // n1=inp.nextInt();
//         // System.out.print("Enter second number : ");
//         // n2=inp.nextInt();
//         // System.out.println("Addition is "+(n1+n2));
//         // System.out.println("Subtraction is " +(n1-n2));
//         // System.out.println("Multiplication is "+(n1*n2));
//         // System.out.println("Division is "+((float)(n1/n2)));

//         // Product of two floating nuumber
//         // float a=5.56f;
//         // float b=10.65f;
//         // float p=a*b;
//         // System.out.println(p);
        
//         // Perimeter of rectangle
//         // int a=2;
//         // int b=2;
//         // int c=3;
//         // int d=3;
//         // System.out.println("Perimeter is "+(a+b+c+d));

//         // Simple Interest

//         // int p=1000;
//         // int r=10;
//         // int t=2;
//         // System.out.println("Simple interest is "+(p*r*t/100));

//         // Compound interest
//         // float p=1000;
//         // int r=10;
//         // float t=2;
//         // System.out.println("Compound interest is "+(p*(Math.pow((1+r/100),t))));

//         // Farhenheit to Celsius

//         // int f=-40;
//         // int c=(f-32)*5/9;
//         // System.out.println("Celsius is "+c);

// // Even odd check using bitwise and
//         // int n=7;
//         // if((n & 1) == 1){
//         //     System.out.println("Odd");
//         // }
//         // else{
//         //     System.out.println("Even");
//         // }

//         // Fibonacci Series 

//     //    int num=1;
//     //    System.out.println("Fibonacci series upto "+num+" digit is : ");
//     //    int first=0;
//     //    int second=1;
//     //    for(int i=0;i<num;i++){
//     //     System.out.println(first);
//     //     int sum=first+second;
//     //     first=second;
//     //     second=sum;
//     //   }  
//     }

// }


// WAP  to return the new array after removing target

// import java.util.Arrays;

// public class practice2{
//     public static void main(String[] args) {
//         int[] arr={1,2,3,4,6,5,6,7};
//         int target=6;
//         int[] newArr=new int[arr.length];
//         int idx=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]!=target){
//                 newArr[idx]=arr[i];
//                 idx++;
//             }
//     }
//     int trim[]=Arrays.copyOf(newArr, idx);
//     for(int i=0;i<trim.length;i++){
//         System.out.println(trim[i]);
//     }

//     }
// }

// Reverse an array
// public class practice2 {

//     public static void main(String[] args) {
//         int arr[]={1,2,5,6,7};
//         int i=0;
//         int j=arr.length-1;
//         while(i<j){
//             int temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//             i++;
//             j--;
//         }
//         for(int k=0;k<arr.length;k++){
//             System.out.print(arr[k]+" ");
//         }
//     }
// }

// Check , is the array is palindrome 

//  public class practice2 {
//     public static void main(String[] args) {
//         int arr[]={1,3,4,2,5,6,1};
//         int len=arr.length;
//         int rev[]=new int[len];
//         // New array with reverse element
//         for(int i=0;i<len;i++){
//             rev[len-i-1]=arr[i];
//         }
//         boolean chk=true;
//         for(int k=0;k<arr.length;k++){
//             if(rev[k]!=arr[k]){
//                 chk=false;
//                 break;
//             }
//         }
//         if(chk){
//             System.out.println("Palindrome");
//         }else{
//             System.out.println("Not a Palindrome");
//         }
//     }
// }

// Merge two sorted arrays
// public class practice2 {

//     public static void main(String[] args) {
//         int[]a={1,2,3,4,5};
//         int[]b={3,6,8,9};
//         int []m=new int[a.length+b.length];
//         int i=0,j=0,k=0;
        // while(i<a.length && j<b.length){
        //     if(a[i]<b[j]){
        //         m[k]=a[i];
        //         i++;
        //     }
        //     else{
        //         m[k]=b[j];
        //         j++;
        //     }
        //     k++;
        // }
        // while (i < a.length) {
//         m[k] = a[i];
//         k++;
//         i++;
//         }

//         while (j < b.length) {
//         m[k] = b[j];
//         k++;
//         j++;
//         }
//         for(int o=0;o<m.length;o++){
//             System.out.print(m[o]+" ");
//         }

//     }
// }

// Search in 2D array
// public class practice2 {

//     public static void main(String[] args) {
//         int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//         int target=10;
//          for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 if(arr[i][j]==target){
//                    System.out.println("Element found at row "+(i+1)+" column "+(j+1)); 
//                    return;
//                 }
//             }
//         }
//         System.out.println("Element not found");

//     }
// }

// Sum  and average of 2D array 
// public class practice2 {

//     public static void main(String[] args) {
//         int[][]arr={{1,2,3},{4,5,6},{7,9,9}};
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
        //     System.out.println();
        // }
        // int sum=0;
        // int count=0;
        //  for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         count++;
//                 sum+=arr[i][j];
//             }
//         }
//         System.out.println("sum is "+sum);
//         System.out.println("count is "+count);
//         System.out.println("average is "+(float)sum/(float)count);

        
//     }
//}

// Diagonal Sum of 2D array
public class practice2 {
        public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        long sum=diagonalSum(arr);
        System.out.println("Sum of diagonal element is "+sum);
   }
   public static long diagonalSum(int arr[][]){
        long leftsum=leftdiagonalSum(arr);
        long rightsum=rightdiagonalSum(arr);
        long sum=leftsum+rightsum;
        if(arr.length%2!=0){
                int idx=arr.length/2;
                sum-=arr[idx][idx];
                return sum;       
         }else{
                return sum;
         }
   
        }
   public static long leftdiagonalSum(int arr[][]){
        int lsum=0;
        for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                        if(i==j){
                                lsum+=arr[i][j];
                        }
                }
        }
        return lsum;
        
   }
   public static long rightdiagonalSum(int arr[][]){
        int rsum=0;
        for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                        if(i+j==arr[i].length-1){
                                rsum+=arr[i][j];
                        }
                }
        }
        return rsum;
   }
   
}