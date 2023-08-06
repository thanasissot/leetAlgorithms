package NeetCode150;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_125 {
    // A phrase is a palindrome if, after converting all uppercase letters into
    // lowercase letters and removing all non-alphanumeric characters, it reads
    // the same forward and backward. Alphanumeric characters include letters and numbers.
    //
    // Given a string s, return true if it is a palindrome, or false otherwise.
    public boolean isPalindrome(String s) {
        List<Character> characterList = new ArrayList<>();
        for (char c : s.toLowerCase().toCharArray()) {
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                characterList.add(c);
            }
        }
        int start = 0;
        int end = characterList.size() - 1;
        while (start < end) {
            if (characterList.get(start) != characterList.get(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

}
