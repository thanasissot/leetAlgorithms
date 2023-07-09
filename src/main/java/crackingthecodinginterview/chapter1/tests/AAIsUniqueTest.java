package crackingthecodinginterview.chapter1.tests;

import org.junit.jupiter.api.Test;

import static crackingthecodinginterview.chapter1.AAisUnique.isUnique;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AAIsUniqueTest {

    @Test
    public void testUniqueCharacters() {
        String input = "abcdefg";
        boolean expected = true;
        boolean result = isUnique(input);
        assertEquals(expected, result);
    }

    @Test
    public void testDuplicateCharacters() {
        String input = "hello";
        boolean expected = false;
        boolean result = isUnique(input);
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyString() {
        String input = "";
        boolean expected = true;
        boolean result = isUnique(input);
        assertEquals(expected, result);
    }

    @Test
    public void testSingleCharacter() {
        String input = "a";
        boolean expected = true;
        boolean result = isUnique(input);
        assertEquals(expected, result);
    }

    @Test
    public void testAllSameCharacters() {
        String input = "bbbbbb";
        boolean expected = false;
        boolean result = isUnique(input);
        assertEquals(expected, result);
    }

    @Test
    public void testMixedCharacters() {
        String input = "abcdeff";
        boolean expected = false;
        boolean result = isUnique(input);
        assertEquals(expected, result);
    }

    @Test
    public void testSpecialCharacters() {
        String input = "!@#$%^&*()";
        boolean expected = true;
        boolean result = isUnique(input);
        assertEquals(expected, result);
    }

}
