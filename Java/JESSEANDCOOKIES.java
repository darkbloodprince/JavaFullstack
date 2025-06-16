/*JESSE AND COOKIES
Jesse loves cookies and wants the sweetness of some cookies to be greater than value k. To do this, two cookies with the least sweetness are repeatedly mixed. This creates a special combined cookie with:

sweetness = (1 * Least sweet cookie + 2 * 2nd least sweet cookie).

This occurs until all the cookies have a sweetness>=k.

Given the sweetness of a number of cookies, determine the minimum number of operations required. If it is not possible, print -1.

Input Format
Line 1 contains two space-separated integers n and k denoting size of array of sweetness values and the minimum required sweetness required.

Line 2 contains n spaced integers denoting elements of array.

Output Format
Print a single integer denoting number of operations required or if it is not possible print -1.

Example 1
Input

6 7
1 2 3 9 10 12
Output

2
Explanation

Combine the first two cookies to create a cookie with sweetness = 1*1 + 2*2=5

After this operation, the cookies are 3,5,9,10,12.

Then, combine the cookies with sweetness 3 and sweetness 5, to create a cookie with resulting sweetness = 1*3 + 2*5= 13

Now, the cookies are 9,10,12,13.

All the cookies have a sweetness>=7.

Thus, 2 operations are required to increase the sweetness.

Example 2
Input

6 10
1 2 3 9 10 12
Output

3
Explanation

Combine the first two cookies to create a cookie with sweetness = 1*1 + 2*2=5

After this operation, the cookies are 3,5,9,10,12.

Then, combine the cookies with sweetness 3 and sweetness 5, to create a cookie with resulting sweetness = 1*3 + 2*5= 13

Now, the cookies are 9,10,12,13.

Then, combine the cookies with sweetness 9 and sweetness 10, to create a cookie with resulting sweetness = 1*9 + 2*10= 29

Now, the cookies are 12,13,29.

Thus, 3 operations are required to increase the sweetness.

Constraints
1<=n<=10^6

0<=k<=10^9

0<=A[i]<=10^6*/
import java.util.*;
import java.io.*;

class Solution {
    static int solve(int a[], int n, int k) {
        // Use a min-heap to always access the two least sweet cookies
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // Add all sweetness values to the heap
        for (int i = 0; i < n; i++) {
            pq.add(a[i]);
        }
        int ops = 0;
        // Continue combining until the least sweet cookie meets the threshold
        while (!pq.isEmpty() && pq.peek() < k) {
            // If fewer than two cookies remain, it's impossible
            if (pq.size() < 2) {
                return -1;
            }
            int least = pq.poll();
            int second = pq.poll();
            // Create the new combined cookie
            int combined = least + 2 * second;
            pq.add(combined);
            ops++;
        }
        return ops;
    }
}

public class JESSEANDCOOKIES {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        System.out.println(Solution.solve(a, n, k));
        input.close();
    }
}
