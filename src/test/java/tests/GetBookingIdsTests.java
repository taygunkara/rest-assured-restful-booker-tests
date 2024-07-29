package tests;

import apis.applicationApi.BookingApi;
import apis.applicationApi.BookingHelper;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static apis.Routes.BOOKING_ENDPOINT;

/**
 * This class contains test cases for retrieving booking IDs from the booking management system.
 */
public class GetBookingIdsTests {

    /**
     * This test verifies that booking IDs are successfully retrieved from the API.
     */
    @Test
    @Epic("Booking Management")
    @Story("Retrieve Booking IDs")
    @Description("This test verifies that booking IDs are successfully retrieved from the API.")
    public void shouldGetBookingIdsSuccessfully(){
        Response actualResponse = BookingApi.getBookingIds(BOOKING_ENDPOINT);
        BookingHelper.assertGetBookingIds(actualResponse);
    }
}
