package methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayHW {

    //Non-staticmethods

    public static void whileLoopDemo(){
        System.out.println("*******Started executing whileLoopDemo()*******");
        for(var i=0; i<3; i--) {
            if(i<-5)
                break;
            System.out.println(i); }
    }


    //Task1)Write a Jva Program to find Second Smallest Number in an Array
    public static int[] secondSmallestNbr(int[] arr){
        System.out.println("*******Started executing secondSmallestNbr()*******");
        System.out.println("Array before sorting in ascending:"+Arrays.toString(arr));
        //sort the array in ascending order
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                      int temp=arr[j];
                      arr[j]=arr[j+1];
                      arr[j+1]=temp;
                }
            }
        }
        System.out.println("Array after sorting in ascending:"+Arrays.toString(arr));
        System.out.println("second smallest element :"+arr[1]);
        return arr;
    }

    //Task2)Find 2nd Largest Number in Array using Arrays
    private static int[] secondLargestElement(int[] arr){
        System.out.println("*******Started executing secondLargestElement()*******");
        System.out.println("Array before sorting in descending order:"+Arrays.toString(arr));
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Array after sorting in descending order:"+Arrays.toString(arr));
        System.out.println("Second largst element is:"+arr[1]);
        return arr;
    }

    //Task3)Java Program to find Third Largest Number in an Array
    protected static int[] thirdLargestElement(int[] arr){
        System.out.println("******Started excuting thirdLargestElement()**********");
        System.out.println("Before sorting array is:"+Arrays.toString(arr));
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Array after sorting in descending order:"+Arrays.toString(arr));
        System.out.println("Third largest element is:"+arr[2]);
        return arr;
    }

    //Task4)Java Program to right rotate the elements of an array
    static void rightRotate(int[] num){
        System.out.println("******Started excuting rightRotate()**********");
        System.out.println("Original array is:"+Arrays.toString(num));
        //step1:determine the no.of times that array should rotate
        int n=1;
        //step2:Iterate the array n times
        for(int i=0;i<n;i++){
            int last=num[num.length-1];
            //iterate the elements towards right
            for(int j=num.length-1;j>0;j--){
               num[j]=num[j-1];
            }
            num[0]=last;
        }
        System.out.println("Array after right rotate is:"+Arrays.toString(num));
    }

    //Task5)Java Program to left rotate the elements of an array
    private static void leftRotate(int[] num){
        System.out.println("******Started excuting leftRotate()**********");
        System.out.println("Original array is:"+Arrays.toString(num));
        //step1:determine the no.of times that array should rotate
        int n=3;
        //step2:iterate the array by n times
        for(int i=0;i<n;i++){
            int first=num[0];
            //step3:iterate the array towards left
            for(int j=0;j< num.length-1;j++){
                num[j]=num[j+1];
            }
            num[num.length-1]=first;
        }
        System.out.println("Array after left rotate is:"+Arrays.toString(num));
    }

    //Task6)Write a program to sort an array in ascending order
    protected static int[] sortArrayInAscending(int[] arr){
        System.out.println("******Started excuting sortArrayInAscending()**********");
        System.out.println("Original array is:"+Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    //task7)Write a program to sort an array in descending order
    private static int[] sortArrayInDescending(int[] num){
        System.out.println("******Started executing sortArrayInDescending()*****");
        System.out.println("Original array is:"+Arrays.toString(num));
        for(int i=0;i<num.length;i++){
            for(int j=0;j< num.length-1-i;j++){
                if(num[j]<num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        return num;
    }

    /**
     * write an array program to print even numbers in given array
     * accessmodifier void methodName(){logic;}
     */
    public void printEvenNumbrs(){
        System.out.println("Started executing printEvenNumbrs().....");
        //datatype[] arrayName={e1,e2...}-->declare and initialize and array
        int[] numbrs={2,7,89,54,64};
        System.out.println("Size of an array is:"+numbrs.length);
        System.out.println("Iterate the array using for loop");
        //Iterate the array using for loop
        for(int i=0;i<numbrs.length;i++){
            if(numbrs[i]%2==0){
                System.out.print(numbrs[i]+"\t");
            }
        }
        System.out.println();
        System.out.println("Iterate the array using for each loop");
        //Iterate the array using for each loop
        for(int e:numbrs){
            if(e%2==0){
                System.out.print(e+"\t");
            }
        }
        System.out.println();
        System.out.println("***********************************************************");
    }

    /**
     * write an array program to print average of in given int[] array
     * accessmodifier returntype methodName(){logic;return;}
     */
    private float printAvgOfArray(){
        System.out.println("Started executing printAvgOfArray().....");
        //datatype[] arrayName={e1,e2...}-->declare and initialize and array
        int[] numbrs={2,7,89,54,64};
        //Averag=(sum of elements/total no.of elements)
        int sum=0;
        //Iterate the array using for loop
        for(int i=0;i<numbrs.length;i++){
            sum=sum+numbrs[i];//sum+=numbrs[i]
        }
        System.out.println("Sum of elements is:"+sum);
        System.out.println("Total no.of elements is:"+numbrs.length);
        float average=(sum/numbrs.length);
        return average;
    }

    /**
     * Write Java statements that do the following:
     * a) Declare an array numArray of 15 elements of type int.
     * b) Output the value of the tenth element of the array alpha.
     * c) Set the value of the fifth element of the array alpha to 35.
     * d) Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha.
     */
    protected void javaStatements(){
        //Declare an array numArray of 15 elements of type int.
        //datatype[] arrayname=new datatype[SIZE];
        int[] alpha= {2,5,8,15,54,24,76,89,5,1,46,78,99,86,75};//new int[15];
        System.out.println("Size of an array is:"+alpha.length);
        //b) Output the value of the tenth element of the array alpha.
        System.out.println("tenth element is:"+alpha[9]);
        //c) Set the value of the fifth element of the array alpha to 35.
        alpha[4]=35;
        // d) Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha.
        alpha[8]=alpha[5]+alpha[12];
        System.out.println("***********************************************************");
    }

    /**
     * a) Write a statement that declares a string array initialized with the following strings:
     * "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
     * b) Write a loop that displays the contents of each element in the array that you declared.
     */
    private void daysInWeek(){
        System.out.println("Started executing daysInWeek().....");
        //datatype[] arrayName= new datatype[SIZE];
        String[] days={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ,"Saturday"};
        System.out.println("Size of an array is:"+days.length);
        // b) Write a loop that displays the contents of each element in the array that you declared.
        System.out.println("Iterate the array using for each loop ");
        //for(datatype variablename:arrayname){logic;}
        for(String d:days){
            System.out.print(d+"\t");
        }
        System.out.println();
        System.out.println("Iterate the array using for loop ");
        //For loop
        for(int i=0;i<days.length;i++){
            System.out.print(days[i]+"\t");
        }
        System.out.println();
        System.out.println("***********************************************************");
    }

    /**
     * Write a Java program to find the largest and smallest element of an array.
     */
    public void largeAndSmallElemnts(int[] arr){
        System.out.println("Started executing largeAndSmallElemnts().....");
        System.out.println("Array elements are:"+Arrays.toString(arr));
       if(arr==null || arr.length==0){
           System.out.println("Array is empty.");
       }
       //Lets assume first element is large
        int large=arr[0];
        //Lets assume first element is small
        int small=arr[0];
        //Iterate the array
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println("Largest value in the array is:"+large);
        System.out.println("Smallest value in the array is:"+small);
        System.out.println("***********************************************************");
    }

    /**
     * write a program to print duplicates of given int[] array
     */
    private void printDuplicates(){
        System.out.println("Started executing printDuplicates().....");
        //datatype[] arrayName={e1,e2...}-->declare and initialize and array
        int[] numbers={55,89,78,55,9,78};
        System.out.println("Array elements are:"+Arrays.toString(numbers));
        //Iterate the array
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]==numbers[j]){
                    System.out.print(numbers[i]+"\t");
                }
            }
        }
        System.out.println();
        System.out.println("***********************************************************");
    }

    /**
     * write a program to reverse an array in place
     * @param num
     */
    void reverseAnArray(int[] num){
        System.out.println("Started executing reverseAnArray().....");
        System.out.println("Before reversing an array is:"+Arrays.toString(num));
        //lets declare one variable
        int temp;
        //Iterate the array
        for(int i=0;i<num.length/2;i++){
            temp=num[i];
            num[i]=num[num.length-i-1];
            num[num.length-i-1]=temp;
        }
        System.out.println("After reversing an array is:"+Arrays.toString(num));
        //Another way to reverse the array
        for(int i=num.length-1;i>=0;i--){
            System.out.print(num[i]+"\t");
        }
        System.out.println();
        System.out.println("***********************************************************");
    }

    /**
     * write a program to sort array using bubble sort
     * @param num
     */
    public void bubbleSort(int[] num){
        System.out.println("Started executing sorting the array sing bubble sort method....");
        System.out.println("Before sorting array elements are:"+Arrays.toString(num));
        //Lets declare temp variable
        int temp;
        //Iterate the array using nested for loop
        for(int i=0;i<num.length-1;i++){
            for(int j=0;j<num.length-i-1;j++){
                if(num[j]>num[j+1]){
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        System.out.println("After sorting array elements are:"+Arrays.toString(num));
        System.out.println("***********************************************************");
    }

    /**
     * write a program to sort array in ascending order
     * @param num
     */
    public void sortArrayInAscenOrder(int[] num){
        System.out.println("Started executing sorting the array in ascending order...");
        System.out.println("Before sorting in ascending order array elements are:"+Arrays.toString(num));
        //Iterate the array using nested for loop
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]>num[j]){
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println("After sorting in ascending order array elements are:"+Arrays.toString(num));
        System.out.println("***********************************************************");
    }

    /**
     * write a program to sort array in descending order
     * @param arr
     */
    public void sortArrayInDescenOrder(int[] arr){
        System.out.println("Started executing sorting the array in descending order...");
        System.out.println("Before sorting in descending order array elements are:"+Arrays.toString(arr));
        //Iterate the array using nested for loop
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("After sorting in descending order array elements are:"+Arrays.toString(arr));
        System.out.println("***********************************************************");
    }

    /**
     * write a program to find second largest element in given array
     * @param num1
     */
    void findSecondLargestElement(int[] num1){
        System.out.println("Started executing findSecondLargestElement()..");
        System.out.println("Before sorting in descending order array elements are:"+Arrays.toString(num1));

        //Iterate the array using nested for loop
        for(int i=0;i<num1.length;i++){
            for(int j=i+1;j<num1.length;j++){
                if(num1[i]<num1[j]){
                    int temp=num1[i];
                    num1[i]=num1[j];
                    num1[j]=temp;
                }
            }
        }
        System.out.println("After sorting in descending order array elements are:"+Arrays.toString(num1));
        System.out.println("Second largest element in given array is:"+num1[1]);
        System.out.println("***********************************************************");
    }

    //Write Java code to remove duplicate elements from array without Hashamap
    private static int[] removeDuplicates(int[] inputArray){
        System.out.println("Before removing duplicates array is:"+Arrays.toString(inputArray));
        //Create a List to store unique elements
        List<Integer> uniqueArray=new ArrayList<>();
        //iterate the inputArray
        for(int i=0;i<inputArray.length;i++){
            if(!uniqueArray.contains(inputArray[i])){
                uniqueArray.add(inputArray[i]);
            }
        }
        int[] resultArray=new int[uniqueArray.size()];
        for(int i=0;i<uniqueArray.size();i++){
            resultArray[i]=uniqueArray.get(i);
        }

        return resultArray;
    }

    /*
    Task6)write a program to print leftangled increased triangle ?
    *      ==1
    * *    ==2
    * * *  ==3
    * * * *
    * * * * *
     */
    private static void increasedTriangle(){
        System.out.println("***Started executing increasedTriangle()*************");
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("###########################");
    }

    /*
    Task7) write a program to print leftangled decreased triangle?
    * * * * * ==5
    * * * *   ==4
    * * *     ==3
    * *       ==2
    *         ==1
     */
    protected static void decreasedTriangle(){
        System.out.println("*********Started executing decreasedTriangle()********");
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("#####################");
    }

    //Task1)Write a program to sum all the digits in given number
    protected static int sumOfAllDigits(int number){
        System.out.println("***Started executing sumOfAllDigits()********");
         //declare a variable
        int sum=0;
        //ensure that given number is +ve
        number=Math.abs(number);
        //loop to extract each digit & do sum
        while (number>0){
            int digit=number%10;
            sum+=digit;
            number/=10;
        }
        return sum;
    }


    public static void main(String[]args){
        whileLoopDemo();
        int sum=sumOfAllDigits(25);
        System.out.println("Sum of all digits in a number is:"+sum);
        increasedTriangle();
        decreasedTriangle();
    //To access non-static members we need to create object for that class
       /* ArrayHW aObj=new ArrayHW();
        aObj.printEvenNumbrs();
        float avg=aObj.printAvgOfArray();
        System.out.println("average of in given array is:"+avg);
        aObj.javaStatements();
        aObj.daysInWeek();
        int[] numbers = {20, 5, 15, 7, 30, 10, -2, 18};
        aObj.largeAndSmallElemnts(numbers);
        aObj.printDuplicates();
        aObj.reverseAnArray(numbers);
        aObj.bubbleSort(numbers);
        int[] num={56,90,66,45};
        aObj.sortArrayInAscenOrder(num);
        aObj.sortArrayInDescenOrder(num);
        int[] num1={4,8,67,80};
        aObj.findSecondLargestElement(num1);*/
        int[] inputArray=new int[]{50,60,50,4,4};
        int[] resultArray=removeDuplicates(inputArray);
        System.out.println("After removing duplicates array is:"+Arrays.toString(resultArray));

        int[] arr={2,10,8,6,0};
        int[] arr1=secondSmallestNbr(arr);
        System.out.println("Second smallest element in an array is:"+Arrays.toString(arr1));

        int[] arr2=secondLargestElement(arr);
        System.out.println("Second largest element in an array is:"+Arrays.toString(arr2));

        int[] arr3=thirdLargestElement(arr);
        System.out.println("Third largest element in an array is:"+Arrays.toString(arr3));

        rightRotate(arr);
        leftRotate(arr);
        int[] sortArray=sortArrayInAscending(arr);
        System.out.println("Array after sorting in ascnding ordr:"+Arrays.toString(sortArray));

        int[] sortArray1=sortArrayInDescending(arr);
        System.out.println("Array after sorting in descending ordr:"+Arrays.toString(sortArray1));
    }
}
