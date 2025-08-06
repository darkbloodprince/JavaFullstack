/*Decrease Print Increase Print
You are given a number N. You have to print the backward counting from N to 1. On reaching 1, you have to print counting from 1 to N.

Note

Complete the body of printDI function to achieve it. Don't change the function Definition.

Input Format
The first line contains a single integer N.

Output Format
Print the counting with each number in a new line.

Example 1
Input

4
Output

4
3
2
1
1
2
3
4
Explanation

We count from 4 to 1 and back to 4 again.

Example 2
Input

2
Output

2
1
1
2
Explanation

We count from 2 to 1 and back to 2 again.

Constraints
1 <= N <= 15000
Hint 1
Use recursion

Approach: Use recursion. If n reaches 0, return. Print n. Call recursively for n-1. Print n.

Algorithm:

If n is 0, return.
Print n.
Call recursively for n-1.
Print n.
Below is the implementation of the above idea:

1. Java*/
import java.io.*;    // Importing Java I/O classes for BufferedReader
import java.util.*;  // Importing utility classes (not used here but included)

// Main class
public class DecreasePrintIncreasePrint {
  
  public static void main(String[] args) throws Exception {
    // Create BufferedReader to read input from console (System.in)
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Read a line of input (number) and convert it to integer
    int n = Integer.parseInt(br.readLine());

    // Call the recursive function with input 'n'
    printDI(n);
  }

  // Recursive method to print numbers in a specific pattern
  public static void printDI(int n) {
    // Base case: If n is 0, stop the recursion
    if (n == 0) {
      return;
    }

    // Print the current number (Descending phase)
    System.out.println(n);

    // Recursive call with n-1
    printDI(n - 1);

    // Print the current number again (Ascending phase)
    System.out.println(n);
  }
}
