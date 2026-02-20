/**
 * ================================================================
 * MAIN CLASS : UseCase2PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author Developer
 * @version 2.0
 */
public class UseCase2PalindromeCheckerApp {

    /**
     * Application entry point for UC2.
     *
     * The main method is the starting point of execution.
     * JVM invokes this method without creating an object
     * because it is declared static.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        /**
         * Hardcoded input string to be checked
         * String literal is stored in the String Constant Pool
         */
        String input = "madam";

        /**
         * Flag variable to track palindrome status
         * Assumed true initially
         */
        boolean isPalindrome = true;

        /**
         * Loop runs only till half of the string length
         * because characters are compared from both ends
         */
        for (int i = 0; i < input.length() / 2; i++) {

            /**
             * Compare character from start and end
             * If mismatch occurs, it is not a palindrome
             */
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break; // Exit loop on first mismatch
            }
        }

        /**
         * Display the input string and result
         * on the console
         */
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}