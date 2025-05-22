/*Number of Days
Given the number of the month, your task is to calculate the number of days present in the particular month.

Note:- Consider non-leap year.

Input Format
An integer M, denoting the number of the month.

Output Format
Return the number of days in the month corresponding to the given number. Consider a non-leap year.

Example 1
Input

1
Output

31
Explanation

January has 31 days.

Example 2
Input

3
Output

31
Explanation

March has 31 days.

Constraints
1 <= M <= 12*/
import java.util.*;

public class NumberofDays {
    public static void main(String[] args) throws Throwable {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        int days;
        if (month == 2) {
            days = 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else {
            days = 31;
        }

        System.out.println(days);
    }
}
