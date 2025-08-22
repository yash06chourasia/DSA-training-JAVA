public class wrapper {
    public static void main(String[] args) {
        Integer first=Integer.valueOf(55);
        Integer second=Integer.valueOf("65");
        Integer third=55;
        //RHS of these statement is automatically converted to integer type object
        System.out.printf("%d ,%d ,%d\n",first ,second,third);
        Integer fourth = first;
        System.out.println(first);
        System.out.println(fourth); 
        first = 20; // This does NOT change the old object, it just points `first` to a new object
        System.out.println(first); 
        System.out.println(fourth); 
    }
}
