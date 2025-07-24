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

1 <= A[i] <= 10000
Approach: Use Sieve of Eratosthenes to generate all the primes. Then iterate over the array and check if each element is prime or composite.

Algorithm:

Use sieve to generate primes.
Iterate over the array.
For each element, if it is composite, remove it from the array.
Remove composite by left shifiting all the elements to the right of it, and moving this number to the end of the array. Update the size of the array.
If it is prime, iterate further.
Print the final array.
Time Complexity : O(NrootN) , where N is the size of the array. Space Complexity : O(N) ,

Below is the implementation of above idea:

1. Java*/
import java.util.*; // Import Scanner and other utility classes

class CompositeNumbers {
    // Maximum size for prime sieve array
    static int sz = (int) 1e5;  // 1e5 = 100000
    static boolean[] isPrime = new boolean[sz + 1]; // Boolean array to mark prime numbers

    // Sieve of Eratosthenes to precompute prime numbers up to sz
    static void sieve() {
        // Initially assume all numbers are prime
        for (int i = 0; i < sz + 1; i++)
            isPrime[i] = true;

        // 0 and 1 are not prime
        isPrime[0] = isPrime[1] = false;

        // Standard sieve: mark all multiples of each prime as non-prime
        for (int i = 2; i * i <= sz; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < sz; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // This line is technically incorrect because 1 is not a prime,
        // but it's added in your code, possibly to keep 1s in the array.
        isPrime[1] = true;
    }

    // Function to remove non-prime numbers from the array
    static void removePrimes(int arr[], int len) {
        sieve(); // Populate the isPrime[] array

        // Traverse the array
        for (int i = 0; i < len; i++) {
            // If the current number is NOT prime
            if (!isPrime[arr[i]]) {
                // Shift all elements to the left to overwrite the current number
                for (int j = i; j < len - 1; j++) {
                    arr[j] = arr[j + 1];
                }

                i--;     // Adjust index after removal
                len--;   // Decrease the length of valid array
            }
        }

        // Print the final array with only prime numbers
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // For user input

        int n = sc.nextInt();        // Size of the array
        int[] arr = new int[n];      // Declare array of size n

        // Read n elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call function to remove non-primes and print the result
        removePrimes(arr, n);
    }
}
