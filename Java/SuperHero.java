/*Super Hero
You have given a string name of user. The user gives his name as to you and your task is to return string "name" is a Super Hero.

You have to complete ModifyName function which consists of single string name as input and return the string as mentioned above as output

Input Format
The first line of input contains a string.

Output Format
Print "name" is a Super Hero

Example 1
Input

Accio
Output

Accio is a Super Hero
Explanation

Output is formed as "Accio" (name) is a Super Hero

Example 2
Input

Main
Output

Main is a Super Hero
Explanation

Output is formed as "Main" (name) is a Super Hero

Constraints
1 <= |str| <= 100

Note
You do not have to worry about classes and objects for now; just keep that abstract. We will cover everything related to classes and objects in Module 2. For the time being, understand the syntax only. This is only shown to you so that you can be able to complete the function of the question given to you in the contest; otherwise, there is no need to create a different class to solve the questions using the function.*/
import java.util.*;

public class SuperHero {

    static String ModifyName(String name) {
        // Return the modified string
        return name + " is a Super Hero";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(ModifyName(name));   
    }
}
