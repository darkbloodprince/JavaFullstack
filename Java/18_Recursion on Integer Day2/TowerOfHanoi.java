/*Tower of Hanoi
Using a helper stick (peg), shift all rings from peg A to peg B using peg C.

All rings are initally placed in ascending order, smallest being on top.

No bigger ring can be placed over a smaller ring.

Complete the given function.

Input Format
Single line input containing a single integer N denoting the no of rings.

Output Format
Print the instructions to move all the rings from peg A to B in a new line each.

Each line should follow format : Moving ring i from A/B/C to A/B/C

Example 1
Input

2
Output:

Moving ring 1 from A to C
Moving ring 2 from A to B
Moving ring 1 from C to B

Example 2
Input

3
Output:

Moving ring 1 from A to B
Moving ring 2 from A to C
Moving ring 1 from B to C
Moving ring 3 from A to B
Moving ring 1 from C to A
Moving ring 2 from C to B
Moving ring 1 from A to B
Constraints
1<=N<=10
Hint 1
Use recursion

Approach:

Let rod 1 = 'A', rod 2 = 'B', rod 3 = 'C'. An example with 2 disks : Step 1 : Shift first disk from 'A' to 'B'.

Step 2 : Shift second disk from 'A' to 'C'.

Step 3 : Shift first disk from 'B' to 'C'.

The pattern here is :

Shift 'n-1' disks from 'A' to 'B', using C.
Shift last disk from 'A' to 'C'.
Shift 'n-1' disks from 'B' to 'C', using A.
Time Complexity: O(2 ^ n)

Space Complexity: O(n)

Below is the implementation of the above code:

Java*/
import java.util.Scanner;

public class TowerofHanoi {

    // Recursive function to solve Towers of Hanoi
    // n     -> number of disks
    // source -> the rod where disks are currently
    // dest   -> the rod where we want to move disks
    static void towersOfHanoi(int n, char source, char dest) {
        // Base case: if there are no disks, nothing to move
        if (n == 0)
            return;

        // There are 3 rods: A, B, C
        // If we know source and dest, the third one is temp (auxiliary rod)
        // Formula: 'A' + 'B' + 'C' - source - dest → gives the missing rod
        char temp = (char) ('A' + 'B' + 'C' - source - dest);

        // Step 1: Move (n-1) disks from source → temp (using dest as helper)
        towersOfHanoi(n - 1, source, temp);

        // Step 2: Move the nth (largest) disk from source → dest
        System.out.println("Moving ring " + n + " from " + source + " to " + dest);

        // Step 3: Move (n-1) disks from temp → dest (using source as helper)
        towersOfHanoi(n - 1, temp, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of disks
        int n = sc.nextInt();

        // Call recursive function to move n disks from rod A → rod B
        // (Rod C will be used as helper automatically)
        towersOfHanoi(n, 'A', 'B');
    }
}
