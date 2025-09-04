public class testThread {
    public static void main(String[] args) {
        firstThread t1=new firstThread();
        SecondThread t2=new SecondThread();
        System.out.println("First thread started");
        t1.start();
        System.out.println("Second thread started");
        t2.start();
        
    }
    
}
