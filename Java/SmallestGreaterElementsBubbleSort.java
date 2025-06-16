/*Smallest Greater Elements - Bubble Sort
Given an array arr of size n. You are required to find Smallest greater elements for all elements in arr. If there is no such element for some element in arr then put its smallest greater element as -10000000.

Note: You have to do this question using Bubble Sort

Input Format
First line contains an integer n which is the size of the array.

Second line contains n space separated integers of array arr

Output Format
Return an array of n elements which contains smallest greater elements of each of the n elements of arr

Example 1
Input

4
13 6 17 12
Output

17 12 -10000000 13
Example 2
Input

9
6 3 9 8 10 2 1 15 7
Output

7 6 10 9 15 3 2 -10000000 8
Constraints
1 <= n <= 10000

-106 <= arr[i] <= 106*/
import java.util.*;

public class SmallestGreaterElementsBubbleSort {
    public static int[] SmallestGreaterElements(int[] arr) {
        int n = arr.length;
        int[] sorted = arr.clone();

        // Bubble sort the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }

        int[] result = new int[n];
        int noGreater = -10000000;

        // For each element in arr, find the smallest greater element from sorted array
        for (int i = 0; i < n; i++) {
            int current = arr[i];
            int smallestGreater = noGreater;

            // Since sorted is sorted, find the smallest element greater than current
            for (int val : sorted) {
                if (val > current) {
                    smallestGreater = val;
                    break;
                }
            }
            result[i] = smallestGreater;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int[] ans = SmallestGreaterElements(arr);
        for(int a : ans) {
            System.out.print(a + " ");
        }
        sc.close();
    }
}
