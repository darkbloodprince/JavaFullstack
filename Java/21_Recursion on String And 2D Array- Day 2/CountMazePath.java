/*Count Maze Path
Given two integers N and M, representing the number of rows and columns in the maze respectively, find all the paths to go from the top left cell to the bottom right cell.

Only two moves are allowed 1-step horizontal to the right and 1-step vertically down.

Complete the body of the print countMazePath function - without changing the signature to print the count of all the possible paths from top left to bottom right of the matrix.

Note The online judge can't force you to write the function recursively but that is what the spirit of the question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

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

2
Explanation

We first go right then down, which gives first path.

One other path is to go down then right which second path.

Total paths 2.

Example 2
Input

1
2
Output

1
Explanation

The only possible path is to go two steps to the right, which gives is total paths as 1.

Constraints
1 <= N <= 10

1 <= M <= 10
Hint 2
Call recursively for the horizontal step by decreasing the cols

Approach: We can simply use recursion to solve this problem. We have two option, either move horizontally or vertically. We make both the moves and call the function again with new parameters.

if m ==1 or n==1 return 1
Make recursive call countMazePath(n - 1, m) + countMazePath(n, m - 1);
Below is the Java implementation of the above idea:

1. Java*/
import java.io.*;
import java.util.*;

public class CountMazePath {

    // Recursive function to count the number of paths
    static int countMazePath(int n, int m) {
        // Base case 1:
        // If there is only one row or one column,
        // there is only one way to reach the destination.
        // (You can move only right or only down)
        if (n == 1 || m == 1)
            return 1;

        // Recursive case:
        // Total paths = paths from the cell above + paths from the cell on the left
        // We move one step down (n-1, m) OR one step right (n, m-1)
        return countMazePath(n - 1, m) + countMazePath(n, m - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Read number of rows (n) and columns (m)
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Print the total number of possible paths
        System.out.println(countMazePath(n, m));
    }
}

