////////////////////////////////////////////////////////////////////
// Tobia Claut 2079245
// Nicolas Fracaro 2076420
////////////////////////////////////////////////////////////////////



package it.unipd.mtss;

import java.util.Map;

public class RomanPrinter {
    
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }


    private static String printAsciiArt(String romanNumber) {
        StringBuilder[] rows = new StringBuilder[6];
        for (int i = 0; i < 6; i++) {
            rows[i] = new StringBuilder();
        }
    
        for (char c : romanNumber.toCharArray()) {
            String[] art = romanAsciiMap.get(c);
            for (int i = 0; i < 6; i++) {
                rows[i].append(art[i]).append("  "); // spazio tra lettere
            }
        }
    
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row.toString()).append("\n");
        }
    
        return result.toString();
    }


    private static final Map<Character, String[]> romanAsciiMap = Map.of(
        'M', new String[]{
            "  __  __ ",
            " |  \\/  |",
            " | \\  / |",
            " | |\\/| |",
            " | |  | |",
            " |_|  |_|"
        },
        'D', new String[]{
            "  _____  ",
            " |  __ \\ ",
            " | |  | |",
            " | |  | |",
            " | |__| |",
            " |_____/ "
        },
        'C', new String[]{
            "   _____ ",
            "  / ____|",
            " | |     ",
            " | |     ",
            " | |____ ",
            "  \\_____|"
        },
        'L', new String[]{
            "  _      ",
            " | |     ",
            " | |     ",
            " | |     ",
            " | |____ ",
            " |______|"
        },
        'X', new String[]{
            " __   __",
            " \\ \\ / /",
            "  \\ V / ",
            "   > <  ",
            "  / . \\ ",
            " /_/ \\_\\"
        },
        'V', new String[]{
            " __      __",
            " \\ \\    / /",
            "  \\ \\  / / ",
            "   \\ \\/ /  ",
            "    \\  /   ",
            "     \\/    "
        },
        'I', new String[]{
            "  _____ ",
            " |_   _|",
            "   | |  ",
            "   | |  ",
            "  _| |_ ",
            " |_____|"
        }
    );

    
}
