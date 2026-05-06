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
                lines[0] += "__      __  ";
                lines[1] += "\\ \\    / /  ";
                lines[2] += " \\ \\  / /   ";
                lines[3] += "  \\ \\/ /    ";
                lines[4] += "   \\  /     ";
                lines[5] += "    \\/      ";
            } else if (c == 'X') {
                lines[0] += "__   __ ";
                lines[1] += "\\ \\ / / ";
                lines[2] += " \\ V /  ";
                lines[3] += "  > <   ";
                lines[4] += " / . \\  ";
                lines[5] += "/_/ \\_\\ ";
            } else if (c == 'L') {
                lines[0] += " _        ";
                lines[1] += "| |       ";
                lines[2] += "| |       ";
                lines[3] += "| |       ";
                lines[4] += "| |____   ";
                lines[5] += "|______|  ";
            } else if (c == 'C') {
                lines[0] += "  _____  ";
                lines[1] += " / ____| ";
                lines[2] += "| |      ";
                lines[3] += "| |      ";
                lines[4] += "| |____  ";
                lines[5] += " \\_____| ";
            } else if (c == 'D') {
                lines[0] += " _____    ";
                lines[1] += "|  __ \\   ";
                lines[2] += "| |  | |  ";
                lines[3] += "| |  | |  ";
                lines[4] += "| |__| |  ";
                lines[5] += "|_____/   ";
            } else if (c == 'M') {
                lines[0] += " __  __  "; 
                lines[1] += "|  \\/  | "; 
                lines[2] += "| \\  / | ";
                lines[3] += "| |\\/| | "; 
                lines[4] += "| |  | | "; 
                lines[5] += "|_|  |_| ";
            }
        }
        return String.join("\n", lines);
    }
}