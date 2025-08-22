import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClass {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(4);
        for (Integer i : list) {
            System.out.print(i+" ");
        }
        System.out.println();
        Collections.sort(list);
         for (Integer i : list) {
            System.out.print(i+" ");
        }
        System.out.println();
        Collections.reverse(list);
         for (Integer i : list) {
            System.out.print(i+" ");
        }
        System.out.println();
        // making list not changeable
        // List<Integer>l=Collections.unmodifiableList(list);
        // l.add(6);
        Collections.swap(list,0,4);
         for (Integer i : list) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
