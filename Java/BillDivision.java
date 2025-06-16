/*Bill Division
Two friends Anna and Brian, are deciding how to split the bill at a dinner. Each will only pay for the items they consume. Brian gets the check and calculates Anna portion. You must determine if his calculation is correct.

For example, assume the bill has the following prices: bill = [2, 4, 6], Anna declines to eat item k = bill[2] which costs 6. If Brian calculates the bill correctly, Anna will pay (2+4)/2 = 3. If he includes the cost of bill[2], he will calculate (2 + 4 + 6)/2 = 6. In the second case, he should refund 3 to Anna.

Your code should print the difference of the share charged by Brian and the actual share of Anna.

Input Format
The first line contains two space-separated integers n and k , the number of items ordered and the 0-based index of the item that Anna did not eat respectively.
The second line contains n space-separated integers bill[i] where 0 <= i < n.
The third line contains an integer, b , the amount of money that Brian charged Anna for her share of the bill.

Output Format
Return the integer difference of the share charged by Brian and the actual share of Anna.

Example 1
Input

4 1
3 10 2 9
12
Output

5
Explanation

Anna did not eat item bill[1] = 10, but she shared the rest of the items with Brian.
The total cost of the shared items is 3 + 9 + 2 = 14 and, split in half, the cost per person is b(actual) = 7.
Brian charged her b(charged) = 12 for her portion of the bill. We print the amount Anna was overcharged, So we print, b(charged) - b(actual) = 12 - 7 = 5, on a new line.

Constraints:
2 <= n < 10^5
0 <= k < n
0 <= bill[i] <= 10^4
0 <= b <= Sum of all bills
The difference amout will always be an integer.*/
import java.util.*;

class Accio {
    static int BillDivision(int n, int k, int[] bill, int charge) {
        int sum = 0;
        // sum up all items except bill[k]
        for (int i = 0; i < n; i++) {
            if (i == k) continue;
            sum += bill[i];
        }
        int actual = sum / 2;         // what Anna really owes
        return charge - actual;       // overcharge (0 if correct)
    }
}

public class BillDivision {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bill = new int[n];
        for (int i = 0; i < n; ++i) {
            bill[i] = sc.nextInt();
        }
        int charge = sc.nextInt();
        int ans = Accio.BillDivision(n, k, bill, charge);
        System.out.println(ans);
    }
}
