package InterviewPrep;


import java.util.HashMap;
import java.util.Map;

public class firsNonRepeatingChar {
    public static char firstNonRepeatingCharacter(String str){
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);

        for (char ch : str.toCharArray()){
            if (map.get(ch)==1){
                return ch;
            }
        }
        return '\0';
    }


    public static void main(String[] args) {
        String str = "Ravindra";
        char res = firstNonRepeatingCharacter(str);
        System.out.println(res);
    }
}
