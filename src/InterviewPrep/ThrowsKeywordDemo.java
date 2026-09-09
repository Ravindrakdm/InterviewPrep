package InterviewPrep;


class A{
    public void show() throws ClassNotFoundException{
            Class.forName("InterviewPrep.ThrowsKeywordDemo");
                }
}
public class ThrowsKeywordDemo {

    static {
        System.out.println("Class is Loaded");
    }
    public static void main(String[] args) {
        A a = new A();
        try {
            a.show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
