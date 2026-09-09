package Collection;

import java.util.HashMap;

public class HashDemo {
    public static void main(String[] args) {

        HashMap<String, Double> map = new HashMap<>();

        map.put("abc", 1000.00);
        map.put("cde", 23.0);
        map.put("xyz", 78.0);

        map.remove("xyz");
         double d = map.get("abc");
        System.out.println("Map entries: "+ map +"key value of abc:"+ d);
    }
}
