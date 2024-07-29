package apis;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static apis.Routes.BASE_URL;

/**
 * The SpecBuilder class provides methods to build request and response specifications
 * for the RestAssured API tests.
 */
public class SpecBuilder {

    /**
     * Builds and returns a request specification with the base URI set.
     *
     * @return the request specification
     */
    public static RequestSpecification buildRequestSpec(){
        return new RequestSpecBuilder()
                .setBaseUri(BASE_URL)
                .build();
    }

    /**
     * Builds and returns a response specification.
     *
     * @return the response specification
     */
    public static ResponseSpecification buildResponseSpec(){
        return new ResponseSpecBuilder()
                .build();
    }
}
