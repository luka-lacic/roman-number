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

    @Test
    public void testPrint_WithNumberOneHundred_ShouldReturnAsciiC() {
        String result = RomanPrinter.print(100);
        String expected = 
            "  _____  \n" +
            " / ____| \n" +
            "| |      \n" +
            "| |      \n" +
            "| |____  \n" +
            " \\_____| ";
        assertEquals(expected, result);
    }

    @Test
    public void testPrint_WithNumberFiveHundred_ShouldReturnAsciiD() {
        String result = RomanPrinter.print(500);
        String expected = 
            " _____    \n" +
            "|  __ \\   \n" +
            "| |  | |  \n" +
            "| |  | |  \n" +
            "| |__| |  \n" +
            "|_____/   ";
        assertEquals(expected, result);
    }

    // Controllare gli spazi
    // @Test
    // public void testPrint_WithNumberNinehundredNinetynine_ShouldReturnAsciiCMXCIX() {
    //     String result = RomanPrinter.print(999);
    //     String expected = 
    //         "  _____   __  __  __   __   _____   _____  __   __ \n" +
    //         " / ____| |  \\/  | \\ \\ / /  / ____| |_   _| \\ \\ / / \n" +
    //         "| |      | \\  / |  \\ V /  | |        | |    \\ V /  \n" +
    //         "| |      | |\\/| |   > <   | |        | |     > <   \n" +
    //         "| |____  | |  | |  / . \\  | |____    | |    / . \\  \n" +
    //         " \\_____| |_|  |_| /_/ \\_\\  \\_____|  |___|  /_/ \\_\\ \n";
    //     assertEquals(expected, result);
    // }

    @Test
    public void testPrint_WithNumberOneThousand_ShouldReturnAsciiM() {
        String result = RomanPrinter.print(1000);
        String expected = 
            " __  __  \n" +
            "|  \\/  | \n" +
            "| \\  / | \n" +
            "| |\\/| | \n" +
            "| |  | | \n" +
            "|_|  |_| ";
        assertEquals(expected, result);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrint_WithInvalidNumberSmaller_ShouldThrowException() {
 
        RomanPrinter.print(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrint_WithInvalidNumberBigger_ShouldThrowException() {
 
        RomanPrinter.print(1001);
    }
}
