package strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringInterviwPrograms {
   // Non-static methods

    //Reverse a String--s=mani rev=inam
    public void reverseString(String s){
        System.out.println("Started executing reverseString()");
        System.out.println("Before reversing String is:"+s);
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println("After reversing String is:"+rev);
        System.out.println("**********************************************");
    }

    private void reverseString1(String s){
        System.out.println("Started executing reverseString1()");
        System.out.println("Before reversing String is:"+s);
        String rev="";
        for(int i=0;i<=s.length()-1;i++){
            rev=s.charAt(i)+rev;
        }
        System.out.println("After reversing String is:"+rev);
        System.out.println("**********************************************");
    }

    protected void reverse3(String s){
        System.out.println("Started executing reverse3()");
        System.out.println("Before reversing String is:"+s);
        StringBuffer sb=new StringBuffer(s);
        System.out.println("After reversing String is:"+sb.reverse());
        System.out.println("**********************************************");
    }

    //check whether given string is palindrome or not
    private boolean chckPalindrome(String str){
        System.out.println("Started executing chckPalindrome()");
        boolean isPalindrome=true;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt((str.length()-i-1))){
                isPalindrome=false;
                break;
            }
        }
        return isPalindrome;
    }

    //This function calculates no of vowels,consonents and numbers in a given String
    public  void countVowelsConsonentsNumbrs(String str){
        System.out.println("Started executing countVowelsConsonentsNumbrs()");
        int vCount=0,cCount=0,nCount=0,spCount=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U'){
                vCount++;
            } else if ((str.charAt(i)>='a') && (str.charAt(i)<='z')) {
                cCount++;
            } else if ((str.charAt(i)>='0') && (str.charAt(i)<='9')) {
                nCount++;
            }else {
                spCount++;
            }
        }
        System.out.println("Vowels count is:"+vCount);
        System.out.println("Consonent count is:"+cCount);
        System.out.println("Numbers count is:"+nCount);
        System.out.println("sp count is:"+spCount);
        System.out.println("******************************************");
    }

    /**
     * An anagram is a word or phrase formed by rearranging the letters of another word or phrase,
     * using all the original letters exactly once.
     * The word "listen" can be rearranged to form "silent".
     * @param s1
     * @param s2
     */
    public  void chckAnagrams(String s1,String s2){
        System.out.println("Started executing chckAnagrams()");
        System.out.println("Given Strings are s1 is "+s1+" s2 is:"+s2);
        //Step1:Convert the Strings Into lowercase
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        //step2:Check the lengths of both Strings
        if(s1.length()!=s2.length()){
            System.out.println("Both Strings are not anagrams");
        }else {
            //Step3:Convert the String into char[] using toCharArray()
            char[] arr1=s1.toCharArray();
            char[] arr2=s2.toCharArray();
            //Step4: Sort the arrays using Arrays.sort()
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            //step5: compare both array lengths & If the elements in the arrays are in the same order and match exactly.
            if(Arrays.equals(arr1,arr2)==true){
                System.out.println("Both Strings are anagrams");
            }
        }
        System.out.println("******************************************");
    }

    /**
     * write a program to reverse the given sentence:
     * String str="USA election starts tomorrow"
     * Output="worromot strats noitcele ASU"
     */
    void reverseSentence(){
        System.out.println("reverse the positions of the words & their characters in the sentence");
        String str="USA election starts tomorrow";
        reverseString(str);
        System.out.println("******************************************");
    }

    void reverseSentence1(){
        System.out.println("reverse the positions of the words (not their characters) in the sentence");
        String str="USA election starts tomorrow";
         String[] arr=str.split("\\s");
         String rev="";
         System.out.println("Array is:"+Arrays.toString(arr));//[USA, election, starts, tomorrow]
        for (int i = arr.length - 1; i >= 0; i--) {
            rev += arr[i] + " "; // Append each word followed by a space
        }

        System.out.println("After reverse String is:"+rev);
        System.out.println("******************************************");
    }

    /**
     * This method swaps given two Strings
     * s1=Good s2=Morning
     * output: s1=Morning s2=Good
     * @param s1,s2
     */
    protected void swapTwoStrings(String s1,String s2){
        System.out.println("Before swapping s1 is "+s1+" s2 is:"+s2);
        s1=s1+s2;//GoodMorning
        //get s2 value
        s2=s1.substring(0,s1.length()-s2.length());
        //fetch s1 value
        s1=s1.substring(s2.length());
        System.out.println("After swapping s1 is "+s1+" s2 is:"+s2);
        System.out.println("***********************************************");
    }

    /**
     * Write a program to find the occurences of characters in a string
     */
    private void occurencesOfChar(){
        System.out.println("Started executing occurencesOfChar()");
        String str="ramesh insights in automation";
        char c='a';
            int count = str.length() - str.replace("a", "").length();
            System.out.println("count of charactr is:" + count);
        System.out.println("***********************************************");
    }

    /**
     * This function extracts bigger integer number from a given String
     * String s="100kmph567abc500"
     * @param str
     */
    public int extractBiggerNbrFromString(String str){
        System.out.println("Started executing extractBiggerNbrFromString()");
        int num=0,res=0;
        //iterate the string
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            //check the char is a numeric value, then start converting into numeric/integer till there are consecutive numbrs
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }else {
                //update the max value
                res=Math.max(num,res);
                //reset the numbr
                num=0;
            }
        }
        return Math.max(num,res);
    }

    /*
    String Compression:
    String input = "aabbcdaav";
    Output: a2b2c1d1a2v1
     */
    private static String compressString(String input) {
        StringBuilder result = new StringBuilder();

        int count = 1;
        for (int i = 0; i < input.length(); i++) {
            // Check if the next character is the same as the current one
            if (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                // Append the character and its count to the result
                result.append(input.charAt(i)).append(count);
                count = 1; // Reset the count for the next character
            }
        }

        return result.toString();
    }

    public static void main(String[]args){
        StringInterviwPrograms sip=new StringInterviwPrograms();
        sip.reverseString("Ramesh");
        sip.reverseString1("Lakshmi");
        sip.reverse3("Rutwik");
        System.out.println("malayalam is palindrome:"+sip.chckPalindrome("malayalam"));
        sip.countVowelsConsonentsNumbrs("harshi124@");
        sip.chckAnagrams("silent","lssten");
        sip.reverseSentence();
        sip.reverseSentence1();
        sip.swapTwoStrings("Web","driver");
        sip.occurencesOfChar();
        System.out.println("Bigger numbr is:"+sip.extractBiggerNbrFromString("100kmph567abc700"));

        // Input string
        String input = "aabbcdaav";
        // Compress the string
        String compressed = compressString(input);
        // Output the result
        System.out.println("Compressed String: " + compressed);
    }
}
