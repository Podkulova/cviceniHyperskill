package src.relationalOperator;

import java.util.Scanner;

public class Pr12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N > 0) {
            System.out.println("Positive");
        } else if (N < 0){
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
    }
        scanner.close();
    }
}
