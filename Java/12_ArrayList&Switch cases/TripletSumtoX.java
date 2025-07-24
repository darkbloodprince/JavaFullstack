/*Triplet Sum to X
You have been given a non-decreasing integer ArrayList(arr) and a number X. Find and return the number of distinct triplets in the ArrayList which sum to X.

Note

Given ArrayList is sorted and can contain duplicate elements.

Input format
The first line contains an Integer t which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains an integer N representing the size of the first ArrayList.

The second line contains N single space-separated integers representing the elements in the ArrayList.

The third line contains an integer X.

Output format
For each test case, print the total number of distinct triplets present in the array/list.

Output for every test case will be printed in a separate line.

Example 1
Input

1
7
1 2 3 4 5 6 7 
12
Output

5
Explanation

Triplets are (1,4,7), (1,5,6), (2,3,7), (2,4,6), (3,4,5).

Example 2
Input

1
7
1 2 3 4 5 6 7 
19
Output

0
Explanation

Since there doesn''t exist any triplet with sum equal to 19 for the first query, we print 0.

Constraints
1 <= t <= 50

1 <= N <= 10^3

-10^6 <= arr[i] <= 10^6

-10^9 <= X <= 10^9
Approach 1
The algorithm can be summarized as -

Sort the input array arr.
Initialize two pointers j and k to the next element of i and the last element of arr, respectively.
Initialize an unordered set uniqTriplets to store unique triplets, and a vector triplets to store the triplets.
Start a loop (i) over the elements of arr.
Within the outer loop, start another loop with two pointers j and k.
Within the inner loop, check if the sum of the elements pointed by i, j, and k is equal to X.
If the sum is equal, add the triplet to the triplets vector and uniqTriplets set.
If the sum is less than X, increment j, and if the sum is more than X, decrement k.
End the inner loop when j is greater than or equal to k.
End the outer loop after all elements of arr have been processed.
Return the size of the triplets vector as the result.
Time Complexity: O(n*n)

Space Complexity: O(n)

Below is the implementation of the above idea:

1. Java*/
import java.io.*;
import java.util.*;

public class TripletSumtoX {
    
    // Function to find unique triplets that sum to X
    public static int triplets(int[] arr, int X) {
        Arrays.sort(arr);  // Sort the array to apply two-pointer technique

        List<List<Integer>> pair = new ArrayList<>();  // Stores all unique triplets
        TreeSet<String> set = new TreeSet<>();         // Used to prevent duplicate triplets
        List<Integer> triplets = new ArrayList<>();    // Temporary list to hold each triplet

        // Loop over each element as the fixed first element in the triplet
        for (int i = 0; i < arr.length - 2; i++) {

            int j = i + 1;               // Left pointer
            int k = arr.length - 1;     // Right pointer

            // Use two-pointer approach to find matching pairs
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum == X) {
                    // Convert triplet to string format for uniqueness
                    String str = arr[i] + ":" + arr[j] + ":" + arr[k];

                    // If this triplet is not already seen
                    if (!set.contains(str)) {
                        // Add triplet to list
                        triplets.add(arr[i]);
                        triplets.add(arr[j]);
                        triplets.add(arr[k]);

                        pair.add(triplets);         // Add the triplet to the result list
                        triplets = new ArrayList<>(); // Reset triplet list
                        set.add(str);               // Mark triplet as seen
                    }

                    j++;  // Move both pointers inward
                    k--;
                } else if (sum < X) {
                    j++;  // If sum is too small, move left pointer to the right
                } else {
                    k--;  // If sum is too big, move right pointer to the left
                }
            }
        }

        return pair.size();  // Return number of unique triplets found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases

        while (t > 0) {
            int n = sc.nextInt();  // Size of array
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();  // Read array elements

            int X = sc.nextInt();       // Target sum

            int result = triplets(arr, X);  // Find number of unique triplets
            System.out.println(result);     // Print the result
            t--;
        }

        sc.close();
    }
}
