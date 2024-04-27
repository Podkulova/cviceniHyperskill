package src.whileDpWhile;

public class Pr14 {
    public static void main(String[] args) {
        int i = 5;
        do {
            i++;
            System.out.print(i + " ");
            i -= 2;
        } while (i > 1);
    }
}
