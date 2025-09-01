package methods;

import java.util.Scanner;

public class DoWhileLoop {

    //Non-static methods

    /**
     * accessmodifier void methodName(){logic;}
     * Write a program to add all the entered numbers using do while loop.
     */
    public void addNumbers(){
        System.out.println("Started executing addNumbers()........");
        int number, sum=0;
        char enterValue;
        //How to input the data from keyboard? Using Scanner Class it contains non-static methods
        Scanner scObj=new Scanner(System.in);
        do{
            System.out.println("Enter the number:");
            number=scObj.nextInt();
            sum=sum+number;//sum+=number
            System.out.println("Do you want to add more numbers yes or no");
            enterValue=scObj.next().charAt(0);
        }while(enterValue=='Y' || enterValue=='y');
          System.out.println("Add all entered numbers:"+sum);
    }

    /**
     * Write a program to guess randomnumber using do while loop.
     * accessmodifier void methodName(){logic;}
     */
    void guessRandomNumber(){
        System.out.println("Started executing guessRandomNumber().........");
        Scanner scobj=new Scanner(System.in);
        int guessNumber, randomNumber;
        randomNumber= (int) (Math.random()*100);
        do{
            System.out.println("enter your guess number:");
            guessNumber=scobj.nextInt();
            if(guessNumber==randomNumber){
                System.out.println("Entered guess number is equal to random number");
            }else if(guessNumber<randomNumber){
                System.out.println("Entered guess number is less than random number: Try again");
            }else{
                System.out.println("Entered guess number is greater than random number: Try again");
            }
        }while (guessNumber!=randomNumber);
    }

    /**
     * print 1 to 10 numbers using do while loop
     * accessmodifier void methodName(){logic;}
     */
    private void print1To10Numbrs(){
        System.out.println("Started executing print1To10Numbrs()......");
        int i=1;
        do{
            System.out.print(i+"\t");
            i++;
        }while (i<=10);
        System.out.println();
        System.out.println("*******************************.");
    }

    public static void main(String[]args){
        //How to call non-static methods? Create object for that class
        DoWhileLoop dObj=new DoWhileLoop();
        //dObj.addNumbers();
       // dObj.guessRandomNumber();
        dObj.print1To10Numbrs();
    }
}
