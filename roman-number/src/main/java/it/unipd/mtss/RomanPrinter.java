////////////////////////////////////////////////////////////////////
// JATIN BAJAJ 2138010
// LUKA LACIC 2145595
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int number) {
        return printAsciiArt(IntegerToRoman.convert(number));
    }

    private static String printAsciiArt(String roman) {
        String[] lines = {"", "", "", "", "", ""};

        for (char c : roman.toCharArray()) {
            if (c == 'I') {
                lines[0] += " _____  ";
                lines[1] += "|_   _| ";
                lines[2] += "  | |   ";
                lines[3] += "  | |   ";
                lines[4] += "  | |   ";
                lines[5] += " |___|  ";
            } else if (c == 'V') {
                lines[0] += "_      _  ";
                lines[1] += "\\ \\    / /  ";
                lines[2] += " \\ \\  / /   ";
                lines[3] += "  \\ \\/ /    ";
                lines[4] += "   \\  /     ";
                lines[5] += "    \\/      ";
            }
        }
        return String.join("\n", lines);
    }
}