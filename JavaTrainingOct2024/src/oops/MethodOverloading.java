package oops;

public class MethodOverloading {

     void sum(){
        System.out.println("Started executing parent class sum()....");
        int a=50,b=63;
        //datatype variablename=value;
        int sum=a+b;
        System.out.println("sum value is:"+sum);
        System.out.println("**************************************");
    }

     void sum(int a,int b){
        System.out.println("Started executing parent class sum(int a,int b)....");
        int res=a+b+156;
        System.out.println("result value is:"+res);
        System.out.println("**************************************");
    }

    private void sum(float a,int b,int c){
        System.out.println("Started executing parent class sum(float a,int b,int c)....");
        float total=a+b+c;
        System.out.println("total value is:"+total);
        System.out.println("**************************************");
    }

   /* protected int sum(int a,int b){
        System.out.println("Started executing sum(float a,int b,int c)....");
        int res=a+b;
        return res;
    }*/

    protected static void main(int a,int b){
        System.out.println("Started executing parent class main()....");
        int rem=a/b;
        System.out.println("Remainder value is:"+rem);
    }



    public static void main(String[]args){
        /*sum();
        sum(85,96);
        sum(85.69F,76,89);
        main(50,25);*/
    }
}
