////////////////////////////////////////////////////////////////////
// JATIN BAJAJ 2138010
// LUKA LACIC 2145595
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertTrue;

public class AppTest {

    @Test
    public void testMain_ValidInput() {
        String input = "10\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.main(new String[0]);

        String output = out.toString();
        assertTrue(output.contains("> <"));
    }

    @Test
    public void testMain_InvalidInput_NotAnInteger() {
        String input = "abc\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.main(new String[0]);

        assertTrue(out.toString().contains("Inserisci un numero intero valido"));
    }

    @Test
    public void testMain_NumberOutOfRange() {
        String input = "1001\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.main(new String[0]);

        assertTrue(out.toString().contains("Errore:"));
    }
}