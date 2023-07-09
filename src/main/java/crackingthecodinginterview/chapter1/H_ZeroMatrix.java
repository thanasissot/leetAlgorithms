package crackingthecodinginterview.chapter1;

import java.util.Arrays;

public class H_ZeroMatrix {
    // Can you use O(N) additional space instead of O(N2)? What information do you really
    // need from the list of cells that are zero?

    // You probably need some data storage to maintain a list of the rows and columns that
    // need to be zeroed. Can you reduce the additional space usage to 0(1) by using the
    // matrix itself for data storage?

    // If you just cleared the rows and columns as you found Os, you'd likely wind up clearing
    // the whole matrix. Try finding the cells with zeros first before making any changes to the
    // matrix.

    /**
     * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
     * column are set to 0.
     */
    public static void zeroMatrix(int[][] matrix) {
        // first check first row and column for 0zeros and set the marker to 0 or 1
        boolean rows = false;
        boolean cols = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                rows = true;
                break;
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                cols = true;
                break;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                Arrays.fill(matrix[i], 0);
            }
        }

        if (cols) {
            Arrays.fill(matrix[0], 0);
        }

        if (rows) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][0] = 0;
            }
        }
    }
}
