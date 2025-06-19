/*Rotate array
Given an array with N elements, the task is to rotate the array to the right by K steps.

Note : if K is negative , rotate the array to the left.

Input Format
The first line contains an integer N representing the size of the array.

The second line contains N space-separated integers representing the elements of the array.

The last line contains an integer K representing the number of times the array has to be rotated in the right direction if k is positive , otherwise to the left if k is negative.

Output Format
The only line of the output prints N space-separated integers representing the Rotated array elements.

Example 1
Input


8
7 5 2 11 2 43 1 1
2

Output

1 1 7 5 2 11 2 43 

Explanation

Rotate 1 steps to the right : 1 7 5 2 11 2 43 1

Rotate 2 steps to the right : 1 1 7 5 2 11 2 43

Example 2
Input


8
7 5 2 11 2 43 1 1
3

Output


43 1 1 7 5 2 11 2 

Explanation

Rotate 1 steps to the right : 1 7 5 2 11 2 43 1

Rotate 2 steps to the right : 1 1 7 5 2 11 2 43

Rotate 3 steps to the right : 43 1 1 7 5 2 11 2

Constraints
1 <= N <= 10^3

1 <= arr[i] <= 10^9

-10^9 <= K < 10^9
We will use Simple logic to solve this problem.

Algorithm

Rotation Function:

We define a function rotateArray that takes a vector (in C++) or an array (in Java) and the rotation value k.
Inside this function, we calculate the effective rotation amount by taking the modulo of the array size to handle cases where k is greater than the size of the array.
If k is negative, we convert it to a positive value equivalent to rotating left.
Reversal Technique: We use a reversal technique to perform the rotation. The steps are as follows:

Reverse the entire array.
Reverse the first k elements.
Reverse the remaining elements.
Time Complexity : O(n).

Space Complexity : O(1).*/
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Function to rotate the array to the right by k positions
    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;

        // To handle cases where k is larger than n
        k %= n;

        // To handle negative values of k (convert to equivalent positive rotation)
        if (k < 0) {
            k += n;
        }

        // Reverse the entire array
        reverse(nums, 0, n - 1);

        // Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Reverse the remaining n - k elements
        reverse(nums, k, n - 1);
    }

    // Helper function to reverse a subarray from index start to end
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // Swap the elements at positions start and end
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            // Move the pointers inward
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in the array
        int n = scanner.nextInt();

        // Create and fill the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Read the number of rotations
        int k = scanner.nextInt();

        // Rotate the array to the right by k positions
        rotateArray(arr, k);

        // Print the rotated array
        for(int num : arr){
            System.out.print(num + " "); 
        }

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}
