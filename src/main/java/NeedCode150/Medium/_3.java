package NeedCode150.Medium;

import java.util.*;

public class _3 {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.length() == 1) return s.length();

        char[] string = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        int current = 0;
        int index = 0;
        int length = 0;
        int max = 0;
        char key;
        int a;
        while (index < s.length()) {
            key = string[index];
            if (!map.containsKey(key)){
                map.put(key, index);
                length++;
            }
            else {
                max = Math.max(length, max);
                a = map.get(key);
                for (int i = current; i < a; i++){
                    map.remove(string[i]);
                    length--;
                }
                current = a + 1;
                map.put(key, index);
            }
            index++;
        }

        return Math.max(length, max);
    }

    public static void main(String[] args) {
        System.out.println(
                lengthOfLongestSubstring("aabaab!bb"));

        System.out.println(
                lengthOfLongestSubstring("abbcbbabc"));

        System.out.println(
                lengthOfLongestSubstring("abcdbeba"));
        System.out.println(
                lengthOfLongestSubstring("pwwkew"));

        System.out.println(
                lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("au"));

    }
}
