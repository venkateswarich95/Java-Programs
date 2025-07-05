package variables;
import methods.NonStaticMembrs;
public class CallNonStaticMembrsInAnotherPackageClass {

    public static void main(String[]args){
        //Create object for that class--ClassName refVar=new ClassName();
        NonStaticMembrs nsObj=new NonStaticMembrs();

         /*
        Q)How to call non-static void method without parameter in another package of class ?
        A)refVar.nonStaticMethod();
         */
        nsObj.concatinationOfStrings();
        System.out.println("************************");
          /*
        Q)How to call non-static void method with parameters in another package of class ?
        A)refVar.nonStaticMethod(value1,value2);
         */
        nsObj.swapUsingThirdVariable(200,500);
        System.out.println("************************");
         /*
        Q)How to call returntype non-static method without parameter in another package of class?
        A)datatypeofthemethod varName= refVar.returntypenonstatic();
        System.out.println("varName value is:"+varName);
         */
        int ranVal=nsObj.getRandomIntegerValue();
        System.out.println("Random integer value  between 1 to 100 is:"+ranVal);
        System.out.println("************************");

         /*
        Q)How to call returntype non-static method with parameter in another package of class?
        A)System.out.println("varName value is:"+refVar.returntypenonstatic());
         */
        System.out.println("Celcius Temp value is:"+nsObj.convertFarenheitToCelciusTemp(44.0F));
    }
}
