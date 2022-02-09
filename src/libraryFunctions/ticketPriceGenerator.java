
package libraryFunctions;

import java.text.DecimalFormat;

public class ticketPriceGenerator {
    public static double ticketPrice(int row, String stand, String event) {
        double rowPrice = rowPrice(row); 
        double standPrice = standPrice(stand); 
        double eventPrice = eventPrice(event); 
        
        double ticketPrice = rowPrice+standPrice+eventPrice;
        new DecimalFormat("##.##").format(ticketPrice);
        System.out.println(ticketPrice);
        return ticketPrice;
    }
    public static double rowPrice(int row){
       
         
        double rowPrice = (15-row)/4;
        return rowPrice;
    }
    public static double standPrice(String stand){
        double standPrice = 0;
        int standInt = Integer.parseInt(stand);
        if (standInt== 3){
            standPrice = 8.99; 
        }
        if (standInt == 1||standInt == 2||standInt == 6){
            standPrice = 5.99; 
        }
        if (standInt == 4||standInt == 5||standInt == 7){
            standPrice = 3.99; 
        }
        return standPrice;
    }
    public static double eventPrice(String event){
        String eventID = databaseOrders.getEventID(event);
        double eventPrice = databaseOrders.getEventPrice(eventID);
        return eventPrice;
    }
}
