/*Toeplitz Matrix
Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.

A matrix is Toeplitz if every diagonal from left to right has the same elements.

Input Format
First line contains two integers, m and n which define the row and column size of the matrix respectively.

Next each of 'm' lines contain 'n' space separated integers that denote the matrix elements.

Output Format
Return true if a matrix is Toeplitz Matrix, else return false.

Example 1
Input

3 4
1 2 3 4
5 1 2 3
9 5 1 4
Output

false
Explanation

Every diagonal from left to right doesn't have the same value. (2,2,4) diagonal is where it becomes false.

Example 2
Input

2 3
3 7 3 
5 3 7 

Output

true
Explanation

Diagonals are [5], [3], [3,3] and [7,7]. As the all values in each diagonal from left to right are equal, it is a toeplitz matrix.

Constraints
m == matrix.length

n == matrix[i].length

1 <= m, n <= 20

0 <= matrix[i][j] <= 99
Approach 1:

Check if one element matches the next element in the same diagonal. That is, matching mat[i][j] with mat[i+1][j+1] for all the elements of the matrix.

Algorithm:

Scan each row and each column.
For each row i and column j, check if the matrix[i][j] is equal to matrix[i+1][j+1]
If they are unequal, return false.
Repeat steps 2-3 for all the elements of the matrix.
Return true.
Time Complexity : O(m*n) as we are traversing the matrix once. Space Complexity : O(1) since we are not using any new space to store anything.

1. Java*/
import java.io.*;
import java.util.*;

// Solution class containing the logic to check if the matrix is Toeplitz
class Solution {

    // Method to check if the given matrix is a Toeplitz matrix
    public boolean isToeplitzMatrix(int[][] matrix, int m , int n) {
        // Loop through each element of the matrix
        for(int i = 0; i < m; i++) { 
            for(int j = 0; j < n; j++) { 
                // Check if we are not at the last row or last column
                // and compare the current element with the one diagonally down-right
                if((i + 1) < m && (j + 1) < n && matrix[i][j] != matrix[i + 1][j + 1]) { 
                    // If any diagonal pair doesn't match, it's not a Toeplitz matrix
                    return false; 
                } 
            } 
        }  
        // If all diagonals matched, return true
        return true;
    }
}

public class ToeplitzMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read matrix dimensions
        int m, n;
        m = sc.nextInt(); // number of rows
        n = sc.nextInt(); // number of columns

        // Declare and populate the matrix
        int[][] A = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt(); // input each element of the matrix
            }
        }

        // Create an object of the Solution class
        Solution Obj = new Solution();

        // Call the method to check if the matrix is Toeplitz
        boolean ans = Obj.isToeplitzMatrix(A, m, n);

        // Print the result
        System.out.println(ans);
    }
}
