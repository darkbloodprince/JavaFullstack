/*Palindrome Checker
Given a number N, you need to check whether the given number is Palindrome or not. A number is said to be Palindrome when it reads the same from backwards as forward.

Note: Input number will not have any trailing zeros.

Input
The line inputs N.

Output
You need to print "true" if the number is palindrome otherwise "false" (without quotes).

Example 1
Input

5
Output

true 
Example 2
Input

121
Output

true 
Constraints:
1 <= N <= 9999*/
import java.util.*;

public class PalindromeChecker {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        if (original == reversed) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
