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

s.length() == 10*/
import java.util.*;

public class TimeConversion {
    static void timeConversion(String s) {
        // Extract hour, minutes, seconds and AM/PM
        String hourStr = s.substring(0, 2);
        String minutes = s.substring(3, 5);
        String seconds = s.substring(6, 8);
        String ampm = s.substring(8, 10);

        int hour = Integer.parseInt(hourStr);

        // Convert hour based on AM/PM
        if (ampm.equals("AM")) {
            // 12 AM is 00 hour
            if (hour == 12) hour = 0;
        } else {
            // PM case, add 12 if hour is not 12
            if (hour != 12) hour += 12;
        }

        // Format hour to two digits
        String hourFormatted = (hour < 10) ? "0" + hour : String.valueOf(hour);

        // Print the converted time
        System.out.println(hourFormatted + ":" + minutes + ":" + seconds);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        timeConversion(str);
        sc.close();
    }
}
