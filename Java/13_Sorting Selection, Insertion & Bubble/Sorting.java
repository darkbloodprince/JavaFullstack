/*0-1 Sorting
You are given an array arr of length n containing only 0's and 1's. Your task is to segregate all the 0's to the left of the array and all the 1's to the right of the array.

Input Format
The first line of input contains an integer n, size of the array.

The next line contains n space seperated integers(0 or 1) denoting the elements of the array.

Output Format
Print n space seperated integers denoting the segregated array.

Example 1
Input

15
0 0 0 1 1 1 1 0 1 1 0 0 1 0 1
Output

0 0 0 0 0 0 0 1 1 1 1 1 1 1 1
Explanation

We have arr = [0 0 0 1 1 1 1 0 1 1 0 0 1 0 1]

Moving all the 0's in the beginning and all the 1's at the end.

The final segregated array is [0 0 0 0 0 0 0 1 1 1 1 1 1 1 1]

Example 2
Input

6
1 0 1 0 1 1
Output

0 0 1 1 1 1
Explanation

The sorted array is [0 0 1 1 1 1]

Constraints
1 <= n <= 10^6

0 <= arr[i] <= 1
Approach 1
Maintain two indexes. Initialize the first index left as 0 and second index right as n-1.

Do following while left < right

Keep incrementing index left while there are 0s at it
Keep decrementing index right while there are 1s at it
If left < right then exchange arr[left] and arr[right]

Time Complexity

0(n): we iterate over the entire array.

Space Complexity

0(1): constant space used.

Below is the implementation of the above idea:

1. JAVA*/
import java.util.*;

public class Sorting {

    // Method to sort binary array (only containing 0s and 1s)
    static int[] Sorting01(int n, int[] arr) {
        int left = 0;          // Pointer starting from the beginning
        int right = n - 1;     // Pointer starting from the end

        // Loop until the two pointers meet
        while (left < right) {

            // Move 'left' forward as long as we see 0s (already in correct position)
            while (arr[left] == 0 && left < right)
                left++;

            // Move 'right' backward as long as we see 1s (already in correct position)
            while (arr[right] == 1 && left < right)
                right--;

            // Now we have arr[left] == 1 and arr[right] == 0
            // Swap them to place 0 on the left and 1 on the right
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }

        // Return the sorted array
        return arr;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();           // Read number of elements
        int arr[] = new int[n];         // Declare array of size n

        // Input array elements
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        // Call the sorting function
        int[] ans = Sorting01(n, arr);

        // Output the sorted array
        for (int i = 0; i < n; ++i) {
            System.out.print(ans[i] + " ");
        }
    }
}
