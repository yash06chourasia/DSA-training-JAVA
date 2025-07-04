public class num_to_array {
    public static void main(String[] args) {
        int n=123;
        int count=0;
        int temp=n;
        while(n!=0){
            count++;
            n=n/10;
        }
        int arr[]=new int[count];
        for(int i=count-1;i>=0;i--){
            arr[i]=temp%10;
            temp=temp/10;
        }
        for(int i=0;i<count;i++){
            System.out.println(arr[i]);
        }
 
    }
}
