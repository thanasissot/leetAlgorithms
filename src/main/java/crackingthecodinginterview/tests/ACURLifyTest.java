package crackingthecodinginterview.tests;

import org.junit.jupiter.api.Test;

import static crackingthecodinginterview.ACURLify.urlify;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ACURLifyTest {
    @Test
    public void testURLify1() {
        String input = "Mr John Smith    ";
        int trueLength = 13;
        String expected = "Mr%20John%20Smith";
        String result = new String(urlify(input.toCharArray()));
        assertEquals(expected, result);
    }

    @Test
    public void testURLify2() {
        String input = "Hello World  ";
        int trueLength = 11;
        String expected = "Hello%20World";
        String result = new String(urlify(input.toCharArray()));
        assertEquals(expected, result);
    }

    @Test
    public void testURLify3() {
        String input = "Spaces";
        int trueLength = 8;
        String expected = "Spaces";
        String result = new String(urlify(input.toCharArray()));
        assertEquals(expected, result);
    }

    @Test
    public void testURLify4() {
        String input = "NoSpaces";
        int trueLength = 8;
        String expected = "NoSpaces";
        String result = new String(urlify(input.toCharArray()));
        assertEquals(expected, result);
    }
}
