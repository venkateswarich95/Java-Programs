package strings;

public class StringLiteral {

   public static void main(String[]args){
       //String literal
       String s="Geetha Sree";
       String s1="Geetha Sree";
       //new keyword
       String s2=new String("Geetha Sree");
       String s3=new String("Geetha Sree").intern();

       /**
        * equals(): will compare the content
        * "==" : will compare the memory addresses
        */
       System.out.println(s==s1);
       System.out.println(s.equals(s1));
       System.out.println(s==s3);
       System.out.println(s2==s3);
       System.out.println(s1==s3);


       /**
        *  System.out.println("Memory address of s is:"+s.hashCode());
        *  System.out.println("Memory address of s1 is:"+s1.hashCode());
        *  System.out.println("Memory address of s2 is:"+s2.hashCode());
        *  System.out.println("Memory address of s3 is:"+s3.hashCode());
        */

   }
}
