package models;

/**
 * The Bookingdates class represents the check-in and check-out dates for a booking.
 */
public class Bookingdates {

    private String checkin;
    private String checkout;

    public Bookingdates(){}

    /**
     * Gets the check-in date.
     *
     * @return the check-in date
     */
    public String getCheckin() {
        return checkin;
    }

    /**
     * Sets the check-in date.
     *
     * @param checkin the check-in date
     * @return the Bookingdates object
     */
    public Bookingdates setCheckin(String checkin) {
        this.checkin = checkin;
        return this;
    }

    /**
     * Gets the check-out date.
     *
     * @return the check-out date
     */
    public String getCheckout() {
        return checkout;
    }

    /**
     * Sets the check-out date.
     *
     * @param checkout the check-out date
     * @return the Bookingdates object
     */
    public Bookingdates setCheckout(String checkout) {
        this.checkout = checkout;
        return this;
    }
}
