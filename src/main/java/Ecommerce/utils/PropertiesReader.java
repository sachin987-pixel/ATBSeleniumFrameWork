package Ecommerce.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    public static String readKey(String key) {
        try {
            // Correctly construct the full file path
            String filePath = System.getProperty("user.dir") + "/src/main/resources/data.properties";
            FileInputStream fileInputStream = new FileInputStream(filePath);
            Properties p = new Properties();
            p.load(fileInputStream);
            return p.getProperty(key);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Properties file not found at specified path", e);
        } catch (IOException e) {
            throw new RuntimeException("An error occurred while reading the properties file", e);
        }
    }

}
