/*Find Number of Digits
Given the number n, find out and return the number of digits present in a number recursively.

Input Format
Input consists of single line which has the integer n.

Output Format
Return the number of digits present in n.

Example 1
Input

1256
Output

4
Example 2
Input

12345
Output

5
Constraints
1 <= n <= 10^9
Hint 1
Think about the base case and the recurrence relation.

Approach 1:

We set the base case as if(n==0) return 0; since we know that the i/p number as given from constraints will never be zero.

The recurrence relation will be 1 + f(n/10) as we will count the single digit and reduce the i/p size by dividing the current i/p by 10.

Time Complexity : O(logn)

Space Complexity : O(logn)

1. Java*/
import java.util.*;

public class FindNumberofDigits {
    
    // Recursive function to count number of digits in an integer n
    static int numOfDigi(int n) {
        // Base case: if n becomes 0, stop recursion
        if (n == 0)
            return 0;
        
        // Recursive case: divide number by 10 (remove last digit),
        // and add 1 for the current digit
        return 1 + numOfDigi(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to read input
        
        int n = sc.nextInt(); // Read an integer from the user
        
        int result = numOfDigi(n); // Call recursive function to count digits
        
        System.out.println(result); // Print the number of digits
        
        sc.close(); // Close scanner to avoid resource leaks
    }
}
