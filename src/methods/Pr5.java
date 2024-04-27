package src.methods;

import java.util.Scanner;

public class Pr5 {
    public static void main(String[] args) {
        //Here's the method callMeAwesome.
        // Write the invocation of this method in the template below.
        callMeAwesome();
    }

    // Do not change code below
    public static void callMeAwesome() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println(name + ", you're awesome!");
    }
}
