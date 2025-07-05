package FileHandling;

import java.io.*;

public class FileReaderDemo {

    private static File f=null;
    private static FileReader fr=null;
    private static BufferedReader br=null;
    private static String inputFPath="D:\\Desktop files\\FileInputStream\\input.txt";

    public static void main(String[]args) throws IOException {
        //Step1: Create object for File class
        f=new File(inputFPath);
        //Step1: Create object for FileReader class
        fr=new FileReader(f);
        br=new BufferedReader(fr);
        String s=null;
        while ((s=br.readLine())!=null){
           System.out.println(s);
        }
    }
}
