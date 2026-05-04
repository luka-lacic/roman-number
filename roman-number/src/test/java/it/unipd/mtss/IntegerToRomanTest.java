////////////////////////////////////////////////////////////////////
// JATIN BAJAJ 2138010
// LUKA LACIC 2145595
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvertNumberOne() {
        int number = 1;
        String roman = IntegerToRoman.convert(number);
        assertEquals("I", roman);
    }

    @Test
    public void testConvertNumberTwo() {
        int number = 2;
        String roman = IntegerToRoman.convert(number);
        assertEquals("II", roman);
    }

    @Test
    public void testConvertNumberThree() {
        int number = 3;
        String roman = IntegerToRoman.convert(number);
        assertEquals("III", roman);
    }
}
