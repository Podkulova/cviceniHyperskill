package src.ternaryOperator;

import java.util.Scanner;

public class Pr19 {
    public static void main(String[] args) {

        String rabbit = "";
        String bat = "";
        String goose = "";
        String deer = "";
        String lion = "lion";
        String camel = "";


        Scanner scanner = new Scanner(System.in);
        String[] animals = {camel, lion, deer, goose, bat, rabbit};


        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.print("Please enter the number of the habitat you would like to view: > ");
            String userResponse = scan.nextLine();

            if (userResponse.equals("exit")) {
                System.out.println("See you later!");
                isRunning = false;
            } else {
                int cage = Integer.parseInt(userResponse);
                System.out.println(animals[cage]);
            }
        }
    }
}