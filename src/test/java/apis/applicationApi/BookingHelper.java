package apis.applicationApi;

import io.restassured.response.Response;
import models.Booking;
import models.BookingResponse;
import models.Bookingdates;
import org.testng.Assert;
import utils.FakerUtils;

/**
 * The BookingHelper class provides utility methods to build booking and booking dates objects,
 * and methods to assert booking details and response status.
 */
public class BookingHelper {

    /**
     * Builds and returns a Bookingdates object with predefined check-in and check-out dates.
     *
     * @return the Bookingdates object
     */
    public static Bookingdates bookingDatesBuilder(){
        return new Bookingdates()
                .setCheckin("2020-01-01")
                .setCheckout("2021-01-01");
    }

    /**
     * Builds and returns a Booking object with details generated using FakerUtils.
     *
     * @return the Booking object
     */
    public static Booking bookingBuilder(){
        return new Booking()
                .setFirstname(FakerUtils.getInstance().generateFirstname())
                .setLastname(FakerUtils.getInstance().generateLastname())
                .setTotalprice(FakerUtils.getInstance().generateTotalprice())
                .setDepositpaid(FakerUtils.getInstance().generateBoolean())
                .setBookingdates(bookingDatesBuilder())
                .setAdditionalneeds("Baby Room");
    }

    /**
     * Builds and returns a Booking object with updated details using FakerUtils.
     *
     * @return the updated Booking object
     */
    public static Booking updateBookingBuilder(){
        return bookingBuilder()
                .setFirstname("Updated " + FakerUtils.getInstance().generateFirstname())
                .setLastname("Updated " + FakerUtils.getInstance().generateLastname())
                .setTotalprice(FakerUtils.getInstance().generateTotalprice())
                .setDepositpaid(FakerUtils.getInstance().generateBoolean())
                .setBookingdates(bookingDatesBuilder())
                .setAdditionalneeds("Updated Baby Room");
    }

    /**
     * Builds and returns a Booking object with partially updated details using FakerUtils.
     *
     * @return the partially updated Booking object
     */
    public static Booking partialUpdateBookingBuilder(){
        return bookingBuilder()
                .setFirstname("Partial Updated " + FakerUtils.getInstance().generateFirstname())
                .setLastname("Partial Updated " + FakerUtils.getInstance().generateLastname());
    }

    /**
     * Asserts that the actual booking details match the expected booking details.
     *
     * @param expectedBooking the expected Booking object
     * @param bookingResponse the BookingResponse object containing the actual booking details
     * @param bookingIsFirst  flag indicating the order of assertion (true if expected is first, false if actual is first)
     */
    public static void assertBooking(Booking expectedBooking, BookingResponse bookingResponse, boolean bookingIsFirst) {
        Booking actualBooking = bookingResponse.getBooking();
        if (bookingIsFirst) {
            Assert.assertEquals(expectedBooking.getFirstname(), actualBooking.getFirstname());
            Assert.assertEquals(expectedBooking.getLastname(), actualBooking.getLastname());
            Assert.assertEquals(expectedBooking.getTotalprice(), actualBooking.getTotalprice());
            Assert.assertEquals(expectedBooking.isDepositpaid(), actualBooking.isDepositpaid());
            Assert.assertEquals(expectedBooking.getBookingdates().getCheckin(), actualBooking.getBookingdates().getCheckin());
            Assert.assertEquals(expectedBooking.getBookingdates().getCheckout(),actualBooking.getBookingdates().getCheckout());
            Assert.assertEquals(expectedBooking.getAdditionalneeds(), actualBooking.getAdditionalneeds());

        } else {
            Assert.assertEquals(actualBooking.getFirstname(), expectedBooking.getFirstname());
            Assert.assertEquals(actualBooking.getLastname(), expectedBooking.getLastname());
            Assert.assertEquals(actualBooking.getTotalprice(), expectedBooking.getTotalprice());
            Assert.assertEquals(actualBooking.isDepositpaid(), expectedBooking.isDepositpaid());
            Assert.assertEquals(actualBooking.getBookingdates().getCheckin(), expectedBooking.getBookingdates().getCheckin());
            Assert.assertEquals(actualBooking.getBookingdates().getCheckout(), expectedBooking.getBookingdates().getCheckout());
            Assert.assertEquals(actualBooking.getAdditionalneeds(), expectedBooking.getAdditionalneeds());
        }
    }

    /**
     * Asserts that the response for retrieving booking IDs is not null and has a status code of 200.
     *
     * @param response the Response object to be asserted
     */
    public static void assertGetBookingIds(Response response){
        Assert.assertNotNull(response);
        Assert.assertEquals(response.statusCode(), 200);
    }

    /**
     * Asserts that the response status is 201 and the response body is "Created".
     *
     * @param response the Response object to be asserted
     */
    public static void assertResponseStatusAndBody(Response response){
        Assert.assertEquals(response.statusCode(), 201);
        Assert.assertEquals(response.getBody().asString(), "Created");
    }

    /**
     * Asserts that the actual booking details match the expected booking details for an update operation.
     *
     * @param expectedBooking the expected Booking object
     * @param actualBooking the actual Booking object
     */
    public static void assertUpdateBooking(Booking expectedBooking, Booking actualBooking) {
        Assert.assertEquals(expectedBooking.getFirstname(), actualBooking.getFirstname());
        Assert.assertEquals(expectedBooking.getLastname(), actualBooking.getLastname());
        Assert.assertEquals(expectedBooking.getTotalprice(), actualBooking.getTotalprice());
        Assert.assertEquals(expectedBooking.getBookingdates().getCheckin(), actualBooking.getBookingdates().getCheckin());
        Assert.assertEquals(expectedBooking.getBookingdates().getCheckout(), actualBooking.getBookingdates().getCheckout());
        Assert.assertEquals(expectedBooking.getAdditionalneeds(), actualBooking.getAdditionalneeds());
    }
}
