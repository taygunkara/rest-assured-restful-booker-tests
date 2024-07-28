package apis;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RestResources {

    public Response get(String path){
        return given(SpecBuilder.getReqSpec())
        .when()
                .get(path)
        .then()
                .spec(SpecBuilder.getResSpec())
                .extract().response();
    }

    public Response post(String path, Object body){
        return given(SpecBuilder.getReqSpec())
                .contentType(ContentType.JSON)
                .body(body)
        .when()
                .post(path)
        .then()
                .spec(SpecBuilder.getResSpec())
                .extract().response();
    }

    public Response put(String path, String token, Object body){
        return given(SpecBuilder.getReqSpec())
                .contentType(ContentType.JSON)
                .header("Accept", "application/json")
                .header("Cookie", "token=" + token)
                .body(body)
        .when()
                .put(path)
        .then()
                .spec(SpecBuilder.getResSpec())
                .extract().response();
    }

    public Response patch(String path, String token, Object body){
        return given(SpecBuilder.getReqSpec())
                .contentType(ContentType.JSON)
                .header("Accept", "application/json")
                .header("Cookie", "token=" + token)
                .body(body)
        .when()
                .patch(path)
        .then()
                .spec(SpecBuilder.getResSpec())
                .extract().response();
    }

    public Response delete(String path, String token){
        return given(SpecBuilder.getReqSpec())
                .header("Accept", "application/json")
                .header("Cookie", "token=" + token)
        .when()
                .delete(path)
        .then()
                .spec(SpecBuilder.getResSpec())
                .extract().response();
    }
}
