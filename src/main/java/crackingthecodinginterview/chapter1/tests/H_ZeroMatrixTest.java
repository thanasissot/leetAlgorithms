package crackingthecodinginterview.chapter1.tests;

import org.junit.jupiter.api.Test;

import static crackingthecodinginterview.chapter1.H_ZeroMatrix.zeroMatrix;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class H_ZeroMatrixTest {


    @Test
    public void testZeroMatrix_3x3() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };
        int[][] expected = {
                {1, 0, 3},
                {0, 0, 0},
                {7, 0, 9}
        };
        zeroMatrix(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testZeroMatrix_4x5() {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 0, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        int[][] expected = {
                {1, 0, 3, 4, 5},
                {6, 0, 8, 9, 10},
                {0, 0, 0, 0, 0},
                {16, 0, 18, 19, 20}
        };
        zeroMatrix(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testZeroMatrix_2x2() {
        int[][] matrix = {
                {1, 0},
                {2, 3}
        };
        int[][] expected = {
                {0, 0},
                {2, 0}
        };
        zeroMatrix(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testZeroMatrix_1x1() {
        int[][] matrix = {
                {0}
        };
        int[][] expected = {
                {0}
        };
        zeroMatrix(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testZeroMatrix_AllZeroes() {
        int[][] matrix = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        int[][] expected = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        zeroMatrix(matrix);
        assertArrayEquals(expected, matrix);
    }



}
