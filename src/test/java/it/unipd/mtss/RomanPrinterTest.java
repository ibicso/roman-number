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

        // Test per i numeri 4-6
        @Test
        public void testPrint4to6() {

            assertEquals(
                "  _____    __      __  \n" +
                " |_   _|   \\ \\    / /  \n" +
                "   | |      \\ \\  / /   \n" +
                "   | |       \\ \\/ /    \n" +
                "  _| |_       \\  /     \n" +
                " |_____|       \\/      \n" +
                "",
                RomanPrinter.print(4)
            );
            
            assertEquals(
                " __      __  \n" +
                " \\ \\    / /  \n" +
                "  \\ \\  / /   \n" +
                "   \\ \\/ /    \n" +
                "    \\  /     \n" +
                "     \\/      \n" +
                "",
                RomanPrinter.print(5)
            );
            
            assertEquals(
                " __      __    _____   \n" +
                " \\ \\    / /   |_   _|  \n" +
                "  \\ \\  / /      | |    \n" +
                "   \\ \\/ /       | |    \n" +
                "    \\  /       _| |_   \n" +
                "     \\/       |_____|  \n" +
                "",
                RomanPrinter.print(6)
            );
        }

        @Test
        public void testPrintTo20() {
            assertEquals(
                " __   __   __      __  \n" +
                " \\ \\ / /   \\ \\    / /  \n" +
                "  \\ V /     \\ \\  / /   \n" +
                "   > <       \\ \\/ /    \n" +
                "  / . \\       \\  /     \n" +
                " /_/ \\_\\       \\/      \n" +
                "",
                RomanPrinter.print(15)
            );
            
            assertEquals(
                " __   __    _____    __   __  \n" +
                " \\ \\ / /   |_   _|   \\ \\ / /  \n" +
                "  \\ V /      | |      \\ V /   \n" +
                "   > <       | |       > <    \n" +
                "  / . \\     _| |_     / . \\   \n" +
                " /_/ \\_\\   |_____|   /_/ \\_\\  \n" +
                "",
                RomanPrinter.print(19)
            );
            
            assertEquals(
                " __   __   __   __  \n" +
                " \\ \\ / /   \\ \\ / /  \n" +
                "  \\ V /     \\ V /   \n" +
                "   > <       > <    \n" +
                "  / . \\     / . \\   \n" +
                " /_/ \\_\\   /_/ \\_\\  \n" +
                "",
                RomanPrinter.print(20)
            );
        }
}