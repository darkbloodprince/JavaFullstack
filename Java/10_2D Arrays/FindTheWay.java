/*Find The Way
You are given a binary matrix of dimensions m*n. A mouse enters the matrix at cell (0,0) in left to right direction.

He goes in the same direction if he encounters a 0 and he takes a right turn when he encounters a 1, and changes that specific 1 to 0. Otherwise he may get stuck in a cycle!

You have to find the co-ordinates from where this mouse will exit the matrix.

Input Format
First line contains the values m and n.

Next m lines contain n spaced integers.

Output Format
Return the co-ordinates from where this mouse will exit the matrix separated by space.

Example 1
Input

1 2
0 0
Output

0 1
Explanation

The mouse will enter at (0,0) and keep going ahead and come out of (0,1).

Example 2
Input

3 3
0 1 0
0 1 0
1 0 1
Output

1 0
Explanation

We enter the matrix at (0,0) we move to (0,1) and encounter a 1 so we change it to 0 and move right to (1,1), we again encounter 1 and turn right.

Then we leave the matrix from (1,0). Thus the output is 1 0.

Constraints
1 <= m,n <= 100

matrix[i][j] is 0, 1

Approach 1:

Simulate the question by keeping track of which direction the mouse is moving and change it's direction accordingly when you encounter a 1.

We can use the East, South, West & North as numbers and represent the direction. Store the previous indices and keep repating this util your indices move out of bounds.

Algorithm:

Keep a direction variable to indicate the current direction the mouse is moving.
We have used the mapping of E->0, S->1, W->2, N->3.
While the indices are in the bounds of the matrix we perform the following steps 4-6 repeatedly.
If the element is 1 then change it to 0 and then we check the direction. If it's 0 i.e. East we change it to 1 i.e. South and so on.
We store the previous indices in an answer variable.
Calculate the new indices which depends on the direction we got from step 4.
Return the answer when you move out of bounds
Time Complexity: O(m*n) as we may have to go through the entire matrix.A Space Complexity: O(1)*/
import java.util.*;

public class FindTheWay {

    // Function to find the exit point in the matrix
    public static int[] findTheWay(int[][] matrix) {
        int m = matrix.length;      // Number of rows
        int n = matrix[0].length;   // Number of columns

        // Direction array representing movement:
        // 0 -> east (right), 1 -> south (down), 2 -> west (left), 3 -> north (up)
        int arr[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

        int i = 0, j = 0;  // Starting at the top-left corner (0, 0)
        int dir = 0;       // Initial direction is east (right)
        int ans[] = new int[2];  // Array to store the last valid position

        // Keep moving until the indices go out of matrix boundaries
        while (i < m && j < n && i >= 0 && j >= 0) {

            // If the current cell has 1, change direction clockwise
            if (matrix[i][j] == 1) {
                matrix[i][j] = 0;  // Set current cell to 0 after visiting

                // Change direction clockwise
                if (dir == 0) {       // East -> South
                    dir = 1;
                } else if (dir == 1) { // South -> West
                    dir = 2;
                } else if (dir == 2) { // West -> North
                    dir = 3;
                } else {               // North -> East
                    dir = 0;
                }
            }

            // Save the current position as the last valid position
            ans[0] = i;
            ans[1] = j;

            // Move to the next cell in the current direction
            i += arr[dir][0];  // Change row index
            j += arr[dir][1];  // Change column index
        }

        // Return the last valid position before going out of the matrix
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows (m) and columns (n)
        int m = sc.nextInt();
        int n = sc.nextInt();

        // Input the matrix
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Call the function to compute the exit point
        int result[] = findTheWay(matrix);

        // Output the result (exit point's row and column)
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

