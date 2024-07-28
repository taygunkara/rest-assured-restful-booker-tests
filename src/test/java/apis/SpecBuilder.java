package apis;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static apis.Routes.BASE_PATH;

public class SpecBuilder {

    public static RequestSpecification getReqSpec(){
        return new RequestSpecBuilder()
                .setBaseUri(BASE_PATH)
                .build();
    }

    public static ResponseSpecification getResSpec(){
        return new ResponseSpecBuilder()
                .log(LogDetail.ALL)
                .build();
    }
}
