import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set<String>set=new HashSet<>();
        set.add("Apple");
        set.add("Mango");
        set.add("Kiwi");
        set.add("lemon");
        set.add("Apple");
        set.remove("lemon");
        
      for (String s : set) {
        System.out.println(s);
      }
      System.out.println(set.size());
      System.out.println(set.contains("Kiwi"));
      System.out.println(set.isEmpty());

    }
}
