package homework_w3;

import java.util.Scanner;

public class Matrices {
    static Scanner scan = new Scanner(System.in);

    public static int[][] createRandomIntMatrix(int row, int col) {
        int[][] mat = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = scan.nextInt();
            }
        }
        return mat;
    }

    public static double[][] createRandomDoubleMatrix(int row, int col) {
        double[][] mat = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = scan.nextDouble();
            }
        }
        return mat;
    }

    public static void printIntMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printDoubleMatrix(double[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }


}
