/*Find sum of all the elements of 2-D array
You are given a 2D array A of order N * M.

Your task is to find out the sum of elements of the 2D array.

Input Format
The first line of input contains two space-separated integers N and M.

The next N lines contain M space-separated integers.

Output Format
For each test case return an integer.

Example 1
Input

2 2
1 2
3 4
Output

10
Explanation

1 + 2 + 3 + 4 = 10. Thus answer is 10.
Example 2
Input

2 3
1 2 3
4 5 6
Output

21
Explanation

1 + 2 + 3 + 4 + 5 + 6 = 21. Thus answer is 21.
Constraints
0 <= N <= 10^3

0 <= M <= 10^3

1 <= A[i][j] <= 10^3

Approach: The sum of each element of the 2D array can be calculated by traversing through the matrix and adding up the elements into a variable sum initialized as zero.

Time Complexity: O(N * M) We iterate over the 2D array once which would take O(N * M) time.

Space Complexity: O(1) We don't create any extra space therefore O(1) time.

Below is the implementation of the above idea:*/

import java.util.*;

class Main {

    // Function to calculate the sum of all elements in a 2D array
    static int findSum(int[][] arr, int n, int m) {
        int ans = 0; // Variable to store the sum

        // Traverse through each row
        for (int i = 0; i < n; i++) {
            // Traverse through each column in the current row
            for (int j = 0; j < m; j++) {
                ans += arr[i][j]; // Add current element to sum
            }
        }
        return ans; // Return the final sum
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of rows and columns
        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // columns

        // Declare and initialize 2D array
        int[][] A = new int[n][m];

        // Input elements of the 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Call function to compute the sum of elements
        int ans = findSum(A, n, m);

        // Print the result
        System.out.println(ans);

        sc.close(); // Close the scanner
    }
}

/*Time: O(n × m)
Space: O(n × m)*/