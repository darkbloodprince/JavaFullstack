/*Recursively Print Numbers
Write a recursive program to print all numbers starting from 1 till N. The sequence should be 1 2 3 ... N.

Input Format
Input consists of a single integer N

Output Format
Print the numbers between 1 and N in ascending order, each separated by a single space.

Example 1
Input

5
Output

1 2 3 4 5
Example 2
Input

10
Output

1 2 3 4 5 6 7 8 9 10
Constraints
1 <= N <= 1000
Hint 2
What would the base case be?

Approach 1: Recursive Approach

For the base case, check if i > N. If it is, stop the recursive calls. Else print i and recurse to f(i+1,N).

Time Complexity : O(N) (As we call on the function N times which does a unit job).

Space Complexity : O(N) (due to the call stack size which grows with the number of calls).

Below is the implementation of this algorithm:

1. Java*/
import java.util.*;

public class RecursivelyPrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        printtillN(N, 1);
        sc.close();
    }
	public static void printtillN(int N, int i) {
        if (i > N) {
            return;
        }
        System.out.print(i + " ");
        printtillN(N, i + 1);
    }
} 