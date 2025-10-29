/*Get Stair Paths
You are given a number n representing the number of stairs in a staircase. You are standing at the top of the floor. In one step you can jump 1 stair, 2 stairs, or 3 stairs.

Return the list of all paths that can be used to climb up the staircase. See examples for more clarity regarding output.

Note: Write the code recursively. The purpose is to learn recursion and not just solve the problem.

Input Format
First line of input contains a single integer n.

Output Format
Return the list of all paths that can be used to climb up the staircase.

Example 1
Input

3
Output

[111, 12, 21, 3]
Explanation

You can climb the stairs in 4 ways.

111 -> climb up one step, then one step, and then again one step.

12 -> climb up 1 step and then 2 steps.

21 -> climb up 2 steps and then 1 step.

3 -> climb up 3 steps.

Example 2
Input

2
Output

[11, 2]
Explanation

You can climb up this in 2 ways.

Constraints
1 <= n <= 10
Approach:

Start from n and recur for all the options 1, 2, and 3. And add them to the string. In the end you can get the list of all paths.
Time Complexity : O(3^n)

Space Complexity : O(n*3^n)

Java*/
import java.io.*;
import java.util.*;

public class GetStairPaths {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // Read the number of stairs (n)
        int n = input.nextInt();

        // Get all possible paths (combinations of steps)
        ArrayList<String> paths = getStairPaths(n);

        // Print the list of paths
        System.out.println(paths);
    }

    /**
     * Recursive function that returns all possible ways
     * to climb 'n' stairs when you can take 1, 2, or 3 steps at a time.
     */
    public static ArrayList<String> getStairPaths(int n) {

        // BASE CASE:
        // If n <= 0, handle two cases:
        if (n <= 0) {
            ArrayList<String> bres = new ArrayList<>();

            // Case 1: n == 0
            // It means you have reached exactly the top — one valid path completed.
            if (n == 0) {
                bres.add("");  // Add empty string to represent a valid completion
            }

            // Case 2: n < 0
            // You have gone past the top of the stairs — no valid path.
            return bres;
        }

        // RECURSIVE CALLS:
        // Explore all 3 possibilities from the current step:
        // 1-step, 2-steps, and 3-steps forward.
        ArrayList<String> res1 = getStairPaths(n - 1);  // paths after taking 1 step
        ArrayList<String> res2 = getStairPaths(n - 2);  // paths after taking 2 steps
        ArrayList<String> res3 = getStairPaths(n - 3);  // paths after taking 3 steps

        // This will store all final combinations for the current n
        ArrayList<String> res = new ArrayList<>();

        // Add "1" before all paths from res1 (since we took 1 step first)
        for (String str : res1) {
            res.add(1 + str);
        }

        // Add "2" before all paths from res2 (since we took 2 steps first)
        for (String str : res2) {
            res.add(2 + str);
        }

        // Add "3" before all paths from res3 (since we took 3 steps first)
        for (String str : res3) {
            res.add(3 + str);
        }

        // Return the complete list of paths
        return res;
    }
}
