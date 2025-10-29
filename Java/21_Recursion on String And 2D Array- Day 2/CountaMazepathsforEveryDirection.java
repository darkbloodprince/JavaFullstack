/*Count aMaze paths for Every Direction
Given two integers N and M, representing the number of rows and columns in the maze respectively, find all the paths to go from the top left cell to the bottom right cell.

All moves are allowed, i.e. a valid path can consist of steps that are horizontal, vertical or diagonal in any direction, except no cell should be repeated twice in the same path.

Complete the body of the print aMazePaths function - without changing the signature - to print the list of all paths that can be used to move from top-left to bottom-right. String psf is initially empty. i and j are two variables with an initial value equal to 1.

Note The online judge can't force you to write the function recursively but that is what the spirit of the question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Input Format
The first line contains two integers value of N and M.

Output Format
Print total number of possible paths.

Example 1
Input

2 2
Output

5
Explanation

There are only 5 ways to go from 1,1 to 2,2.

right down
right left-down right
down right
right-down
down right-up down
Example 2
Input

1 2
Output

1
Explanation

There is only 1 possible direction.

Constraints
1 <= N <= 9

1 <= M <= 9 Hint 2
You need to call recursive function in every direction

Approach 1:
We write simple recursive code such that we move in each possible direction, when we reach the target, we increase the value by 1. In order for the paths to be unique, we maintain a visited array that allows us to not visit the same cell again.

Algorithm:

Declare a visited array of size of m*n and initalise it with value 0. Also initalise a variable count to count total number of path outside the function.

Declare a helper function that takes current cell coordinates, final cell coordinates, visted array as agruments.

If current cell coordinates is out of bound, return, if the cell has already been visited, return, if the cell is target cell, increase the count of 1.

Else, mark the current cell as visited, and call the helper function recursively in all 8 directions (2 vertical, 2 horizontal and 4 diagonal). This will find all possible paths.

At the end, unmark the visited cell.

Return the final count as answer.

Time Complexity: O(8^(nm)) since we all calling 8 recursive function each time for nm times.

Space Complexity: O(n*m) for visited array.

Code:

1. Java*/
import java.util.*;

public class CountaMazepathsforEveryDirection {
    // Global counter to track total number of paths from (1,1) to (n,m)
    static int count = 0;

    // Recursive helper function to explore all possible paths
    static void countAllPathHelper(int x, int y, int n, int m, int[][] visited) {
        
        // 🔒 Base Case 1: Out of boundary check
        // If (x, y) goes outside the grid — return immediately
        if (x > n || y > m || x < 1 || y < 1)
            return;

        // 🔒 Base Case 2: If current cell is already visited, skip to prevent infinite loops
        if (visited[x][y] == 1)
            return;

        // 🏁 Base Case 3: Reached destination cell (n, m)
        // Increase count and return
        if (x == n && y == m) {
            count++;
            return;
        }

        // Mark current cell as visited
        visited[x][y] = 1;

        // 🚶 Explore all 8 possible directions from current cell:
        // Horizontal moves
        countAllPathHelper(x + 1, y, n, m, visited); // move right
        countAllPathHelper(x - 1, y, n, m, visited); // move left

        // Vertical moves
        countAllPathHelper(x, y + 1, n, m, visited); // move down
        countAllPathHelper(x, y - 1, n, m, visited); // move up

        // Diagonal moves
        countAllPathHelper(x + 1, y + 1, n, m, visited); // move bottom-right
        countAllPathHelper(x + 1, y - 1, n, m, visited); // move bottom-left
        countAllPathHelper(x - 1, y + 1, n, m, visited); // move top-right
        countAllPathHelper(x - 1, y - 1, n, m, visited); // move top-left

        // 🔁 Backtrack:
        // Unmark current cell before returning, so it can be used in other paths
        visited[x][y] = 0;

        return;
    }

    // Function to initialize visited array and start recursion
    static int countAllPath(int n, int m) {
        // Create a visited matrix (1-based index)
        int[][] visited = new int[n + 1][m + 1];

        // Initialize all cells as unvisited (0)
        for (int i = 0; i <= n; i++)
            for (int j = 0; j <= m; j++)
                visited[i][j] = 0;

        // Start exploring from the top-left corner (1,1)
        countAllPathHelper(1, 1, n, m, visited);

        // Return total number of unique paths found
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input: grid size n x m
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Output: number of all possible paths
        System.out.println(countAllPath(n, m));
    }
}
