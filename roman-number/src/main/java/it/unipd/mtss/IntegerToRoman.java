////////////////////////////////////////////////////////////////////
// JATIN BAJAJ 2138010
// LUKA LACIC 2145595
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    
    public static String convert(int number) {
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < number; i++) {
            roman.append("I");
        }
        return roman.toString();
    }
}