package NeedCode150.Easy;

import java.util.Locale;

public class _125 {
    public boolean isPalindrome(String s) {
        String a = s.replaceAll("\\W|_", "");
        a = a.toLowerCase();
        if (a.length() == 0 || a.length() == 1) return true;
        for(int i = 0, j = a.length() - 1; i < a.length(); i++, j--) {
            if (a.charAt(i) != a.charAt(j) && i != j) {
                return false;
            }
        }
        return true;
    }

    // nice solution to consider using a valid character
    public boolean validCharacter(char w){
        return w <= 'z' && w >= 'a' ||
                w <= 'Z' && w >= 'A' ||
                w <= '9' && w >= '0';
    }

    public boolean isPalindromeLeet(String s) {
        int i = 0,
                j = s.length() - 1;
        while(i < j){
            char a = s.charAt(i),
                    b = s.charAt(j);
            while(i < j && !validCharacter(a)){
                a = s.charAt(++i);
            }
            while(i < j && !validCharacter(b)){
                b = s.charAt(--j);
            }
            a = Character.toLowerCase(a);
            b = Character.toLowerCase(b);
            if(a != b){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
