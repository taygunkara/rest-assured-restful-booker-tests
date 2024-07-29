package utils;

/**
 * The ConfigUtils class provides utility methods to retrieve configuration properties
 * such as username and password from a properties file.
 */
public class ConfigUtils {

    private ConfigUtils(){};
    private static ConfigUtils configUtils;

    /**
     * Returns the singleton instance of the ConfigUtils class.
     *
     * @return the singleton instance of ConfigUtils
     */
    public static ConfigUtils getInstance(){
        if (configUtils == null){
            configUtils = new ConfigUtils();
        }
        return configUtils;
    }

    /**
     * Retrieves the username from the properties file.
     *
     * @return the username
     */
    public String  getUsername(){
        return PropertiesUtils.readProperties().getProperty("USERNAME");
    }

    /**
     * Retrieves the password from the properties file.
     *
     * @return the password
     */
    public String  getPassword(){
        return PropertiesUtils.readProperties().getProperty("PASSWORD");
    }
}
