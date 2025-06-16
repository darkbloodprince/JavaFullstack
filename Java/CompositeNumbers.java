/*Composite Numbers
You are given an array A consisting of N integers. You have to remove all the composite numbers from the array.

Note Complete the given function and print the updated array. The input and output would be handled by the driver code. You have to return the final arraylist.

1 is neither prime nor composite.

Input Format
The first line an integer N.

The next line contains N integers.

Output Format
Return the updated arraylist.

Example 1
Input

4
3 12 13 15
Output

3 13
Explanation

12 and 15 are composite, thus, they are removed.

Example 2
Input

2
4 2
Output

2
Explanation

4 is the only composite number. It is removed.

Constraints
1 <= N <= 10000

1 <= A[i] <= 10000*/
import java.util.*;

class CompositeNumbers
{
    static ArrayList<Integer> removeComposite(int arr[], int len)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (isPrimeOrOne(num)) {
                result.add(num);
            }
        }
        return result;
    }

    // Helper function to check if a number is prime or 1 (1 is neither prime nor composite, so we keep it)
    static boolean isPrimeOrOne(int num) {
        if (num == 1) return true;  // keep 1 as is
        if (num < 2) return false;  // 0 or negative not prime

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;  // composite
            }
        }
        return true;  // prime
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = removeComposite(arr, n);
        for(int val : list) System.out.print(val + " ");
    }
}
