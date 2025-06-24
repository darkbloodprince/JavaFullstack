/*Alt Matrix Sum
You are given a chessboard of size N x N, where the top left square is black. Each square contains a value. Find the sum of the values of all black squares and all white squares.

Remember that in a chessboard, black and white squares are alternate.

Input Format
The first line contains N, the size of a row of the square matrix.

The next N lines contain N space-separated integers each.

Output Format
Print two lines, the first line containing the sum of black squares and the second line containing the sum of white squares.

Example 1
Input

3
1 2 3
4 5 6
7 8 9
Output

25
20
Explanation

Black squares contain 1, 3, 5, 7, 9: sum = 25

White squares contain 2, 4, 6, 8: sum = 20

Example 2
Input

2
3 5 
7 4
Output

7
12
Explanation

Black squares contain 3, 4: sum = 7

White squares contain 5, 7: sum = 12

Constraints
1 <= N <= 1000

1 <= matrix[i][j] <= 10^5

Approach 1:
Traverse the matrix row wise. Now for each cell, simply check if the sum of row number and column number of the current cell is odd or even. If it is even then that cell is a black square else it is a white square.

Algorithm:

Traverse the matrix in a nested loop keeping 'i' as the row number and 'j' as the column number.
Keep two variables to store black square and white square sums.
Now at each cell, simply check if (i+j) is even or odd. If it is even then add the current cell value to the black square else add it to the white square.

Time Complexity:

O(N^2): as we are traversing the matrix.

Space Complexity

O(1).

Below is the implementation of the above idea:*/
import java.io.*;
import java.util.*;
public class AltMatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to read input

        int n;
        n = sc.nextInt(); // Reading the size of the matrix (n x n)

        int [][]mat = new int[n][n]; // Declaring a 2D matrix of size n x n

        // Reading the matrix elements
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                mat[i][j] = sc.nextInt(); // Taking input at (i, j)
            }
        }

        // Call to alternateMatrixSum method to calculate the black and white cell sums
        alternateMatrixSum(mat, n);  

        System.out.println('\n'); // Printing a newline character
    }
public static void alternateMatrixSum(int [][]mat, int n) {
    int blackSum = 0; // Sum of elements at black-colored positions (even index sum)
    int whiteSum = 0; // Sum of elements at white-colored positions (odd index sum)

    for(int i = 0; i < n; i++) { // Loop through each row
        for(int j = 0; j < n; j++) { // Loop through each column
            if((i + j) % 2 == 0) { // If the sum of indices is even (like a black square in chess)
                blackSum += mat[i][j]; // Add to black sum
            } else {
                whiteSum += mat[i][j]; // Otherwise, add to white sum
            }
        }
    }

    // Print both sums
    System.out.println(blackSum);
    System.out.println(whiteSum);
}

