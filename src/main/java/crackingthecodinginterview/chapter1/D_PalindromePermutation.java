package crackingthecodinginterview.chapter1;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

public class D_PalindromePermutation {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
    }

    // You do not have to-and should not-generate all permutations. This would be very inefficient.
    // What characteristics would a string that is a permutation of a palindrome have?
    // Have you tried a hash table? You should be able to get this down to 0(N) time
    // Can you reduce the space usage by using a bit vector?

    // with hashtable (map)
    public static boolean isPalindromePermutation(String string) {
        Map<Character, Integer> map = new HashMap<>();
        for (char a : string.toCharArray()) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        return map.values().stream().filter(integer -> integer % 2 != 0).count() <= 1;
    }

    // use vector -> bitset
    public static boolean isPalindromePermutation1(String string) {
        BitSet bitSet = new BitSet();
        for (char a : string.toCharArray()) {
            if (bitSet.get(a)) {
                bitSet.clear(a);
            }
            else {
                bitSet.set(a);
            }
        }

        return bitSet.cardinality() <= 1;
    }

}
