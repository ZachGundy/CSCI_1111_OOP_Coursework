package JavaFX;

import java.util.Scanner;

public class Exercise6_17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printMatrix(n);
    }

    public static void printMatrix(int n) {
        for (int r = 1; r <=n; r++) {
            for (int c = 1; c <=n; c++) {

                System.out.print((int)(Math.random() * 2));
            }

            System.out.println();
        }
    }
}