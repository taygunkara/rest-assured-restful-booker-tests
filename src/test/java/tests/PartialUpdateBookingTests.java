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
 * This class contains test cases for partial updates of bookings in the booking management system.
 */
public class PartialUpdateBookingTests {

    /**
     * This test verifies that a booking is partially updated successfully by providing valid data and an authentication token.
     */
    @Test
    @Epic("Booking Management")
    @Story("Partial Update Booking")
    @Description("This test verifies that a booking is partially updated successfully by providing valid data and an authentication token.")
    public void shouldPartialUpdateBookingSuccessfully(){
        Booking expectedBooking = BookingHelper.bookingBuilder();
        BookingResponse actualBookingResponse = BookingApi.createBooking(BOOKING_ENDPOINT, expectedBooking);
        int bookingId = actualBookingResponse.getBookingid();

        Booking expectedPartialUpdatedBooking = BookingHelper.partialUpdateBookingBuilder();
        Booking actualPartialUpdatedBooking = BookingApi.partialUpdateBooking(BOOKING_ENDPOINT, bookingId, TokenManager.retrieveAuthToken(),expectedPartialUpdatedBooking);

        BookingHelper.assertUpdateBooking(expectedPartialUpdatedBooking, actualPartialUpdatedBooking);

    }
}
