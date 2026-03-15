import java.util.*;

/**
 * ================================================================
 * MAIN CLASS : UseCase12PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This program demonstrates how different palindrome
 * checking algorithms can be selected dynamically
 * at runtime using the Strategy Design Pattern.
 *
 * The application:
 * 1. Defines a common PalindromeStrategy interface
 * 2. Implements StackStrategy and DequeStrategy
 * 3. Injects the strategy at runtime
 * 4. Executes the selected algorithm
 *
 */

public class UseCasePalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("\nChoose Strategy");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        int choice = sc.nextInt();

        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

/**
 * ================================================================
 * INTERFACE : PalindromeStrategy
 * ================================================================
 *
 * This interface defines a contract for all
 * palindrome checking algorithms.
 */

interface PalindromeStrategy {
    boolean check(String input);
}


/**
 * ================================================================
 * CLASS : StackStrategy
 * ================================================================
 *
 * Uses Stack (LIFO) to reverse characters
 * and compare with original sequence.
 */

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}


/**
 * ================================================================
 * CLASS : DequeStrategy
 * ================================================================
 *
 * Uses Deque to compare front and rear characters.
 */

class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}