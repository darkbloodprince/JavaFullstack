/*Recursive Fibonacci
Given an integer N, find the Nth number in the fibonacci series. Consider 0 and 1 to be the seed values.

In a fibonacci series, each number ( Fibonacci number ) is the sum of the two preceding numbers. The series with 0 and 1 as seed values will go like -

0, 1, 1, 2, 3, 5.....

Input Format
First line contains the integer N

Output Format
Print the Nth fibonacci number

Example 1
Input

1
Output

0
Example 2
Input

2
Output

1
Example 3
Input

5
Output

3
Constraints
1 <= N <= 30
Approach:
A direct recursive implementation mathematical recurrence relation Fn = Fn-1 + Fn-2 where n>2
And we can define the base case as F1=0 and F2 = 1.
Thus the series is 0,1,1,2,3,5,8.....

Time Complexity

O(2^n) as there are two calls at each level.

Space Complexity

O(n) since the recursion tree's depth is up to the nth level.

1. JAVA*/
import java.util.*;              // Import utility package for Scanner
import static java.lang.Math.ceil; // Import Math.ceil (not used in this code, can be removed)

public class RecursiveFibonacci {

    // Recursive function to calculate the nth Fibonacci number
    public static int fib(int n) {
        // Base case 1: if n == 1, return 0 (first Fibonacci number)
        if (n == 1) return 0;

        // Base case 2: if n == 2, return 1 (second Fibonacci number)
        if (n == 2) return 1;

        // Recursive case: sum of previous two Fibonacci numbers
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object to read input
        int n = sc.nextInt();                // Read nth position from user

        System.out.println(fib(n));          // Call recursive function and print result
    }
}
