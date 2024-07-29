package tests;

import apis.applicationApi.BookingApi;
import apis.applicationApi.BookingHelper;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;

import static apis.Routes.HEALTH_CHECK_PATH;

/**
 * This class contains test cases for health check operations in the booking management system.
 */
public class HealthCheckTests {

    /**
     * This test verifies that the health check endpoint (ping) responds successfully.
     */
    @Test
    @Epic("Health Check Management")
    @Story("Ping API")
    @Description("This test verifies that the health check endpoint (ping) responds successfully.")
    public void shouldSendPingSuccessfully(){
        Response actualResponse = BookingApi.healthCheck(HEALTH_CHECK_PATH);
        BookingHelper.assertResponseStatusAndBody(actualResponse);
    }
}
