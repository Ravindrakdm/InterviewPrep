package InterviewPrep;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {

        String s = "aabbcdde";
        List<Character> result = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting())).entrySet().stream()
                .filter(e -> e.getValue() ==1)
                .map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(result);
        }

    }
