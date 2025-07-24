/*Index of the target element after sorting
You are given an array arr of length n. Your task is to print the index of the given target element after sorting the given array arr. Assume that the array contains only unique elements.

Input Format
The first line of input contains an integer n, size of the array.

The next line contains n space seperated integers denoting the elements of the array.

The next line contains the target element.

Output Format
The only line of output contains the index of the target element after sorting the array.

Example 1
Input

6
6 27 2 3 1 5
5
Output

3
Explanation

We have arr = [6 27 2 3 1 5]

After sorting arr = [1 2 3 5 6 27]

Index of 5 is 3

Example 2
Input

7
9 7 19 20 13 1 6
6
Output

1
Explanation

Sorted array = [1 6 7 9 13 19 20]

Index of 7 is 1

Constraints
1 <= n <= 10^6

0 <= arr[i] <= 10^9
Approach

One simple approach to solve this problem is to iterate through each element of the array and check if it is less than k . If it is, then we increment a counter. Finally, we return the counter value, which represents the number of elements less than k.

Here's the step-by-step breakdown of the approach:

Initialize a variable count to 0 , which will store the count of elements less than k.
Iterate through each element of the array.
For each element, check if it is less than k.
If it is, increment the count variable.
After iterating through all elements, return the count variable.
Time Complexity : The time complexity of this approach is O(n) , where n is the size of the array. This is because we iterate through each element of the array once.

Space Complexity : The space complexity is O(1) since we use only a constant amount of extra space for storing variables.

1.Java*/
import java.util.Scanner;

public class Indexofthetargetelementaftersorting {
    // Function to find the number of elements in arr less than k
    static int findIndex(int[] arr, int n, int k) {
        int ans = 0; // Initialize answer to 0
        for (int i = 0; i < n; i++) { // Loop through all elements of arr
            if (arr[i] < k) // If current element is less than k
                ans++; // Increment ans
        }
        return ans; // Return the count of elements less than k
    }

    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Input size of array
        int[] arr = new int[n]; // Declare array of size n

        // Input elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt(); // Input value of k

        // Call the function findIndex and store the result in index
        int index = findIndex(arr, n, k);

        // Output the result
        System.out.println(index);

        scanner.close(); // Close the scanner
    }
}