package methods;

public class WhileLoopDemo {

    //Static methods
    /**
     * accessmodifier static void methodName(datatype p1){logic;}
     * Print 5 divisibilities using while loop
     */
    public static void print5DivisibilitiesUsingWhile(int n){
        System.out.println("Started executing print5DivisibilitiesUsingWhile().....");
        int i=1;//initialization
        while(i<=n){//condition
            if(i%5==0){
                System.out.print(i+"\t");//statement
            }
            i++;//increment
        }
        System.out.println();
        System.out.println("***************************");
    }

    /**
     * accessmodifier static void methodName(){logic;}
     * Print 50 to 1 odd numbers using while loop
     */
    static void print50To1OddNumbrs(){
        System.out.println("Started executing print50To1OddNumbrs().....");
        int i=50;
        while(i>=1){
            if(i%2!=0){
                System.out.print(i+"\t");
            }
            i--;
        }
        System.out.println();
        System.out.println("***************************");
    }

    /**
     * accessmodifier static void methodName(){logic;}
     * Write a program to Print alphabets from A to Z using while loop
     */
    private static void printAToZUsingWhile(){
        System.out.println("Started executing printAToZUsingWhile().....");
        char c='A';
        while(c<='Z'){
            System.out.print(c+"\t");
            c++;
        }
        System.out.println();
        System.out.println("***************************");
    }

    /**
     * accessmodifier static void methodName(){logic;}
     * Write a program to Print asciicodes from A to Z using while loop
     */
    protected static void printAsciiCodesAToZ(){
        System.out.println("Started executing printAsciiCodesAToZ().....");
        int i='A';
        while (i<='Z'){
            System.out.print(i+"\t");
            i++;
        }
        System.out.println();
        System.out.println("***************************");
    }

    /**
     * accessmodifier static void methodName(datatype p1){logic;}
     * Write a program to Print multiplication table using while loop
     * 2 * 1 =2
     * 2 * 2 =4
     */
    public static void printMultiplicationTable(int n){
        System.out.println("Started executing printMultiplicationTable().............");
        int i=1;
        while (i<=10){
            System.out.println(n+""+"*"+""+i+"="+(n*i));
            i++;
        }
        System.out.println("***************************");
    }

    /**
     * accessmodifier static returntype methodName(datatype p1){logic;return;}
     * Write a program to find sum of n natral numbers using while loop
     *
     */
    private static int sumOfNaturalNumbrs(int x){
        System.out.println("Started executing sumOfNaturalNumbrs().........");
        int sum=0;
        int i=1;
        while(i<=x){//1<=5-T|2<=5-T|3<=5-T|4<=5-T|5<=5-T|6<=5-F
            sum+=i;//sum=sum+i==>0+1=1|1+2=3|3+3=6|6+4=10|10+5=15
            i++;//1+1=2|2+1=3|3+1=4|4+1=5|5+1=6
        }
    return sum;
    }

    /**
     * accessmodifier static retuentype methodName(datatype p1){logic;return;}
     * Write a program to find factorial of n value using while loop
     * n!=n*(n-1)*(n-2).....
     */
    protected static int factorialOfNumbrUsingWhile(int y){
        System.out.println("Started executing factorialOfNumbrUsingWhile().........");
        int factorial=1;
        int i=1;
        while (i<=y){
            factorial=factorial*i;
            i++;
        }
        return factorial;
    }

    /**
     * Recursion: It is a programming concept where a function calls itself directly or indirectly
     * to solve a problem.This is where the function calls itself with modified parameters.
     * Write a program to find factorial of n value using recursion.
     * accessmodifier static retuentype methodName(datatype p1){logic;return;}
     */
    public static int getFactorialByRecursion(int z){
        if(z==0){
            return 1;
        }
        return z*getFactorialByRecursion((z-1));
    }

    /**
     * Recursion: It is a programming concept where a function calls itself directly or indirectly
     * to solve a problem.This is where the function calls itself with modified parameters.
     * Write a program to print 1 to 10 numbers with out using loops
     * accessmodifier static void methodName(datatype p1){logic;}
     */
    static void print1To10UsingRecursion(int n){
        if(n<=10){
            System.out.print(n+"\t");
            print1To10UsingRecursion(n+1);
        }

    }

    public static void main(String[]args){
        print5DivisibilitiesUsingWhile(120);
        print50To1OddNumbrs();
        printAToZUsingWhile();
        printAsciiCodesAToZ();
        printMultiplicationTable(5);
        int val=sumOfNaturalNumbrs(5);
        System.out.println("Sum of natural numbers:"+val);
        int fact=factorialOfNumbrUsingWhile(5);
        System.out.println("Factorial of number is:"+fact);
        int recufact=getFactorialByRecursion(10);
        System.out.println("Factorial of number using recursion is:"+recufact);
        print1To10UsingRecursion(1);
    }
}
