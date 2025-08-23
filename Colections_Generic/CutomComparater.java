import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CutomComparater {

    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Ant");
        list.add("Zebra");
        list.add("Monkey");
        list.add("Lion");
       for (String l : list) {
        System.out.print(l +" ");
       }
       Collections.sort(list, new Comparator<String>() {
        @Override
        public int compare(String s, String t) {
            if(s.equals(t)){
                return 0;
                // Decending sorting
            }else if(s.charAt(0) < t.charAt(0)){
                return 1;
            }else{
                return -1;
            }
        }
       }) ;
       System.out.println(); 
       System.out.println("After Sorting: " + list);
      }
}