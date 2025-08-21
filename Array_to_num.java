
public class Array_to_num {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int num=0;
        int count=1;
        int sum=0;
        for(int i=1;i<arr.length;i++){
            count=count*10;
        }
        for(int i=0;i<arr.length;i++){
           num=num+arr[i]*count;
           sum=sum+num;
           count=count/10;
        }
        System.out.println(num);

    }
}