////////////////////////////////////////////////////////////////////
// JATIN BAJAJ 2138010
// LUKA LACIC 2145595
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testPrint_WithNumberOne_ShouldReturnAsciiI() {
        String result = RomanPrinter.print(1);
        String expected = 
            " _____  \n" +
            "|_   _| \n" +
            "  | |   \n" +
            "  | |   \n" +
            "  | |   \n" +
            " |___|  ";
        assertEquals(expected, result);
    }

    @Test
    public void testPrint_WithNumberFive_ShouldReturnAsciiV() {
        String result = RomanPrinter.print(5);
        String expected = 
            "__      __  \n" +
            "\\ \\    / /  \n" +
            " \\ \\  / /   \n" +
            "  \\ \\/ /    \n" +
            "   \\  /     \n" +
            "    \\/      ";
        assertEquals(expected, result);
    }
    
    @Test
    public void testPrint_WithNumberTen_ShouldReturnAsciiX() {
        String result = RomanPrinter.print(10);
        String expected = 
            "__   __ \n" +
            "\\ \\ / / \n" +
            " \\ V /  \n" +
            "  > <   \n" +
            " / . \\  \n" +
            "/_/ \\_\\ ";
        assertEquals(expected, result);
    }
    @Test
    public void testPrint_WithNumberFifty_ShouldReturnAsciiL() {
        String result = RomanPrinter.print(50);
        String expected = 
            " _        \n" +
            "| |       \n" +
            "| |       \n" +
            "| |       \n" +
            "| |____   \n" +
            "|______|  ";
        assertEquals(expected, result);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrint_WithInvalidNumber_ShouldThrowException() {
 
        RomanPrinter.print(0);
    }
}
