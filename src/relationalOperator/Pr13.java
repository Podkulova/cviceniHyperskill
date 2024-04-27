package src.relationalOperator;

import java.util.Scanner;

/*
Given an integer as an input, print True if its value falls within the interval
(−15,12]∪(14,17)∪[19,+∞). Otherwise, print False (case sensitive).
 */
public class Pr13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N > -15 && N <= 12 || N > 14 && N < 17 || N >= 19 ) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        scanner.close();
    }
}
