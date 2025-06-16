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

0 <= arr[i] <= 1*/
import java.util.*;

public class Sorting {
    static int[] Sorting01(int n, int[] arr) {
        int left = 0;       // Pointer for the next 0's position
        int right = n - 1;  // Pointer for the next 1's position
        
        while (left < right) {
            // If left is 0, it's already in correct place, move forward
            if (arr[left] == 0) {
                left++;
            } 
            // If right is 1, it's already in correct place, move backward
            else if (arr[right] == 1) {
                right--;
            }
            // If left is 1 and right is 0, swap them
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return arr;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; ++i){
            arr[i] = sc.nextInt();
        }
        int[] ans = Sorting01(n, arr);
        for(int i=0; i<n; ++i){
            System.out.print(ans[i] + " ");
        }
    }
}
