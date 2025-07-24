/*AS Sorting 1
Write a program to sort a given matrix mat[][] of dimensions N*M (row and column) in column wise order.

Your task is to sort each column of a matrix in ascending order and finally print the updated matrix/2D Array.

Input Format
First line contains integer N and M denoting the rows and columns of matrix mat[][]

Each of the next N lines contains M integers denoting the matrix elements

Output Format
Print the matrix after sorting column wise

Example 1
Input

3 5
9 7 8 11 21
1 4 3 7 2
4 3 14 9 12
Output

1 3 3 7 2  
4 4 8 9 12 
9 7 14 11 21
Explanation

The matrix is sorted column wise

Example 2
Input

5 9
9 14 62 23 25 25 41 33 95
78 7 30 97 51 35 41 42 92
79 32 45 30 62 92 87 8 19
52 100 36 11 57 85 73 91 54
90 94 98 21 12 79 80 78 72
Output

9 7 30 11 12 25 41 8 19 
52 14 36 21 25 35 41 33 54 
78 32 45 23 51 79 73 42 72 
79 94 62 30 57 85 80 78 92 
90 100 98 97 62 92 87 91 95 
Constraints
1 <= N <= 20
1 <= M <= 20
-10^6<=mat[i][j]<=10^6
Approach
To solve the question we first transpose the matrix, sort it row wise and transpose it again to get matrix sorted column wise

The approach is as follows: Traverse the matrix

Find the transpose of the given matrix mat[][].
Store this transpose of mat[][] in a 2D vector, tr[][]
Traverse the rows of the matrix tr[][]
Sort each row of the matrix using the sort function.
Store the transpose of tr[][] in mat[][]
Print the matrix, mat[][]
Time Complexity: O(nmlog(m))
Space Complexity: O(n*m)

Below is the implimentation of above Approach:

1. Java:*/
import java.util.*;

// Solution class contains helper methods for matrix operations
class Solution {

    // Method to transpose a matrix (rows become columns and vice versa)
    public static int[][] transpose(int[][] mat, int row, int col) {
        int[][] tr = new int[col][row];  // Create transposed matrix of size [col][row]
     
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                tr[j][i] = mat[i][j];  // Assign element from [i][j] to [j][i]
            }
        }
        return tr;
    }

    // Method to sort each row of a 2D array
    public static void RowWiseSort(int[][] B) {
        for (int i = 0; i < B.length; i++) {
            Arrays.sort(B[i]);  // Use built-in sort to sort each row
        }
    }

    // Method to sort each column of the matrix
    public static void sortCol(int[][] mat, int N, int M) {
        // Step 1: Transpose the matrix, so columns become rows
        int[][] B = transpose(mat, N, M);

        // Step 2: Sort each row (which was originally a column)
        RowWiseSort(B);

        // Step 3: Transpose back to original orientation
        mat = transpose(B, M, N);

        // Step 4: Print the sorted matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class ASSorting1 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in); 
        
        int n = sc.nextInt();  // Read number of rows
        int m = sc.nextInt();  // Read number of columns
        
        int[][] mat = new int[n][m];  // Create 2D array (matrix)
        
        // Input matrix elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Call method to sort matrix column-wise
        Solution.sortCol(mat, n, m);
    }
}
