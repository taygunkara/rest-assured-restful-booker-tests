package apis;

import apis.applicationApi.BookingApi;
import org.json.JSONObject;
import utils.ConfigUtils;

import static apis.Routes.AUTH_ENDPOINT;

/**
 * The TokenManager class handles the retrieval of authentication tokens for the booking API.
 */
public class TokenManager {

    private static final String USERNAME = ConfigUtils.getInstance().getUsername();
    private static final String PASSWORD = ConfigUtils.getInstance().getPassword();

    /**
     * Retrieves an authentication token by sending a POST request with the username and password.
     *
     * @return the authentication token as a String
     */
    public static String retrieveAuthToken(){
        JSONObject requestBody = new JSONObject()
                .put("username", USERNAME)
                .put("password", PASSWORD);

        return BookingApi.createToken(AUTH_ENDPOINT, requestBody.toString())
                .jsonPath()
                .getString("token");
    }
}
