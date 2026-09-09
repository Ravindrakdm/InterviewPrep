package Collection;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DemoB {
    public static boolean stringAnagramCheck(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : s2.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }
        for (int count : map.values()) {
            if (count != 0) { return false; }
        }
        return true;
    }

    public static void main(String[] args) {
        Boolean result = DemoB.stringAnagramCheck("listen", "silent");
        System.out.println(result);
    }
}