package Proj1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class JavaDemo01 {
    public static void main(String[] args) {
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
            hash.put("Ravi",60);
            hash.put("Kadam", 79);
            hash.put("RK", 78);
        System.out.println(hash);

        System.out.println(hash.get("RK"));

    }
}
