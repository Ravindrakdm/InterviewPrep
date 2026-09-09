package InterviewPrep;

public class palindrome {
    public static boolean isPalindrom(String str) {

//  Approach 1:
//        String rev = "";
//        for (int i =str.length()-1; i>=0; i--){
//            rev = rev + str.charAt(i);
//        }
//        System.out.println(rev);
//        return str.equals(rev);
// -------------------------------------------------------

//  Approach 2:

        int left = 0;
        int right = str.length() - 1;

        while (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        left++;
        right--;
        return true;
    }

    public static void main(String[] args) {
        String str = "Ravi";
        Boolean result = isPalindrom(str);
        System.out.println(result);
    }
}
