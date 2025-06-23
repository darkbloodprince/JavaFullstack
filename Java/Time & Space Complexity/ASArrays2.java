/*AS Arrays 2
Write a program to find out the count of numbers greater than 20 that are present in the array. First take input of size (N) of the array from user followed by array elements. Then using a loop, find out the total number of integers present in the array that are greater than 20 and finally print that count.

Input Format
First line contains an integer N denoting size of array

Second line contains N integers denoting the array elements separated by single space

Output Format
Print count of all array elements greater than 20 in a line

Example 1
Input

6
7 81 17 21 20 11
Output

2
Explanation

There is only 21 & 81 greater than 20 in the array
Example 2
Input

6
1 2 3 4 5 6
Output

0
Explanation

There are no elements greater than 20 in array
Constraints
1 <= N <= 10^5

1 <= arr[i] <= 10^6

Approach 1
We have a variable count to counter number of elements greater than 20
We loop over all elements and compare the value using if statements
We update the count variable if an element greater than 20 is found
We print the value of count
Time Complexity

O(n) as we are looping over all elements in the array, where n is the number of elements in the array

Space Complexity

O(1) as we are only using constant extra space and we are not using any other data structures like arrays etc.*/

import java.io.*;
import java.util.*;

class Main {

    // Function to count elements greater than 20
    static int greater(int arr[], int N) {
        int sum = 0; // Variable to store the count of numbers greater than 20

        // Traverse the entire array
        for (int i = 0; i < N; i++) {
            if (arr[i] > 20) {
                sum++; // Increment count if element is greater than 20
            }
        }

        return sum; // Return the final count
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Read the size of the array

        int arr[] = new int[N]; // Declare array of size N

        // Input elements into the array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the function to count elements > 20
        int ans = greater(arr, N);

        // Output the result
        System.out.println(ans);
    }
}

/*Time: O(N)
Space: O(N)*/