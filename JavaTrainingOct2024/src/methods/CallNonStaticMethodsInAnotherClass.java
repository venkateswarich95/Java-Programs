package methods;

public class CallNonStaticMethodsInAnotherClass {

    public static void main(String[]args){
        //To access one class non-static members in another class of same package we need to create object for that class.
        //ClassName refVariable= new ClassNAme();
        NonStaticMembrs nsmObj=new NonStaticMembrs();

        /*
        Q)How to call non-static void method without parameter in another class of same package?
        A)refVar.nonStaticMethod();
         */
        nsmObj.concatinationOfStrings();
        System.out.println("************************");

         /*
        Q)How to call non-static void method with parameters in another class of same package?
        A)refVar.nonStaticMethod(value1,value2);
         */
        nsmObj.swapUsingThirdVariable(80,90);
        System.out.println("************************");

        /*
        Q)How to call returntype non-static method without parameter in another class of same package?
        A)datatypeofthemethod varName= refVar.returntypenonstatic();
        System.out.println("varName value is:"+varName);
         */
        int ranVal=nsmObj.getRandomIntegerValue();
        System.out.println("Random integer value  between 1 to 100 is:"+ranVal);
        System.out.println("************************");
         /*
        Q)How to call returntype non-static method without parameter in another class of same package
        directly in print statement?
        A)System.out.println("varName value is:"+refVar.returntypenonstatic());
         */
        System.out.println("Celcius value is:"+nsmObj.convertFarenheitToCelciusTemp(82.6F));
    }
}
