/*Frequency of digit
You are given a number n and a digit d.

You are required to calculate the frequency of the digit d in the number n.

Note:- Don't change the Function Definition in the solution Class just return the frequency to the main function and the main function prints the frequency.

Input Format
The first line of input contains an integer n.

Next line of input contains an integer d which represents the digit whose frequency has to be counted.

Output Format
Print the frequency of the given digit d.

Example 1
Input

986272
2
Output

2
Explanation

2 occurs 2 times in the given digit. Hence the output will be 2.

Example 2
Input

1973672936423
3
Output

3
Explanation

3 occurs 3 times in the given digit. Hence the output will be 3.

Constraints
0 < n <= 9*1018

0 <= d <= 9

Note
You do not have to worry about classes and objects for now; just keep that abstract. We will cover everything related to classes and objects in Module 2. For the time being, understand the syntax only. This is only shown to you so that you can be able to complete the function of the question given to you in the contest; otherwise, there is no need to create a different class to solve the questions using the function.*/
import java.util.*;

public class Frequencyofdigit {

    static int FrequencyofDigits(long n, int d) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == d) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int d = sc.nextInt();
        System.out.println(FrequencyofDigits(n, d));
    }
}
