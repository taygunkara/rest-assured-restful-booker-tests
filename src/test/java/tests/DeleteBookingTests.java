package tests;

import apis.TokenManager;
import apis.applicationApi.BookingApi;
import apis.applicationApi.BookingHelper;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import models.Booking;
import models.BookingResponse;
import org.testng.annotations.Test;

import static apis.Routes.BOOKING_ENDPOINT;

/**
 * This class contains test cases for deleting bookings in the booking management system.
 */
public class DeleteBookingTests {

    /**
     * This test verifies that a booking is successfully deleted by providing a valid booking ID and authentication token.
     */
    @Test
    @Epic("Booking Management")
    @Story("Delete Booking")
    @Description("This test verifies that a booking is successfully deleted by providing valid booking ID and authentication token.")
    public void shouldDeleteBookingSuccessfully(){
        Booking expectedBooking = BookingHelper.bookingBuilder();
        BookingResponse actualBookingResponse = BookingApi.createBooking(BOOKING_ENDPOINT, expectedBooking);
        int bookingId = actualBookingResponse.getBookingid();

        Response expectedResponse = BookingApi.deleteBooking(BOOKING_ENDPOINT, bookingId, TokenManager.retrieveAuthToken());
        BookingHelper.assertResponseStatusAndBody(expectedResponse);
    }

}
