/*Triplet Sum to X
You have been given a non-decreasing integer ArrayList(arr) and a number X. Find and return the number of distinct triplets in the ArrayList which sum to X.

Note

Given ArrayList is sorted and can contain duplicate elements.

Input format
The first line contains an Integer t which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains an integer N representing the size of the first ArrayList.

The second line contains N single space-separated integers representing the elements in the ArrayList.

The third line contains an integer X.

Output format
For each test case, print the total number of distinct triplets present in the array/list.

Output for every test case will be printed in a separate line.

Example 1
Input

1
7
1 2 3 4 5 6 7 
12
Output

5
Explanation

Triplets are (1,4,7), (1,5,6), (2,3,7), (2,4,6), (3,4,5).

Example 2
Input

1
7
1 2 3 4 5 6 7 
19
Output

0
Explanation

Since there doesn''t exist any triplet with sum equal to 19 for the first query, we print 0.

Constraints
1 <= t <= 50

1 <= N <= 10^3

-10^6 <= arr[i] <= 10^6

-10^9 <= X <= 10^9*/
import java.io.*;
import java.util.*;

public class TripletSumtoX {
    public static int triplets(ArrayList<Integer> arr, int X) {
        int n = arr.size();
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            // Avoid duplicates for i
            if (i > 0 && arr.get(i).equals(arr.get(i - 1))) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr.get(i) + arr.get(left) + arr.get(right);

                if (sum == X) {
                    count++;

                    int leftVal = arr.get(left);
                    int rightVal = arr.get(right);

                    // Move left pointer skipping duplicates
                    while (left < right && arr.get(left).equals(leftVal)) left++;
                    // Move right pointer skipping duplicates
                    while (left < right && arr.get(right).equals(rightVal)) right--;

                } else if (sum < X) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t > 0) {
            int n, X;
            n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>(n);
            for (int i = 0; i < n; i++) arr.add(sc.nextInt());
            X = sc.nextInt();
            int result = triplets(arr, X);
            System.out.println(result);
            t--;
        }
        sc.close();
    }
}
