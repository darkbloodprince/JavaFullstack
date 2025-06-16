/*Find The Median
The median of a list of numbers is essentially its middle element after sorting. The same number of elements occur after it as before. Given a list of numbers with an odd number of elements, find the median.

Input Format
The first line inputs integer n, size of array a.
The second line inputs n space-seperated integers, i.e., a[i].

Output
In a new line, print the median of the array.

Example 1
Input

7
0 1 2 4 6 5 3
Output

3
Explanation The sorted a=[0,1,2,3,4,5,6].
Its middle element is at a[3]=3.

Example 2
Input

5
10 12 11 14 -100
Output

11
Explanation The sorted a=[-100,10,11,12,14].
Its middle element is at a[2]=11.

Constraints
1 <= n <= 1000001
n is odd
-10000 <= a[i] <= 10000*/
import java.io.*;
import java.util.*;

public class FindTheMedian {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String[] arr_a = br.readLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(arr_a[i]);
        }
        int median = Solution.solve(a);
        System.out.println(median);
        br.close();
    }
}

class Solution {
    /**
     * Computes the median of an odd-sized array of integers.
     * @param a the input array (odd length)
     * @return the median value
     */
    static int solve(int[] a) {
        // Sort the array
        Arrays.sort(a);
        // Return the middle element
        return a[a.length / 2];
    }
}
