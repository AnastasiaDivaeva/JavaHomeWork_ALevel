package ua.divaveva.hw5;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][3];


        int matrixValue = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = matrixValue++;
                } else {
                    matrix[i][j] = -1 * matrixValue++;
                }
            }
        }

        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}
