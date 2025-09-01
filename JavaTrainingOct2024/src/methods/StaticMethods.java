package methods;

public class StaticMethods {
    //accessmodifier static datatype variablename=value;---Static variable syntax

    public static char c='d';
    // static int i=10;
    public static int i=10;
    public static long l=500L;
    protected static String s="Harshini";

    //Static Methods
/**
 * static method with void without parameters
 * accessmodifier static void methodName(){logic;}
 * Adding 2 to 3 numbers
 */
 public static void addition(){
     // datatype variablename =value;--- local variable
     short s1=15;
     int res= (int) (i+l+s1+899);
     System.out.println("Result is:"+res);
 }

/**
 *  static method with void with parameters
 *  accessmodifier static void methodName(datatype p1, datatype p2){logic;}
 *  Swap twonumbers without third variable
 */
//static void swapTwoNumbers(int a,int b){
    public static void swapTwoNumbers(int a,int b){
    System.out.println("Before swapping a is:"+a+" b is:"+b);
    a=a+b;
    //subtract a from b
    b=a-b;
    a=a-b;
    System.out.println("After swapping a is:"+a+" b is:"+b);
}

    /**
     * static method with returntype without parameters
     *  accessmodifier static datatype methodName(){logic; return value;}
     * Write a program to return the random double value
     */
    //private static double getRandomDoubleValue(){
    public static double getRandomDoubleValue(){
        System.out.println("Started executing getRandomDoubleValue().....");
        /*
        Math Class random() will give random values from 0 to 1
         */
        double randVal= Math.random();
        return randVal;
    }

    /**
     * static method with returntype with parameters
     *  accessmodifier static datatype methodName(datatype p1, datatype p2){logic; return value;}
     * Write a program toconvert celcius to farenheit temp
     */

    //protected static float convertCelciusToFarenTemp(float ct) {
    public static float convertCelciusToFarenTemp(float ct) {
        System.out.println("Started executing convertCelciusToFarenTemp().....");
        float ft= (ct*9/5+32);
        return ft;
    }

    public static void main(String[] args){
     //how to call static members in the Same class

        /*
        Q)How can you call static void method under main method/anystaticmethod in the same class?
        Ans)staticmethodname();
         */
        addition();

        /*
        Q)how can you call static void parameterised method under main() in same class?
        Ans)staticmethodname(p1value,p2value,p3value..);
         */
       swapTwoNumbers(12,25);

       /*
       Q)how can you call return type static method() under main() in the same class?
        datatypeofthemethod varaiblename=returntypestaticmethod();
       System.out.println("value is"+varaiblename);
        */
        double ranVal=getRandomDoubleValue();
        System.out.println("Random double value is:"+ranVal);

        /*
        how to call returntype static method in printstatement?
         Ans)System.out.println("value is"+returntypestaticmethod());
         */
        System.out.println("value is"+convertCelciusToFarenTemp(2.4F));

        /*
        Q)how can you access static variable in same class under any static/nostatic/main method?
       Ans)directly call static variable
         */
        System.out.println("String s value is:"+s);
}

}
