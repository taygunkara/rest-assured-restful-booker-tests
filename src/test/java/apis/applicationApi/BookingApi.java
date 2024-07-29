package apis.applicationApi;

import apis.RestResources;
import io.restassured.response.Response;
import models.Booking;
import models.BookingResponse;

/**
 * The BookingApi class provides methods to interact with the booking API.
 * It includes methods for creating tokens, getting booking IDs, retrieving bookings,
 * creating bookings, updating bookings, partially updating bookings, deleting bookings,
 * and performing health checks.
 */
public class BookingApi {

    /**
     * Creates a token by sending a POST request to the specified endpoint.
     *
     * @param endpoint the endpoint URL for token creation
     * @param body the request body to be sent
     * @return the response from the POST request
     */
    public static Response createToken(String endpoint, Object body){
        return RestResources.post(endpoint, body);
    }

    /**
     * Retrieves the booking IDs by sending a GET request to the specified endpoint.
     *
     * @param endpoint the endpoint URL for retrieving booking IDs
     * @return the response from the GET request
     */
    public static Response getBookingIds(String endpoint){
        return RestResources.get(endpoint);
    }

    /**
     * Retrieves a specific booking by its ID.
     *
     * @param endpoint the endpoint URL for retrieving the booking
     * @param bookingid the ID of the booking to be retrieved
     * @return the booking object
     */
    public static Booking getBooking(String endpoint, int bookingid){
        return RestResources.get(endpoint + "/" + bookingid).as(Booking.class);
    }

    /**
     * Creates a booking by sending a POST request to the specified endpoint.
     *
     * @param endpoint the endpoint URL for creating the booking
     * @param body the request body to be sent
     * @return the response from the POST request, parsed as a BookingResponse object
     */
    public static BookingResponse createBooking(String endpoint, Object body){
        return RestResources.post(endpoint, body).as(BookingResponse.class);
    }

    /**
     * Updates a booking by sending a PUT request to the specified endpoint.
     *
     * @param endpoint the endpoint URL for updating the booking
     * @param bookingid the ID of the booking to be updated
     * @param token the authentication token to be used
     * @param body the request body to be sent
     * @return the updated booking object
     */
    public static Booking updateBooking(String endpoint, int bookingid, String token, Object body){
        return RestResources.put(endpoint + "/" + bookingid, token, body).as(Booking.class);
    }

    /**
     * Partially updates a booking by sending a PATCH request to the specified endpoint.
     *
     * @param endpoint the endpoint URL for partially updating the booking
     * @param bookingid the ID of the booking to be partially updated
     * @param token the authentication token to be used
     * @param body the request body to be sent
     * @return the partially updated booking object
     */
    public static Booking partialUpdateBooking(String endpoint, int bookingid, String token, Object body){
        return RestResources.patch(endpoint + "/" + bookingid, token, body).as(Booking.class);
    }

    /**
     * Deletes a booking by sending a DELETE request to the specified endpoint.
     *
     * @param endpoint the endpoint URL for deleting the booking
     * @param bookingid the ID of the booking to be deleted
     * @param token the authentication token to be used
     * @return the response from the DELETE request
     */
    public static Response deleteBooking(String endpoint, int bookingid, String token){
        return RestResources.delete(endpoint + "/" + bookingid, token);
    }

    /**
     * Performs a health check by sending a GET request to the specified endpoint.
     *
     * @param endpoint the endpoint URL for the health check
     * @return the response from the GET request
     */
    public static Response healthCheck(String endpoint){
        return RestResources.get(endpoint);
    }
}
