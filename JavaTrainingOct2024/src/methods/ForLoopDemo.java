package methods;

public class ForLoopDemo {

    //Static methods
    /**
     * accessmodifier static void methodName(){logic;}
     *  write a program to print 1 to 10 using for loop
     */
    public static void print1To10UsingForLoop(){
        System.out.println("Started executing print1To10UsingForLoop()............");
        //for(initialization;condition;increment/decrement){logic}---for loop syntax
        for(int i=1;i<=10;i++){
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println("*************************");
    }

    /**
     * accessmodifier static void methodName(){logic;}
     *  write a program to print 10 to 1 using for loop
     */
    static void print10To1UsingForLoop(){
        System.out.println("Started executing print10To1UsingForLoop()..");
        for(int i=10;i>=1;i--){
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println("*************************");
    }

    /**
     *accessmodifier static void methodName(){logic;}
     *  write a program to print 1 to 100 even number using for loop
     *
     */
    private static void print1To100EvenNumbrs(){
        System.out.println("Started executing print1To100EvenNumbrs()..");
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(i+"\t");
            }
        }
        System.out.println();
        System.out.println("*************************");
    }

    /**
     * write a program to print z to a using for loop
     * accessmodifier static void methodName(){logic;}
     */
    protected static void printzToaUsingForLoop(){
        System.out.println("Started executing printzToaUsingForLoop()..");
        for(char c='z';c>='a';c--){
            System.out.print(c+"\t");
        }
        System.out.println();
        System.out.println("*************************");
    }

    /**
     * write a program to print asciicodes from z to a
     *accessmodifier static void methodName(){logic;}
     */
    public static void printAsciiFromzToaUsingFor(){
        System.out.println("Started executing printAsciiFromzToaUsingFor()..");
        for(int x='z';x>='a';x--){
            System.out.print(x+"\t");
        }
        System.out.println();
        System.out.println("*************************");
    }

    /**
     * write a program to print 1 to 100 without using any numbers inside the program logic
     * accessmodifier static void methodName(){logic;}
     */
    static void print1To100WithOutUsingNumbrs(){
        System.out.println("Started executing print1To100WithOutUsingNumbrs()..");
        for(int y=('A'/'A');y<='d';y++){
            System.out.print(y+"\t");
        }
        System.out.println();
        System.out.println("*************************");
    }

    /**
     * accessmodifier static datatype methodName(datatype p1){logic; return;}
     * write a program to return  difference of the sum of  even and odd numbers
     */
    private static int diffOfSumOfEvenOdd(int n){
        System.out.println("Started executing diffOfSumOfEvenOdd()..");
        int evenSum=0, oddSum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                evenSum+=i;//evenSum=evenSum+i
            }else{
                oddSum+=i;//oddSum=oddSum+i
            }
        }
        System.out.println("Even sum is:"+evenSum);
        System.out.println("odd sum is:"+oddSum);
        return evenSum-oddSum;
    }

    /**
     * accessmodifier static void methodName(datatype p1){logic;}
     * Print 5 divisibilities using for loop
     */
    protected static void print5Divisibilities(int n){
        System.out.println("Started executing print5Divisibilities()..");
        for(int i=1;i<=n;i++){
            if(i%5==0){
                System.out.print(i+"\t");
            }
        }
        System.out.println();
        System.out.println("*************************");
    }

    /**
     * accessmodifier static void methodName(){logic;}
     * Print 50 to 1 odd numbers using for loop
     */
    public static void print50To1OddNumbrs(){
        System.out.println("Started executing print50To1OddNumbrs()..");
        for(int z=50;z>=1;z--){
            if(z%2!=0){
                System.out.print(z+"\t");
            }
        }
        System.out.println();
        System.out.println("*************************");
    }

    /**
     * accessmodifier static void methodName(){logic;}
     * Write a program to Print alphabets from A to Z using for loop
     */
    static void printAToZUsingForLoop(){
        System.out.println("Started executing printAToZUsingForLoop()..");
        for(char c='A';c<='Z';c++){
            System.out.print(c+"\t");
        }
        System.out.println();
        System.out.println("*************************");
    }

    /**
     * accessmodifier static void methodName(){logic;}
     * Write a program to Print asciicodes from A to Z using for loop
     */
        private static void printAsciiFromAToZUsingFor(){
            System.out.println("Started executing printAsciiFromAToZUsingFor()..");
            for(int i='A';i<='Z';i++){
                System.out.print(i+"\t");
            }
            System.out.println();
            System.out.println("*************************");
        }

    /**
     * accessmodifier static void methodName(datatype p1){logic;}
     * Write a program to Print multiplication table using while loop
     * 2 * 1 =2
     * 2 * 2 =4
     */
    protected static void printMultiplicationTable(int n){
        System.out.println("Started executing printMultiplicationTable()..");
        for(int i=1;i<=10;i++){
            System.out.println(n+ " * " +i+ " = " +(n*i)+"\t");
        }
        System.out.println("*************************");
    }

    /**
     * accessmodifier static returntype methodName(datatype p1){logic;return;}
     * Write a program to find sum of n natral numbers using for loop
     */
    public static int sumOfNaturalNumbrs(int x){
        System.out.println("Started executing sumOfNaturalNumbrs()..");
        int sum=0;
        for(int i=1;i<=x;i++){
            sum=sum+i;//sum+=i
        }
        return sum;
    }

    /**
     * accessmodifier static retuentype methodName(datatype p1){logic;return;}
     * Write a program to find factorial of n value using for loop
     * n!=n*(n-1)*(n-2).....
     */
    static int findFactorialOfn(int j){
        System.out.println("Started executing findFactorialOfn()..");
        int fact=1;
        for(int i=1;i<=j;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[]args){
        //How to call static methods in main method? Directly call methodName.
        print1To10UsingForLoop();
        print10To1UsingForLoop();
        print1To100EvenNumbrs();
        printzToaUsingForLoop();
        printAsciiFromzToaUsingFor();
        print1To100WithOutUsingNumbrs();
        int result=diffOfSumOfEvenOdd(50);
        System.out.println("The difference of the sum of  even and odd numbers is:"+result);
        print5Divisibilities(50);
        print50To1OddNumbrs();
        printAToZUsingForLoop();
        printAsciiFromAToZUsingFor();
        printMultiplicationTable(12);
        int total=sumOfNaturalNumbrs(30);
        System.out.println("Sum of natural numbers is:"+total);
        int factorial=findFactorialOfn(2);
        System.out.println("Factorial of given number is:"+factorial);
    }
}
