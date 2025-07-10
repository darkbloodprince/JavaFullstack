/*Diagonal Traversal of a Matrix
Give a N * N square matrix, return all the elements of its diagonals from top to bottom.

Input Format
First line contains N, representing the order of the 2D matrix.

Next N lines contains N spaced elements each representing matrix elements.

Output Format
Output in a sigle line, the Diagonal traversal of the matrix.

The traversal should start from the top right of the matrix in bottom right direction and should continue upto bottom left.

Example 1
Input

2
1 2
3 4
Output

2 1 4 3
Explanation:

Topmost diagonal is [[2]]

Next diagonal is [[1, 4]]

and the last diagonal is [[3]]

Example 2
Input

3
1 2 3
4 5 6
7 8 9
Output

3 2 6 1 5 9 4 8 7
EXPLANATION

Topmost diagonal is [[3]]

Next diagonal is [[2, 6]]

Next diagonal is [[1, 5, 9]]

Next diagonal is [[4, 8]]

and the last-diagonal is [[7]]

CONSTRAINTS:
1 <= N <= 500

-10000 <= Mat[i][j] <= 10000
Approach :
The problem requires us to perform a diagonal traversal of a given square matrix. We need to print the elements of the matrix in a specific order, starting from the top-right corner and moving towards the bottom-left corner, along the anti-diagonals.

To solve the problem, we can use two nested loops to traverse the matrix diagonally. We will start from the top-right corner of the matrix and move diagonally down towards the bottom-left corner. In each iteration, we will add the element to the result ArrayList. The first loop will handle the topmost anti-diagonal, and the second loop will take care of the remaining anti-diagonals.

Algorithm
Create an empty ArrayList called res to store the diagonal traversal result.
For the topmost anti-diagonal:
Initialize row to 0 and col to n-1.
Loop until row is less than n and col is less than n:
Add the element mat[row][col] to the res ArrayList.
Increment both row and 'col`.
For the remaining anti-diagonals below the topmost one:
Start with row at 1 (as the first element of the first anti-diagonal has already been added) and col at 0.
Loop until row is less than n and col is less than n:
Add the element mat[row][col] to the res ArrayList.
Increment both row and col.
Return the res ArrayList containing the diagonal traversal result.
Time Complexity

Time Complexity: The two nested loops traverse all elements of the n x n matrix once, so the time complexity is O(n^2).

Space Complexity

The space complexity is O(n) to store the result ArrayList res.

Below is the implementation of the above idea:

1. Java*/
import java.util.ArrayList;
import java.util.Scanner;

public class DiagonalTraversalofaMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input
        int n = sc.nextInt(); // Read the size of the matrix (N x N)

        int[][] mat = new int[n][n]; // Create a 2D array of size n x n
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt(); // Fill the matrix with user input
        }
        sc.close(); // Close the scanner

        // Get diagonal traversal result
        ArrayList<Integer> res = diagonalTraversal(mat, n);

        // Print the result
        for (Integer x : res)
            System.out.print(x + " ");
    }

    public static ArrayList<Integer> diagonalTraversal(int[][] mat, int n) {
        ArrayList<Integer> res = new ArrayList<>();

        // First half: Start diagonals from the top row (right to left)
        // i goes from (n-1) to 0, representing columns of the top row
        for (int i = n - 1; i >= 0; i--) {
            int row = 0, col = i; // Start at top row and current column
            // Traverse diagonally down to the right (↘️)
            while (row < n && col < n) {
                res.add(mat[row][col]);
                row++;
                col++;
            }
        }

        // Second half: Start diagonals from the last column (top to bottom), skipping top-right corner
        // i goes from 1 to n-1, representing rows of the last column
        for (int i = 1; i < n; i++) {
            int row = i, col = 0; // Start at current row and first column
            // Traverse diagonally down to the right (↘️)
            while (row < n && col < n) {
                res.add(mat[row][col]);
                row++;
                col++;
            }
        }

        return res; // Return the final diagonal traversal list
    }
}
