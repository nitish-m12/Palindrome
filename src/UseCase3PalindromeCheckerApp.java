/**
 * ================================================================
 * MAIN CLASS : UseCase3PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Developer
 * @version 3.0
 */
public class UseCase3PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        /**
         * Hardcoded input string to be checked
         */
        String input = "madam";

        /**
         * Variable to store the reversed string
         * String concatenation is used here
         */
        String reversed = "";

        /**
         * Iterate from the last character to the first
         * and build the reversed string
         */
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        /**
         * Compare original and reversed strings
         * using equals() method
         */
        boolean isPalindrome = input.equals(reversed);

        /**
         * Display the input, reversed string,
         * and palindrome result
         */
        System.out.println("Input text: " + input);
        System.out.println("Reversed text: " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}