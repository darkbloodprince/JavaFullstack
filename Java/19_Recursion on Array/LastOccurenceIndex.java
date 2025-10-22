/*Last Occurence Index
You are given an array A of size N with possibly duplicate elements. Your task is to find the index of last occurence of an element T in the given array. Also, return -1 if the element is not present.

You have to complete lastIndex function which contains array A , integers T (target) and startIndex as inputs and returns the last index of occurence as integer output

Input Format
First line represents size of the array i.e. N

Second line represents n-spaced array elements of the array.

Third line represents element T for which we have to find the last index of occurence.

Output Format
Print the integer value i.e. last index of occurence of the element.

Example 1
Input

6
8 9 4 1 1 2
1
Output

4
Explanation

1 is present twice in the input array and the last time it appears is at index 4.

Example 2
Input

8
6 2 5 9 1 4 5 5 
7
Output

-1
Explanation

7 is not present in the array so the output is -1.

Constraints
0 <= N <= 10^5

-10^9 <= A[i] <= 10^9

-10^9 <= T <= 10^9
Hint 1
Think for recursive approach to find the index

Approach 1:

The simplest and efficient approach to solve this question is recursively.

Algorithm:

To solve this using recursion, make a recursion function with inputs, and a variable startIndex to traverse the input array.
Base Case: If startIndex <0 of the input array, return -1, i.e. element not found.
If T == A[startIndex], then return startIndex.
else return the next call of recursive function with startIndex incremented.
Time Complexity : O(N)

Space Complexity : O(1)

Below is the implementation of the above idea:

1. Java*/
import java.util.Scanner;

class LastOccurenceIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);   // Create a Scanner object to take user input
        int N = s.nextInt();                  // Read the size of the array
        int[] A = new int[N];                 // Create an array of size N

        // Read N integers into the array
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }

        int T = s.nextInt();                  // Read the target element T
        // Call the recursive function to find the last index of T
        // Start checking from the last index (N-1)
        System.out.println(lastIndex(A, T, N - 1));
    }

    // Recursive function to find the last occurrence (index) of element T in array A
    static int lastIndex(int A[], int T, int startIndex) {
        // Base condition: if index goes out of bounds (no match found)
        if (startIndex < 0) {
            return -1; // Element not found, return -1
        }

        // If the current element matches the target, return this index
        if (T == A[startIndex]) {
            return startIndex;
        }

        // Otherwise, move one step left and check the next element
        return lastIndex(A, T, startIndex - 1);
    }
}
