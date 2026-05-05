////////////////////////////////////////////////////////////////////
// JATIN BAJAJ 2138010
// LUKA LACIC 2145595
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvert_WithNumberOne_ShouldReturnRomanI() {
        int number = 1;
        String roman = IntegerToRoman.convert(number);
        assertEquals("I", roman);
    }

    @Test
    public void testConvert_WithNumberTwo_ShouldReturnRomanII() {
        int number = 2;
        String roman = IntegerToRoman.convert(number);
        assertEquals("II", roman);
    }

    @Test
    public void testConvert_WithNumberThree_ShouldReturnRomanIII() {
        int number = 3;
        String roman = IntegerToRoman.convert(number);
        assertEquals("III", roman);
    }

    @Test
    public void testConvert_WithNumberFour_ShouldReturnRomanIV() {
        int number = 4;
        String roman = IntegerToRoman.convert(number);
        assertEquals("IV", roman);
    }

    @Test
    public void testConvert_WithNumberFive_ShouldReturnRomanV() {
        int number = 5;
        String roman = IntegerToRoman.convert(number);
        assertEquals("V", roman);
    }

    @Test
    public void testConvert_WithNumberSix_ShouldReturnRomanVI() {
        int number = 6;
        String roman = IntegerToRoman.convert(number);
        assertEquals("VI", roman);
    }

    @Test
    public void testConvert_WithNumberNine_ShouldReturnRomanIX() {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    public void testConvert_WithNumberTen_ShouldReturnRomanX() {
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void testConvert_WithNumberFourteen_ShouldReturnRomanXIV() {
        assertEquals("XIV", IntegerToRoman.convert(14));
    }

    @Test
    public void testConvert_WithNumberNineteen_ShouldReturnRomanXIX() {
        assertEquals("XIX", IntegerToRoman.convert(19));
    }

    @Test
    public void testConvert_WithNumberTwenty_ShouldReturnRomanXX() {
        assertEquals("XX", IntegerToRoman.convert(20));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvert_WithZero_ShouldThrowException() {
        IntegerToRoman.convert(0);
    }
    
   @Test(expected = IllegalArgumentException.class)
    public void testConvert_WithNegative_ShouldThrowException() {
        IntegerToRoman.convert(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvert_OverRange_ShouldThrowException() {
        IntegerToRoman.convert(21); 
    }
}
