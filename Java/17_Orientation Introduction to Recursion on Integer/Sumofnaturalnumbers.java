/*Sum of natural numbers
Write a recursive program to find out the sum of all natural numbers till N. Take input of N from the user and make a recursive function that returns the sum of all the natural numbers upto N.

Input Format
First line is an integer N

Output Format
Print the sum of first N natural numbers.

Example 1
Input

5
Output

15
Explanation

Here, n = 5, so 1 + 2 + 3 + 4 + 5 = 15

Example 2
Input

1
Output

1
Explanation

Here n = 1, so 1 = 1

Constraints
1 <= N < = 10^3
Hint 1
Think of base condition
Approach:
Keep adding the number in the function and recursively add the sum of all the numbers smaller to it.

Algorithm:

if number is 0, return 0.
else return number+ NumberSum(number-1)
Time Complexity

O(N).

Space Complexity

O(N)

Code:

1. Java*/
import java.util.*;  // Import the Java utility package (needed for Scanner)

public class Sumofnaturalnumbers {

    // Recursive function to calculate sum of first N natural numbers
    static long NumberSum(long N) {
        // Base case: if N is 0, return 0
        if (N == 0) 
            return N; // Or return 0, sum of first 0 numbers is 0

        // Recursive case: sum of first N numbers = N + sum of first (N-1) numbers
        return N + NumberSum(N - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner to take input from user
        
        long N = scanner.nextLong();             // Read the value of N
        System.out.println(NumberSum(N));        // Call recursive function and print the result
    }
}
