package FileHandling;

import java.io.*;

public class BufferedInputStreamDemo {

    private static File f=null;
    private static FileInputStream fis=null;
    private static BufferedInputStream bis=null;
    private static String inputFPath="D:\\Desktop files\\FileInputStream\\input.txt";

    public static void main(String[]args) {
        //Step1: Create object for File Class
        f=new File(inputFPath);
        //Step2: Create object for FileInputStream Class
        try {
            fis=new FileInputStream(f);
            bis=new BufferedInputStream(fis);
            int i=0;
            while ((i=bis.read())!=-1){
                //Convert int into char
                char c= (char) i;
                System.out.print(c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
