package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

  private static File f=null;
  private static FileInputStream fis;
  private static String inputFPath="D:\\Desktop files\\FileInputStream\\input.txt";
    public static void main(String[]args) throws IOException {
    //Step 1: Create object for File Class
        f=new File(inputFPath);

        //Step 2: Create object for FileInputStream Class
        fis=new FileInputStream(f);
        int i=0;
        while ((i=fis.read())!=-1){
            //convert int into char
            char c= (char) i;
            System.out.print(c);
        }
    }
}
