/*Pascal's Triangle
You are given a number n, you are required to print the first n rows of the pascal triangle.

Pascal Triangle

Your task is to complete the function pascalTriangle which receives n as the parameters and returns a 2D array containing the first n rows of the pascal's triangle.

Input Format
You are given a single integer n representing the number of rows of pascal's triangle.

Output Format
Print n lines of output, where ith line represents the ith row of the triangle.

Example 1
Input

3
Output

1
1 1
1 2 1
Example 2
Input

5
Output

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
Constraints:
1<= n <= 30
Approach 1:
We start with the first row and each subsequent rows are formed with each elements being the sum of its two top elements. This approach is repeated n times to generate n rows and the final answer vector is returned.

Algorithm:

We create a 2D array ret which is the final answer array.
For each i in the row, we create a 1D array row of size current row number and fill it with 1.
Now we run loop for traversing the current row from 1 to less than i and update row[j] = ret[i-1][j-1] + ret[i-1][j].
Now push row into ret.
Finally return ret.
Time Complexity: O(n^2) for generating the 2D array.

Space Complexity: O(n^2) for storing the answer array.

Below is the implementation of the above idea:

1. Java*/
import java.util.*; // Importing utility classes like ArrayList and Scanner

public class PascalsTriangle {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);  // Creating Scanner object to take user input
        int n = sc.nextInt();                 // Reading an integer 'n' from the user

        // Calling the function to generate Pascal's Triangle with 'n' rows
        ArrayList<ArrayList<Integer>> triangle = pascalTriangle(n);

        // Looping through each row of the triangle
        for (int i = 0; i < triangle.size(); i++) {
            // Looping through each element in the current row
            for (int j = 0; j < triangle.get(i).size(); j++) {
                // Printing the current element followed by a space
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    // Function to generate Pascal's Triangle
    public static ArrayList<ArrayList<Integer>> pascalTriangle(int numRows) {
        // Declaring a 2D ArrayList to hold all rows of the triangle
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();

        // If the number of rows is 0 or negative, return an empty triangle
        if (numRows <= 0) {
            return triangle;
        }

        // Loop through each row index from 0 to numRows-1
        for (int i = 0; i < numRows; i++) {
            // Create a new list to hold the current row's values
            ArrayList<Integer> row = new ArrayList<Integer>();

            // Loop through each element in the current row
            for (int j = 0; j < i + 1; j++) {
                // First and last elements of each row are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Each inner element is the sum of the two elements above it
                    // triangle.get(i-1).get(j-1) -> element to the top-left
                    // triangle.get(i-1).get(j)   -> element to the top-right
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }

            // Add the completed row to the triangle
            triangle.add(row);
        }

        // Return the complete Pascal's Triangle
        return triangle;
    }
}
