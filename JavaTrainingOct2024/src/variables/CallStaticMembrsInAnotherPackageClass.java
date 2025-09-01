package variables;
import methods.StaticMethods;

public class CallStaticMembrsInAnotherPackageClass {

    public static void main(String[]args){
        //Scenario:3 How to call one class Static members in another package of class
        /*
        Q) How to access one class static variable in another package of class?
        A) ClassName.staticVariable;
         */
        System.out.println("i value is:"+StaticMethods.i);
        System.out.println("******************************************");
         /*
        Q) How to access one class static void method without parameters in another package of class?
        A) ClassName.staticMethod();
         */
        StaticMethods.addition();
        System.out.println("******************************************");
         /*
        Q) How to access one class static void method with parameters in another package of class?
        A) ClassName.staticMethod(value1,value2);
         */
        StaticMethods.swapTwoNumbers(999,856);
        System.out.println("******************************************");
         /*
        Q) How to access one class static returntype method without parameters in another package of class?
        A) datatypeofthemethod varName=ClassName.returnTypestaticMethod();
            System.out.println("varName value is:"+varName);
         */
        double randomVal=StaticMethods.getRandomDoubleValue();
        System.out.println(" getRandomDoubleValue is:"+randomVal);
        System.out.println("******************************************");
         /*
        Q) How to access one class static returntype method with parameters in another package of class?
           directly in print statement
          A)  System.out.println("varName value is:"+ClassName.returnTypeStaticMethod(value1));
         */
        System.out.println("Farenheit temp value is:"+StaticMethods.convertCelciusToFarenTemp(7.9F));
    }
}
