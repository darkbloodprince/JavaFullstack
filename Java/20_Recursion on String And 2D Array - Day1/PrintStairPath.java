/*Print Stair Path
You are given a number n representing number of stairs in a staircase.

You are standing at the top of staircase. You are allowed to jump 1 step, 2 steps or 3 steps in one move.

Complete the body of printStairPaths function - without changing signature - to print the list of all paths that can be used to jump the staircase up. Use sample input and output to take idea about output.

Note: Write recursive and not iterative logic

Input Format
Input consists of one line.

First line contains an integer n.

Output Format
Print paths (one path in each line) in order hinted by Example output

Example
Input

3
Output

111
12
21
3
Constraints
0 <= n <= 10
Hint 3
Think about using recursion.

Approach 1:
Think about using recursion here.

Algorithm:

Create a helper function with parameters as int input and string answer. String answer will help us in storing the answer.
Call recursive functions by decreasing the input and increasing the answer.
Three recursive calls would be made with parameters (n-1,ans+1) (n-2, ans+2) and (n-3, ans+3)

Time Complexity

O(3^n)

Space Complexity

O(n) because of the recursion stack space used.

Below is the implementation of the algorithm

1. Java*/
import java.io.*;
import java.util.*;

public class PrintStairPath {

    // Recursive helper function that generates and prints all possible stair paths
    static void printStairPathsHelper(int n, String ans) {
        // Base case 1: If n <= 0, we have either reached or gone below the ground
        if (n <= 0) {
            // If n == 0, we’ve found a valid path (reached exactly the ground)
            if (n == 0) {
                System.out.println(ans);  // Print the path
            }
            // If n < 0, it's an invalid path (overshot), so just return
            return;
        }

        // Recursive case:
        // Try taking 1 step and explore all paths from (n-1)
        printStairPathsHelper(n - 1, ans + 1);

        // Try taking 2 steps and explore all paths from (n-2)
        printStairPathsHelper(n - 2, ans + 2);

        // Try taking 3 steps and explore all paths from (n-3)
        printStairPathsHelper(n - 3, ans + 3);
    }

    // Wrapper function that starts recursion
    static void printStairPaths(int n) {
        printStairPathsHelper(n, "");  // Initially, no steps are taken
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // Read number of stairs from user
        printStairPaths(n);     // Print all possible paths
    }
}
