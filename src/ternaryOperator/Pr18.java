package src.ternaryOperator;

public class Pr18 {
    public static void main(String[] args) {
        int x = 15;
        int y = 20;

        long max2 = (x < y) ? (y + x) : (y -x);

        System.out.println(max2);
    }
}
