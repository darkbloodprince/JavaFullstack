/*Buildings
You have given a number n, representing the size of array arr.

You are required to print a building representing value of arr using *.

Input Format
First line consists of an integer n

Second line consists of n spaced integers, representing elements of arr

Output Format
Output the height of the building represented by the values of array arr using *

Example 1
Input

7
9 3 7 6 2 0 4
Output

*
*
*               *
*               *       *
*               *       *
*               *       *                       *
*       *       *       *                       *
*       *       *       *       *               *
*       *       *       *       *               *
Explanation

Number of stars in each column represents the value of that index of array arr which are tab seprated

Example 2
Input

5
1 2 3 4 5
Output

                                *
                        *       *
                *       *       *
        *       *       *       *
*       *       *       *       *
Explanation

Number of stars in each column represent the value of that index of array arr which are tab seprated

Constraints
1 <= n <= 1000

0 <= arr[i] <= 1000*/
import java.util.*;  // Importing all utility classes like Scanner for input

public class Buildings {

  public static void main(String[] args) throws Exception {
    // Creating a Scanner object to read input from the user
    Scanner sc = new Scanner(System.in);

    // Reading the number of elements in the array
    int n = sc.nextInt();
    
    // Creating an array of size 'n' to store the elements
    int[] arr = new int[n];

    // Initializing 'max' to the smallest possible integer value
    int max = Integer.MIN_VALUE;

    // Loop to read array elements and find the maximum value
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();               // Reading element into array
      max = Math.max(max, arr[i]);        // Updating max value if needed
    }

    sc.close(); // Closing the scanner

    // Calling the function to print the bar graph
    barGraph(arr, n);
  }

  // Function to print the vertical bar graph
  public static void barGraph(int[] arr, int n) {
    // Again, finding the maximum value in the array
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) 
      max = Math.max(max, arr[i]);

    // Outer loop runs from top level (max height) to 1
    for (int i = 0; i < max; i++) {

      // Inner loop runs through each element of the array
      for (int val : arr) {
        // If current value is >= the level we are printing, print '*'
        if (val >= max - i) {
          System.out.print("*\t");  // Tab-separated stars
        } else {
          System.out.print("\t");   // Just a tab for empty space
        }
      }

      // Print newline after each row
      System.out.println();
    }
  }
}
