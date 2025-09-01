package methods;

import java.util.Arrays;

public class TwoDimensionalArray {

    //Static Methods

    /**
     * This program demonstrates a two-dimensional array
     */
    public static void languages(){
        System.out.println("Started executing languages() using 2D-Array......");
        //datatype[][] arrayname=new datatype[rows][cols];
        String[][] lang=new String[2][3];
        //Insert the data in 2D Array->arrayName[row][col]=value;
        lang[0][0]="Java";
        lang[0][1]="Python";
        lang[0][2]="Ruby";
        lang[1][0]=".NET";
        lang[1][1]="c";
        lang[1][2]="c++";
        //Iterate the array using nest for loop
        for(int i=0;i<lang.length;i++){
            System.out.println("");
            for(int j=0;j<lang[i].length;j++){
                System.out.print(lang[i][j]+"|");
            }
        }
    }

    /**
     * Write a program to left rotate an array
     */
        private static void leftRotate(){
            System.out.println("Started executing leftRotate() .....");
            //datatype[] arr=new datatype[SIZE];
            int[] arr={2,8,67,45,13};
            System.out.println(" array is:"+ Arrays.toString(arr));
            int n=3;
            for(int i=0;i<n;i++){
                //copy first array element into temp
                int temp=arr[0];
                for(int j=0;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                arr[arr.length-1]=temp;
            }
            System.out.println("left rotate of an array is:"+ Arrays.toString(arr));
        }

    /**
     * Write a program to right rotate an array
     */
    protected static void rightRotate(){
        System.out.println("Started executing rightRotate() .....");
        //datatype[] arr=new datatype[SIZE];
        int[] arr={6,15,5,45,64};
        System.out.println(" array is:"+ Arrays.toString(arr));
        int n=2;
        for(int i=0;i<n;i++){
            //copy last array element into temp
            int temp=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            //placing last element in first place
            arr[0]=temp;
        }
        System.out.println("Right rotate of an array is:"+ Arrays.toString(arr));
    }


    public static void main(String[]args){
    languages();
    leftRotate();
    rightRotate();
    }
}
