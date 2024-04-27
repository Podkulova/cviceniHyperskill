package src.relationalOperator;

import java.util.Scanner;

/*
In Java, write a program that reads two integer values from the user and compares them.
If the first number is greater than the second, print "TRUE", else print "FALSE".
You should first scan an integer 'a' and then scan an integer 'b'.
 */
public class Pr10 {
    public static void main(String[] args) {
        // Create a Scanner to read input from the user.
        Scanner sc = new Scanner(System.in);

        // Read two integer values from the user.
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Compare the two values and print the result.
        // ADD YOUR CODE HERE
        if (a > b) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        sc.close();
    }
}
