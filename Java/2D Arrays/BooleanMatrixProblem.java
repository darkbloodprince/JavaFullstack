/*Boolean Matrix Problem
You are given a matrix Mat of m rows and n columns. The matrix is boolean so the elements of the matrix can only be either 0 or 1.

Now, if any row of the matrix contains a 1, then you need to fill that whole row with 1. After doing the mentioned operation, you need to return the modified matrix.

Your task is to complete the function BooleanMatrixProblem which takes m, n and the input array as the parameter and returns the modified matrix as specified in the question.

Input Format
The first line of contains m and n denoting number of rows and number of columns respectively.

Then next m lines contain n elements each denoting the elements of the matrix.

Output Format
Return the modified matrix as specified above.

Example 1
Input

5 4
1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
Output

1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1
Explanation

rows = 5 and columns = 4

The given matrix is

1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
Evidently, the first row contains a 1 so fill the whole row with 1. The third row also contains a 1 so that row will be filled too. Finally, the last row contains a 1 and therefore it needs to be filled with 1 too.

The final matrix is

1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1
Example 2
Input

2 2
1 0 
0 1 
Output

1 1 
1 1 
Explanation

rows = 2 and columns = 2

The given matrix is

1 0 
0 1
Evidently, the first row contains a 1 so fill the whole row with 1. The second row also contains a 1 so that row will be filled too. The final matrix is

1 1 
1 1
Constraints
1 <= m, n <= 300

Mat[i][j] ∈ {0,1}

Approach 1:
Go over all the elements of the matrix, if you find any value as 1, i.e mat[i][j]=1, the iterate over the entire row again and set all values to one.

Go to the next row and repeat the same process.

Algorithm:

Iterate over the rows of the matrix.
Iterate over the columns of the matrix.
If mat[i][j]=1, then iterate over the entire row again and set all values to 1, move to next row.
Print the matrix.
Time Complexity:

O(m*(n+n)) we go over the entire matrix, and update the rows.

Space Complexity:

O(1) constant space used.

Below is the implimentation of the above approach:*/

import java.util.*; // Importing the Java utility package (includes Scanner)
public class BooleanMatrixProblem {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for input
        
        int m = sc.nextInt(); // Reading number of rows
        int n = sc.nextInt(); // Reading number of columns
        
        int nums[][] = new int[m][n]; // Declaring and initializing a 2D array
        
        // Reading matrix elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = sc.nextInt(); // Input element at (i, j)
            }
        }
        
        // Calling the BooleanMatrixProblem method with input matrix
        int[][] ans = BooleanMatrixProblem(m, n, nums);
        
        // Printing the modified matrix
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.print("\n"); // Move to next line after each row
        }
    }
    public static int[][] BooleanMatrixProblem(int m, int n, int[][] mat) {
        // Loop through each row
        for (int i = 0; i < m; i++) {
            // Loop through each column in that row
            for (int j = 0; j < n; j++) {
                // If an element is 1
                if (mat[i][j] == 1) {
                    // Set all elements in that row to 1
                    for (int k = 0; k < n; k++) {
                        mat[i][k] = 1;
                    }
                    break; // Stop checking rest of this row (since we updated it already)
                }
            }
        }
        return mat; // Return the modified matrix
    }
}
