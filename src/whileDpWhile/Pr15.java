package src.whileDpWhile;

import java.util.Scanner;

public class Pr15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        int maxDivisibleBy4 = Integer.MIN_VALUE; // Proměnná pro uchování maximálního prvků dělitelného 4

        int i = 0;
        while (i < count) {
            int number = scanner.nextInt(); // Načtení dalšího čísla ze vstupu
            if (number % 4 == 0 && number > maxDivisibleBy4) {
                maxDivisibleBy4 = number; // Aktualizace maximálního prvku dělitelného 4, pokud je potřeba
            }
            i++;
        }

        // Výpis maximálního prvku dělitelného 4
        System.out.println("Maximální prvek dělitelný 4: " + (maxDivisibleBy4 == Integer.MIN_VALUE ? "Nenalezen" : maxDivisibleBy4));

        scanner.close();
    }
}
