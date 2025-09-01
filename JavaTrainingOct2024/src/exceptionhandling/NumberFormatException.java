package exceptionhandling;

public class NumberFormatException {

    static String s="20";

    public static void main(String[]args){
        //Converting primitive into object called-->Autoboxing
        //Converting object into primitive called-->Unboxing
        int i=0;
        try {
             i = Integer.parseInt(s);
            System.out.println("i value is:"+i);
        } catch (java.lang.NumberFormatException e) {
            e.printStackTrace();
        }
        int sum=i+40;
        System.out.println("sum value is:"+sum);
        System.out.println("i value is:"+i);
    }
    /**
     * Primitive Type	Wrapper Class
     * byte	             Byte
     * short	         Short
     * int	             Integer
     * long	             Long
     * float	         Float
     * double	         Double
     * char         	Character
     * boolean         	Boolean
     */
}
