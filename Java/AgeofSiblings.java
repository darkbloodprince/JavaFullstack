/*Age of Siblings

There are 4 siblings with different ages. Age of each of the siblings is less than 10 years. They are playing a game with their mother and gave her a sum which is the sum of the age of two of the siblings. The mother has to return the product of the ages of the siblings who combined their ages to give the sum to the mother. You have to help the mother in finding the answer where you are provided with a 4 digit number representing the age of 4 siblings. Note that there would be only one possible answer

Input Format

A single 4 digit number representing the ages and a single number representing the sum

Output Format

A single integerrepresenting the product

Example 1

Input 4235 6

Output

8

Explanation

The 4 ages are 4, 2, 3 and 5. 4+2=6, so the two ages are 4 and 2. The product of 4 and 2 is 8.

Example 2

Input

3189 9

Output

B

Explanation The two brother with the age 8 and I have their age total as 9. The product of their ages is 8.

Constraints

1<=age_of_each_brother <=9

Age of each brother is unique
Here's the complete and corrected Java code for the problem "Age of Siblings", including the logic to extract individual digits from a 4-digit number and find the pair whose sum matches the given input, returning their product*/
import java.util.*;

public class AgeofSiblings
 {

    static int ageProduct(int ages, int sum) {
        // Extract the digits (individual sibling ages)
        int[] ageArray = new int[4];
        for (int i = 3; i >= 0; i--) {
            ageArray[i] = ages % 10;
            ages /= 10;
        }

        // Check all pairs for the given sum
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (ageArray[i] + ageArray[j] == sum) {
                    return ageArray[i] * ageArray[j];
                }
            }
        }

        // Should never reach here based on constraints
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ages = input.nextInt();
        int sum = input.nextInt();
        input.close();
        System.out.print(ageProduct(ages, sum));
    }
}
