package collections;

import java.util.*;

public class ListDemo {

    public static void main(String[] args){
        //1.Write a java program to create a new array list
        //Interface<datatype> variable=new ImplementingClass<datatype>();
        List<String> al=new ArrayList<String>();
        System.out.println("al size is:"+al.size());
        System.out.println("al collection is:"+al);

        //add some colors(String) & print out the collection
        al.add("Green");
        al.add(0,"viloet");
        System.out.println("al size is:"+al.size());
        System.out.println("al collection is:"+al);
        al.addAll(Arrays.asList("Orange","Red","Blue","Yellow","Blue"));
        System.out.println("al size is:"+al.size());
        System.out.println("al collection is:"+al);

        //2.Write a program to iterate through all elements in a array list
        System.out.println("Printing the elements using iterator()");
        Iterator it= al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Printing the elements using for each loop");
        for(String c:al){
            System.out.print(c+"\t");
        }
        System.out.println();
        System.out.println("Printing the elements using for loop");
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+"\t");
        }

        //3.Insert an element into the arraylist at the first position
        al.add(0,"Pink");
        System.out.println("al size is:"+al.size());
        System.out.println("al collection is:"+al);

        //4.Retrieve an element(at specific index) from an array list
        System.out.println("Element at 4th index is:"+al.get(4));
        System.out.println("al size is:"+al.size());

        //5.Update specific array list element by given element
        al.set(1,"Brown");
        System.out.println("After updating 2nd element is:"+al);

        //6.Remove the 3rd element from an array list
        al.remove("Green");
        System.out.println("al size is:"+al.size());
        System.out.println("al collection is:"+al);

        //7.Search an element in the array list
        boolean b=al.contains("Blue");
        System.out.println("Search Blue element is present in the array list or not:"+b);

        //8.Sort the given array list
        Collections.sort(al);
        System.out.println("al collection after sort() is:"+al);

        //another way to print the collection is
        al.forEach(System.out::println);

        //9.Write a java program to copy one arraylist into another
        List<String> ac=new ArrayList<String>(al);
        System.out.println("ac size is:"+ac.size());
        System.out.println("ac collection is:"+ac);

        //10.empty an arraylist
        al.clear();
        System.out.println("al size is:"+al.size());
        System.out.println("al collection is:"+al);

        //11.Test an arraylist is empty or not
        boolean b1=al.isEmpty();
        System.out.println("Collection is empty or not:"+b1);
    }
}
