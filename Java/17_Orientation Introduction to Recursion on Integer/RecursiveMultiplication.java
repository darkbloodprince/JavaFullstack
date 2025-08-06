/*Recursive Multiplication
You are given two integers N and M. Calculate and return their multiplication using recursion.

You can only use subtraction and addition for your calculation. No other operators are allowed.

Note

Complete the given function. The input would be handled by the driver code. You only have to print the answer.

Input Format
The first line contains N.

The second line contains M.

Output Format
Print the product.

Example 1
Input

10
13
Output

130
Explanation

10 * 13 = 130

Example 2
Input

5
4
Output

20
Explanation

5 * 4 = 20.

Constraints
1 <= N, M <= 10000
Hint 1
Adding something n times is same as multiplication by n.

Approach: We can add m, times to get n*m. Adding something n times is same as multiplication by n.

Algorithm:

if n is less than, m swap the numbers

Calculate m times sum of n

If any of the two numbers is 0, then return 0.

Time Complexity

O(min(N,M)

Space Complexity

Space is required only for the recursion stack.

Below is the implementation of above idea:

Java*/
import java.io.*;       // Importing Java I/O classes (not used directly in this code).
import java.util.*;     // Importing utility classes like Scanner for user input.

public class RecursiveMultiplication {

  // This method recursively multiplies two numbers without using the '*' operator.
  public static int multiply(int n, int m) {
    // Swap to make sure the smaller number is used in recursion (to reduce stack depth)
    if (n < m)
      return multiply(m, n);  // Ensure n >= m to minimize recursive calls.

    // Recursive case: keep adding n, m times.
    else if (m != 0)
      return (n + multiply(n, m - 1));  // Add n and make recursive call with (m-1)

    // Base case: if m is 0, return 0 (since n * 0 = 0)
    else
      return 0;
  }

  // This method just prints the result of multiplying n and m using recursion
  public static void multiplyRecursively(int n, int m) {
    System.out.println(multiply(n, m));
  }

  // Main method: takes input and calls the multiplication method
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in); // Scanner for reading input
    int n = scn.nextInt();  // Read first integer
    int m = scn.nextInt();  // Read second integer
    multiplyRecursively(n, m); // Call method to multiply and print the result
  }
}
