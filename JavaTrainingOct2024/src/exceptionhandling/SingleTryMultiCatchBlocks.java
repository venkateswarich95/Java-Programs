package exceptionhandling;

public class SingleTryMultiCatchBlocks {

    public static void main(String[]args){
        int a[]=new int[5];
        try {
            a[0]=20;//ArithmeticException
            a[1]=8;
            a[2]=17;
            a[3]=5;
            a[4]=11;
           // a[5]=3;//ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException aie) {
            aie.printStackTrace();

        }catch (ArithmeticException ae) {
            ae.printStackTrace();

        }  catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("rest of the code");
        for(int e1:a){
            System.out.println(e1);
        }

    }
}
