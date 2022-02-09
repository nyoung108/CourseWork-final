
package Objects;

import java.time.LocalDate;

public class bookingDetailsObject {
  private String bookingID;
  private String userID;
  private String ticketID;
  private LocalDate dateBooked;

    public bookingDetailsObject(String bookingID, String userID, String ticketID, LocalDate dateBooked) {
        this.bookingID = bookingID;
        this.userID = userID;
        this.ticketID = ticketID;
        this.dateBooked = dateBooked;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public LocalDate getDateBooked() {
        return dateBooked;
    }

    public void setDateBooked(LocalDate dateBooked) {
        this.dateBooked = dateBooked;
    }

    @Override
    public String toString() {
        return "bookingDetailsObject{" + "bookingID=" + bookingID + ", userID=" + userID + ", ticketID=" + ticketID + ", dateBooked=" + dateBooked + '}';
    }
    
}
