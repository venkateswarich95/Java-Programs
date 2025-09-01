package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

  private static File f=null;
  private static FileInputStream fis;
    private static FileOutputStream fos;
  private static String inputFPath="D:\\Desktop files\\FileInputStream\\input.txt";
    private static String outputFPath="D:\\Desktop files\\FileInputStream\\output.doc";

    public static void main(String[]args) throws IOException {
    //Step 1: Create object for File Class
        f=new File(outputFPath);
        //Create a file
        if(!f.exists()){
            //Create a new file
            f.createNewFile();
        }

        //Step 2: Create object for FileInputStream Class
        fis=new FileInputStream(new File(inputFPath));
        fos=new FileOutputStream(f.getAbsoluteFile());
        int i=0;
        while ((i=fis.read())!=-1){
            //convert int into char
            char c= (char) i;
            System.out.print(c);
            //Write the data to output file
            fos.write(i);
        }

    }
}
