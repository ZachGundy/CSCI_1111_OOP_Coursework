package JavaFX;

import java.util.Scanner;

public class Exercise7_09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter ten numbers seperated by a space: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.println("The minimum number is: " + min(numbers));
    }

    public static double min(double[] array) {
        double min = array[0];
        for (double e: array) {
            if (e < min)
                min = e;
        }
        return min;
    }
}