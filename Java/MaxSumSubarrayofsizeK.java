/*Given an array of integers Arr of size N and a number, K. Return the maximum sum of a subarray of size K

Input
The first line contains 2 integers N and K The second line contains N integers denoting elements of the array

Output
Print an integer denoting the maximum sum subarray of size K

Example 1
Input:

4 2
100 200 300 400
Output:

 700
Explanation: The sum of the last 2 elements is maximum i.e. (0-based indexing) Arr[2]+Arr[3]=700 is maximum

Example 2
Input:

4 2
100 -200 300 -400
Output:

100
Explanation: Sum of Arr[1]+Arr[2]=((-200)+300=)100 which is the maximum sum possible for subarray of size 2

Constraints

1 <= N <= 1000000

1 <= K <= N

-10000 <= Arr[i] <= 10000*/
import java.util.*;
class Solution{
    public static int solve(int[] arr , int k){
        //Write your code here
        int sum = 0;
        int result = 0;
        for(int i = 0; i <= arr.length-k; i++){
            for(int j = i; j < i+k; j++){
                sum = sum + arr[j];
            }
            if(sum > result){
                result = sum;
            }
            sum = 0;
        }
        return result;
		
    }
}
public class MaxSumSubarrayofsizeK {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Solution.solve(arr,k));
    }
}