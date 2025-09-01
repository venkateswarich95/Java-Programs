package FileHandling;

import java.io.*;

public class BufferedOutputStreamDemo {

    private static File f=null;
    private static FileInputStream fis;
    private static BufferedInputStream bis;
    private static FileOutputStream fos;
    private static BufferedOutputStream bos;
    private static String inputFPath="D:\\Desktop files\\FileInputStream\\input.txt";
    private static String outputFPath="D:\\Desktop files\\FileInputStream\\output.txt";

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
        bis=new BufferedInputStream(fis);
        fos=new FileOutputStream(f.getAbsoluteFile());
        bos=new BufferedOutputStream(fos);
        int i=0;
        while ((i=bis.read())!=-1){
            //convert int into char
            char c= (char) i;
            System.out.print(c);
            //Write the data to output file
            bos.write(i);
        }

    }
}
