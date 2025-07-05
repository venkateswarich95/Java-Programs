package exceptionhandling;

public class ArthimeticExceptionDemo {

    static int a=20,b;

    public static void main(String[]args){

        int div= 0;
        //Select the code you want to surround.
        //Windows: Press Ctrl + Alt + T.
        try {
            div = a/b;
            System.out.println("sum value is:"+div);
        } catch (ArithmeticException ae) {
            System.out.println("message is:"+ae.getMessage());
            System.out.println(" Cause is:"+ae.getCause());
           ae.printStackTrace();
        }
        int sub=a-b;
        System.out.println("sub value is:"+sub);
        int multi=a*b;
        System.out.println("multiplication value is:"+multi);
        int sum=a+b;
        System.out.println("sum value is:"+sum);
    }
}
