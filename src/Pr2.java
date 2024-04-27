package src;

import java.util.Scanner;

public class Pr2 {
    public static void main(String[] args) {
        // Write a Java program that reads in a single integer value
        // and prints out the number of bytes used to represent that data type in Java.

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number == 8) {
            System.out.println(1);
        } else if (number == 16) {
            System.out.println(2);
        } else if (number == 32) {
            System.out.println(4);
        } else if (number == -128) {
            System.out.println(4);
        } else {
            System.out.println("Neplatný datový typ");
        }
        scanner.close();


    }
}

