package src.relationalOperator;

import java.util.Scanner;

//Write a program that reads the numbers a, b, c and checks if there's a pair of
// them that adds up to exactly 20.
//The program must output true or false.
public class Pr9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 + num2 == 20) {
            System.out.println("true");
        } else if (num1 + num3 == 20) {
            System.out.println("true");
        } else if (num2 + num3 == 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        scanner.close();
    }
}
