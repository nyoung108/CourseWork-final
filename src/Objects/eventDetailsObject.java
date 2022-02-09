
package Objects;

import java.time.LocalDate;
import java.time.LocalTime;

public class eventDetailsObject {
    String eventID;
    String eventName;
    String eventType;
    LocalDate date;
    LocalTime time;
    double eventPrice;
    eventDetailsObject newEvent;
    public eventDetailsObject(String eventID, String eventName, String eventType, LocalDate date, LocalTime time, double eventPrice) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventType = eventType;
        this.date = date;
        this.time = time;
        this.eventPrice = eventPrice;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getEventPrice() {
        return eventPrice;
    }

    public void setEventPrice(double eventPrice) {
        this.eventPrice = eventPrice;
    }
   
    public void getEventObject(eventDetailsObject newEvent) {
       
    }
}
