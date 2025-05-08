////////////////////////////////////////////////////////////////////
// [STUDENT-1-NAME-SURNAME] [STUDENT-1-ID]
// [STUDENT-2-NAME-SURNAME] [STUDENT-2-ID]
////////////////////////////////////////////////////////////////////


package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testPrint1to3() {
        // Test per il numero 1 (I)
        assertEquals(
            "  _____   \n" +
            " |_   _|  \n" +
            "   | |    \n" +
            "   | |    \n" +
            "  _| |_   \n" +
            " |_____|  \n",
            RomanPrinter.print(1)
        );

        // Test per il numero 2 (II)
        assertEquals(
            "  _____     _____   \n" +
            " |_   _|   |_   _|  \n" +
            "   | |       | |    \n" +
            "   | |       | |    \n" +
            "  _| |_     _| |_   \n" +
            " |_____|   |_____|  \n",
            RomanPrinter.print(2)
        );

        // Test per il numero 3 (III)
        assertEquals(
            "  _____     _____     _____   \n" +
            " |_   _|   |_   _|   |_   _|  \n" +
            "   | |       | |       | |    \n" +
            "   | |       | |       | |    \n" +
            "  _| |_     _| |_     _| |_   \n" +
            " |_____|   |_____|   |_____|  \n",
            RomanPrinter.print(3)
        );
    }
}