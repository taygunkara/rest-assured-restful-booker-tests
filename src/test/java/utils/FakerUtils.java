package utils;

import com.github.javafaker.Faker;

/**
 * The FakerUtils class provides utility methods to generate random data using the Faker library.
 */
public class FakerUtils {
    private Faker faker;
    private FakerUtils(){
        faker = new Faker();
    }
    private static FakerUtils fakerUtils;

    /**
     * Returns the singleton instance of the FakerUtils class.
     *
     * @return the singleton instance of FakerUtils
     */
    public static FakerUtils getInstance(){
        if (fakerUtils == null){
            fakerUtils = new FakerUtils();
        }
        return fakerUtils;
    }

    /**
     * Generates a random first name.
     *
     * @return the generated first name
     */
    public String generateFirstname(){
        return faker.name().firstName();
    }

    /**
     * Generates a random last name.
     *
     * @return the generated last name
     */
    public String generateLastname(){
        return faker.name().lastName();
    }

    /**
     * Generates a random total price between 100 and 500.
     *
     * @return the generated total price
     */
    public int generateTotalprice(){
        return faker.number().numberBetween(100, 500);
    }

    /**
     * Generates a random boolean value.
     *
     * @return the generated boolean value
     */
    public boolean generateBoolean(){
        return faker.bool().bool();
    }
}
