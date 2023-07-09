package crackingthecodinginterview.chapter1;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

public class E_OneAway {
    // Start with the easy thing. Can you check each of the conditions separately?
    // What is the relationship between the "insert character"
    //      option and the "remove character" option? Do these need to be two separate checks?
    // Can you do all three checks in a single pass?

    public static boolean isOneAway(String str1, String str2) {
        if (Math.abs(str1.length() - str2.length()) > 1) {
            return false;
        }

        int counter = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char a : str1.toCharArray()) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for (char b : str2.toCharArray()) {
            if (!map.containsKey(b) || map.get(b) < 0) {
                counter++;
            } else {
                map.put(b, map.get(b) - 1);
            }
        }

        return counter <= 1;
    }
}
