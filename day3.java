// import java.util.Scanner;

// WAP to take row and columns of 2D array and then take elements from user and print it

// public class day3 {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the number of rows");
//         int row=in.nextInt();
//         System.out.println("Enter the number of columns");
//         int columns=in.nextInt();
//         int arr[][]=new int[row][columns];
      
//         for(int i=0;i<row;i++){
//             for(int j=0;j<columns;j++){
//                 System.out.println("Enter elements ["+i+"]["+j+"]");
//                 arr[i][j]=in.nextInt();
//             }
//         }
//         System.out.println("Elements are :");
//         for(int i=0;i<row;i++){
//             for(int j=0;j<columns;j++){
//                System.out.print(arr[i][j]+"\t"); 
//             }
//             System.out.println();
//         }
//     }
// }

//WAP to transpose matrix


// public class day3 {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the number of rows");
//         int row=in.nextInt();
//         System.out.println("Enter the number of columns");
//         int columns=in.nextInt();
//         int arr[][]=new int[row][columns];
      
//         for(int i=0;i<row;i++){
//             for(int j=0;j<columns;j++){
//                 System.out.println("Enter elements ["+i+"]["+j+"]");
//                 arr[i][j]=in.nextInt();
//             }
//         }
//         System.out.println("Elements are :");
//         for(int i=0;i<row;i++){
//             for(int j=0;j<columns;j++){
//                System.out.print(arr[i][j]+"\t"); 
//             }
//             System.out.println();
//         }
//         int trans[][]=new int[columns][row];
//         for(int i=0;i<columns;i++){
//             for(int j=0;j<row;j++){
//                 trans[i][j]=arr[j][i];
//             }
//         }
//         System.out.println("Elements of transposed matrix is :");
//         for(int i=0;i<columns;i++){
//             for(int j=0;j<row;j++){
//                System.out.print(trans[i][j]+"\t"); 
//             }
//             System.out.println();
//         }
//     }
// }


// Maximum of 2D array input by user


// public class day3 {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the number of rows");
//         int row=in.nextInt();
//         System.out.println("Enter the number of columns");
//         int columns=in.nextInt();
//         int arr[][]=new int[row][columns];
      
//         for(int i=0;i<row;i++){
//             for(int j=0;j<columns;j++){
//                 System.out.println("Enter elements ["+i+"]["+j+"]");
//                 arr[i][j]=in.nextInt();
//             }
//         }
//        int max=arr[0][0];
//        for(int i=0;i<row;i++){
//             for(int j=0;j<columns;j++){
//                if (arr[i][j]>max){
//                     max=arr[i][j];
//                  }
//             }
//         }
//     System.out.println("Maximum element is "+max);
//     }
// }

// WAP to check whether matrix is Symmetric


// public class day3 {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         System.out.println("Enter the number of rows");
//         int row=in.nextInt();
//         System.out.println("Enter the number of columns");
//         int columns=in.nextInt();
//         int arr[][]=new int[row][columns];
      
//         for(int i=0;i<row;i++){
//             for(int j=0;j<columns;j++){
//                 System.out.println("Enter elements ["+i+"]["+j+"]");
//                 arr[i][j]=in.nextInt();
//             }
//         }
//         System.out.println("Elements are :");
//         for(int i=0;i<row;i++){
//             for(int j=0;j<columns;j++){
//                System.out.print(arr[i][j]+"\t"); 
//             }
//             System.out.println();
//         }
    
    
//         if(row!=columns){
//             System.out.println("Not Symmetric");
//         }
//         else{
//             boolean symmetric=true;
//             for(int i=0;i<row;i++){
//              for(int j=0;j<columns;j++){
//                if(arr[i][j]!=arr[j][i]){
//                       symmetric=false;
//                       break;
//                     }
//                 }
//             }
//             if(symmetric==false){
//             System.out.println("Not symmetric matrix");
//            }
//            else{
//             System.out.println("Symmetric");
//            }
    
//         } 
        
//     }
// }


