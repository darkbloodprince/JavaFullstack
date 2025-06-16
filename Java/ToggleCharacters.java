/*Toggle Characters
Given a string of length N, toggle the case of all the characters in the string, i.e. You should set all lowercase characters to uppercase and vice versa.

Please note that the string may contain numbers or special characters as well.

Input Format
The input consists of two lines.

The first line of the input contains one integer N, denoting the size of the string.

The second line of the input contains the string S.

Output Format
Your code should output the string S with its characters toggled.

Example 1
Input

8
helloABC
Output

HELLOabc
Explanation

All the lower case alphabets got converted into upper case and vice versa.

Example 2
Input

4
aBC1
Output

Abc1
Explanation

All the lower case alphabets got converted into upper case and vice versa.

Constraints
`1 <= N <= 2*10^5``

where n is the size of the string.*/
import java.util.*;

public class ToggleCharacters {

  public static void main(String[] args) throws Throwable {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String str = sc.nextLine();
    toggleCase(n, str);
  }

  static void toggleCase(int n, String str) {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < n; i++) {
        char ch = str.charAt(i);
        if (Character.isLowerCase(ch)) {
            result.append(Character.toUpperCase(ch));
        } else if (Character.isUpperCase(ch)) {
            result.append(Character.toLowerCase(ch));
        } else {
            result.append(ch);  // for digits or special characters
        }
    }

    System.out.println(result.toString());
}

}