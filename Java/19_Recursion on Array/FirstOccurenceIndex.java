/*First Occurence Index
You are given an array A of size N with possibly duplicate elements. Your task is to find the index of first occurence of an element T in the given array. Also, return -1 if the element is not present.

You have to complete firstIndex function which contains array A , integers T (target) and startIndex as inputs and returns the first index of occurence as integer output

Input Format
First line represents size of the array i.e. N

Second line represents n-spaced array elements of the array.

Third line represents element T for which we have to find the first index of occurence.

Output Format
Print the integer value i.e. first index of occurence of the element.

Example 1
Input

6
5 6 4 6 1 2
6
Output

1
Explanation

6 is present twice in the input array and the first time it appears is at index 1.

Example 2
Input

8
3 9 2 6 1 4 2 1 
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
Base Case: If startIndex == N of the input array, return -1, i.e. element not found.
If T == A[startIndex], then return startIndex.
else return the next call of recursive function with startIndex incremented.
Time Complexity : O(N)

Space Complexity : O(1)

Below is the implementation of the above idea:

1. Java*/
import java.util.Scanner;

class FirstOccurenceIndex {
    // Create a single Scanner object to read inputs
    static Scanner s = new Scanner(System.in);

    // Function to take input and return an array
    public static int[] takeInput() {
        int N = s.nextInt();          // Read the size of the array
        int[] A = new int[N];         // Create an array of size N
        
        // Fill the array with N integers from user input
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        return A; // Return the filled array
    }
    
    public static void main(String[] args) {
        int[] A = takeInput(); // Step 1: Read array from user
        int T = s.nextInt();   // Step 2: Read the target element to search
        
        // Step 3: Find and print the first index of T in A (starting from index 0)
        System.out.println(firstIndex(A, T, 0));
    }

    // Recursive function to find the first index of target (T) in array (A)
    static int firstIndex(int A[], int T, int startIndex) {
        int N = A.length;   // Length of the array
        
        // Base Case: If we reach the end of the array without finding T
        if (startIndex == N) {
            return -1; // Target not found
        }
        
        // If the element at current index matches target, return this index
        if (T == A[startIndex]) {
            return startIndex;
        }
        
        // Recursive Step: Move to the next index
        return firstIndex(A, T, startIndex + 1);
    }
}
