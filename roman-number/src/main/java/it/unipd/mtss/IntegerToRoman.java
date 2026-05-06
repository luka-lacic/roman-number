////////////////////////////////////////////////////////////////////
// JATIN BAJAJ 2138010
// LUKA LACIC 2145595
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    
    public static String convert(int number) {
        if (number < 1 || number > 50) {
            throw new IllegalArgumentException("Range non valido");
        }
        
        int[] values = {50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"L", "XL","X", "IX", "V", "IV", "I"};
        
        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                roman.append(symbols[i]);
                number -= values[i];
            }
        }
        return roman.toString();
    }
}