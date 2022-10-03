package JavaFX;

import java.util.Scanner;

public class Exercise02_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double MonthlyInterestRate = 0.00417;

        System.out.print("Enter the monthly saving amount: ");

        double savings= input.nextDouble();

        double total = 100 * (1 + MonthlyInterestRate);

        total = (100 + total) * (1 + MonthlyInterestRate);

        total = (100 + total) * (1 + MonthlyInterestRate);

        total = (100 + total) * (1 + MonthlyInterestRate);

        total = (100 + total) * (1 + MonthlyInterestRate);

        total = (100 + total) * (1 + MonthlyInterestRate);


        System.out.println("After the sixth month, the account value is " + total);
    }
}