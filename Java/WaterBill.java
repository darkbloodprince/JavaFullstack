/*Water Bill
In this task, you need to identify the water bill for a household

You are given the total liter of water used by a house and output the total water bill. The water bill is calculated as follows:

For first 100 litres: Rs. 15 per litre

For next 100 litres: Rs. 14 per litre

After 200 litres: Rs. 12 per litre

Input Format
The first and only line of input is the number of litres of water used

Output Format
Return the total bill of the house based on given conditions

Example 1
Input

105
Output

1570
Explanation

We add 15*100 for first 100 litres and 14*5 for next 5 litres.

Example 2
Input

70
Output

1050
Explanation

We add 15*70 for first 70 litres

Constraints
1 < n < 10^6*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public static int waterBill(int w) {
        int bill = 0;
        if (w <= 100) {
            // All usage in the first slab
            bill = 15 * w;
        } else if (w <= 200) {
            // First 100 litres at 15, remaining at 14
            bill = 15 * 100 + 14 * (w - 100);
        } else {
            // First 100 at 15, next 100 at 14, rest at 12
            bill = 15 * 100 + 14 * 100 + 12 * (w - 200);
        }
        return bill;
    }
}


public class WaterBill
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
	    int w=sc.nextInt();
		System.out.println(Solution.waterBill(w));
	}
}