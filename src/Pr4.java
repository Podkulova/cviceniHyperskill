package src;

import java.util.Scanner;

public class Pr4 {
    public static void main(String[] args) {
        // Please write a Java program that reads in a number of type double and prints it to the console as an integer.
        // All values are guaranteed to be within the valid range of their data types.
        Scanner scanner = new Scanner(System.in);

        // Read the number as a double.
        double number = scanner.nextDouble();

        // Convert and print the number to an integer.
        int number2 = (int) number;

        System.out.println(number2);

        scanner.close();
    }
}
