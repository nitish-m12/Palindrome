import java.util.Scanner;

/**
 * ================================================================
 * MAIN CLASS : UseCase13PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures the execution performance
 * of a palindrome validation algorithm.
 *
 * Steps:
 * - Accepts input string
 * - Checks palindrome
 * - Captures start and end time
 * - Displays execution duration
 */

public class UseCase13PalindromeCheckerApp {

    // Method to check palindrome
    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Application entry point
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Capture start time
        long startTime = System.nanoTime();

        boolean result = isPalindrome(input);

        // Capture end time
        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Is Palindrome : " + result);
        System.out.println("Execution Time : " + executionTime + " ns");

        scanner.close();
    }
}