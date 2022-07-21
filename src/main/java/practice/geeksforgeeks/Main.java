package practice.geeksforgeeks;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static int maximumNumber(int num) {
        // code here
        char[] digits = String.valueOf(num).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '7') {
                digits[i] = '9';
                return Integer.parseInt(String.valueOf(digits));
            }
        }

        return num;
    }

    static int countSubstring(String S) {
        // reverse case for 0-index to be upper

        List<Integer> list = new ArrayList<>();
        char[] chara = S.toCharArray();
        int charIndex = 0;
        int temp = 0;

        while (charIndex < chara.length) {
            while(charIndex < chara.length && Character.isUpperCase(chara[charIndex])) {
                temp++;
                charIndex++;
            }
            list.add(temp);
            temp = 0;

            while(charIndex < chara.length && Character.isLowerCase(chara[charIndex])) {
                charIndex++;
                temp++;
            }
            list.add(temp);
            temp = 0;
        }

        int result = 0;
        for (int i = 0; i < list.size() - 1; i++){
            result += Math.min(list.get(i), list.get(i + 1));
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(countSubstring("gEEk"));
        System.out.println(countSubstring("WomensDAY"));
        System.out.println(countSubstring("aWomensDAY"));


    }
}
