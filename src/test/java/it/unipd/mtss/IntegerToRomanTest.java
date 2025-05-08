////////////////////////////////////////////////////////////////////
// [STUDENT-1-NAME-SURNAME] [STUDENT-1-ID]
// [STUDENT-2-NAME-SURNAME] [STUDENT-2-ID]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {
    @Test
    public void testConvert4() {
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    public void testConvert5() {
        assertEquals("II", IntegerToRoman.convert(2));
    }

    @Test
    public void testConvert6() {
        assertEquals("III", IntegerToRoman.convert(3));
    }
}