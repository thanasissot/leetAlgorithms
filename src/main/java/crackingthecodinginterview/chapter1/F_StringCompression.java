package crackingthecodinginterview.chapter1;

public class F_StringCompression {
    // Do the easy thing first. Compress the string, then compare the lengths
    // Be careful that you aren't repeatedly concatenating strings together. This can be very
    //    inefficient.

    public static String stringCompression(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] array = string.toCharArray();

        for (int i = 0; i < array.length;) {
            char c = array[i];
            int counter = 0;
            while (i < array.length && c == array[i]) {
                counter++;
                i++;
            }

            stringBuilder.append(c);
            stringBuilder.append(counter);
        }

        if (stringBuilder.length() < array.length) {
            return stringBuilder.toString();
        }

        return string;
    }
}
