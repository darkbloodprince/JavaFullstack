/*Diamond Pattern
Given an integer N, print a diamond full of stars * with height equal to N.

Note It is given that N is odd.

Input Format
The first line contains the number of test cases.

For each test case: The first line contains an integer N denoting the height of the pyramid.

Output Format
For each test case print the required pattern.

Example 1
Input

1
5
Output


Explanation

The required diamond of height 5 has been returned.

Example 2
Input

1
3
Output


Explanation

The required diamond of height 3 has been returned.

Constraints
1 <= T <= 10

1 <= N <= 100

N is odd.
Approach 1
We can break the diamond structure into two parts the upper pyramid and lower pyramid. The Upper Pyramid is of height n/2+1 and lower is of height n/2.
In the upper pyramid In row i, the star is supposed to be printed 2*i-1 times which is maintained by a cnt variable. Before printing the first star, we must add a certain number of spaces to set the diamond shape. This number is equal to n-i.
After printing n-i spaces, we print the star cnt times, with a space after each occurrence.
We then update the value of cnt for the lower pyramid which would be two less than the last row of the upper Pyramid.
In the lower pyramid In row i, the star is supposed to be printed cnt times which is then decremented by 2. Before printing the first star, we must add a certain number of spaces to set the diamond shape. This number is equal to i.
After printing i spaces, we print the star cnt times, with a space after each occurrence.
Time Complexity: O(t * n * n), Since there are t testcases and for each t we are running two nested for loops for n

Space Complexity: O(t), Since there are t testcases and for each t constant space is used.

Below is the Java implementation of above idea:*/
import java.util.*;
class DiamondPattern{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int t=sc.nextInt();
            while(t>0){
                int n=sc.nextInt();

                int x=n/2+1,cnt=1;
                for (int i = 1; i <= x; i++) {
                    for (int j = 1; j <= x - i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= cnt; j++) {
                        System.out.print("* ");
                    }
                    cnt+=2;
                    System.out.println();
                }
                cnt-=4;
                for (int i = 1; i <x; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= cnt; j++) {
                        System.out.print("* ");
                    }
                    cnt-=2;
                    System.out.println();
                }

                t--;
            }
        }
    }
}