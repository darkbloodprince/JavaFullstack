/*Array Swaps
Hitesh has an array A of N integers. He wants his friend to sort the array in the non-decreasing order. Since it would be a too easy problem, Hitesh allows him to use only the following operation:

Choose indices i and j such that 1 ≤ i, j ≤ n, and |i−j|≥X. Then, swap elements A[i] and A[j].

Can you tell if there is a way to sort the array in the non-decreasing order by using the operation written above some finite number of times (possibly 0)?

Input Format
The first line contains two integers, N and X.

The second line contains N space-separated integers.

Output
If you can sort the array in non-decreasing order using the operation written above, output "YES" (without quotes). Otherwise, output "NO" (without quotes).

Example 1
Input

3 3
3 2 1
Output

NO
Explanation

You can not do any operations.
Example 2
Input

5 2
5 1 2 3 4
Output

YES
Explanation

In this test case, you can do the operations as follows:

-   [5,1,2,3,4], swap(a1,a3)
-   [2,1,5,3,4], swap(a2,a5)
-   [2,4,5,3,1], swap(a2,a4)
-   [2,3,5,4,1], swap(a1,a5)
-   [1,3,5,4,2], swap(a2,a5)
-   [1,2,5,4,3], swap(a3,a5)
-   [1,2,3,4,5]

(Here, swap(ai, aj) refers to swapping elements at positions i, j).
Constraints
1 ≤ X ≤ N ≤10⁵

1 ≤ A[i] ≤ 10⁹
Approach 1:
Copy the array into a new array and sort the new array. Now traverse over the array and check for the 3 conditions

arr[i] != b[i] // b is the new array
i < x
n - 1 - i < x
if arr[i] != b[i] and any of other two condition is true then we cannot change the position of that element so we cannot sort the array

Algorithm:

Create an array of size N, put all value of arr into that array and sort it
Iterate from 0 to N-1 if arr[i]==b[i] (where b is new array) then continue otherwise
Check if i less then x or n - 1 - i less then x if any of these is true then return NO
Otherwise if loop is terminated without NO return YES
Time Complexity:

O(N log(N)) , as we are sorting the array of size N

Space Complexity:

O(N) , as we are creating another array of size N

Below is the Java implementation of above idea:

1. Java*/
import java.io.*;
import java.util.*;
public class ArraySwaps {
    static String arraySwaps(int arr[],int n,int x)
    {
        // Your code here
        int b[] = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = arr[i];
        }
        Arrays.sort(b);
        for(int i = 0; i < n; i++){
            // if it is possible to take the element to one of the extremes
            if(arr[i] != b[i] && i < x && n - 1 - i < x){
                return "NO";
            }
        }

        return "YES";
    }
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        String ans = arraySwaps(a,n,x);
        System.out.println(ans);
    }
}