package src.whileDpWhile;

import java.util.Scanner;

/*Find the sum of all elements of a sequence, ending with the number 0.
The number 0 itself is not included into the sequence and serves as a sign of cessation.*/
public class Pr17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int sum = 0;
        do {
            n = scanner.nextInt();
            sum += n;
        } while (n != 0);
        System.out.println(sum);
    }
}
