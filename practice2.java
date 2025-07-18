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

import java.util.Arrays;

public class practice2{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,5,6,7};
        int target=6;
        int[] newArr=new int[arr.length];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=target){
                newArr[idx]=arr[i];
                idx++;
            }
    }
    int trim[]=Arrays.copyOf(newArr, idx);
    for(int i=0;i<trim.length;i++){
        System.out.println(trim[i]);
    }
    
    }
}