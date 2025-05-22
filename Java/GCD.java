/*Sokka is a brilliant scientist who keeps on doing experiments For an experiment, he needs to fill up two containers, as fast as possible, but the constraint being both of them must be filled in a time that is a whole number. He has two containers but unfortunately, their volume is different. Their volume is given as A and B. Find the maximum rate of water flow per minute that can fill up both the tanks in a time (in minutes) which is a whole number

For eg: let A=601 and B-45L Awaterflow of 15L per minute will fill up both the containers at whole numbers, le 4 and 3 minutes respectively.

Write a recursive function that takes two integers, A and B, and returns the maximum rate of water flow following the above constraint.

Input Format

The First line of input contain two Integer A and B

Output Format

Print the maximum rate of water flow such that both the containers take the time to fill which is a whole number.

Example 1

Input

52

Output

Explanation

Only a pipe with IL/min can fill both the containers at a time which is a whole number

Example 2

Input

46

Output 2

Explanation

Pipe with rate flow of 2L/min can fill container 1 in 2 mins and container 2 in 3 mins.

Constraints

1 <= A, B <=10^5 import java.util.*;

class Solution (

int catchingUp(int a, int b) (

// write code here

public class Main {

public static void main(String[] args) {

Scanner sc new Scanner(System.in);

int a= sc.nextInt();

int b= sc.nextInt();

Solution Obj new solution();

System.out.println(Obj.catchingUp (a,b));


ChatGPT said:
To solve this problem, we need to find the maximum rate of water flow that fills both containers in a whole number of minutes. This means the rate must divide both volumes exactly.

This is a classic problem of finding the Greatest Common Divisor (GCD) of the two container volumes.

Why GCD?
If you have two volumes A and B, and you're looking for the maximum rate r such that both A % r == 0 and B % r == 0, that’s the GCD of A and B.

We can write a recursive function to find the GCD using Euclid’s algorithm.*/
import java.util.*;

class Solution {

    int catchingUp(int a, int b) {
        return gcd(a, b);
    }

    // Recursive function to find GCD
    int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

public class GCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Solution obj = new Solution();
        System.out.println(obj.catchingUp(a, b));
    }
}
