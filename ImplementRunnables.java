public class ImplementRunnables implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.printf("%c",targetChar);
        }
        System.out.printf("\n %c task is done",targetChar);        
    }
    private final char targetChar;
    ImplementRunnables(char targetChar){
        this.targetChar=targetChar;
    }
}
