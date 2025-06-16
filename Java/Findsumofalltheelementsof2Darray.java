/*Find sum of all the elements of 2-D array
You are given a 2D array A of order N * M.

Your task is to find out the sum of elements of the 2D array.

Input Format
The first line of input contains two space-separated integers N and M.

The next N lines contain M space-separated integers.

Output Format
For each test case return an integer.

Example 1
Input

2 2
1 2
3 4
Output

10
Explanation

1 + 2 + 3 + 4 = 10. Thus answer is 10.
Example 2
Input

2 3
1 2 3
4 5 6
Output

21
Explanation

1 + 2 + 3 + 4 + 5 + 6 = 21. Thus answer is 21.
Constraints
0 <= N <= 10^3

0 <= M <= 10^3

1 <= A[i][j] <= 10^3*/
import java.util.*;

class Findsumofalltheelementsof2Darray {
    static int findSum(int[][] arr, int n, int m) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int ans = findSum(A, n, m);
        System.out.println(ans);
        sc.close();
    }
}
