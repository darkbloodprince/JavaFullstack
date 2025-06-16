/*Pascal's Triangle
You are given a number n, you are required to print the first n rows of the pascal triangle.

Pascal Triangle

Your task is to complete the function pascalTriangle which receives n as the parameters and returns a 2D array containing the first n rows of the pascal's triangle.

Input Format
You are given a single integer n representing the number of rows of pascal's triangle.

Output Format
Print n lines of output, where ith line represents the ith row of the triangle.

Example 1
Input

3
Output

1
1 1
1 2 1
Example 2
Input

5
Output

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
Constraints:
1<= n <= 30*/
import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> triangle = pascalTriangle(n);
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static ArrayList<ArrayList<Integer>> pascalTriangle(int numRows) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                // The first and last element of each row is 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // sum of two elements from the previous row
                    row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(row);
        }
        return result;
    }
}
