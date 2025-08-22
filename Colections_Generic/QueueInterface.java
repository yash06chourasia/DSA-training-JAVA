import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue <String> queue=new LinkedList<>();
        queue.add("First");
        // it does not handle exception implicitly
        queue.add("Second");
        queue.offer("Third");
        // it does handle exception implicitly
        queue.offer("Fourth");

        System.out.println(queue.element());// it does not handle exception implicitly
        queue.remove();// it does not handle exception implicitly 
        queue.poll();// it does handle exception implicitly
        System.out.println(queue.peek());// it does handle exception implicitly
        

        for (String s :queue) {
            System.out.println(s);
        }

    }
}
