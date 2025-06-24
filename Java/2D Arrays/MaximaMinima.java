/*Maxima Minima
Given an n*n matrix mat find an element such that it is the smallest in a row and largest in a column, if such an element does not exist return -1.

Input Format
First line contains the values n.

Next n lines contain n spaced integers.

Output Format
Return the element that is smallest in a row and largest in a column if not found return -1.

Example 1
Input

2
1 3
6 5
Output

5
Explanation

Row 2 contains minimum element 5 that is largest in the 2nd column.

Example 2
Input

3
1 2 3
4 5 6
7 8 9
Output

7
Explanation

Here the minimum value is 7 in the third row and the largest value in the 1st column.

Constraints
1 <= n <= 10^3

1 <= mat[i][j] <=10^5

Approach 1:

Traverse all rows one by one and do the following for every row i.

Find the minimum element of the current row and store the column index of the minimum element.
Check if the row minimum element is also maximum in its column. We use the stored column index here.
If yes, then saddle point else continues till the end of the matrix.
Time Complexity: O(n*n) as within the first for loop we loop n times but separately Space Complexity: O(1) no extra space used.

Below is the implementation of the above idea:*/
import java.util.*; // Importing the utility package for Scanner
public class MaximaMinima {
    public static int maximaMinima(int[][] mat) {
        int n = mat.length; // Get matrix size (since it's n x n)
        for (int i = 0; i < n; i++) {
            int min_row = mat[i][0], col_ind = 0; // Start by assuming first element is row-min

            // Find the minimum in the current row
            for (int j = 1; j < n; j++) {
                if (min_row > mat[i][j]) {
                    min_row = mat[i][j]; // Update minimum
                    col_ind = j;         // Save column index of the minimum
                }
            }
            int k;
            // Check if min_row is the maximum in its column
            for (k = 0; k < n; k++) {
                if (min_row < mat[k][col_ind]) {
                    break; // Not a saddle point if any element in the column is larger
                }
            }
            if (k == n) {
                return min_row; // If loop completed, min_row is also column max → saddle point
            }
        }
        return -1; // No saddle point found in the matrix
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Reading the size of the matrix (n x n)

        int[][] matrix = new int[n][n]; // Declaring a square matrix
        // Reading matrix elements
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        int result = maximaMinima(matrix); // Call the function to find saddle point
        System.out.println(result); // Print the result

        sc.close(); // Close the scanner
    }
}