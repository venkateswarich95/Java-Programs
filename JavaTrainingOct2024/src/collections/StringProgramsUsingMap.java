package collections;

import java.util.*;

public class StringProgramsUsingMap {

    /**
     * Write a program to fetch each occurence of a character in a String
     * String str="java is java"
     * output:{ =2,j=2,a=4,v=2,i=1,s=1}
     * @param str
     */
    public Map<Character,Integer> occurenceOfCharInString(String str){
        //Step1: Create a Map
        Map<Character,Integer> hm=new TreeMap<>();
        //iterate the String
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }else {
                hm.put(c,1);
            }
        }
        return hm;
    }

    /**
     * Write a program to print duplicate characters in a String
     * @param str
     */
    private void printDuplicateChars(String str){
        Map<Character,Integer> hm=occurenceOfCharInString(str);
        //get all the keys from map using keySet()
        Set<Character> keysColl=hm.keySet();
        System.out.println("print duplicate characters in a String:");
        //iterate
        for(Character c:keysColl){
           if(hm.get(c)>1){
               System.out.println(c);
           }
        }
        System.out.println("******************************");
    }

    /**
     * Write a program to get first non repeated characters from String
     * @param str
     */
    protected void getFirstNonRepeatChars(String str){
        Map<Character,Integer> hm=occurenceOfCharInString(str);
        //get all the keys from map using keySet()
        Set<Character> keysColl=hm.keySet();
        //iterate
        for(Character c:keysColl){
            if(hm.get(c)==1){
                System.out.println("First non-repeated character in a String is:"+c);
                break;
            }
        }
        System.out.println("******************************");
    }

    /**
     * Write a program to get first repeated characters from String
     * @param str
     */
     void getFirstRepeatChars(String str){
        Map<Character,Integer> hm=occurenceOfCharInString(str);
        //get all the keys from map using keySet()
        Set<Character> keysColl=hm.keySet();
        //iterate
        for(Character c:keysColl){
            if(hm.get(c)>1){
                System.out.println("First repeated character in a String is:"+c);
                break;
            }
        }
         System.out.println("******************************");
    }

    /**
     * write a program to print the words which is occurring more than one time
     * String str = "happy halloween to everyone and thanksgiving to everyone EVERYONE";
     * @param str
     */
    protected void printRepeatedWordsFromString(String str){
        //create a map
        Map<String,Integer> hm=new HashMap<>();
        //split the string based on space using split()
        String[] s1=str.split(" ");
        //[happy, halloween,to,everyone,and ,thanksgiving, to ,everyone ,EVERYONE]
        //Iterate the array
        for(String word:s1){
            //convert all the words into lower case using toLowerCase()
            String s2=word.toLowerCase();
            if(hm.containsKey(s2)){
                hm.put(s2,hm.get(s2)+1);
            }else {
                hm.put(s2,1);
            }
        }
        System.out.println(hm);
        System.out.println("******************************");
    }

    /**
     * write a program to find the frequency of each element in given int[]={2,4,1,2,4,5,6,5};
     * @param
     */
    public void printFreqencyOfEle(){
        //Create a Map
        Map<Integer,Integer> hm=new HashMap<>();
        int[] arr={2,4,1,2,4,5,6,5};
        System.out.println("Freqently repeated elements in the given array is");
        //iterate the array
        for(int i1:arr){
            if(hm.containsKey(i1)){
                hm.put(i1,hm.get(i1)+1);
            }else {
                hm.put(i1,1);
            }
        }
        System.out.println(hm);
        System.out.println("******************************");
    }

    /**
     * Write a program to check given String has valid paranthesis
     * String str = "({}[])"; return true else false
     * String invalidbr= "({[]}"; false
     * @param str
     */
    private boolean checkValidBrackets(String str){
        //Step1: Create a Stack
        Stack<Character> stack=new Stack<>();
        //Iterate the String
        for(char ch:str.toCharArray()){//[(,{,},[,],)]
            if(ch==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            } else if (ch=='}' && !stack.isEmpty() && stack.peek()=='{') {
                stack.pop();
            } else if (ch==']' && !stack.isEmpty() && stack.peek()=='[') {
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        StringProgramsUsingMap spObj=new StringProgramsUsingMap();
        System.out.println("fetch each occurence of a character in a String:"+spObj.occurenceOfCharInString("java is java"));
        System.out.println("******************************");
        spObj.printDuplicateChars("malayalam");
        spObj.getFirstNonRepeatChars("malayzalam");
        spObj.getFirstRepeatChars("racecar");
        spObj.printRepeatedWordsFromString("happy halloween to everyone and thanksgiving to everyone EVERYONE");
        spObj.printFreqencyOfEle();
        System.out.println(" check given String has valid paranthesis:"+spObj.checkValidBrackets("({}[])"));
    }
}
