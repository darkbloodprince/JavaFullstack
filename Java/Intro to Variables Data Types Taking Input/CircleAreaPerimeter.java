/*Circle Area-Perimeter
You are required to take the radius of a circle as input from the user, and finally, print the area and perimeter of the circle.

Note: Take pi as 3

Input Format
One line contains an integer number which is the radius of a circle.

Output Format
Print the area of the circle in the first line

Print the perimeter of the circle in the second line

Example 1
Input

4
Output

48
24
Explanation

pi * r * r = 48 and 2 * pi * r = 24, where r is the radius.

Example 2
Input

7
Output

147
42
Explanation

pi * r * r = 147 and 2 * pi * r = 42, where r is the radius

Constraints
0 <= radius <= 100000

pi = 3*/
import java.util.*;

public class CircleAreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long radius = sc.nextLong();
        sc.close();

        long pi = 3L;
        long area = pi * radius * radius;
        long perimeter = 2L * pi * radius;

        System.out.println(area);
        System.out.println(perimeter);
    }
}
