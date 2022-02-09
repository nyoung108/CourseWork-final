
package Objects;

import java.time.LocalDate;
import java.time.LocalTime;


public class sportObject extends eventDetailsObject {
    String sportID;
    String sportType;
    String homeTeam;
    String awayTeam;
    

  public sportObject(String sportID, String sportType, String homeTeam, String awayTeam, String eventID, String eventName, String eventType, LocalDate date, LocalTime time, double eventPrice) {
        super(eventID, eventName, eventType, date, time, eventPrice);
        this.sportID = sportID;
        this.sportType = sportType;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        
    }

    

    public String getSportID() {
        return sportID;
    }

    public void setSportID(String sportID) {
        this.sportID = sportID;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    @Override
    public String toString() {
        return   sportID + ", " + sportType + ", " + homeTeam + ", " + awayTeam;
    }

      
}
