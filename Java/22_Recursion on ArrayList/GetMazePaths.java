/*Get Maze Paths
You are given n and m representing the number of rows and columns in a maze. You are standing at the top-left corner and have to reach the bottom-right corner.

You can move in only two directions - 1-step horizontal (h) and 1-step vertical (v).

Return the list of all paths that can be used to move from top-left to bottom-right of the maze.

Note: Write the code recusrively. The purpose is to learn recursion and not just solve the problem.

Input Format
First line of input contains two integers n and m.

Output Format
Return the list of all paths that can be used to move from top-left to bottom-right of the maze.

Example 1
Input

3 3
Output

[hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]
Explanation

You can move to bottom-right in 6 ways.

For 1st way ->

(1,1) -> (1,2) -> (1,3) -> (2,3) -> (3,3)

Example 2
Input

2 1
Output

[v]
Explanation

You can move to bottom-right in 6 ways.

(1,1) -> (2,1)

Constraints
1 <= n <= 10

1 <= m <= 10*/
import java.io.*;
import java.util.*;

public class GetMazePaths {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // Read the size of the maze: n rows and m columns
        int n = input.nextInt();   // destination row index = n - 1
        int m = input.nextInt();   // destination column index = m - 1

        // Start from (0,0) and reach (n-1,m-1)
        ArrayList<String> paths = getMazePaths(0, 0, n - 1, m - 1);

        // Print all possible paths
        System.out.println(paths);
    }

    /**
     * Recursive function to return all paths from source (sr, sc)
     * to destination (dr, dc) in a grid maze.
     *
     * You can move only:
     * - Right  → represented by "h" (horizontal move)
     * - Down   → represented by "v" (vertical move)
     *
     * Each path is represented as a string like "hhvv" (2 right, 2 down).
     */
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        // BASE CASE:
        // If the current cell (sr, sc) == destination (dr, dc),
        // we found one valid path.
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");  // empty string means path complete
            return base;
        }

        // This will store all paths from the current position
        ArrayList<String> result = new ArrayList<>();

        // -----------------------------------------------
        // 1️⃣ Move Right (Horizontal move)
        // -----------------------------------------------
        if (sc < dc) {  // ensure we don't go out of maze boundaries
            // Recursively get all paths from the next right cell
            ArrayList<String> hPaths = getMazePaths(sr, sc + 1, dr, dc);

            // Add 'h' (for horizontal move) in front of each returned path
            for (String path : hPaths) {
                result.add("h" + path);
            }
        }

        // -----------------------------------------------
        // 2️⃣ Move Down (Vertical move)
        // -----------------------------------------------
        if (sr < dr) {  // ensure we don't go out of maze boundaries
            // Recursively get all paths from the next downward cell
            ArrayList<String> vPaths = getMazePaths(sr + 1, sc, dr, dc);

            // Add 'v' (for vertical move) in front of each returned path
            for (String path : vPaths) {
                result.add("v" + path);
            }
        }

        // Return all possible paths from (sr, sc)
        return result;
    }
}
