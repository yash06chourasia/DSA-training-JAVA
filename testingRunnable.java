public class testingRunnable {
    public static void main(String[] args) {
        ImplementRunnables p1=new ImplementRunnables('*');
        ImplementRunnables p2=new ImplementRunnables('$');
        ImplementRunnables p3=new ImplementRunnables('&');
        Thread t1=new Thread(p1);
        t1.start();
        Thread t2=new Thread(p2);
        t2.start();
        Thread t3=new Thread(p3);
        t3.start();

    }
}
