package crackingthecodinginterview.chapter1;

import java.util.Arrays;
import java.util.HashMap;

public class ABisPermutation {

    // Describe what it means for two strings to be permutations of each other. Now, look at
    //        that definition you provided. Can you check the strings against that definition?
    // There is one solution that is 0( N log N) time. Another solution uses some space, but
    //      isO(N) time.
    // Could a hash table be useful?
    // Two strings that are permutations should have the same characters, but in different
    //      orders. Can you make the orders the same?


    // nlogn sort and check side by side
    public static boolean isPermutations(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        for (int i = 0; i < a.length(); i++) {
            if (arrayA[i] != arrayB[i]) {
                return false;
            }
        }

        return true;
    }

    // or 2n = O(n) create HashTable and check
    // for the same contents on the 2nd string
    public static boolean isPermutations2(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        HashMap<Character, Integer> mapA = new HashMap<>();
        char[] arrayA = a.toCharArray();
        for (char c : arrayA) {
            mapA.put(c, mapA.getOrDefault(c, 0) + 1);
        }

        arrayA = b.toCharArray();
        for (int i = 0; i < b.length(); i++) {
            if (!mapA.containsKey(arrayA[i])
                || mapA.get(arrayA[i]) <= 0) {
                return false;
            }

            mapA.put(arrayA[i], mapA.get(arrayA[i]) - 1);

        }

        return true;
    }
}
