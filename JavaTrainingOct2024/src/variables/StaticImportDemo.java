package variables;

import static methods.StaticMethods.*;
import static methods.StaticMethods.addition;
import static methods.StaticMethods.i;
public class StaticImportDemo {

    public static void main(String[]args){
       System.out.println("i vale is:"+i);
       addition();
       swapTwoNumbers(55,74);
       double ranmValue=getRandomDoubleValue();
       System.out.println("getRandomDoubleValue is:"+ranmValue);
       System.out.println("Farenheit value is:"+convertCelciusToFarenTemp(8.57F));
    }
}
