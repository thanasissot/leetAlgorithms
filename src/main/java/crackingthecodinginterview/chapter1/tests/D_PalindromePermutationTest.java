package crackingthecodinginterview.chapter1.tests;

import org.junit.jupiter.api.Test;

import static crackingthecodinginterview.chapter1.D_PalindromePermutation.isPalindromePermutation;
import static crackingthecodinginterview.chapter1.D_PalindromePermutation.isPalindromePermutation1;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class D_PalindromePermutationTest {

    @Test
    public void testPermutationOfPalindrome1() {
        String input = "tactcoa";
        boolean expected = true;
        boolean result = isPalindromePermutation(input);
        assertEquals(expected, result);
        result = isPalindromePermutation1(input);
        assertEquals(expected, result);
    }

    @Test
    public void testPermutationOfPalindrome2() {
        String input = "abc";
        boolean expected = false;
        boolean result = isPalindromePermutation(input);
        assertEquals(expected, result);
        result = isPalindromePermutation1(input);
        assertEquals(expected, result);
    }

    @Test
    public void testPermutationOfPalindrome3() {
        String input = "aab";
        boolean expected = true;
        boolean result = isPalindromePermutation(input);
        assertEquals(expected, result);
        result = isPalindromePermutation1(input);
        assertEquals(expected, result);
    }

    @Test
    public void testPermutationOfPalindrome4() {
        String input = "hello";
        boolean expected = false;
        boolean result = isPalindromePermutation(input);
        assertEquals(expected, result);
        result = isPalindromePermutation1(input);
        assertEquals(expected, result);
    }

    @Test
    public void testPermutationOfPalindrome5() {
        String input = "racecar";
        boolean expected = true;
        boolean result = isPalindromePermutation(input);
        assertEquals(expected, result);
        result = isPalindromePermutation1(input);
        assertEquals(expected, result);
    }

    @Test
    public void testPermutationOfPalindrome6() {
        String input = "aabb";
        boolean expected = true;
        boolean result = isPalindromePermutation(input);
        assertEquals(expected, result);
        result = isPalindromePermutation1(input);
        assertEquals(expected, result);
    }
}
