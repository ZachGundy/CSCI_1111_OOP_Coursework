package JavaFX;

import java.util.Scanner;

public class Exercise8_05 {

    public static void main(String[] args) {

        double[][] matrix1 = getmatrix(1);
        double[][] matrix2 = getmatrix(2);

        double[][] matrix3 = addMatrix(matrix1, matrix2);

        print(matrix1, matrix2, matrix3);
    }

    public static double[][] getmatrix(int b) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter matrix" + b + ": ");

        double[][] m = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                m[i][j] = input.nextDouble();
        }

        return m;
    }

    public static double[][] addMatrix(double[][] x, double[][] y) {
        double[][] z = new double[3][3];

        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[i].length; j++) {
                z[i][j] = x[i][j] + y[i][j];
            }
        }
        return z;
    }

    public static void print(double[][] m, int r) {
        for (int j = 0; j < m[r].length; j++) {
            System.out.print(m[r][j] + " ");
        }
    }


    public static void print(double[][] m1, double[][] m2, double[][] m3) {
        System.out.println("The matrices added together are");

        for (int i = 0; i < 3; i++) {

            if (i == 1)
                System.out.print(m1 + "+" + i + ": ");

            else if (i == 1)
                System.out.print(m2 + "+" + i + ": ");

            else
                print(m3, i);
            System.out.println();

        }
    }
}