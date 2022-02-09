package libraryFunctions;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class hash {

    public static String hashedPassword(String password) {
        try {
            //using MD5 algorithm
            MessageDigest messageDigest = MessageDigest.getInstance("MD5"); //creates message digest object
            messageDigest.update(password.getBytes()); // gives message digest the data from password
            byte[] digestPassword = messageDigest.digest(); //generates message digest

            String hexHash = javax.xml.bind.DatatypeConverter.printHexBinary(digestPassword); //converts hash into hex
            return hexHash;
            
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(hash.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
