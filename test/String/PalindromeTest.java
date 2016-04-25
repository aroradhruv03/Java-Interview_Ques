package String;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dhruv on 4/23/16.
 */
public class PalindromeTest {

    @Test
    public void testCheckPalindrome_Recursion() throws Exception {

        // Example with even & odd length
        String len1 = "a";
        String palindrome = "jabaj";
        String palindrome2 = "jabbaj";
        String notPalindrome = "river";
        String notPalindrome2 = "rier";
        String nul = null;
        String empty = "";


        Palindrome p = new Palindrome();

        // Checking the Recursion
        assertTrue(p.checkPalindrome_Recursion(palindrome));
        assertTrue(p.checkPalindrome_Recursion(palindrome2));
        assertTrue(p.checkPalindrome_Recursion(len1));
        assertFalse(p.checkPalindrome_Recursion(notPalindrome));
        assertFalse(p.checkPalindrome_Recursion(notPalindrome2));
        assertFalse(p.checkPalindrome_Recursion(nul));
//      assertFalse(p.checkPalindrome_Recursion(empty)); // No Need for this assert in Recursive
    }

    @Test
    public void testCheckPalindrome_char() throws Exception {

        // Example with even & odd length
        String len1 = "a";
        String palindrome = "jabaj";
        String palindrome2 = "jabbaj";
        String notPalindrome = "river";
        String notPalindrome2 = "rier";
        String nul = null;
        String empty = "";


        Palindrome p = new Palindrome();

        // Checking the Recursion
        assertTrue(p.checkPalindrome_char(palindrome));
        assertTrue(p.checkPalindrome_char(palindrome2));
        assertTrue(p.checkPalindrome_char(len1));
        assertFalse(p.checkPalindrome_char(notPalindrome));
        assertFalse(p.checkPalindrome_char(notPalindrome2));
        assertFalse(p.checkPalindrome_char(nul));
        assertFalse(p.checkPalindrome_char(empty));
    }

    @Test
    public void testCheckPalindrome_StrBuilder() throws Exception {

        // Example with even & odd length
        String len1 = "a";
        String palindrome = "jabaj";
        String palindrome2 = "jabbaj";
        String notPalindrome = "river";
        String notPalindrome2 = "rier";
        String nul = null;
        String empty = "";


        Palindrome p = new Palindrome();

        // Checking the Recursion
        assertTrue(p.checkPalindrome_StrBuilder(palindrome));
        assertTrue(p.checkPalindrome_StrBuilder(palindrome2));
        assertTrue(p.checkPalindrome_StrBuilder(len1));
        assertFalse(p.checkPalindrome_StrBuilder(notPalindrome));
        assertFalse(p.checkPalindrome_StrBuilder(notPalindrome2));
        assertFalse(p.checkPalindrome_StrBuilder(nul));
        assertFalse(p.checkPalindrome_StrBuilder(empty));
    }
}