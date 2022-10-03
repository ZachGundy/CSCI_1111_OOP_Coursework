package JavaFX;

import java.util.Scanner;

public class Exercise5_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int positives = 0;
        int negatives = 0;
        int count = 0;
        double total = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();
        while (number != 0) {

            System.out.print("Enter an integer, the input ends if it is 0: ");


            if (number > 0)
                positives++;
            else
                negatives++;
            total += number;
            count++;
            number = input.nextInt();
        }


        double average = total / count;

        System.out.printf("The number of positives is: %d \nThe number of negatives is: %d \nThe total is: %.0f \nThe average is: %.2f ", positives, negatives, total, average);

    }
}