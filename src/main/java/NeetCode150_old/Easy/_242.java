package NeetCode150_old.Easy;

public class _242 {
    // TIME & SPACE (memory efficient)
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int arr[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[97 - s.codePointAt(i)]++;
            arr[97 - t.codePointAt(i)]--;
        }

        for (int j : arr) {
            if (j != 0) return false;
        }
        return true;
    }
}
