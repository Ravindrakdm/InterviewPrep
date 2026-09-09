package InterviewPrep;

import java.util.HashMap;
import java.util.Map;

public class charFrequency {
    public static void charFrequencyCheck(String str){
        Map<Character, Integer> map = new HashMap<>();
       for (char ch : str.toCharArray()){
           map.put(ch, map.getOrDefault(ch,0)+1);
       }
        System.out.println(map);
    }

    public static void main(String[] args) {
        String str = "ravindra";
        charFrequencyCheck(str);
    }

}
