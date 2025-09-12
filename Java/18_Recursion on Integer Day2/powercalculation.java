/*power calculation
You are given two integers, N and X. You have to find X raised to the power N in O(N) time complexity using recursion.

Note Complete the given function and use recursion to solve this problem.

It is guaranteed that the test cases are made such that the answer does not overflow a 64-bit integer datatype.

Input Format
The first line contains two integers, X, and N.

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

Approach: Use Recursion.

Algorithm:

If n is 0, return 1.
If x is 0, return 0.
Call recursively for n-1.
Multiply the recursive call with x and return.
Below is the implementation of above idea:

1. Java*/
import java.util.*;

class powercalculation {
    
    // Recursive function to calculate x^n (x raised to the power n)
	public static long xPowerN(int x, int n) {

        // Base case: if power is 0, return 1 (any number^0 = 1)
		if (n == 0)
			return 1;

        // If base is 0, return 0 (0 raised to any positive power = 0)
		if (x == 0)
			return 0;

        // Recursive case:
        // Multiply x with result of x^(n-1)
        // This keeps reducing the power until it reaches 0
		return x * xPowerN(x, n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Input the base (x) and exponent (n)
		int x = sc.nextInt();
		int n = sc.nextInt();

        // Print the result of x^n
		System.out.println(xPowerN(x, n));
	}
}
