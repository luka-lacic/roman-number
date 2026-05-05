////////////////////////////////////////////////////////////////////
// JATIN BAJAJ 2138010
// LUKA LACIC 2145595
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testPrint_WithValidNumber_ShouldReturnNonEmptyString() {
        
        int number = 1;
        
        String result = RomanPrinter.print(number);
        
        assertNotNull(result);
        assertTrue(result.contains("|")); 
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrint_WithInvalidNumber_ShouldThrowException() {
 
        RomanPrinter.print(0);
    }
}
