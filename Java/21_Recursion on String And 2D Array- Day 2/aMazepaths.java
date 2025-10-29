/*aMaze paths
Given two integers N and M, representing the number of rows and columns in the maze respectively, find all the paths to go from the top left cell to the bottom right cell.

Only two moves are allowed h (1-step horizontal to the right) and v (1-step vertically down).

Complete the body of the print aMazePaths function - without changing the signature - to print the list of all paths that can be used to move from top-left to bottom-right. String psf is initially empty. i and j are two variables with an initial value equal to 1.

Note The online judge can't force you to write the function recursively but that is what the spirit of the question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Make the horizontal call first, before the vertical recursive call.

Input Format
The first line contains the value of N.

The second line contains the value of M.

Output Format
Print all possible paths.

Example 1
Input

2
2
Output

hv
vh
Explanation

We first go right then down, which gives hv.

One other path is to go down then right which gives vh.

Example 2
Input

1
2
Output

h
Explanation

The only possible path is to go one step to the right, which gives h.

Constraints
1 <= N <= 10

1 <= M <= 10
Hint 2
Call recursively for the horizontal step by passing the string with an additional h and updating the value of i.

Approach:

We can simply use recursion to solve this problem. We make a string psf+"h" and pass it in the recursive call with i=i+1 for the horizontal step. Similarly, for the vertical step.

Algorithm :

if i or j exceed n or m respectively, return.
if i and j are equal to n and m respectively, print string and return.
Make a recursive call for the horizontal step as mentioned above.
Make a recursive call for the vertical step as mentioned above.
Below is the Java implementation of the above idea:

1. Java*/
import java.util.*;
import java.io.*;

public class aMazepaths {
    
    // Recursive function to print all paths from (1,1) to (n,m)
    public static void recursion(int n, int m, String psf, int i, int j) {
        // Base case: when we reach the destination cell (n, m)
        if (i == n && j == m) {
            System.out.println(psf); // Print the path so far
            return;
        }

        // Boundary case: when we go out of grid bounds
        if (i > n || j > m)
            return;

        // 'h' means a horizontal move (right)
        String psfh = psf + "h";
        // 'v' means a vertical move (down)
        String psfv = psf + "v";

        // Move horizontally (increase column index)
        recursion(n, m, psfh, i, j + 1);
        // Move vertically (increase row index)
        recursion(n, m, psfv, i + 1, j);
    }

    // Wrapper function to start recursion from cell (1,1)
    public static void aMazePaths(int n, int m, String psf) {
        // Call recursion starting from the top-left corner (1,1)
        recursion(n, m, psf, 1, 1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine;

        // Read number of rows (n)
        inputLine = br.readLine().trim().split(" ");
        int n = Integer.parseInt(inputLine[0]);

        // Read number of columns (m)
        inputLine = br.readLine().trim().split(" ");
        int m = Integer.parseInt(inputLine[0]);

        // Start finding all paths
        aMazePaths(n, m, "");
    }
}
