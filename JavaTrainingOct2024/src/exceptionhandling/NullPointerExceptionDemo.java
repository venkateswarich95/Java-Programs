package exceptionhandling;

public class NullPointerExceptionDemo {
   static String s;

    public static void main(String[]args){
        s="java";
        try {
            System.out.println("length of s is:"+s.length());
            String s1=s.concat("Selenium");
            System.out.println("s1 value is:"+s1);
        } catch (NullPointerException ne) {
           ne.printStackTrace();
        } finally {
            System.out.println("finally block will execute whether the exception is handled or not");
        }
        System.out.println("String is an immutable class");
        System.out.println("It is available in java.lang package");
    }
}
