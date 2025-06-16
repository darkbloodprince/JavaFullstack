/*AS Basic DataTypes 2
Given 3 integer variables from the user ( a, b, c ) and find out how many of them are negative numbers.

After finding out the total count of negative numbers, return the count.

If there are no negative numbers, count will be 0.

Input Format
First line contains input of a, b, c separated by a space.

You need to complete printCount function which contains 3 integers and then and return return the result

Output Format
First line contains total count of negative numbers out of the three input numbers (a,b,c)

Example 1
Input

2 3 -10
Output

1
Explanation

There is only 1 negative number i.e. -10 , so count is 1.

Example 2
Input

7 -20 -16
Output

2
Explanation

There are two negative numbersM : -20 & -16 , so count is 2.

Constraints
-10^6<=a<=10^6
-10^6<=b<=10^6
-10^6<=c<=10^6*/
import java.util.*;

public class ASBasicDataTypes2 {
    static int printCount(int a, int b, int c){
        int count = 0;
        if (a < 0) count++;
        if (b < 0) count++;
        if (c < 0) count++;
        return count;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(printCount(a, b, c));
    }
}
