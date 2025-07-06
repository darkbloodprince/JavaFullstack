/*Spiral Matrix 2
You are given a matrix with N rows and M columns. You have to start iterating downwards on the first column and then continue spirally. Print an array containing the spiral of the matrix in the said manner.

NOTE: You need to complete the given function. The input and printing of output will be handled by the driver code.

Input Format:
The first line contains t: the number of test cases.

For each test case: The first line contains N and M.

The next N lines contain M integers each representing the elements of the matrix.

Output Format:
Print an array containing the spiral of the matrix in the said manner.

Example 1:
Input:

1
3 3
1 4 7
2 5 8
3 6 9
Output:

1 2 3 6 9 8 7 4 5
Explanation:

We iterate spirally and print each element.

Example 2:
Input:

1
3 3
1 2 3
4 5 6
7 8 9
Output:

1 4 7 8 9 6 3 2 5
Explanation:

We iterate spirally and print each element.

Constraints:
1 <= T <= 10

1 <= N,M <= 200

0 <= A[i] <=1000000
Approach:
The problem can be solved by dividing the matrix into loops or squares or boundaries. It can be seen that the elements of the outer loop are printed first in a anti-clockwise manner then the elements of the inner loop are printed.

Algorithm:

Printing the elements of a loop can be solved using four loops that print all the elements.
Every for loop defines a single-direction movement along with the matrix.
The first for loop represents the movement from top to bottom, whereas the second crawl represents the movement from left to right, the third represents the movement from the bottom to top, and the fourth represents the movement from right to left.
Time Complexity

O(N x M) i.e. N rows * M column

Space Complexity

O(N x M) ans array has N*M elements

1. Java*/
class Solution {
    public Vector<Integer> spiralMatrix2(Vector<Vector<Integer>> arr, int n, int m) {
        // Define boundaries of the matrix
        int row1 = 0;        // Top row index
        int row2 = n - 1;    // Bottom row index
        int col1 = 0;        // Left column index
        int col2 = m - 1;    // Right column index

        int cnt = 0;         // Count of elements added to the result
        Vector<Integer> ans = new Vector<>(n * m);  // To store spiral order
                while (cnt < n * m) {
                                for (int i = row1; i <= row2; i++) {
                if (cnt < n * m) {
                    ans.add(arr.get(i).get(col1));  // Add element to result
                    cnt++;  // Increment count
                }
            }
            col1++;  // Move right to the next column
                        for (int i = row1; i <= row2; i++) {
                if (cnt < n * m) {
                    ans.add(arr.get(i).get(col1));  // Add element to result
                    cnt++;  // Increment count
                }
            }
            col1++;  // Move right to the next column
                        for (int i = col1; i <= col2; i++) {
                if (cnt < n * m) {
                    ans.add(arr.get(row2).get(i));
                    cnt++;
                }
            }
            row2--;  // Move up to the next row
                        for (int i = row2; i >= row1; i--) {
                if (cnt < n * m) {
                    ans.add(arr.get(i).get(col2));
                    cnt++;
                }
            }
            col2--;  // Move left to the previous column
                        for (int i = col2; i >= col1; i--) {
                if (cnt < n * m) {
                    ans.add(arr.get(row1).get(i));
                    cnt++;
                }
            }
            row1++;  // Move down to the next row
        }
                return ans;
    }
}
public class SpiralMatrix2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Input reader
        int t = sc.nextInt();                 // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();             // Rows
            int m = sc.nextInt();             // Columns

            // Reading the matrix into a Vector of Vectors
            Vector<Vector<Integer>> matrix = new Vector<>(n);
            for (int i = 0; i < n; i++) {
                Vector<Integer> row = new Vector<>(m);
                for (int j = 0; j < m; j++) {
                    row.add(sc.nextInt());    // Read and add each element
                }
                matrix.add(row);              // Add the full row
            }

            // Create object and get spiral traversal result
            Solution ob = new Solution();
            Vector<Integer> result = ob.spiralMatrix2(matrix, n, m);

            // Print the result
            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i) + " ");
            }
            System.out.println();  // Move to next line after each test case
        }
    }
}
