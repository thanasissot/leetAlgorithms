package crackingthecodinginterview;

import java.util.Arrays;

public class ACURLify {
    // It's often easiest to modify strings by going from the end of the string to the beginning
    // You might find you need to know the number of spaces. Can you just count them?

    /**
     * Write a method to replace all spaces in a string with '%20'. You may assume that the string
     * has sufficient space at the end to hold the additional characters, and that you are given the "true"
     * length of the string. (Note: If implementing in Java, please use a character array so that you can
     * perform this operation in place.)
     */

    public static char[] urlify (char[] chararray) {
        // calculate how many spaces are in the string
        int spaces = ((int) new String(chararray).chars().filter(c -> c == ' ').count()) / 3;
        int currentIndex = chararray.length - 1;
        int end = chararray.length - 1;

        // len has the first index of non space character from the end to the front
        while (spaces > 0) {
            while (chararray[currentIndex] == ' ') {
                currentIndex--;
            }

            while (chararray[currentIndex] != ' ') {
                chararray[end] = chararray[currentIndex];
                chararray[currentIndex] = ' ';
                end--;
                currentIndex--;
            }

            currentIndex = end;
            chararray[currentIndex--] = '0';
            chararray[currentIndex--] = '2';
            chararray[currentIndex--] = '%';
            end = currentIndex;
            spaces--;
        }

        return chararray;
    }




}
