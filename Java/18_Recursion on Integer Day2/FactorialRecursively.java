/*Factorial Recursively
Given a number n, find its factorial using recursion.

Input Format
Input consists only of integer n.

Output Format
Print the factorial of the number.

Example 1
Input

5
Output

120
Explanation

1 * 2 * 3 * 4 * 5 = 120.

Example 2
Input

10
Output

3628800
Explanation

1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 = 3628800.

Constraints
0 <= n <= 18
Hint 1
Factorial of x can be written as F(x)=xF(x-1). That is x((x-1)!)

Approach 1
Let's create a factorial program using recursive functions. Until the value is not equal to zero, the recursive function will call itself.
Factorial can be calculated using the following recursive formula.
n! = n * (n - 1)!

n! = 1 if n = 0 or n = 1

Time Complexity

O(n)

Space Complexity

O(n)

Below is the implementation of the above approach:

Java*/
import java.util.*;

public class FactorialRecursively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
        int n = sc.nextInt();                // Read an integer from the user
        System.out.println(factorial_recursive(n)); // Call recursive method and print result
        sc.close();                          // Close the scanner to prevent resource leak
    }

    // Method to calculate factorial recursively
    public static long factorial_recursive(int n) {
        // Base case: if n is 0 or 1, factorial is n itself
        // (Note: mathematically, 0! = 1, so ideally we should return 1 here)
        if (n <= 1)
            return n;

        // Recursive case:
        // Multiply current n by factorial of (n - 1)
        // Example: factorial(5) = 5 * factorial(4)
        return (long) (n * factorial_recursive(n - 1));
    }
}
