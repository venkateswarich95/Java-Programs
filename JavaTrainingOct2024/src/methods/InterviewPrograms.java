package methods;

import java.util.Scanner;

public class InterviewPrograms {
    //static methods

    /**
     * Write a program to print fibonacci sequence-->Sum of previous two numbrs is equal to next number.
     * accessmodifier static void methodName(datatype p1){logic;}
     */
    public static void printFibonnaciSequence(int n){
        System.out.println("Started executing printFibonnaciSequence()............");
        int n1=0, n2=1, n3;
        System.out.print(n1+" "+n2);
        for(int i=2;i<n;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        System.out.println();
        System.out.println("*******************************************");
    }

    /**
     * Write a program to chck given number is palindrome or not
     * that reads the same forward and backward ->palindrome
     * accessmodifier static void methodName(datatype p1){logic;}
     * @param n
     */
    static void checkPalindrome(int n){
        System.out.println("Started executing checkPalindrome()............");
        //declare some variables
        int rem, rev=0,temp;
        //assign n value to temp
        temp=n;
        while(n>0){
            //fetch each digit from the number using %
            rem=n%10;
            //reverse the value
            rev=(rev*10)+rem;
            n=n/10;
        }
        if(rev==temp){
            System.out.println("Given number is a palindrome:"+temp) ;
        }else{
            System.out.println("Given number is not a palindrome:"+temp) ;
        }
        System.out.println("*******************************************");
    }

    /**
     * A number that is equal to the sum of its own digits each raised to the power
     * of the number of digits.--> Armstrong number
     * accessmodifier static void methodName(datatype p1){logic;}
     * @param n
     */
    private static void checkArmstrongNumbr(int n){
        System.out.println("Started executing checkArmstrongNumbr()............");
        //declare some variables
        int rem,cube=0,temp;
        //assign n value to temp
        temp=n;
        while(n>0){
            //fetch each digit using %
            rem=n%10;
            n=n/10;
            //cube the value
            cube=cube+(rem*rem*rem);
        }
        if(cube==temp){
            System.out.println("Given number is an armstrong numbr:"+cube);
        }else{
            System.out.println("Given number is not an armstrong numbr:"+cube);
        }
        System.out.println("*******************************************");
    }

    /**
     * Write a program to check prime number
     * Prime number is greater than 1 & divisible by 1 and itself
     * accessmodifier static void methodName(datatype p1){logic;}
     * @param n
     */
    protected static void checkPrimeNumbr(int n){
        System.out.println("Started executing checkPrimeNumbr()............");
        boolean isPrime=true;
        if(n==0|| n==1){
            System.out.println("Given number is not a prime number:"+n);
        }else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    System.out.println("Given number is not a prime number:"+n);
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("Given number is a prime number:"+n);
            }
        }
        System.out.println("*******************************************");
    }

    public static void findMaxValueUsingTernary(){
        System.out.println("Started executing findMaxValueUsingTernary()............");
        int n1=50, n2=75, max;
        System.out.println("n1 value is:"+n1);
        System.out.println("n2 value is:"+n2);
        //variable=expression ? expression1: expression2;
        max=n1>n2?n1:n2;
        System.out.println("max value is:"+max);
    }

    /**
     * write a program to check given number is neon or not
     * neon number:square the given input, then sum all the digits in that number,
     * then if you get same as initial number then that number is called neon number.
     * int n=9 sqrval=n*n=81
     * 	sum=1+8=>9
     * @param n
     */
    public static void printNeonNumber(int n){
        System.out.println("Started executing printNeonNumber()............");
        //Declare variables
        int rem,sum=0;
        //step2 -square the given input
        int sqrval=n*n;

        //Iterate using while loop
        while(sqrval>0){
            //step4-extract each digit from the sqrval using %
            rem=sqrval%10;
            sum=sum+rem;
            sqrval=sqrval/10;
        }
        if(n==sum) {
            System.out.println("given number: "+ n + " is a neon number: "+sum );
        }else {
            System.out.println("given number: "+n+ " is not a neon number: "+sum );
        }
    }

    //print pyramid shape
    protected static void printPyramid(){
        System.out.println("Started executing printPyramid()...........");
        //Create object for Scanner class
        Scanner scObj=new Scanner(System.in);
        System.out.println("Please enter no.of rows that you want in pyramid shape");
        int noOfRows=scObj.nextInt();
        //initialize the row count with 1
        int rowCount=1;
        for(int i=noOfRows;i>0;i--){
            //print the i spaces
            for(int j=0;j<=1;j++){
                System.out.print(" ");
            }
            //print the * after all spaces in each row
            for(int k=1;k<=rowCount;k++){
                System.out.print(" * ");
            }
            System.out.println();
            //increment the row count by 1
            rowCount++;
        }
    }

    public static void main(String[] args){
    printFibonnaciSequence(10);
    checkPalindrome(120);
    checkArmstrongNumbr(153);
    checkPrimeNumbr(7);
    findMaxValueUsingTernary();
    printPyramid();
    }
}
