package tests;

import apis.applicationApi.BookingApi;
import apis.applicationApi.BookingHelper;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import models.Booking;
import models.BookingResponse;
import org.testng.annotations.Test;

import static apis.Routes.BOOKING_ENDPOINT;

/**
 * This class contains test cases for retrieving booking details from the booking management system.
 */
public class GetBookingTests {

    /**
     * This test verifies that a booking's details are successfully retrieved from the API using a valid booking ID.
     */
    @Test
    @Epic("Booking Management")
    @Story("Get Booking Details")
    @Description("This test verifies that a booking's details are successfully retrieved from the API using a valid booking ID.")
    public void shouldGetBookingSuccessfully(){
        Booking expectedBooking = BookingHelper.bookingBuilder();
        BookingResponse actualBookingResponse = BookingApi.createBooking(BOOKING_ENDPOINT, expectedBooking);
        int bookingId = actualBookingResponse.getBookingid();

        Booking actualBooking = BookingApi.getBooking(BOOKING_ENDPOINT, bookingId);
        BookingHelper.assertBooking(actualBooking, actualBookingResponse , false );
    }
}
