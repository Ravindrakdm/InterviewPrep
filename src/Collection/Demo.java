package Collection;


import java.lang.reflect.Array;
import java.security.Key;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
       String[] arr = {"eat","tea","tan","ate","nat","bat"};

        Map<String, List<String>> map = new HashMap<>();

        for (String word: arr){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            
            String key = new String(ch);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        } 
            List<List<String>> result =new ArrayList<>(map.values());
        System.out.println(result);    }

}
