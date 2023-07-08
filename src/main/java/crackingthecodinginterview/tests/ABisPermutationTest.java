package crackingthecodinginterview.tests;

import org.junit.jupiter.api.Test;

import static crackingthecodinginterview.ABisPermutation.isPermutations;
import static crackingthecodinginterview.ABisPermutation.isPermutations2;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABisPermutationTest {
    @Test
    public void testPermutation1() {
        String a = "abc";
        String b = "cab";
        boolean expected = true;
        boolean result1 = isPermutations(a, b);
        boolean result2 = isPermutations2(a, b);
        assertEquals(expected, result1);
        assertEquals(expected, result2);
    }

    @Test
    public void testPermutation2() {
        String a = "hello";
        String b = "llohe";
        boolean expected = true;
        boolean result1 = isPermutations(a, b);
        boolean result2 = isPermutations2(a, b);
        assertEquals(expected, result1);
        assertEquals(expected, result2);
    }

    @Test
    public void testPermutation3() {
        String a = "abc";
        String b = "def";
        boolean expected = false;
        boolean result1 = isPermutations(a, b);
        boolean result2 = isPermutations2(a, b);
        assertEquals(expected, result1);
        assertEquals(expected, result2);
    }

    @Test
    public void testPermutation4() {
        String a = "";
        String b = "";
        boolean expected = true;
        boolean result1 = isPermutations(a, b);
        boolean result2 = isPermutations2(a, b);
        assertEquals(expected, result1);
        assertEquals(expected, result2);
    }
}
