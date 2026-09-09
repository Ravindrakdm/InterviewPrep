package Collection;


public class DemoD {

    public static String stringReverse(String str) {
         String rev = " ";
        for (int i =str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);        }
        return rev;
    }

    public static void main(String[] args) {
        String str = "Java";
          String result = DemoD.stringReverse(str);
        System.out.println(result);
    }
}
