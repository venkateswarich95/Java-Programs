package methods;

public class NonStaticMembrs {
    //accessmodifier datatype variablename=value;---Non-staticvariable

    public char c='A';
    String s=" Geetha";
    private short s1=8;
    protected boolean b=false;

    //Non-Static/Instance Methods

    /**
     * Non-static void method without parameters
     * accessmodifier void methodName(){logic;}
     * Write a program to concatinate the Strings
     */
    //private void concatinationOfStrings(){
    public void concatinationOfStrings(){
        //datatype variableName=value;
        String s2=" Sree";
        String s3="Welcome to";
        String s4=" world";
        String cOfStrings=s3+ s+ s2+ s4;
        System.out.println("concatination of the Strings is:"+cOfStrings);

    }

    /**
     * Non-static void method with parameters
     * accessmodifier void methodName(datatype p1){logic;}
     * Swap any two integers with third variable
     */

    public void swapUsingThirdVariable(int x,int y){
        System.out.println("Before Swapping X value is:"+x +" y value is:"+y);
        //Step1: Declare a variable temp and assign a value x
        int temp=x;
        //Step2: Assign y value to x
        x=y;
        //Step3: Assign temp value to y
        y=temp;
        System.out.println("After Swapping X value is:"+x +" y value is:"+y);

    }



    /**
     * Return type non-static method without parameter
     * accessmodifier datatype methodName(){logic; return value;}
     * This method will return random integer value using Math Class random()
     * write a program to get random integer value from 1 to 100 value
     */
    public int getRandomIntegerValue(){
        int res= (int) (Math.random()*100);
        return res;
    }

    /**
     * returntype non-static method with parameter
     * accessmodifier datatype methodName(datatype p1){logic; return;}
     * write a program to convert farehenheit temp to celcius
     *
     */

    //protected int convertFarenheitToCelciusTemp(float ft){
    public int convertFarenheitToCelciusTemp(float ft){
        int ct= (int) (5.0/9.0*(ft-32));
        return ct;

    }

    /**
     * Return type non-static method with parameter
     * accessmodifier datatype methodName(datatype p1){logic; return value;}
     * This method will return random integer value using Math Class random()
     * write a program to get random integer value from 1 to n value(n =10 or 100 or 1000)
     */
   /** public int getRandomIntegerValue(int n){
        int res= (int) (Math.random()*n);
        return res;
    }*/

    public static void main(String[]args){
    //To access non-static variables we need to create object for that class
        //ClassName refVariable= new ClassNAme();

        NonStaticMembrs refVar=new NonStaticMembrs();

        /*
        Q)How to access Non-static void method without parameters in the same class?
        A)refVar.nonStaticMethod();
         */
        refVar.concatinationOfStrings();
        System.out.println("************************");

         /*
        Q)How to access Non-static void method with parameters in the same class?
        A)refVar.nonStaticMethod(value1,value2);
         */
        refVar.swapUsingThirdVariable(55,96);
        System.out.println("************************");
        /*
        Q)How to call returntype non-static method without parameter under main method in same class?
        A)datatypeofthemethod varName= refVar.returntypenonstatic();
        System.out.println("varName value is:"+varName);
         */
        int result=refVar.getRandomIntegerValue();
        System.out.println("Random integer value is:"+result);
        System.out.println("************************");
         /*
        Q)How to call returntype non-static method with parameter under main method in same class?
        A)System.out.println("varName value is:"+refVar.returntypenonstatic(value1));
         */

        System.out.println("Celcius Temp value is:"+refVar.convertFarenheitToCelciusTemp(66.0F));
    }
}
