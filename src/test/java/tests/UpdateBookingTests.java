package tests;

import apis.TokenManager;
import apis.applicationApi.BookingApi;
import apis.applicationApi.BookingHelper;
import models.Booking;
import models.BookingResponse;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;

import static apis.Routes.BOOKING_ENDPOINT;

/**
 * This class contains test cases for updating bookings in the booking management system.
 */
public class UpdateBookingTests {

    /**
     * This test verifies that a booking is updated successfully by providing valid data and an authentication token.
     */
    @Test
    @Epic("Booking Management")
    @Story("Update Booking")
    @Description("This test verifies that a booking is updated successfully by providing valid data and an authentication token.")
    public void shouldUpdateBookingSuccessfully(){
        Booking expectedBooking = BookingHelper.bookingBuilder();
        BookingResponse createBookingResponse = BookingApi.createBooking(BOOKING_ENDPOINT, expectedBooking);
        int bookingId = createBookingResponse.getBookingid();

        Booking expectedUpdatedBooking = BookingHelper.updateBookingBuilder();
        Booking actualBooking = BookingApi.updateBooking(BOOKING_ENDPOINT, bookingId, TokenManager.retrieveAuthToken(), expectedUpdatedBooking);

        BookingHelper.assertUpdateBooking(expectedUpdatedBooking, actualBooking);
    }
}