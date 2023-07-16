package NeetCode150_old.Medium;

public class _424 {
    public static int characterReplacement(String s, int k) {
        // chartFrequencies
        int max = 0, temp = 0, index = 0, next = 0, len = k;
        boolean flag = false;
        char[] arr = s.toCharArray();
        while (index < arr.length - 1) {
            char c = arr[index];
            while (index < arr.length - 1 && c == arr[index + 1]){
                temp++;
                index++;
            }

            if (temp-- <= len) {
                c = arr[index+1];
                len -= index;
            }
            next = index + 1; // next index to try the loop

            while (index < arr.length - 1 && (len > 0 || c == arr[index + 1])) {
                if (c != arr[index + 1]) {
                    len--;
                }
                temp++;
                index++;
            }

            max = Math.max(max, temp);
            index = next;
        }
        return max;
    }


    public static void main(String[] args) {
        System.out.println(
                characterReplacement("ABBB", 2)
        );
        System.out.println(
                characterReplacement("ABABAA", 1)
        );
        System.out.println(
                characterReplacement("ABAB", 2)
        );
        System.out.println(
                characterReplacement("AABABBBA", 0)
        );
        System.out.println(
                characterReplacement("AABABBA", 2)
        );


    }


//    int next = 0;
//    int max = 0, temp = 0;
//    int len = k;
//    int index = 0;
//    char c;
//    char[] arr = s.toCharArray();
//        while (index < arr.length) {
//        next = index+1;
//        c = arr[index];
//        while(index < arr.length && (c == arr[index] || len > 0)){
//            if (c != arr[index]) {
//                len--;
//            }
//            index++;
//            temp++;
//        }
//        max = Math.max(max, temp);
//        temp = 0;
//        len = k;
//        index = next;
//    }
//        return max;
}
