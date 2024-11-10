/*
  4) Write a Java program to demonstrate static variables, methods and
 blocks. / Matrix Mul Program
 */
package Q4;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the matrices
        System.out.print("Enter rows and columns of the first matrix: ");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();

        System.out.print("Enter rows and columns of the second matrix: ");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();

        // Matrix multiplication is only possible if cols1 == rows2
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication not possible. Columns of first matrix must match rows of second matrix.");
            return;
        }

        // Input the first matrix
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input the second matrix
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Initialize the result matrix
        int[][] result = new int[rows1][cols2];

        // Perform matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display the result
        System.out.println("Product of the matrices:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
