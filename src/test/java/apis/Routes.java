package apis;

/**
 * The Routes interface defines constants for the base URL and endpoints used in the booking API.
 */
public interface Routes {

    /**
     * The base URL for the booking API.
     */
    String BASE_URL = "https://restful-booker.herokuapp.com";

    /**
     * The endpoint for booking operations.
     */
    String BOOKING_ENDPOINT = "/booking";

    /**
     * The endpoint for authentication.
     */
    String AUTH_ENDPOINT = "/auth";

    /**
     * The path for the health check.
     */
    String HEALTH_CHECK_PATH = "/ping";
}
