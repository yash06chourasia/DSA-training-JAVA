public class variableArgument {
    static void sum(int first,int... add){
        int total=first;
        for (int i :add) {
            total+=i;
        }
        System.out.println("Sum is "+total);
    }

    public static void main(String[] args) {
        sum(2,3,4);
        sum(2,8,0);
        sum(1,2,3,4,5);
        // sum();   This give error as it compulsorily needs atleast 1 parameter
        sum(5);
        sum(1,new int[]{1,2,3});
    }

}
