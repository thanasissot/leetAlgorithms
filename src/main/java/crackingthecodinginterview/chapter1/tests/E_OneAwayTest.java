package crackingthecodinginterview.chapter1.tests;

import org.junit.jupiter.api.Test;

import static crackingthecodinginterview.chapter1.E_OneAway.isOneAway;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class E_OneAwayTest {
    @Test
    public void testIsOneAway_Insert() {
        String s1 = "pale";
        String s2 = "ple";
        boolean expected = true;
        boolean result = isOneAway(s1, s2);
        assertEquals(expected, result);
    }

    @Test
    public void testIsOneAway_Remove() {
        String s1 = "pales";
        String s2 = "pale";
        boolean expected = true;
        boolean result = isOneAway(s1, s2);
        assertEquals(expected, result);
    }

    @Test
    public void testIsOneAway_Replace() {
        String s1 = "pale";
        String s2 = "bale";
        boolean expected = true;
        boolean result = isOneAway(s1, s2);
        assertEquals(expected, result);
    }

    @Test
    public void testIsOneAway_MultipleEdits() {
        String s1 = "pale";
        String s2 = "bake";
        boolean expected = false;
        boolean result = isOneAway(s1, s2);
        assertEquals(expected, result);
    }

    @Test
    public void testIsOneAway_SameStrings() {
        String s1 = "abc";
        String s2 = "abc";
        boolean expected = true;
        boolean result = isOneAway(s1, s2);
        assertEquals(expected, result);
    }

    @Test
    public void testIsOneAway_EmptyStrings() {
        String s1 = "";
        String s2 = "";
        boolean expected = true;
        boolean result = isOneAway(s1, s2);
        assertEquals(expected, result);
    }
}
