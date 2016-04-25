package String;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dhruv on 4/24/16.
 */
public class AnagramTest {
    String ana = "asddfgglja";
    @Test
    public void testIsAnagram() throws Exception {
        Anagram a = new Anagram();
        assertTrue(a.isAnagram("java","aavj")); // even length
        assertTrue(a.isAnagram("asdfg","dgfsa")); // odd length
        assertTrue(a.isAnagram("Asdfg","dGfsA")); // odd length - dffferent case
        assertTrue(a.isAnagram(ana,ana)); // same reference
        assertFalse(a.isAnagram("java","aavja")); // different length
        assertFalse(a.isAnagram("java",null)); // null
        assertFalse(a.isAnagram("aa","bb")); // unique case
        assertFalse(a.isAnagram("","")); // unique case
    }

    @Test
    public void testIsAnagram_HashMap() throws Exception {
        Anagram a = new Anagram();
        assertTrue(a.isAnagram_HashMap("java","aavj"));
        assertTrue(a.isAnagram_HashMap("asdfg","dgfsa"));
        assertTrue(a.isAnagram_HashMap(ana,ana)); // same reference
        assertFalse(a.isAnagram_HashMap("java","aavja"));
        assertFalse(a.isAnagram_HashMap("java",null));
    }
}