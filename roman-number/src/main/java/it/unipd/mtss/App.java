////////////////////////////////////////////////////////////////////
// JATIN BAJAJ 2138010
// LUKA LACIC 2145595
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ROMAN CONVERTER TESTER ===");
        System.out.print("Inserire un numero (1-1000): ");

        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            try {
                String result = RomanPrinter.print(input);
                System.out.println("\nRisultato per " + input + ":");
                System.out.println(result);
            } catch (IllegalArgumentException e) {
                System.out.println("Errore: " + e.getMessage());
            }
        } else {
            System.out.println("Errore: Inserisci un numero intero valido.");
        }

        scanner.close();
        System.out.println("==============================");
    }
}