package strings;

import java.util.Arrays;
import java.util.Date;

public class StringMethods {
    static String s="java";
public static void main(String[]args){
    /**
     * String is available in java.lang package
     * Strings are immutable.
     * String class contains returntype non-static methods
     */

    /**
     * To find the length of a String use-->length()
     * datatypeOfMethod variableName=objref.method();
     */
    int len=s.length();
    System.out.println("Length of "+s+" is:"+len);

    /**
     * Fetch the character from a String using index value-->charAt(int index)
     * datatypeOfMethod variableName=objref.method();
     */
    char c=s.charAt(3);
    System.out.println("Character at index 3 is:"+c);

    /**
     * Convert the String into char[] returns char[] using-->toCharArray()
     * datatypeOfMethod variableName=objref.method();
     */
    char[] arr=s.toCharArray();
    System.out.println("char[] is:"+ Arrays.toString(arr));

    /**
     * Joins two Strings and returns new String--->concat()
     *  datatypeOfMethod variableName=objref.method();
     */
    String s1=s.concat("selenium");
    System.out.println(s+" concat with selenium then s1 value is:"+s1);

    /**
     * Convert the characters in a String into upper case returns new String -->toUpperCase()
     * datatypeOfMethod variableName=objref.method();
     */
    String s2=s1.toUpperCase();
    System.out.println("s2 value after converting "+s1+" into uppercase:"+s2);

    /**
     * Convert the characters in a String into lower case returns new String -->toLowerCase()
     * datatypeOfMethod variableName=objref.method();
     */
    String s3=s2.toLowerCase();
    System.out.println("s3 value after converting "+s2+" into lower case:"+s3);

    /**
     * isEmpty():Checks whether given string is empty or not returns boolean
     * datatypeOfMethod variableName=objref.method();
     */
    boolean b=s.isEmpty();
    System.out.println("Checking "+s+" is empty or not:"+b);
    try {
        String s4=null;
        boolean b1=s4.isEmpty();
        System.out.println("Checking "+s4+" is empty or not:"+b1);
    } catch (NullPointerException e) {
        e.printStackTrace();
    }
    String s5="";
    boolean b2=s5.isEmpty();
    System.out.println("Checking "+s5+" is empty or not:"+b2);
    String s6=" ";
    boolean b3=s6.isEmpty();
    System.out.println("Checking "+s6+" is empty or not:"+b3);

    /**
     *  isBlank():Checks whether given string is blank or not returns boolean
     *  datatypeOfMethod variableName=objref.method();
     */
    boolean b4=s6.isBlank();
    System.out.println("Checking "+s6+" is blank or not:"+b4);

    /**
     * contains(String str): Checks whether given string is present in main string or not returns boolean
     *  datatypeOfMethod variableName=objref.method();
     */
    boolean b5=s1.contains(s);
    System.out.println("Checking "+s1+" contains java or not:"+b5);

    /**
     * equals(): It compares content of given two strings returns boolean
     * datatypeOfMethod variableName=objref.method();
     */
    boolean b6=s1.equals(s3);
    System.out.println("Checking "+s1+" equals to "+s3+" or not:"+b6);
    boolean b7=s1.equals(s2);
    System.out.println("Checking "+s1+" equals to "+s2+" or not:"+b7);

    /**
     * equalsIgnoreCase(): It compares content of given two strings & avoid upper & lower cases returns boolean
     * datatypeOfMethod variableName=objref.method();
     */
    boolean b8=s1.equalsIgnoreCase(s2);
    System.out.println("Checking "+s1+" equalsIgnoreCase() to "+s2+" or not:"+b8);
    boolean b9=s1.equals(s3);
    System.out.println("Checking "+s1+" equalsIgnoreCase() to "+s3+" or not:"+b9);

    /**
     * startsWith(String str):Checks whether given String starts with main String or not returns boolean
     * datatypeOfMethod variableName=objref.method();
     */
    boolean b10=s3.startsWith(s);
    System.out.println("Checking "+s3+" starts With "+s+" or not:"+b10);

    /**
     * endsWith(String str):Checks whether given String ends with main String or not returns boolean
     * datatypeOfMethod variableName=objref.method();
     */
    boolean b11=s3.endsWith("selenium");
    System.out.println("Checking "+s3+" ends With selenium or not:"+b11);

    /**
     * split(delimiter):splits the string based on given delimiter returns String[]
     * delimiter= : , ? space(\\s) [ { }
     * datatypeOfMethod variableName=objref.method();
     */
    Date d=new Date();
    System.out.println("Current date is:"+d);
    String s7="Mon Nov 18 10:14:00 IST 2024";
    String[] strArr=s7.split("\\s");
    System.out.println("Array is:"+Arrays.toString(strArr));//[Mon, Nov, 18, 10:14:00, IST, 2024]
    //fetch time from array
    String s8=strArr[3];
    System.out.println("String at indx 3 is:"+s8);
    String[] strArr1=s8.split(":");
    System.out.println("Array is:"+Arrays.toString(strArr1));//[10, 14, 00]
    String s9=strArr1[1];
    System.out.println("String at indx 1 is:"+s9);
    System.out.println("******************************************");

    /**
     * replace("oldValue/char","newVal/char"):replaces old value with new value returns String
     * replaceAll("oldValue/char","newVal/char"):replaces all old value occurences  with new value occurences returns String
     */
    String s10=s1.replace("java","ruby");
    System.out.println("After replace()"+s1+" value is:"+s10);
    String s11=s7.replaceAll(" ","-");//"Mon Nov 18 10:14:00 IST 2024"
    System.out.println("After replaceAll()"+s7+" value is:"+s11);

    /**
     * trim():removes the spaces at head & tail portion
     */
    String s12=" java web driver ";
    String s13=s12.trim();
    System.out.println("After trim()"+s12+" value is:"+s13);
    System.out.println("length of"+s12+" value is:"+s12.length());
    System.out.println("length of"+s13+" value is:"+s13.length());

    /**
     * subString: A portion of a String is called substring
     * substring(int index):It fetches the char from start index to till end returns String
     * substring(int index,int endIndex):It fetches the char from start index to till end index returns String
     * start index includes and end index excludes
     * j a v a s e l e n i u m
     * 0 1 2 3 4 5 6 7 8 9 10 11
     */
    String s14=s1.substring(4);
    System.out.println("s14 value after substring(int index) is:"+s14);
    String s15=s1.substring(0,4);
    System.out.println("s15 value after substring(int index,int endIndex) is:"+s15);

    /**
     * getBytes(): will fetch byte[] from given string
     */
    byte[] arr1=s.getBytes();
    System.out.println("arr1 value after getBytes() is:"+Arrays.toString(arr1));

    /**
     * indexOf(String str/char c): it fetches the index number of char/String returns int
     */
    int indx=s.indexOf('j');
    System.out.println("j index value is:"+indx);

    /**
     * lastIndexOf(Char c):it fetches the last char/String index returns int
     */
    int lasIndex=s1.lastIndexOf('e');
    System.out.println("last index value is:"+lasIndex);

    /**
     * repeat(int count): same String will be repeated number of times.
     */
    String s16=s.repeat(4);
    System.out.println("java is repeated 4 times using repeat() value is:"+s16);

    /**
     * compareTo(): compares the given two strings lexicographically if s1>s2 returns +value, s1<s2 returns -value
     * if s1=s2 returns zero.
     */
    System.out.println("Comparing "+s1+" with "+s2+" using compareTo():"+s1.compareTo(s2));
    System.out.println("Comparing "+s2+" with "+s3+" using compareTo():"+s2.compareTo(s3));
    System.out.println("Comparing "+s1+" with "+s3+" using compareTo():"+s1.compareTo(s3));

    /**
     * How can you find length of a string without using length()?
     * Using compareTo()->returns int
     */
    int len2=s.compareTo("");
    System.out.println(s+" length is:"+len2);

    /**
     * join(delemiter,s1,s2...): joins all the Strings with given delemiter returns String
     * Static method in String class
     */
    String s17=String.join("-","Ramesh","Insights","In","Automation");
    System.out.println("Joined all the Strings using join() then s17 value is:"+s17);

    /**
     * valueOf(): converts the given object into String
     * Static method in String class
     */
    String s18=String.valueOf(5);
    System.out.println("s18 value is:"+s18);
    String s19=s+s18;
    System.out.println(s+" is concatinated with "+s18+" then value is:"+s19);
    String s20=25+s18;
    System.out.println("25 is concatinated with "+s18+" then value is:"+s20);




}

}
