package String;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Dhruv
 * @version 1.0
 *          Date 11/11/16
 *          <p>
 *          This is a implementation class for
 */
public class ReverseTest {

    @Test
    public void testCheckReverse_Recursion() throws Exception {
        String len1 = "a";
        String str1 = "jba";
        String str2 = "19ijsd:)(*b4jif2039ojfFGOskl+=>DFJ";
        String nul = null;
        String empty = "";

        Reverse r = new Reverse();

        // Checking the Recursion
        assertTrue(r.reverse_Recursion(str1).equals("abj"));
        assertTrue(r.reverse_Recursion(str2).equals("JFD>=+lksOGFfjo9302fij4b*():dsji91"));
        assertFalse(r.reverse_Recursion(str1).equals("abJ"));
        assertTrue(r.reverse_Recursion(len1).equals(len1));
        assertTrue(r.reverse_Recursion(empty).equals(empty));
        assertTrue(r.reverse_Recursion(nul)==null);

    }

    @Test
    public void testCheckReverse_char() throws Exception {

        String len1 = "a";
        String str1 = "jba";
        String str2 = "19ijsd:)(*b4jif2039ojfFGOskl+=>DFJ";
        String nul = null;
        String empty = "";

        Reverse r = new Reverse();

        // Checking the Recursion
        assertTrue(r.reverse_charArray(str1).equals("abj"));
        assertTrue(r.reverse_charArray(str2).equals("JFD>=+lksOGFfjo9302fij4b*():dsji91"));
        assertFalse(r.reverse_charArray(str1).equals("abJ"));
        assertTrue(r.reverse_charArray(len1).equals(len1));
        assertTrue(r.reverse_charArray(empty).equals(empty));
        assertTrue(r.reverse_charArray(nul)==null);
    }

    @Test
    public void testCheckReverse_StrBuilder() throws Exception {
        String len1 = "a";
        String str1 = "jba";
        String str2 = "19ijsd:)(*b4jif2039ojfFGOskl+=>DFJ";
        String nul = null;
        String empty = "";

        Reverse r = new Reverse();

        // Checking the Recursion
        assertTrue(r.reverse_StringBuilder(str1).equals("abj"));
        assertTrue(r.reverse_StringBuilder(str2).equals("JFD>=+lksOGFfjo9302fij4b*():dsji91"));
        assertFalse(r.reverse_StringBuilder(str1).equals("abJ"));
        assertTrue(r.reverse_StringBuilder(len1).equals(len1));
        assertTrue(r.reverse_StringBuilder(empty).equals(empty));
        assertTrue(r.reverse_StringBuilder(nul)==null);
    }
}
