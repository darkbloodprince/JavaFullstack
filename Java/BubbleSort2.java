/*Sorting Problem 3
Given an integer array arr[] in unsorted order. Using Bubble Sort Technique, return an array of the squares of each number sorted in non-decreasing order.

Explanation: After squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes [0,1,9,16,100].

Input Format
n (size of the array) arr[0] arr[1] arr[2] … arr[n-1]

Output Format
arr[0] arr[1] arr[2] … arr[n-1]

Example 1
Input

5
-4 -1 0 3 10
Output

0 1 9 16 100*/
import java.io.*;
import java.util.*;

public class BubbleSort2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int n = sc.nextInt();

        // Initialize and read the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Square each element
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i];
        }

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(" ");
        }
    }
}
