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

1 <= arr[i] <= 10^6*/
import java.io.*;
import java.util.*;

class ASArrays2 {
    static int greater(int arr[], int N) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] > 20) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // array size
        int arr[] = new int[N]; // creating array of size N

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // taking input of array elements
        }

        int ans = greater(arr, N);
        System.out.println(ans);
    }
}
