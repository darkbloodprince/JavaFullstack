/*Product of natural numbers
Write a recursive program to find the product of all the Natural numbers till N. Take input of N from the user and write a recursive function that returns the product of all the Natural numbers until N.

Input Format
Enter an integer N (N>0)

Output Format
Print the product of all the Natural numbers between N and 1 (both included).

Example 1
Input

5
Output

120
Explanation

5 * 4 * 3 * 2 * 1 = 120.

Example 2
Input

4
Output

24
Explanation

4 * 3 * 2 * 1 = 24.

Constraints
1 <= N <= 14
Hint 1
If you have the product till N-1, how can you get product till N?
Approach:
First of all, let's see what is a factorial.
The factorial of a non-negative integer is the multiplication of all positive integers smaller than or equal to n. For example factorial of 5 is 5*4*3*2*1 which is 120. In general, we can write
N! =N * (N-1) * (N-2) * .. 3 * 2 * 1.
For (N-1)! = (N-1)* (N-2)* N-3)* .. 3 * 2 * 1.
For(N-2)!= (N-2)* N-3)* (N-4).. 3 * 2 * 1.
.
.
For 3!= 3*2*1
For 2!=2*1
For 1! =1

Can you see a recursive trend? Can you find N! factorial if you have (N-1)!?
N!= (N-1)! * N
it's a recursive equation that ends when N=1.
Therefore, it can be written as

Algorithm:

if N is equal to 1, N!=1,
else N!= N* (N-1)!

Time Complexity

O(N).

Space Complexity

O(1).

Code:

1. Java*/
import java.util.*;  // Importing the utility package which includes Scanner class

public class Productofnaturalnumbers {

    // This is a recursive method to calculate the factorial of a number
    static long product(int n) {
        // Base case: if n is 1, factorial of 1 is 1
        if (n == 1)
            return 1;

        // Recursive case: multiply current number 'n' by factorial of (n-1)
        return n * product(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object to read input from user

        int n = sc.nextInt(); // Read an integer from user

        System.out.println(product(n)); // Call the 'product' method and print the result

        sc.close(); // Close the Scanner to prevent resource leak
    }
}
