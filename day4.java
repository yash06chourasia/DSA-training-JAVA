// import java.util.ArrayList;
// import java.util.Collections;
import java.util.HashMap;
// import java.util.HashSet;
// import java.util.Scanner;
// import java.util.TreeSet;

public class day4 {

    public static void main(String[] args) {
        // Collection framework

        // Dynamic allocation of array
        // ArrayList<Integer> arr=new ArrayList<>(); //bydefault capapcity 10
        // arr.add(5);
        // arr.add(6);
        // arr.add(0);
        // arr.add(7);
        // arr.add(2,11);
        // arr.set(1,8);
        

        // Printing elements of array
        // System.out.println("Array elements are :");
        // for(int i=0;i<arr.size();i++){
        //     System.out.println(arr.get(i));
        // }
        // arr.remove(2);
        // System.out.println("Array elements after removal are :");
        // for(int i=0;i<arr.size();i++){
        //     System.out.println(arr.get(i));
        // }
        // Finding max and min of array
        // int max=arr.get(0);
        // int min=arr.get(0);
        // for(int i=0;i<arr.size();i++){
        //     if(arr.get(i)>max){
        //         max=arr.get(i);
        //     }
        //     if(arr.get(i)<min){
        //         min=arr.get(i);
        //     }
        // }
        // System.out.println("Maximum : "+max);
        // System.out.println("Minimum : "+min);

        // Sort array elements using predefined method
        // Collections.sort(arr);
        // System.out.println("Sorted array elements are :");
        // for(int var : arr){
        //     System.out.println(var);
        // }

        // Count odd and even elements
        // int odd=0;
        // int even=0;
        // for(int var: arr){
        //     if(var%2==0){
        //         even+=1;
        //     }
        //     else{
        //         odd+=1;
        //     }
        // }
        // System.out.println("Even count : "+even);
        // System.out.println("Odd count : "+odd);     
        // System.out.println(arr.contains(9));
        
        // Check whether user input is present in the array
        // Scanner in=new Scanner(System.in);
        // System.out.println("Enter the number to check whether it is present or not : ");
        // int num=in.nextInt();
        // int idx=-1;
        // for(int i=0 ;i<arr.size();i++){
        //     if(arr.get(i)==num){
        //         idx=i;
        //     }
        // }
        // if(arr.contains(num)){
        //     System.out.println(num+" present at index "+idx);
        // }
        // else{
        //     System.out.println(num+" is not present");
        // }

        //  Set allocation
        // HashSet<String> set=new HashSet<>() ;
        // set.add("hello");
        // set.add("hello");
        // set.add("hii");
        // set.add("bye");
        // System.out.println(set);
        // System.out.println(set.contains("bye"));
        // set.add("Namaste");
        // System.out.println(set);
        // set.remove("bye");
        // System.out.println(set);
        
        // TreeSet<Integer> data=new TreeSet<>();
        // data.add(10);
        // // data.add(1,4); cannot done at particular index
        // data.add(23);
        // data.add(2);
        // data.add(10);
        // System.out.println(data);

        // HASHMAP
        // HashMap<String,Integer> map=new HashMap<>();
        // map.put("one", 1);
        // map.put("one", 2);
        // // Key one will store the latest value
        // map.put("two", 3);
        // map.put("three",1);
        // System.out.println(map);
        // System.out.println(map.get("two"));
        // System.out.println(map.get("four"));
        // System.out.println(map.getOrDefault("four", 4));

        // Frequency Count using HashMap
        // HashMap<Character,Integer> map=new HashMap<>();
        // String str="Yash Chourasia";
        // char[]arr=str.toCharArray();
        // // for(char i=0;i<arr.length;i++){
        // //     System.out.println(arr[i]);
        // // }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i] !=' '){
        //         map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        //     }
        // }
        // System.out.println(map);

        // First non repeating character and if there is non return $
        // String str="YYash Chourasia";
        // HashMap<Character,Integer> map=new HashMap<>();
        // for(char ch : str.toCharArray()){
        //     if(ch !=' '){
        //         map.put(ch, map.getOrDefault(ch,0)+1);
        //     }
        // }
        // char target='$';
        // for(char ch : str.toCharArray()){
        //     if(ch!=' ' && map.get(ch)==1){
        //         target=ch;
        //         break;
        //     }    
        // }
        // if(target=='$'){
        //          System.out.println("$");
        // }
        // else{
        //      System.out.println("The first non repeated character is "+target);
        // }

        // Rotate the array by 1
        // int arr[]={7,2,3,4,5,6};
        // int temp=arr[0];
        // for(int i=0;i<arr.length-1;i++){
        //     arr[i]=arr[i+1];
        // }
        // arr[arr.length-1]=temp;
        // for(int i :arr){
        //     System.out.print(i+"\t");
        // }
        
        // Two Sum
        // int arr[]={2,7,11,15};
        // int target=9;
        // HashMap<Integer,Integer>map=new HashMap<>();




    }
}