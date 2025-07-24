/*Pascal's Triangle II
Given an number n, print the nth row of the Pascal's triangle.

Pascal Triangle

Your task is to complete the function pascalTriangleRow which receives n as the parameter and returns the nth row of the pascal's triangle.

Input Format
There is a single line of input representing n.

Output Format
Return the nth row of the Pascal’s triangle

Example 1
Input

4
Output

1 3 3 1
Explanation

The elements in the 4rd row are 1 3 3 1.

Example 2
Input

1
Output

1
Explanation

The elements in the 1st row are 1.

Constraints
1 <= n <= 30
Approach 1:
We create a 1D array that holds our answer. We use a nested loop where the outer loop is to iterate over the rows and the inner loop is to update the 'ith' row based on the previous row.

Algorithm:

We create a 1D array triangle which is the final answer array and fill it with '0'.
Mark the first element of the array to be '1' since every row of the pascal's triangle starts with 1.
Now we run a loop using 'i' from 1 to less than numRows which on 'ith' iteration, using inner loop builds the answer for the 'ith' row.
Now we run the inner loop where 'j' runs from 'i' to greater than 0 and on each step the answer is updated as triangle[j] = triangle[j] + triangle[j-1].
Finally return triangle.
Time Complexity: O(n^2) for generating the 2D array.

Space Complexity: O(n) for storing the answer array.

Below is the implementation of the above idea:

1. Java*/

import java.util.*;  // Importing utility classes like Scanner and ArrayList

public class PascalsTriangleII {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);  // Scanner object to take input from the user
        int n = sc.nextInt();  // Read the row number 'n' for Pascal's Triangle
        ArrayList<Integer> triangle = pascalTriangleRow(n);  // Get the nth row (0-indexed logic)
        
        // Print the elements of the nth row
        for (int i = 0; i < triangle.size(); i++) {
            System.out.print(triangle.get(i) + " ");
        }
    }

    // Function to compute the nth row (0-indexed) of Pascal's Triangle
	public static ArrayList<Integer> pascalTriangleRow(int numRows) {
        // Create an array of size numRows to hold intermediate values
        Integer[] triangle = new Integer[numRows];
        
        // Initialize all values in the array to 0
        Arrays.fill(triangle, 0);
        
        // The first element in the row is always 1
        triangle[0] = 1;
        
        // Compute the row using Pascal's Triangle logic
        // Outer loop from row 1 to numRows-1
        for (int i = 1; i < numRows; i++) {
            // Inner loop goes from right to left to avoid overwriting data too early
            // We update each value based on the sum of the value above it and the one to the left
            for (int j = i; j > 0; j--) {
                triangle[j] = triangle[j] + triangle[j - 1];
            }
        }

        // Convert the final array into an ArrayList to return
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i < numRows; i++) {
            ans.add(triangle[i]);
        }

        return ans;  // Return the computed row
    }
}
