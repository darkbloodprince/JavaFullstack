/*Get Maze Paths
Given a grid with N rows and M columns, you must print all the possible paths from the top-left cell to the bottom-right cell.

However you can only make the following moves:

Move one cell to the right (denoted as h1)
Move two cells to the right (denoted as h2)
Move one cell down (denoted as v1)
Move two cells down (denoted as v2)
Move one cell diagonally down and right (denoted as d1)
Move two cells diagonally down and right (denoted as d2)
Return an ArrayList containing all the possible sequence of moves you can make to reach the bottom-right cell.

Note: The online judge can''t force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Input Format
The first line of input contains two space-separated integers N and M.

Output Format
Return the list of all possible paths from the top-left cell to the bottom-right cell. The driver code will print the paths in the required format.

Example 1
Input

3 3
Output

d1d1
d1h1v1
d1v1h1
d2
h1d1v1
h1h1v1v1
h1h1v2
h1v1d1
h1v1h1v1
h1v1v1h1
h1v2h1
h2v1v1
h2v2
v1d1h1
v1h1d1
v1h1h1v1
v1h1v1h1
v1h2v1
v1v1h1h1
v1v1h2
v2h1h1
v2h2
Explanation

h1h1v1v1 - Move one cell to the right, move one cell to the right, move one cell down, move one cell down. This will take you from (1,1) to (3,3).

h1h1v2 - Move one cell to the right, move one cell to the right, move two cells down. This will take you from (1,1) to (3,3).

Similarly, all the other paths will also take you from (1,1) to (3,3).

Example 2
Input

2 2
Output

d1  
h1v1
v1h1
Constraints
1 <= N <= 6

1 <= M <= 6
Approach 1
Imagine we are at (x,y). We recurse to the following cells as follows:

f(x,y) -> "h1" + f(x+1,y)
f(x,y) -> "h2" + f(x+2,y)
f(x,y) -> "v1" + f(x,y+1)
f(x,y) -> "v2" + f(x,y+2)
f(x,y) -> "d1" + f(x+1,y+1)
f(x,y) -> "d2" + f(x+2,y+2)
If at any point, we reach the destination, we add the path to the result. If we go out of bounds, we return.

Time Complexity:

O(2^(n+m)) where n and m are the dimensions of the grid.

Space Complexity:

O((n+m)) where n and m are the dimensions of the grid.

Below is the implementation of the above idea:

1. Java*/
import java.io.*;
import java.util.*;

public class GetMazePaths2 {

    // Recursive helper function to generate maze paths
    public static void gmp(int sr, int sc, int dr, int dc, ArrayList<String> ans, String asf) {
        /*
         * sr -> current row position
         * sc -> current column position
         * dr -> destination row (n-1)
         * dc -> destination column (m-1)
         * ans -> stores all valid paths found so far
         * asf -> path constructed so far ("asf" means "answer so far")
         */

        // ✅ Base Case 1: Reached the destination cell
        if (sr == dr && sc == dc) {
            ans.add(asf); // store the path string
            return;       // stop exploring further from this cell
        }

        // ✅ Base Case 2: Out of bounds (crossed grid limits)
        if (sr > dr || sc > dc) {
            return; // invalid path — stop recursion
        }

        // ---------------------------------------------------------
        // 🡒 Horizontal Moves (Right)
        // ---------------------------------------------------------

        // Move one step to the right
        gmp(sr, sc + 1, dr, dc, ans, asf + "h1");

        // Move two steps to the right
        gmp(sr, sc + 2, dr, dc, ans, asf + "h2");

        // ---------------------------------------------------------
        // 🡓 Vertical Moves (Down)
        // ---------------------------------------------------------

        // Move one step down
        gmp(sr + 1, sc, dr, dc, ans, asf + "v1");

        // Move two steps down
        gmp(sr + 2, sc, dr, dc, ans, asf + "v2");

        // ---------------------------------------------------------
        // 🡔 Diagonal Moves (Down + Right)
        // ---------------------------------------------------------

        // Move one step diagonally (down-right)
        gmp(sr + 1, sc + 1, dr, dc, ans, asf + "d1");

        // Move two steps diagonally (down-right)
        gmp(sr + 2, sc + 2, dr, dc, ans, asf + "d2");
    }

    // Wrapper function to initialize and return all paths
    public static ArrayList<String> allPossiblePaths(int n, int m) {
        /*
         * n -> number of rows
         * m -> number of columns
         * We start recursion from (0,0) to (n-1,m-1)
         */
        ArrayList<String> ans = new ArrayList<>();
        gmp(0, 0, n - 1, m - 1, ans, ""); // Start recursion
        return ans;
    }

    // Main driver code
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Read grid size (rows, columns)
        int n = input.nextInt();
        int m = input.nextInt();

        // Generate all possible paths
        ArrayList<String> result = allPossiblePaths(n, m);

        // Sort the paths alphabetically for consistent output
        Collections.sort(result);

        // Print each path in new line
        for (String str : result) {
            System.out.println(str);
        }
    }
}
