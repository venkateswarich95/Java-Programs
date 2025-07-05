package methods;

public class CallStaticMethodsInAnotherClass {

    public static void main(String[]args){
        //Scenrio:2 how to call one class static members in another class of same package

    /*
    Q)How can you access one class static variable in another class?
    Ans)classname.staticvariable;
     */
        System.out.println("L value is:"+StaticMethods.l);
        System.out.println("***********************");
    /*
     Q)how can you call one class static void method in another class?
     Ans)classname.staticmethod();
         */
        StaticMethods.addition();
        System.out.println("***********************");
     /*
     Q)how can you call static void parameterised method under any method/main() in another class?
Ans)classname.staticmethodname(p1value,p2value,p3value..);
      */
        StaticMethods.swapTwoNumbers(50,100);
        System.out.println("***********************");
    /*
    Q)how can you call return type static method() under any method/main() in another class?
     datatypeofthemethod varaiblename=classname.returntypestaticmethod();
    System.out.println("value is"+varaiblename);
     */
        double ranValue=StaticMethods.getRandomDoubleValue();
        System.out.println("value is"+ranValue);
        System.out.println("***********************");
        /*
        how to call returntype static method in printstatement?
    Ans)System.out.println("value is"+classname.returntypestaticmethod());
         */
        System.out.println("value is"+StaticMethods.convertCelciusToFarenTemp(5.6F));
    }

}
