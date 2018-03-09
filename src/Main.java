import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static Pattern pattern;
    static Matcher matcher;
    static ArrayList<String> pass;

    // initialize the pattern where the password will be
    // compared to using regular expressions.
    // RegEx:
    // {6,100} <-- password length, between 6-100.
    // (?=.*[a-z]) <-- should contain 1 lowercase letter a-z.
    // (?=.*[A-Z]) <-- should contain 1 uppercase letter A-Z.
    // (?=.*\d) <-- must contain 1 digit from 0-9.
    private static final String PASSWORD_REQUIREMENTS =
            "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,100})";

    public static void main(String[] args) {

        // arrayList for a dynamic list of invalid password
        // creation attempts.
        pass = new ArrayList<>();
        // compile the regex pattern
        pattern = Pattern.compile(PASSWORD_REQUIREMENTS);

        //initialize scanner class to accept input from user.
        Scanner sc = new Scanner(System.in);

        // some user prompts and password requirements statement
        System.out.println("Welcome to MindGrub. Please create a password that: ");
        System.out.println("- is at least six characters long");
        System.out.println("- contains at least one uppercase and at least " +
                "one lower case letter ");
        System.out.println("- contains at least one digit \n");

        // keep asking for password until it satisfies requirements
        do {
            System.out.print("Enter password: ");

            // add password attempt to arraylist called pass.
            pass.add(sc.nextLine());

            // print invalid pass if the password if validatePassword is false.
            if (!validatePassword(pass.get(pass.size()-1))) {
                System.out.println("Invalid password. Try again.\n");

                // if validatePassword returns true, print all attempts,
                // and print passwordExpiration.
            } else {
                System.out.println("\nPassword valid.\nAttempts:");
                printAllAttempts();
                printPasswordExpiration();
            }
        } while (!validatePassword(pass.get(pass.size()-1)));
    }

    /**
     * Print all password attempts if password is valid.
     * @param
     * @return void
     */
    public static void printAllAttempts() {
        for (int i = 0; i < pass.size(); i++) {
            System.out.println(pass.get(i));
        }
    }

    /**
     * Validate password using regular expressions assigned above.
     * @param password passed from the user input.
     * @return true if password is valid, false if invalid.
     */
    public static boolean validatePassword(final String password){

        matcher = pattern.matcher(password);
        return matcher.matches();
    }

    /**
     * Print a message that states the password will expire in # of weeks.
     * This # equals the amount of characters present in
     * the final correct password.
     * @param
     * @return void
     */
    public static void printPasswordExpiration() {
        System.out.println("\nPassword will expire in "
                + pass.get(pass.size()-1).length() + " weeks.");
    }
}
