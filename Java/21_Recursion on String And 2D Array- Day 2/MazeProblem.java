/*Maze Problem
You are given two numbers n and m representing number of rows and columns in a maze.

You are standing in the top-left corner and have to reach the bottom-right corner.

In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..).

Your task is to print the list of all paths that can be used to move from top-left to bottom-right.

Note

You need to write a recursive solution to the problem.

You only need to complete the given function. The function parameters consist of the starting row and column, destination row and column and an empty string.

Use example to take idea about output.

Input Format
The first line conatins an integer n.

The second line conatins an integer m.

Output Format
Print in a new line the list of all paths that can be used to move from top-left to bottom-right.

Example 1
Input

2
2
Output

h1v1
v1h1
d1
Explanation

All paths from top left cell to bottom right cell are printed.

Example 2
Input

3
3
Output

h1h1v1v1
h1h1v2
h1v1h1v1
h1v1v1h1
h1v1d1
h1v2h1
h1d1v1
h2v1v1
h2v2
v1h1h1v1
v1h1v1h1
v1h1d1
v1h2v1
v1v1h1h1
v1v1h2
v1d1h1
v2h1h1
v2h2
d1h1v1
d1v1h1
d1d1
d2
Explanation

All paths from top left cell to bottom right cell are printed.

Constraints
1 ≤ N ≤ 5

1 ≤ M ≤ 5
Hint 1
Recursive traverse through all paths in the given matrix.

Approach:
The easiest way to solve the given problem is to recursively traverse through all the paths. We can write for loops seperately for traversing horizontally, vertically and diagonally. Inside each loop we can call the function recursively considering movement in a particular direction. In the solution we have called the function first for the horizontal direction then the vertical direction and finally the diagonal direction.

Time Complexity

O(3^(N+M))

Space Complexity

O(1)

Below is the implementation of above idea:

1. Java*/
import java.io.*;
import java.util.*;

public class MazeProblem {

    // Recursive function to print all possible paths from (sr, sc) to (dr, dc)
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        // Base case 1: If we move out of the maze boundaries → stop
        if (sr > dr || sc > dc) {
            return;
        }

        // Base case 2: If we reach the destination cell → print the path
        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }

        // ────────────────────────────────
        // 1️⃣ Horizontal moves (right)
        // ────────────────────────────────
        // Try all possible horizontal jumps from current column
        for (int move = 1; move <= dc - sc; move++) {
            // move horizontally by 'move' steps → sc + move
            // add "h" + move to the path string
            printMazePaths(sr, sc + move, dr, dc, psf + "h" + move);
        }

        // ────────────────────────────────
        // 2️⃣ Vertical moves (down)
        // ────────────────────────────────
        // Try all possible vertical jumps from current row
        for (int move = 1; move <= dr - sr; move++) {
            // move vertically by 'move' steps → sr + move
            // add "v" + move to the path string
            printMazePaths(sr + move, sc, dr, dc, psf + "v" + move);
        }

        // ────────────────────────────────
        // 3️⃣ Diagonal moves (down-right)
        // ────────────────────────────────
        // Try all possible diagonal jumps (same number of steps down and right)
        for (int move = 1; move <= dc - sc && move <= dr - sr; move++) {
            // move diagonally by 'move' steps → (sr + move, sc + move)
            // add "d" + move to the path string
            printMazePaths(sr + move, sc + move, dr, dc, psf + "d" + move);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input number of rows
        int n = Integer.parseInt(br.readLine());
        // Input number of columns
        int m = Integer.parseInt(br.readLine());

        // Start recursion from top-left corner (0,0) to bottom-right (n-1, m-1)
        printMazePaths(0, 0, n - 1, m - 1, "");
    }
}
