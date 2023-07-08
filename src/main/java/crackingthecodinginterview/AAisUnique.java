package crackingthecodinginterview;

import java.util.Arrays;

public class AAisUnique {
    // Try a hash table
    // Could a bit vector be useful?
    // Can you solve it in O(N log N) time? What might a solution like that look like?

    public static boolean isUnique(String string) {
        char[] array = string.toCharArray();
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i+1]) {
                return false;
            }
        }

        return true;
    }
}
