////////////////////////////////////////////////////////////////////
// Tobia Claut 2079245
// Nicolas Fracaro 2076420
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 1000) {
            throw new IllegalArgumentException("Numeri tra 1 e 1000");
        }

        // Lettere romane e valori corrispondenti
        String[] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder romanNumber = new StringBuilder();

        // Itera attraverso i valori romani e aggiungi le lettere corrispondenti
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                romanNumber.append(romanLetters[i]);
            }
        }

        return romanNumber.toString();
    }
}
