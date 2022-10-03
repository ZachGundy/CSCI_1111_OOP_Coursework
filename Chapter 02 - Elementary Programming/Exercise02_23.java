package JavaFX;

import java.util.Scanner;

public class Exercise02_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance:");
        double distance = input.nextDouble();

        System.out.print("Enter miles per gallon:");
        double mpg = input.nextDouble();

        System.out.print("Enter price per gallon:$");
        double pricePerGallon = input.nextDouble();

        double cost = distance / mpg * pricePerGallon ;

        System.out.println("The cost of driving is $" + cost);

    }
}
