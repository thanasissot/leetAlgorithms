package crackingthecodinginterview.chapter1.tests;

import org.junit.jupiter.api.Test;

import static crackingthecodinginterview.chapter1.F_StringCompression.stringCompression;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class F_StringCompression {
    @Test
    public void testStringCompression_Compress() {
        String input = "aabcccccaaa";
        String expected = "a2b1c5a3";
        String result = stringCompression(input);
        assertEquals(expected, result);
    }

    @Test
    public void testStringCompression_NoCompression() {
        String input = "abc";
        String expected = "abc";
        String result = stringCompression(input);
        assertEquals(expected, result);
    }

    @Test
    public void testStringCompression_SingleCharacter() {
        String input = "a";
        String expected = "a";
        String result = stringCompression(input);
        assertEquals(expected, result);
    }

    @Test
    public void testStringCompression_EmptyString() {
        String input = "";
        String expected = "";
        String result = stringCompression(input);
        assertEquals(expected, result);
    }

    @Test
    public void testStringCompression_MixedCharacters() {
        String input = "aabbbcccddd";
        String expected = "a2b3c3d3";
        String result = stringCompression(input);
        assertEquals(expected, result);
    }

    @Test
    public void testStringCompression_LowercaseUppercase() {
        String input = "aaAAAbbbbCCCC";
        String expected = "a2A3b4C4";
        String result = stringCompression(input);
        assertEquals(expected, result);
    }

}
