/*Print ACCIOJOB
Using recursion, your task is to print string ACCIOJOB, n times.

Input Format
First line contains integer n

Output Format
Print the string ACCIOJOB, n times.

Example 1
Input

3
Output

ACCIOJOB
ACCIOJOB
ACCIOJOB
Explanation:

As the value of n is 3 so, we get 3 times ACCIOJOB.

Example 2
Input

1
Output

ACCIOJOB
Explanation:

As the value of n is 1, so we get ACCIOJOB 1 times.

Constraints
1 <= n <= 104
Hint 1
Base case when n==1

Approach 1: Linear Solution

The base case for this recursion is when n==1, just print ACCIOJO1B and return from there.

Time Complexity : O(N)

Space Complexity : O(N)

Below is the Java implementation of above idea:

1. Java*/
import java.io.*;   // Import Java I/O classes (not used directly here)
import java.util.*; // Import utility classes like Scanner

class PrintACCIOJOB
{
    public static void main(String args[]) throws IOException
    {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Read an integer 'n' from the user
        int n = sc.nextInt();

        // Call the recursive method 'solve' with 'n'
        solve(n);
    }

    // Recursive method to print "ACCIOJOB" 'n' times
    static void solve(int n)
    {
        // Base case: if n equals 1, print "ACCIOJOB" once and stop recursion
        if (n == 1)
        {
            System.out.println("ACCIOJOB");
            return; // exit from the current function call
        }

        // Print "ACCIOJOB" before the recursive call
        System.out.println("ACCIOJOB");

        // Recursive call with n-1 (this reduces the problem size)
        solve(n - 1);
    }
}
