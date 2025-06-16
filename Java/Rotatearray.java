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

-10^9 <= K < 10^9*/
import java.util.Scanner;

public class Rotatearray {

    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;

        // Normalize k to be within the range of [0, n-1]
        k = k % n;
        if (k < 0) {
            // If k is negative, convert left rotation to equivalent right rotation
            k = k + n;
        }

        // Reverse the entire array
        reverse(nums, 0, n - 1);
        // Reverse first k elements
        reverse(nums, 0, k - 1);
        // Reverse remaining elements
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        rotateArray(arr, k);

        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
