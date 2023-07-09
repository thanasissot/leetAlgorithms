package crackingthecodinginterview.chapter1;

public class G_RotateMatrix {
    /**
     * Given an image represented by an NxN matrix, where each pixel in the image is 4
     * bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
     */

    // Try thinking about it layer by layer. Can you rotate a specific layer?
    // Rotating a specific layer would just mean swapping the values in four arrays. If you were
    // asked to swap the values in two arrays, could you do this? Can you then extend it to four
    // arrays?
    public static void rotateMatrix(int[][] matrix) {
        int ai, aj, bi, bj, ci, cj, di, dj;
        ai = aj = bi = dj = 0;
        bj = ci = cj = di = matrix.length - 1;

        int counter = 1;
        while (ai <= matrix.length / 2 && aj <= matrix.length / 2) {

            while (aj < bj) {
                int last = matrix[ai][aj];

                matrix[ai][aj] = matrix[di][dj];
                matrix[di][dj] = matrix[ci][cj];
                matrix[ci][cj] = matrix[bi][bj];
                matrix[bi][bj] = last;

                aj++;
                bi++;
                cj--;
                di--;
            }

            ai = aj = bi = dj = counter;
            bj = ci = cj = di = matrix.length - 1 - counter;

            counter++;
        }
    }

}
