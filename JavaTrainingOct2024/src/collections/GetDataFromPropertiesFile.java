package collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromPropertiesFile {

    private static String getDataFromPropertiesFile(String key) throws IOException {
        //Create object for Properties class[contains static methods]
        Properties prop=new Properties();
        //read the file
        //System.out.println("Fetch the current project directory:"+System.getProperty("user.dir"));//C:\Users\Dell\IdeaProjects\JavaTrainingOct2024
        File f=new File(System.getProperty("user.dir")+"/src/collections/testData.properties");
        FileInputStream fis=new FileInputStream(f);
        prop.load(fis);

        return prop.getProperty(key);
    }

    public static void main(String[] args) throws IOException {
        System.out.println("url is:"+getDataFromPropertiesFile("url"));
        System.out.println("browser is:"+getDataFromPropertiesFile("browser"));
        System.out.println("env is:"+getDataFromPropertiesFile("env"));
        System.out.println("username is:"+getDataFromPropertiesFile("username"));
    }
}
