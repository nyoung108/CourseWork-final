
package Objects;

public class ticketDetailsObject {
    private String ticketID;
    private String seatID;
    private String eventID;
    private String type;
    private double price;

    public ticketDetailsObject(String ticketID, String seatID, String eventID, String type, double price) {
        this.ticketID = ticketID;
        this.seatID = seatID;
        this.eventID = eventID;
        this.type = type;
        this.price = price;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getSeatID() {
        return seatID;
    }

    public void setSeatID(String seatID) {
        this.seatID = seatID;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ticketDetailsObject{" + "ticketID=" + ticketID + ", seatID=" + seatID + ", eventID=" + eventID + ", type=" + type + ", price=" + price + '}';
    }
    
}
