package com.fancv.leetCode.matrix;

public class TransposedMartix {

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 11}, {4, 5, 6, 12}, {7, 8, 9, 13}};
        transpose(a);

    }

    public static int[][] transpose(int[][] matrix) {
        int width = matrix.length;
        int temp = -1;
        for (int[] s : matrix) {
            temp = s.length > temp ? s.length : temp;
        }
        int b[][] = new int[temp][width];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                b[j][i] = matrix[i][j];
            }

        }
        return b;
    }
}
