package models;

/**
 * The BookingResponse class represents the response received after a booking operation,
 * containing the booking ID and the booking details.
 */
public class BookingResponse {
    private int bookingid;
    private Booking booking;

    /**
     * Gets the booking ID.
     *
     * @return the booking ID
     */
    public int getBookingid() {
        return bookingid;
    }

    /**
     * Sets the booking ID.
     *
     * @param bookingid the booking ID
     */
    public void setBookingid(int bookingid) {
        this.bookingid = bookingid;
    }

    /**
     * Gets the booking details.
     *
     * @return the booking details
     */
    public Booking getBooking() {
        return booking;
    }

    /**
     * Sets the booking details.
     *
     * @param booking the booking details
     */
    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
