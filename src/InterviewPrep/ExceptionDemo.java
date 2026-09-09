package InterviewPrep;

class MyException extends Exception{
        MyException(String s){
            super(s);
        }
   }


public class ExceptionDemo {
    int a = 15;
    public void check() throws MyException {
        try{
        int i = 0;
        int b = 18/i;
            System.out.println(b);
    } catch (Exception e) {
            throw new MyException( "Number is not divisile by 0: Arithamatic exception occured");
        }
    }
    public static void main(String[] args)   {
        ExceptionDemo ed = new ExceptionDemo();
        try {
            ed.check();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-----------------------");
    }

    }



