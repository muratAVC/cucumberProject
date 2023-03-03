package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties=new Properties();
    static {
        FileInputStream fileInput= null;
        try {
            fileInput = new FileInputStream("configuration.properties");
            properties.load(fileInput);
            fileInput.close();
        } catch (IOException e) {
            System.out.println("File Reading Error");
            System.out.println(e);
        }

    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}
