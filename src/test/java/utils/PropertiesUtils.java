package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * The PropertiesUtils class provides utility methods to read properties from a properties file.
 */
public class PropertiesUtils {

    /**
     * Reads properties from the specified properties file.
     *
     * @return the Properties object containing the properties read from the file
     */
    public static Properties readProperties(){
        Properties properties = new Properties();
        InputStream inputStream;
        try {
            inputStream = new FileInputStream("src/test/resources/config.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }

}
