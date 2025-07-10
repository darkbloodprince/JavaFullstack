/*Reverse an array
You are given an array arr of length n. You have to come up with an in-place solution.

Input Format
The first line of input contains an integer n, size of the array.

The next line contains n space-separated integers denoting the elements of the array.

Output Format
Printing is handled by the main function you just have to come up with an inplace solution.

Example 1:
Input

4
1 3 5 7
Output

7 5 3 1
Explanation

We have array = [1 3 5 7].

Print the array from the ending. The reversed array is [7 5 3 1]

Example 2:
Input

7
0 0 1 1 0 2 3
Output

3 2 0 1 1 0 0
Explanation

The reversed array is [3 2 0 1 1 0 0].

Constraints
1 <= n <= 10^6

1 <= arr[i] <= 10^9*/
import java.util.*;

public class Reverseanarray {

    public static void reverseArray(int[] arr, int n) {
        int left = 0, right = n - 1;
        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
