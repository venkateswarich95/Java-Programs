package methods;

public class WhileLoop {


    //nonstatic methods
    /**
     * accessmodifier void methodName(){logic;}
     *  write while loop programs to print 1 to 10
     */
    public void print1To10UsingWhile(){
        System.out.println("Started executing print1To10singWhile()............");
        int i=1; //initialization
        while(i<=10){ //condition
            System.out.print(i+"\t"); //logic/print statements
            i++; // increment
        }
        System.out.println();
        System.out.println("************************");

    }

    /**
     * accessmodifier void methodName(){logic;}
     *  write while loop programs to print 10 to 1
     */
    protected void print10To1UsingWhile(){
        System.out.println("Started executing print10To1singWhile()............");
        int i=10;
        while(i>=1){
            System.out.print(i+"\t");
            i--;
        }
        System.out.println();
        System.out.println("************************");
    }

    /**
     *accessmodifier void methodName(){logic;}
     *  write a program to print 1 to 100 even number using while loop
     *
     */
    void print1To100EvenNumbrs(){
        System.out.println("Started executing print1To100EvenNumbrs()............");
        int i=1;
        while(i<=100){
            if(i%2==0){
                System.out.print(i+"\t");
            }
            i++;
        }
        System.out.println();
        System.out.println("************************");
    }

    /**
     * write a program to print z to a using while loop
     * accessmodifier void methodName(){logic;}
     */
    private void printzToaUsingWhile(){
        System.out.println("Started executing printzToaUsingWhile()............");
        char c='z';
        while(c>='a'){
            System.out.print(c+"\t");
            c--;
        }
        System.out.println();
        System.out.println("************************");
    }

    /**
     * write a program to print asciicodes from z to a
     *
     */
    public void printAsciiCodesFromzToa(){
        System.out.println("Started executing printAsciiCodesFromzToa()............");
        int c='z';
        while (c>='a'){
            System.out.print(c+"\t");
            c--;
        }
        System.out.println();
        System.out.println("************************");
    }

    private int getFactorial(int n){
        if(n==0){
            return 1;
        }
        return n*getFactorial(n-1);
    }

    /**
     *  write a program to print sum of n natural numbers using recursion
     *
     */
    public int sumOfNaturalNumbrs(int n){
        System.out.println("Started executing sumOfNaturalNumbrs()....");
      if(n==1){
          return 1;
      }
      return n+sumOfNaturalNumbrs(n-1);
    }

    /**
     * write a program to print 1 to 100 without using any numbers inside the program logic
     *
     */
    private void print1To100WithOutNumbrs(){
        int one=('a'/'a');
        int hundred='d';

        int i=one;
        while(i<=hundred){
            System.out.print(i+"\t");
            i++;
        }
        System.out.println();
        System.out.println("************************");
    }

    /**
     * accessmodifier datatype methodName(datatype p1){logic; return;}
     * write a program to return  difference of the sum of  even and odd numbers
     */
    private int diffOfEvenAndOddNumbrs(int n){
        System.out.println("Started executing diffOfEvenAndOddNumbrs");
        int evenSum=0, oddSum=0;
        int i=1;
        while (i<=n){//1<=10-T|2<=10-T|3<=10-T|4<=10-T|5<=10-T|6<=10-T|7<=10-T|8<=10-T|9<=10-T|10<=10-T
            if(i%2==0){
                evenSum+=i;//evenSum=evenSum+i;|2|2+4=6|6+6=12|12+8=20|20+10=30
                i++;
            }else{
                oddSum+=i;//oddSum=oddSum+i;|1|1+3=4|4+5=9|9+7=16|16+9=25|
                i++;
            }
        }
        return evenSum-oddSum;
    }


    public static void main(String[]args){
        //Create an object for the class using new keyword
        WhileLoop wlObj=new WhileLoop();
        wlObj.print1To10UsingWhile();
        wlObj.print10To1UsingWhile();
        wlObj.print1To100EvenNumbrs();
        wlObj.printzToaUsingWhile();
        wlObj.printAsciiCodesFromzToa();
        int val= wlObj.sumOfNaturalNumbrs(4);
        System.out.println("value is:"+val);
        wlObj.print1To100WithOutNumbrs();
        int diff= wlObj.diffOfEvenAndOddNumbrs(10);
        System.out.println("Difference of even & odd sum:"+diff);
    }
}
