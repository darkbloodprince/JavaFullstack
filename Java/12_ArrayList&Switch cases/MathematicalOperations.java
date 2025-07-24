/*Mathematical Operations
You are given two positive integers. You have to calculate the result by performing +,-,*,/,% operations on them.

Input Format
The first line of input contains two space-separated integers A and B.

Output Format
The first line of the output should contain the sum of A and B.

The second line of the output should contain the difference of A and B.

The third line of the output should contain the product of A and B.

The fourth line of the output should contain the quotient of A divided by B.

The fifth line of the output should contain the remainder of A modulus by B.

Example 1
Input:

8 3
Output:

11
5
24
2
2
Example 2
Input:

10 2
Output:

12
8
20
5
0
Constraints
1 <= A <= 10^3

1 <= B <= 10^3
Approach:
Use mathematical operators for each of the operations.
Print each result in the required order and in a new line.
Time Complexity

O(1) as each operation takes constant time.

Space Complexity

O(1) as we do not need any extra memory.

Below is the implementation of the above idea:

1. Java*/
import java.util.*; // Importing utility package for Scanner and other utilities

public class MathematicalOperations {

  public static void main(String[] args) throws Throwable {
    Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user

    int a = sc.nextInt(); // Read the first integer input from the user and store it in variable 'a'
    int b = sc.nextInt(); // Read the second integer input from the user and store it in variable 'b'

    // Perform arithmetic operations between a and b
    int sum = a + b;          // Addition
    int diff = a - b;         // Subtraction
    int product = a * b;      // Multiplication
    int quotient = a / b;     // Integer Division (quotient only, decimals truncated)
    int remainder = a % b;    // Modulus operation (remainder of a divided by b)

    // Print the results line by line
    System.out.println(sum);        // Print the sum
    System.out.println(diff);       // Print the difference
    System.out.println(product);    // Print the product
    System.out.println(quotient);   // Print the quotient
    System.out.println(remainder);  // Print the remainder
  }
}
