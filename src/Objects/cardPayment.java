
package Objects;

import java.sql.Date;
import java.time.LocalDate;

public class cardPayment {
    private String cardNumber;
    private LocalDate expirationDate;
    private int CVV;
    private String postalCode;

    public cardPayment(String cardNumber, LocalDate expirationDate, int CVV, String postalCode) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.CVV = CVV;
        this.postalCode = postalCode;
    }
    
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    

    @Override
    public String toString() {
        return "Card Details: "+"n/" + "Card Number=" + cardNumber+"n/"+ "Expiration Date=" 
                + expirationDate+"n/"+"CVV =" + CVV +"n/"+"Postal Code =" + postalCode;
    }
    
    
}
