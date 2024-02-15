package AdvancedModule.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readMatrix(scanner);
        int[][] newMatrix = createNewMatrix(matrix, scanner);
        printMatrix(newMatrix);
    }

    private static int[][] readMatrix(Scanner scanner) {
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][];
        for (int i = 0; i < n; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }

    private static int[][] createNewMatrix(int[][] matrix, Scanner scanner) {
        int[][] newMatrix = new int[matrix.length][];
        int[] index = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int row = index[0];
        int col = index[1];
        int number = matrix[row][col];
        for (int i = 0; i < matrix.length; i++) {
            int[] array = new int[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == number) {
                    int left = 0, right = 0, up = 0, down = 0;
                    if (j > 0) left = matrix[i][j - 1];
                    if (j < matrix[i].length - 1) right = matrix[i][j + 1];
                    if (i > 0) up = matrix[i - 1][j];
                    if (i < matrix.length - 1) down = matrix[i + 1][j];
                    array[j] = left + right + up + down;
                } else {
                    array[j] = matrix[i][j];
                }
            }
            newMatrix[i] = array;
        }
        return newMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

