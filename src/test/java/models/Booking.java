package models;

/**
 * The Booking class represents a booking entity with details such as firstname, lastname,
 * total price, deposit status, booking dates, and additional needs.
 */
public class Booking {

    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private Bookingdates bookingdates;
    private String additionalneeds;

    public Booking(){}

    /**
     * Gets the first name of the booking.
     *
     * @return the first name
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the first name of the booking.
     *
     * @param firstname the first name
     * @return the Booking object
     */
    public Booking setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    /**
     * Gets the last name of the booking.
     *
     * @return the last name
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the last name of the booking.
     *
     * @param lastname the last name
     * @return the Booking object
     */
    public Booking setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    /**
     * Gets the total price of the booking.
     *
     * @return the total price
     */
    public int getTotalprice() {
        return totalprice;
    }

    /**
     * Sets the total price of the booking.
     *
     * @param totalprice the total price
     * @return the Booking object
     */
    public Booking setTotalprice(int totalprice) {
        this.totalprice = totalprice;
        return this;
    }

    /**
     * Checks if the deposit is paid.
     *
     * @return true if the deposit is paid, false otherwise
     */
    public boolean isDepositpaid() {
        return depositpaid;
    }

    /**
     * Sets the deposit paid status.
     *
     * @param depositpaid the deposit paid status
     * @return the Booking object
     */
    public Booking setDepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
        return this;
    }

    /**
     * Gets the booking dates.
     *
     * @return the booking dates
     */
    public Bookingdates getBookingdates() {
        return bookingdates;
    }

    /**
     * Sets the booking dates.
     *
     * @param bookingdates the booking dates
     * @return the Booking object
     */
    public Booking setBookingdates(Bookingdates bookingdates) {
        this.bookingdates = bookingdates;
        return this;
    }

    /**
     * Gets the additional needs.
     *
     * @return the additional needs
     */
    public String getAdditionalneeds() {
        return additionalneeds;
    }

    /**
     * Sets the additional needs.
     *
     * @param additionalneeds the additional needs
     * @return the Booking object
     */
    public Booking setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
        return this;
    }
}
