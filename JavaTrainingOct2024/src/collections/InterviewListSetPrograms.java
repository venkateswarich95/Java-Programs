package collections;

import java.util.*;

public class InterviewListSetPrograms {

    /**
     * Write a program to arranage even numbrs at begining and odd numbrs later for given array
     * int[] num={2,13,6,20,5,7}
     * @param num
     */
    public static void setEvenFirstLaterOdd(int[] num){
        System.out.println("Array before arrange:"+ Arrays.toString(num));
        //create an arraylist for even & odd
        List<Integer>evenList=new ArrayList<>();
        List<Integer>oddList=new ArrayList<>();
        //Iterate the array
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0){
                evenList.add(num[i]);
            }else {
                oddList.add(num[i]);
            }
        }
        evenList.addAll(oddList);
        System.out.println("After arranging the even first then list is:"+evenList);
        System.out.println("************************************");
    }

    /**
     * Write a program to reverse an arraylist in place
     */
    static void reverseArrayListInPlace(){
        //create array list of type String
        List<String> itemList=new ArrayList<>();
        //add all the items to the list
        itemList.addAll(Arrays.asList("Beans","Soup","Nuts","Dark choclate","Yogurt","Pure Vegetables","Sausage"));
        System.out.println("Before reversing the array list is:"+itemList);
        System.out.println("Before reversing the array list size is:"+itemList.size());
        //iterate the collection
        for(int i=0;i<itemList.size()/2;i++){
            String item=itemList.get(i);
            itemList.set(i,itemList.get(itemList.size()-1-i));
            itemList.set(itemList.size()-1-i,item);
        }
        System.out.println("After reversing the array list is:"+itemList);
        System.out.println("************************************");
    }

    /**
     * Write a program to remove duplicates from given int[]
     * int[] num1={2,8,7,2,4}
     * @param num1
     */
    private static void removeDuplicatesUsingList(int[] num1){
        System.out.println("Before removing duplicates array is:"+Arrays.toString(num1));
        //create array list of type String
        List<Integer> resList=new ArrayList<>();
        //iterate the array
        for(int i=0;i< num1.length;i++){
            if(!resList.contains(num1[i])){
                resList.add(num1[i]);
            }
        }
        System.out.println("After removing duplicates array is:"+resList);
        System.out.println("************************************");
    }

    private static void removeDuplicatesUsingSet(int[] num1){
        System.out.println("Before removing duplicates array is:"+Arrays.toString(num1));
        //create array list of type String
        List<Integer> resList=new ArrayList<>();
        //iterate the array
        for(int i=0;i< num1.length;i++){
            resList.add(num1[i]);
        }
        System.out.println("Before converting list to set list is:"+resList);
        //convert list into set
        Set<Integer> sd=new HashSet<>(resList);
        System.out.println("After converting list to set then set collection sd is:"+sd);
        System.out.println("************************************");
    }


    public static void main(String[] args) {
        int[] num={2,13,6,20,5,7};
    setEvenFirstLaterOdd(num);
    reverseArrayListInPlace();
        int[] num1={2,8,7,2,4};
        removeDuplicatesUsingList(num1);
        removeDuplicatesUsingSet(num1);
    }
}
