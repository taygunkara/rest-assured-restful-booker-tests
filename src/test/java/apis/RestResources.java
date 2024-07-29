package apis;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

/**
 * The RestResources class provides methods to perform RESTful operations such as GET, POST, PUT, PATCH, and DELETE.
 * Each method builds a request specification and a response specification using the SpecBuilder class.
 */
public class RestResources {

    /**
     * Sends a GET request to the specified path.
     *
     * @param path the endpoint URL
     * @return the response from the GET request
     */
    public static Response get(String path){
        return given(SpecBuilder.buildRequestSpec())
        .when()
                .get(path)
        .then()
                .spec(SpecBuilder.buildResponseSpec())
                .extract().response();
    }

    /**
     * Sends a POST request to the specified path with the given request body.
     *
     * @param path the endpoint URL
     * @param body the request body to be sent
     * @return the response from the POST request
     */
    public static Response post(String path, Object body){
        return given(SpecBuilder.buildRequestSpec())
                .contentType(ContentType.JSON)
                .body(body)
        .when()
                .post(path)
        .then()
                .spec(SpecBuilder.buildResponseSpec())
                .extract().response();
    }

    /**
     * Sends a PUT request to the specified path with the given request body and token.
     *
     * @param path the endpoint URL
     * @param token the authentication token to be used
     * @param body the request body to be sent
     * @return the response from the PUT request
     */
    public static Response put(String path, String token, Object body){
        return given(SpecBuilder.buildRequestSpec())
                .contentType(ContentType.JSON)
                .header("Accept", "application/json")
                .header("Cookie", "token=" + token)
                .body(body)
        .when()
                .put(path)
        .then()
                .spec(SpecBuilder.buildResponseSpec())
                .extract().response();
    }

    /**
     * Sends a PATCH request to the specified path with the given request body and token.
     *
     * @param path the endpoint URL
     * @param token the authentication token to be used
     * @param body the request body to be sent
     * @return the response from the PATCH request
     */
    public static Response patch(String path, String token, Object body){
        return given(SpecBuilder.buildRequestSpec())
                .contentType(ContentType.JSON)
                .header("Accept", "application/json")
                .header("Cookie", "token=" + token)
                .body(body)
        .when()
                .patch(path)
        .then()
                .spec(SpecBuilder.buildResponseSpec())
                .extract().response();
    }

    /**
     * Sends a DELETE request to the specified path with the given token.
     *
     * @param path the endpoint URL
     * @param token the authentication token to be used
     * @return the response from the DELETE request
     */
    public static Response delete(String path, String token){
        return given(SpecBuilder.buildRequestSpec())
                .header("Accept", "application/json")
                .header("Cookie", "token=" + token)
        .when()
                .delete(path)
        .then()
                .spec(SpecBuilder.buildResponseSpec())
                .extract().response();
    }
}
