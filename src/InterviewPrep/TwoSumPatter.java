package InterviewPrep;

import java.util.HashMap;
import java.util.Map;

public class TwoSumPatter {
    public static int[] findTwoSumNumber(int[] a, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++){
            int compliment = target - a[i];

            if (map.containsKey(compliment)) {
                 return new int[] {map.get(compliment), i};
            }
            map.put(a[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
     int[] a = {2, 7, 11, 15};
     int target = 9;
     int [] result = findTwoSumNumber(a, target);

        System.out.println(result[0]+" , "+result[1]);
    }
}
