/*Insertion Sort
Implement insertion sort.

Input Format
The first line  contains one space separated integer N denoting the number of elements.

The Second line  contains N space separated integers denoting the elements of the array.

You need to complete insertionSort function which contains a array of size n and print the final sorted array in this function only.

Output Format
Print the array in sorted fashion in sorted fashion.

Example 1
Input

 6
 7 6 8 5 4 9
Output

 4 5 6 7 8 9
Explanation

Printed sorted array.

Example 2
Input

 5
 11 5 12 6 13
Output

5 6 11 12 13
Explanation

Printed sorted array.

Constraints
0 <= nums.length <= 10^4

-10^9 <= nums[i] <= 10^9*/
import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        
        insertionSort(array,n);
    }

    static void insertionSort(int a[], int n)
    {
        for(int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;

            // Move elements of a[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while(j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }

        // Print the sorted array
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
