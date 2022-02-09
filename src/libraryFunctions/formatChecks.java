package libraryFunctions;

import java.util.regex.Pattern;

public class formatChecks {

    public static boolean validEmail(String email) {
// need to use method to check for high level domain
//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

        boolean valid = true;
        if (email.length() > 64) {
            System.out.println("Email too long");
            valid = false;
            return valid;

        }
        String regularPattern = ".+@.+\\....+";
        valid = Pattern.compile(regularPattern).matcher(email).matches();
        return valid;
    }

    public static boolean validPassword(String password, String passwordCheck) {

        boolean valid = true; //starts of assuming password is valid

        valid = passwordEqual(valid, password, passwordCheck); //method to check if both passwords are the same when entered
        if (valid == false) {
            System.out.println("The passwords do not match.");
            return valid; //all of the checks need to be passed so as soon as one is false it returns false;
        }
        if (password.length() <= 20 && valid == true) {
            //checks to make sure password is not too long
        } else {
            System.out.println("The password is too long.");
            valid = false;
            return valid;
        }

        valid = passwordFormat(valid, password); // method to check for symbol
        if (valid == false) {
            return valid;
        }

        return valid;
    }

    public static boolean passwordEqual(Boolean valid, String password, String passwordCheck) {

        if (password.equals(passwordCheck) && (valid == true)) {      // compares first password to second password    
            return valid;
        } else {
            valid = false; //if not true then sets valid to false
        }
        return valid;
    }

    public static boolean passwordFormat(boolean valid, String password) {
        String regularPattern = "^.*(?:[A-Z].*+\\W+)|(?:\\W+.*[A-Z]+).*$";
        boolean check = Pattern.compile(regularPattern).matcher(password).matches();
        if (check == false) {
            return valid;
        }

        return valid;
    }

    public static boolean lastNameValid(String lastName) {
        boolean valid = true;
        if (lastName.length() > 30) {
            System.out.println("Last name too long.");
            valid = false;
            return valid;
        }
        String regularPattern = "^[A-Za-z]+?-?[A-Za-z]+$";
        valid = Pattern.compile(regularPattern).matcher(lastName).matches();
        

        return valid;
    }
    public static boolean firstNameValid(String lastName) {
        boolean valid = true;
        if (lastName.length() > 20) {
            System.out.println("First name too long.");
            valid = false;
            return valid;
        }
        String regularPattern = "^[A-Za-z]+$";
        valid = Pattern.compile(regularPattern).matcher(lastName).matches();
        

        return valid;
    }
    

}
