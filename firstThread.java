public class firstThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.printf("%c",'*');
        }
    }
}
