/*Minimize The Difference
You are given an array A of length N consisting only of positive integers and an integer K. You have to update every element of the array by increasing or decreasing its value by K only once. Your task is to minimize the difference between maximum and minimum elements of the array after performing the increment or decrement on every element of the array.

Note: After the operation, every value of the array should remain non-negative.

For example:

Let’s say the array A = [1, 2, 3, 4, 5] and K = 2, then after increasing each element by K. The array A will become [3, 4, 5, 6, 7]. So the maximum - minimum will be 7 - 3 = 4.

Input Format
The first line contains two space-separated integers, ‘N’ and ‘K’, denoting the length of the array ‘A’ and the amount you must increase or decrease, respectively.

The following line contains ‘N’ space-separated positive integers, representing the array’s values.

Output Format
You have to print an integer denoting the minimum difference between maximum and minimum elements of the array after performing the increment or decrement on every element of the array.

Example 1
Input

4 2
1 5 8 10
Output

5
Explanation

The final array will look like [3, 3, 6, 8]. So the difference between maximum and minimum is 8 - 3 = 5.

Example 2
Input

5 2
1 2 3 4 5
Output

3
Explanation

The final array will look like [3, 4, 1, 2, 3]. So the difference between maximum and minimum is 4 - 1 = 3.

Constraints
1 <=N<= 10^5
1 <= K <= 10^9
1 <= A[i] <= 10^9, for 1 <= i <= N*/
import java.util.*;

class Solution {
    static int minimizeIt(int[] A, int K) {
        int n = A.length;
        if (n == 0) return 0;

        // 1. Sort the array
        Arrays.sort(A);

        // 2. Initial answer: range without any modifications
        int ans = A[n-1] - A[0];

        // 3. Now try every split i = 1..n-1
        for (int i = 1; i < n; i++) {
            // If A[i] < K, subtracting K would make it negative, so skip
            if (A[i] < K) continue;

            // The smallest possible after raising A[0]..A[i-1] by +K
            int possibleMin = Math.min(A[0] + K, A[i] - K);

            // The largest possible after lowering A[i]..A[n-1] by -K
            int possibleMax = Math.max(A[i - 1] + K, A[n - 1] - K);

            ans = Math.min(ans, possibleMax - possibleMin);
        }

        return ans;
    }
}

public class MinimizeTheDifference {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int ans = Solution.minimizeIt(A, k);
        System.out.println(ans);
    }
}
