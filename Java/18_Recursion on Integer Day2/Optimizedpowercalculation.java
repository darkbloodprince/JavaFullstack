/*Optimized power calculation
You are given two integers, N and X. You have to find X raised to the power N in O(log(N)) time complexity using recursion.

Note Complete the given function and use recursion to solve this problem.

It is guaranteed that the test cases are made such that the answer does not overflow a 64-bit integer datatype.

Input Format
The first line contains two integers, X and N.

Output Format
Print the answer.

Example 1
Input

2 3
Output

8
Explanation

2 raised to the power 3 is 8.

Example 2
Input

10 5
Output

100000
Explanation

10 raised to the power 5 is 100000.

Constraints
1 <= X <= 10^8

1 <= N <= 64
Hint 1
Use recursion and check for base cases.

Approach: Divide and Conquer Algorithm. The problem can be recursively defined by:

power(x, n) = power(x, n / 2) * power(x, n / 2); // if n is even
power(x, n) = x * power(x, n / 2) * power(x, n / 2); // if n is odd
We can optimize the above function by computing the solution of the subproblem once only.

Time Complexity : O(log(N)).

Space Complexity : O(log(N))

Below is the implementation of above idea:

1. Java*/
import java.io.*;    // Importing input/output classes (not used explicitly here)
import java.util.*;  // Importing utility classes for Scanner

class Optimizedpowercalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input

        int X, N;
        X = sc.nextInt();  // Read the base number from user input
        N = sc.nextInt();  // Read the exponent from user input

        // Call the recursive function 'power' and print the result
        System.out.println(power(X, N));

        sc.close(); // Close the Scanner to free resources
    }

    // Recursive function to calculate x raised to the power y
    static long power(int x, int y) {
        long temp;

        // Base case: anything to the power 0 is 1
        if (y == 0)
            return 1;

        // Recursively calculate power(x, y/2)
        temp = power(x, y / 2);

        // If exponent is even, use the formula: x^y = (x^(y/2))^2
        if (y % 2 == 0)
            return temp * temp;
        else
            // If exponent is odd, use the formula: x^y = x * (x^(y/2))^2
            return x * temp * temp;
    }
}
