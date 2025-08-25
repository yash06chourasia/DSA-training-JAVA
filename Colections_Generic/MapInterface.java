import java.util.HashMap;
import java.util.Map;

public class MapInterface {
  
    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();
        map.put("Football", 20);
        map.put("Basketball", 40);
        map.put("Cricket", 60);
        map.put("Football", 30);
        System.out.println(map.size());
        for (String key : map.keySet()) {
            System.out.println(key +" : "+map.get(key));
        }
        map.remove("Football");
        System.out.println(map.size());
        System.out.println(map.containsKey("Cricket"));
        for (Integer v : map.values()) {
            System.out.println(v);
        }
        

    }
    
}