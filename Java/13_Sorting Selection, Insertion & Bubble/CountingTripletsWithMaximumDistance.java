/*Counting Triplets With Maximum Distance
You are given two integers, N and X. You have to find X raised to the power N using recursion. Implement the function using the Exponentiation by Squaring method to solve this problem in O(log N) time complexity.

Input Format
The first line contains integer N denoting the number of points

The second line contains N integers denoting the points

The third line contains L denoting the maximum distance possible

Output Format
Print the count of the total ways of selecting three points

Example 1
Input

4
2 1 3 4
3
Output

4
Explanation

{1, 2, 3} Here distance between farthest points = 3 – 1 = 2 <= L

{1, 2, 4} Here distance between farthest points = 4 – 1 = 3 <= L

{1, 3, 4} Here distance between farthest points = 4 – 1 = 3 <= L

{2, 3, 4} Here distance between farthest points = 4 – 2 = 2 <= L

Example 2
Input

4
2 1 3 4
2
Output

2
Explanation

{1, 2, 3} Here distance between farthest points = 3 – 1 = 2 <= L

{2, 3, 4} Here distance between farthest points = 4 – 2 = 2 <= L

Constraints
1 <= N <= 100

0 <= points <= 1000

1 <= L <= 500
Approach
Sort the array. Run three nested loops and check for each triplet present in the array. If the maximum distance in the triplet is less than l, increment your answer.

Algorithm:

Sort the array.
Run three nested loops.
Check for each triplet. If a triplet satisfies the condition, include it in the answer.
Time complexity: O(n^3) Space complexity: O(1)

Below is the implementation of the above idea:

1. Java*/
import java.util.*;   // For Arrays and other utility classes
import java.io.*;     // For BufferedReader and InputStreamReader

public class CountingTripletsWithMaximumDistance {

    // Function to count valid triplets
    static int sorting4(int n, int[] arr, int l){
        Arrays.sort(arr);   // Sort the array to make comparison easier

        int ans = 0;

        // Iterate through all triplets (i, j, k) with i < j < k
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Check if the difference between max and min is within the limit
                    if (arr[k] - arr[i] <= l)
                    {
                        ans++;  // Valid triplet found
                    }
                }
            }
        }
        return ans;  // Return the count of valid triplets
    }

    public static void main(String[] args) throws Exception {
        // For fast input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine;

        // Read first line: number of elements in array
        inputLine = br.readLine().trim().split(" ");
        int n = Integer.parseInt(inputLine[0]);

        // Read array elements
        int[] arr = new int[n];
        inputLine = br.readLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputLine[i]);
        }

        // Read the value of 'l'
        inputLine = br.readLine().trim().split(" ");
        int l = Integer.parseInt(inputLine[0]);

        // Call the function and print the result
        int ans = sorting4(n, arr, l);
        System.out.println(ans);
    }
}
