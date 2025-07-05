package methods;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

    //Static methods

    /**
     * print vowels
     * accessmodifier static void methodName(){logic;}
     */
    public static void printVowels(){
        System.out.println("Started executing printVowels()....");
        //Declare & initialize the array->datatype[] arrayname=new datatype[SIZE];
        char[] vowels=new char[5];
        System.out.println("Size of an array is:"+vowels.length);
        //insert the elements in the array->arrayname[index]=value;
        //First Element
        vowels[0]='a';
        //2nd element
        vowels[1]='e';
        //3rd element
        vowels[2]='i';
        //4th element
        vowels[3]='o';
        //5th element
        vowels[4]='u';
        //vowels[5]='p';
        System.out.println("Print vowels using for loop");
        //for loop->for(initialization;condition;incre/decre){logic;}
       for(int i=0;i<vowels.length;i++){
            System.out.print(vowels[i]+"\t");
        }
       System.out.println();
        System.out.println("Print vowels using for each loop");
        for(char v:vowels){
            System.out.print(v+"\t");
        }
        System.out.println();
        System.out.println("Print vowels in reverse order using for loop");
        //print vowels in reverse order
        for(int i=vowels.length-1;i>=0;i--){
            System.out.print(vowels[i]+"\t");
        }
        System.out.println();
    }

    /**
     * Print even numbers in given array
     * accessmodifier static void methodName(){logic;}
     */
    private static void printEvnNumbrs(){
        System.out.println("Started executing printEvnNumbrs()....");
        //datatype[] arrayname=new datatype[SIZE];
        int[] evenNum={2,7,8,20};
        System.out.println("Size of an array is:"+evenNum.length);
        System.out.println("Print even numbers using for each loop");
        //Iterate using for each loop->for(datatype variablename:arrayname){logic;}
        for(int e:evenNum){
            if(e%2==0){
                System.out.print(e+"\t");
            }
        }
        System.out.println();
        System.out.println("Print even numbers using for loop");
        //Iterate using for loop
        for(int i=0;i<evenNum.length;i++){
            if (evenNum[i] % 2 == 0) {
                System.out.print(evenNum[i]+"\t");
            }
        }
        System.out.println();
    }

    /**
     * Write a program to generate random integer array and return it
     * accessmodifier static returntype methodName(){logic;return;}
     */
    static int[] getRandomArray(){
        System.out.println("Started executing getRandomArray()....");
        final int SIZE=5;
        //datatype[] arrayName=new datatype[SIZE];
        int[] randArray=new int[SIZE];
        //Iterate using for loop
        for(int i=0;i<SIZE;i++){
            randArray[i]= (int) (Math.random()*100);
        }
        return randArray;
    }

    /**
     * Write a program to find max element in given array
     * accessmodifier static returntype methodName(){logic;return;}
     * @param num
     */
    protected static int getMaxValue(int[] num){
        System.out.println("Started executing getMaxValue()....");
        System.out.println("Array elements are:"+Arrays.toString(num));
       if(num.length==0){
           throw new IllegalArgumentException("Invalid array");
       }
       //Lets assume first element is max
        int max=num[0];
       //Iterate using for loop
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        return max;
    }

    /**
     * Write a program to find min element in given array
     * accessmodifier static returntype methodName(){logic;return;}
     * @param arr
     */
    public static int getMinValue(int[] arr){
        System.out.println("Started executing getMinValue()....");
        System.out.println("Array elements are:"+Arrays.toString(arr));
        if(arr.length==0){
            throw new IllegalArgumentException("Invalid array");
        }
        //Lets assume first elment is minimum
        int min=arr[0];
        //Iterate using for loop
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    /**
     * Write a program to find average of array elements
     * @param arr
     */
    private static float getAverageOfArray(int[] arr){
        System.out.println("Started executing getAverageOfArray()....");
        System.out.println("Array elements are:"+Arrays.toString(arr));
        int sum=0;
        //length of array
        int size=arr.length;
        //Iterate the array using for loop
        for(int i=0;i<size;i++){
            sum=sum+arr[i];//sum+=i
        }
        //avarage of an array
        System.out.println("Total sum is:"+sum);
        System.out.println("Size of an array is:"+size);
        float avg=sum/size;
        return avg;
    }

    /**
     * Write a program to print duplicate elements in given array
     */
    protected static void printDuplicateElemnts(){
        System.out.println("Started executing printDuplicateElemnts()....");
        //datatype[] arraynam={e1,e2,....}
        String[] lang={"java","python","c","c++","c++","java"};
        //iterate the array using nested for loop
        for(int i=0;i<lang.length;i++){
            for(int j=i+1;j<lang.length;j++){
                if(lang[i].equals(lang[j])){
                    System.out.print(lang[i]+"\t");
                }
            }
        }
        System.out.println();
    }

    /*
    Task1)Write a program that creates an array of 10 elements size. Your program should prompt
     the user to input numbers in array and then display the sum of all array elements.
     */
    protected static int sumOfArrayElements(){
        //creates an array of 10 elements size
          //datatype[] arrayName=new datatype[SIZE];
        int[] numbrs=new int[10];
        //declare a variable sum
        int sum=0;
        //Your program should prompt the user to input numbers in array
          //create object for Scanner class
        Scanner scObj=new Scanner(System.in);
        System.out.println("Enter 10 elements:");
        //Iterate
        for(int i=0;i<numbrs.length;i++){
            numbrs[i]=scObj.nextInt();
            sum+=numbrs[i];
        }
       // System.out.println("Sum of array elements:"+sum);
        return sum;
    }

    /*
    Task2)The variable list1 and list2 are reference arrays that each have 5 elements.
    Write code that copies the values in list1 to list2. Values in list1 are input by user.
     */
    private static void copyArrayElements(){
        System.out.println("*************Started executing copyArrayElements()************");
        final int SIZE=5;
        //The variable list1 and list2 are reference arrays that each have 5 elements
          //datatype[] arrayName=new datatype[SIZE];
        int[] list1=new int[SIZE];
        int[] list2=new int[SIZE];
        // Values in list1 are input by user
         //Create object for Scanner class
        Scanner scObj=new Scanner(System.in);
        //iterate
        for(int i=0;i<SIZE;i++){
            list1[i]= scObj.nextInt();
        }
        System.out.println("list1 elements are:"+Arrays.toString(list1));
        for(int j=0;j<SIZE;j++){
            list2[j]=list1[j];
        }
        System.out.println("list2 elements are:"+Arrays.toString(list2));
    }

    //Task3)Write a Java program to reverse the element of an integer 1-D array.
     static void reverseArrayElements(int[] num){
         System.out.println("******Started executing reverseArrayElements()**********");
         System.out.println("Array elements are:"+Arrays.toString(num));
         //iterate
         for(int i=num.length-1;i>=0;i--){
             System.out.print(num[i]+"\t");
         }
         System.out.println();
     }

    static void reverseArrayInPlace(int[] num){
        System.out.println("******Started executing reverseArrayInPlace()**********");
        System.out.println("Before reverse Array elements are:"+Arrays.toString(num));
        //iterate
        for(int i=0;i<num.length/2;i++){
           int temp=num[i];
           num[i]=num[num.length-1-i];
            num[num.length-1-i]=temp;
        }
        System.out.println("After reverse Array elements are:"+Arrays.toString(num));
        System.out.println();
    }

    /*
    Task4)Write a menu driven Java program with following option
 a. Accept elements of an array
 b. Display elements of an array
 c. Search the element within array given by user
 d. Sort the array using bubble sort method
 Write methods for all options. The methods should be static and have one parameter name of the array.
     */
    //a. Accept elements of an array
    private static void readArray(int[] arr){
        Scanner scObj=new Scanner(System.in);
        System.out.println("Enter "+arr.length+" elements in an array:");
        for(int i=0;i<arr.length;i++){
            arr[i]= scObj.nextInt();
        }
    }
    //b. Display elements of an array
    private static void displayArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    //c. Search the element within array given by user
    private static int searchElementInArray(int[] arr,int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }
    //d. Sort the array using bubble sort method
    public static void sortArray(int[] arr){
        System.out.println("Before sorting array is:"+Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After sorting array is:"+Arrays.toString(arr));
    }
    //Write methods for all options. The methods should be static and have one parameter name of the array.
    protected static void searchSortArray(int[] arr){
        Scanner scObj=new Scanner(System.in);
        int option;
        do{
            System.out.println("Menu:");
            System.out.println("1.Read Array:");
            System.out.println("2.Display Array:");
            System.out.println("3.Search the element in the array:");
            System.out.println("4.Sort the array:");
            System.out.println("5.Exit");
            System.out.println("select an option from menu:");
            option=scObj.nextInt();
            switch (option){
                case 1:
                    readArray(arr);
                    break;
                case 2:
                    displayArray(arr);
                    break;
                case 3:
                    System.out.println("Enter the number that you want to search:");
                    int element= scObj.nextInt();
                    int index=searchElementInArray(arr,element);
                    if(index==-1){
                        System.out.println("Item not found in the array");
                    }else{
                        System.out.println("Item found in the array");
                    }
                    break;
                case 4:
                    sortArray(arr);
                    displayArray(arr);
            }
        }while (option!=5);
    }
    public static void main(String[]args){
        reverseArrayElements(new int[]{45, 85, 75, 96});
        reverseArrayInPlace(new int[]{65,100,50,70,96});
        searchSortArray(new int[]{20,40,10,5,90});
   /* printVowels();
    printEvnNumbrs();
    int[] randVal=getRandomArray();
    System.out.println("Random array values are:"+ Arrays.toString(randVal));
    int maxVal=getMaxValue(randVal);
    System.out.println("Max value in"+Arrays.toString(randVal)+ "is:"+ maxVal);
    int minVal=getMinValue(randVal);
    System.out.println("Min value in given array is:"+ minVal);
    float average=getAverageOfArray(randVal);
    System.out.println("Average in given array is:"+ average);
    printDuplicateElemnts();
    //datatype variablename=returntypestatic();
       int arraySum=sumOfArrayElements();
       System.out.println("Sum of array elements:"+arraySum);
        copyArrayElements();*/


    }
}
