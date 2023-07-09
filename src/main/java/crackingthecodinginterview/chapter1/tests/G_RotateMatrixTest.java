package crackingthecodinginterview.chapter1.tests;

import org.junit.jupiter.api.Test;

import static crackingthecodinginterview.chapter1.G_RotateMatrix.rotateMatrix;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class G_RotateMatrixTest {
    @Test
    public void testRotateMatrix_2x2() {
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        int[][] expected = {
                {3, 1},
                {4, 2}
        };
        rotateMatrix(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testRotateMatrix_3x3() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expected = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        rotateMatrix(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testRotateMatrix_4x4() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[][] expected = {
                {13, 9, 5, 1},
                {14, 10, 6, 2},
                {15, 11, 7, 3},
                {16, 12, 8, 4}
        };
        rotateMatrix(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testRotateMatrix_1x1() {
        int[][] matrix = {
                {1}
        };
        int[][] expected = {
                {1}
        };
        rotateMatrix(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testRotateMatrix_5x5() {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int[][] expected = {
                {21, 16, 11, 6, 1},
                {22, 17, 12, 7, 2},
                {23, 18, 13, 8, 3},
                {24, 19, 14, 9, 4},
                {25, 20, 15, 10, 5}
        };
        rotateMatrix(matrix);
        assertArrayEquals(expected, matrix);
    }
}
