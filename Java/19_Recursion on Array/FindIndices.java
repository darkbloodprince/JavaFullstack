/*Find Indices
Given an array arr of size N and an integer X. The task is to find all the indices of the integer X in the array recursively and print them.

Input Format
The first line of input is the size of array N and an integer X denoting the number whose indices need to be printed. the second line consists of N integers separated by space denoting array arr.

Output Format
print the indices where X is there in array in order

Example
Input

6 2
1 2 3 2 3 5
Output

1 3
Explanation

2 is present on index 1 and index 3 in the provided array

Constraints
1 <= N <= 1000
1 <= X <= 1000
-10^6 <= arr[i] <= 10^6
Approach:

We simply use recursion and pass a start variable to maintain our position in the recursion. If we get element equal to x we put it in the answer. We have to shift the elements of the answer array as recursion will provide result in reverse format.

Algorithm is as follows:

If the start index reaches the length of the array, then return empty array
Else keep the first element of the array with yourself and pass the rest of the array to recursion.
If the element at start index is not equal to x then just simply return the answer which came from recursion.
Else if the element at start index is equal to x then shift the elements of the array (which is the answer of recursion) one step to the right and then put the start index in the front of the array (which came through recursion)
Java:*/
import java.io.*;
import java.util.*;

public class FindIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,x;
        n = sc.nextInt();
        x = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        findX(arr1, n, x);
    }


	public static int[] recur(int arr[],
                                int x, int start)
    {
        if (start == arr.length) {
            int[] ans = new int[0]; // returning empty array as array does not have elements
            return ans;
        }
 
        int[] smallIndex = recur(arr, x,start + 1);
 
        // if we find X at arr[start] we add it to the answer
        if (arr[start] == x) {
            int[] ans = new int[smallIndex.length + 1];
 
            // Put the start index in front
            // of the array
            ans[0] = start;
            for (int i = 0; i < smallIndex.length; i++) {
                 
                // Shift the elements of the array one step right
                ans[i + 1] = smallIndex[i];
            }
            return ans;
        }
        else {
            return smallIndex;
        }
    }

    static void findX(int arr[], int n, int x)
    {
        // write code here
        int[] res = recur(arr, x, 0);
        int zz = res.length;
        for(int i=0;i<zz;i++) System.out.print(res[i]+" ");
    }
}