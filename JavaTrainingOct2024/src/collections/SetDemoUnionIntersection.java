package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemoUnionIntersection {

    public static void main(String[] args) {
        int[] a={2,8,7,5};
        int[] b={3,4,2,5};
        //create a set collection
        Set<Integer> aSet=new HashSet<>();
        aSet.addAll(Arrays.asList(2,8,7,5));
        System.out.println("aSet collection is:"+aSet);
        Set<Integer> bSet=new HashSet<>();
        bSet.addAll(Arrays.asList(3,4,2,5));
        System.out.println("bSet collection is:"+bSet);

        //Create union set collection
        Set<Integer>unionSet=new HashSet<>();
        unionSet.addAll(aSet);
        unionSet.addAll(bSet);
        System.out.println("uninon elements are:"+unionSet);

        //Create Intersection collection
        Set<Integer>interSectionSet=new HashSet<>();
        interSectionSet.addAll(aSet);
        interSectionSet.retainAll(bSet);
        System.out.println("Intersection elements are:"+interSectionSet);
    }
}
