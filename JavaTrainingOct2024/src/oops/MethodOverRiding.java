package oops;

public class MethodOverRiding extends MethodOverloading{

    @Override
     public void sum(){
         System.out.println("Started executing child class sum()....");
         int a=99,b=67;
         int sum=a+b;
         System.out.println("sum is:"+sum);
    }

    static void combineTwoStrings(String a,String b){
        System.out.println("Started executing child class combineTwoStrings()...");
       String s=a+b;
        System.out.println("result value is:"+s);
        System.out.println("**************************************");
    }

    void division(int a,int b){
        System.out.println("Started executing child class division()...");
        int rem=a%b;
        System.out.println("remainder value is:"+rem);
        System.out.println("**************************************");
    }


    public static void main(String[]args){

        //upcating-->ParentClass pObj=new ChildClass();
        MethodOverloading mlObj=new MethodOverRiding();
        System.out.println("Using upcasting we can access child class overriden method & parent class non static methods");
        mlObj.sum();
        mlObj.sum(25,90);
        System.out.println("*******Completed Upcasting*************");

        //Create objct for child class
        MethodOverRiding mrObj=new MethodOverRiding();
        System.out.println("Using Child class object we can access all child class members(overriden method) & parent class members");
        System.out.println("Child class methods");
        mrObj.division(50,100);
        combineTwoStrings("Geetha","Sree");
        System.out.println("Parent class methods");
        mrObj.sum();
        mrObj.sum(12,52);
        main(55,74);


    }
}