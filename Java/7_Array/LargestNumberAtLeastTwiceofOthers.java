/*Largest Number At Least Twice of Others
You are given an integer array nums of size n where the largest integer is unique. Your task is to determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, print the index of the largest element, or print -1 otherwise.

Input Format
The first line of the input contains the number n(length of the array),

The next line contains n space separated integers denoting the elements of the array.

Output Format
Print the index of the element if it satisfies the condition else print -1

Example 1
Input

4
3 6 1 0
Output

1
Explanation

Here, 6 is the largest integer, and for every other number in the array x, 6 is more than twice as big as x. The index of value 6 is 1, so we return 1

Example 2
Input

4
1 2 3 4
Output

-1
Explanation

4 isn't at least as big as twice the value of 3, so we return -1.

Constraints
1 <= n <= 50

0 <= nums[i] <= 100

The largest element in nums is unique.*/
import java.util.*;

class Solution {
    public int LargestElement(int[] nums, int n) {
        int maxIndex = 0;
        int maxValue = nums[0];

        // Find the index and value of the largest element
        for (int i = 1; i < n; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
                maxIndex = i;
            }
        }

        // Check if maxValue is at least twice every other element
        for (int i = 0; i < n; i++) {
            if (i != maxIndex && maxValue < 2 * nums[i]) {
                return -1;
            }
        }

        return maxIndex;
    }
}

public class LargestNumberAtLeastTwiceofOthers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution Obj = new Solution();
        System.out.println(Obj.LargestElement(nums, n));
    }
}
