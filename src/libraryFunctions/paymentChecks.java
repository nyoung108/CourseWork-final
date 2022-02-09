package libraryFunctions;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import Gui.*;
import java.util.regex.Pattern;

public class paymentChecks {

    

    public static boolean cardNumberCheck(String cardHolder, String cardNumber, int CVC, LocalDate expiryDate) {
        boolean valid = true;
        valid = cardNumberCorrect(valid, cardNumber);
        valid = CVC(valid, CVC);
        valid = cardHolderName(valid, cardHolder);
        valid = expiryDateCheck(valid, expiryDate);
        return valid;
    }

    public static boolean cardNumberCorrect(boolean valid, String cardNumber) {
        
        String regularPattern = "(\\d{4,4}\\s*){4,4}";
       valid = Pattern.compile(regularPattern).matcher(cardNumber).matches();
        return valid;
    }

    public static int[] ascii(String dataToAscii) {
        char[] characters = dataToAscii.toCharArray();
        int[] ascii = new int[characters.length];
        for (int i = 0; i < characters.length; i++) {
            char character = characters[i];
            int asciiValue = (int) character;
            ascii[i] = asciiValue;
        }
        return ascii;
    }

    public static boolean CVC(boolean valid, int CVC) {
        
        if (CVC > 999 || CVC < 100) {
            valid = false;
            return valid;
        }
        return valid;
    }

    public static boolean cardHolderName(boolean valid, String name) {
        String regularPattern = "^[a-zA-Z]+\\s\\w+-?[a-zA-Z]+$";
        boolean correctForm = true;
        correctForm = Pattern.compile(regularPattern).matcher(name).matches();
        if(correctForm == false)
        {
            valid = false;
        }
        return valid;
    }

    public static boolean expiryDateCheck(boolean valid, LocalDate expiryDate) {
        
        DateTimeFormatter expiryDateFormat = DateTimeFormatter.ofPattern("MM-yy");
         //LocalDate expiryDateFormatted = LocalDate.parse(expiryDate, expiryDateFormat);
        LocalDate current = LocalDate.now();
        if (expiryDate.isBefore(current)) {
            valid = false;
        }
        return valid;
    }
}
