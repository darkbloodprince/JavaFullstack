/*Sum of Array
Write a program to find sum of all elements present in an array (arr[ ]). Take input of size of array (N) from user followed by the elements of array. After taking input, make variable sum and add all the elements of the array to the sum variable till you reach the last element of the array.

Input Format
First line contains an integer N denoting size of array.

Second line contains N integers denoting the array elements separated by single space.

Output Format
Print sum of the array elements

Example 1
Input

5
1 2 3 4 4
Output

14
Explanation

1+2+3+4+4 = 14
Example 2
Input

3
1 2 3
Output

6
Explanation

1+2+3 = 6
Constraints
1 <= N <= 10^5

1 <= arr[i] <= 10^9

Approach 1
We use a variable called sum to store the total sum of the array and initialize it with 0.
We loop over all the elements of the array and add the value of the element to the sum variable.
We output the value of the sum variable as it stores the sum of all elements of an array.
Time complexity

O(N) will be the time complexity because we will have to make N iterations to execute the code starting from the 1st element of the array till the Nth element.

Space Complexity

Since we take the same amount of input/space to implement without using any additional space to store, we can say that the Space complexity will be O(1)*/

import java.io.*;
import java.util.*;

class Main {
    
    // Function to calculate the sum of elements in an array
    static int findSum(int arr[], int N) {
        int sum = 0; // Initialize sum to 0

        // Loop through each element of the array
        for (int i = 0; i < N; i++) {
            sum = sum + arr[i]; // Add current element to sum
        }

        return sum; // Return the final sum
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in); // Create scanner object for input

        int N = sc.nextInt(); // Read size of the array

        int arr[] = new int[N]; // Create array of size N

        // Read N elements into the array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the function to compute the sum
        int ans = findSum(arr, N);

        // Output the result
        System.out.println(ans);
    }
}

/*Time: O(N)
Space: O(N)*/