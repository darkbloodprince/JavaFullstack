/*Print the pattern
Using recursion, print the given pattern.

Input Format
First line contains integer n, representing rows of the given pattern

Output Format
Display the given pattern.

Example 1
Input

5

Output


* 
* * 
* * * 
* * * * 
* * * * * 


Explanation:

The number of rows given is 5.

Example 2
Input

3

Output


* 
* * 
* * * 

Explanation:

The number of rows given is 3.

Constraints
1 <= n <= 102
Hint 1
Think for a base case
Approach 1: Linear Solution

using recursion we have to print the given pattern,
the base case for this problem is when n==0,
after that , we call for n-1, and then using loop we print the pattern.
Time Complexity : O(N)

Space Complexity : O(N)

Below is the Java implementation of above idea:

1. Java*/

import java.io.*;       // Import for input/output classes (not strictly needed here)
import java.util.*;     // Import for Scanner class to take user input

class Printthepattern
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from user
        
        int n = sc.nextInt(); // Read an integer 'n' from the user
        solve(n);             // Call the solve function with input 'n'
    }

    // Recursive function to print a right-angled triangle pattern of stars
    static void solve(int n)
    {
        // Base case: if n is 0, stop recursion
        if (n == 0)
        {
            return; // exit the function
        }

        // Recursive call: first go all the way down to 1
        solve(n - 1);

        // After returning from recursion, print 'n' stars on the current line
        for (int i = 0; i < n; i++)
            System.out.print("*" + " "); // Print a star followed by a space

        System.out.println(); // Move to the next line after printing 'n' stars
    }
}
