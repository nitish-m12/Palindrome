import java.util.Scanner;
import java.util.Stack;

/**
 * ================================================================
 * MAIN CLASS : UseCase5PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 5: Stack based palindrome checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * At this stage, the application:
 * - Pushed characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 *
 * This maps stack behaviour to reversal logic.
 *
 * @author Developer
 * @version 5.0
 */
public class UseCasePalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to lowercase for case-insensitive comparison
        String str = input.toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop and compare
        for (int i = 0; i < str.length(); i++) {
            char poppedChar = stack.pop();
            if (str.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close();
    }
}