public class string {
    public static void main(String[] args) {
        String x="abc";
        String y="abc";
        //String is immutable
        //String is stored at String pool which is present at heap
        //String is object thus x and y have reference to abc
        System.out.println(x==y/*it checks reference of x and y */);
        //to check for values
        System.out.println(x.equals(y));

        x=x+"y";
        //now x=abcy thus reference of x changes 
        String z=new String("abc");
        //Since string z is made using new operator therefore a new reference is added for abc to z 
        System.out.println(y==z);
        System.out.println(x==y);


        //String formatting
        String name="Yash";
        int marks=96;
        System.out.println("Hii "+name+" your marks are : "+marks);
        //This will use more memory as String concatenation is expensive

        System.out.printf("Hii %s your marks are : %d ",name,marks);
        // This is way cheaper in terms of memory usage
    }
}
