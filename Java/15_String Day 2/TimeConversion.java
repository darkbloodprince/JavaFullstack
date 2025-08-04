/*Time Conversion
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Note
12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.

12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Input Format
First line contains a 12-hour clock time as a string s.

Output Format
Print the 24-hour clock time.

Example 1
Input

07:05:45PM
Output

19:05:45
Explanation

The seventh hour in a 12 hour clock (in post meridiem) can be represented as nineteenth hour on a 24 hour clock.

The minute value and second value remain unchanged. So, the time on 24 hour clock is 19:05:45.

Example 2
Input

12:01:00PM
Output

12:01:00
Explanation

The twelfth hour of 12 hour clock (in post meridiem) remains unchanged on 24 hour clock.

The minute value and second value also remain unchanged. So, the time on 24 hour clock is 12:01:00.

Constraints
All valid 12-hour clock times.

s.length() == 10
Approach 1:

Create a new result string of length 8 as we don't require AM/PM in 24-hour time. Now copy string s to the result string upto the first 8 characters.

Now for 12 coming in the hour places we have two choices when converting if time is AM then we convert it to 00 and if it is PM we leave it as is.

Otherwise we simply check if the time AM then no change in the hour else we need to add 12 to the hour places to make it 24-hour format time.

Algorithm:

Create result string similar to string s but remove AM/PM.
Check if at 0 and 1 index 1 and 2 are present i.e. 12 is at hour place.
If true then check if 'A' is at index 8 of string s, if true then replace s[0] by '0' and s[1] by '0'.
If the 2nd step is false then check index 8 of string s, if it is 'P' then add 1 to s[0] (use typecasting) and 2 to s[1] (use typecasting).
Print the result string.
Time Complexity : O(1) as we have fixed length string input and any operations on the whole string will still result in constant time.

Space Complexity : O(1) since no extra space used.

1. Java*/
import java.util.*;

public class TimeConversion {
    static void timeConversion(String s) {
        //Write your code here
		StringBuilder result = new StringBuilder();
        result.setLength(8);
        for (int i = 0; i < 8; i++)
            result.setCharAt(i, s.charAt(i));
        if (s.charAt(0) == '1' && s.charAt(1) == '2') {
            if (s.charAt(8) == 'A') {
                result.setCharAt(0, '0');
                result.setCharAt(1, '0');
            }
        } else {
            if (s.charAt(8) == 'P') {
                result.setCharAt(0, (char) ((int) s.charAt(0) + 1));
                result.setCharAt(1, (char) ((int) s.charAt(1) + 2));
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        timeConversion(str);
        sc.close();
    }
}