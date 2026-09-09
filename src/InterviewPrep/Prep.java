package InterviewPrep;

import com.sun.tools.javac.Main;

import java.beans.PropertyEditorSupport;

public class Prep {
    public static String reverseWordInString(String s) {
        String[] s1 = s.split(" ");
        StringBuilder res = new StringBuilder();

        for (int i =s1.length-1; i>=0; i--){
             res.append(s1[i]);

             if(i!=0){
                 res.append(" ");
             }
        }
        return res.toString() ;
    }

    public static void main(String[] args) {
        String result = Prep.reverseWordInString("java Is Powerfull");
        System.out.println(result);
    }
}
