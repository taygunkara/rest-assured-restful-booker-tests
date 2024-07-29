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
 * This class contains test cases for creating bookings in the booking management system.
 */
public class CreateBookingTests {

    /**
     * This test verifies that a booking is created successfully with valid details.
     */
    @Test
    @Epic("Booking Management")
    @Story("Create Booking")
    @Description("This test verifies that a booking is created successfully with valid details.")
    public void shouldCreateBookingSuccessfully(){
        Booking expectedBooking = BookingHelper.bookingBuilder();
        BookingResponse actualBookingResponse = BookingApi.createBooking(BOOKING_ENDPOINT, expectedBooking);
        BookingHelper.assertBooking(expectedBooking, actualBookingResponse, true );
    }
}
