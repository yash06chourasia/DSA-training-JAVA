public class recursion {

    static void display(int a){
         if(a<0){
            return;
        }
        // System.out.println(a);
        // display(a-1);

        display(a-1);
        System.out.println(a);
    }

    static int factorial(int a){
        if(a<=1){
            return 1;
        }
        return a*factorial(a-1);
     
    }
    static void fibonacciSeries(int a){
        // Iterative approach

        int first=0;
        int second=1;
        for(int i=0;i<a;i++){
            System.out.println(first);
            int temp=first+second;
            first=second;
            second=temp;
        }
    }
    static int fibonacciElement(int n)
    {       if (n <= 1) return n;
        return fibonacciElement(n-1) + fibonacciElement(n-2);
    }


    public static void main(String[] args) {
        // display(5);
        // int res=factorial(5);
        // System.out.println(res);
        // fibonacciSeries(2);
        // int res=fibonacciElement(5);
        // System.out.println(res);
    }
}
