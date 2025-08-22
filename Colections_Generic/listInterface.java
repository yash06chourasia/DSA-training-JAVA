import java.util.ArrayList;
import java.util.List;

public class listInterface {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(1,2);
        list.add(5);
        list.remove(1);
        // for (int i :list) {
        //     System.out.println(i);
        // }
        System.out.println(list.indexOf(3));
        list.set(0,1);
        for (int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }
        if(list.contains(5)){
            System.out.println("List contain 5");
        }
        list.clear();
        list.add(6);
        for (int i :list) {
            System.out.println(i);
        }
    }

}
