package JavaFX;

import java.util.Scanner;

public class Exercise02_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println ("Current Population: 312032486");

        System.out.print("Enter the number of years for population growth: ");

        int years = input.nextInt();

        int population = 312032486;

        int birthrate = 365 * 24 * 3600/7;

        int deathrate = 365 * 24 * 3600/13;

        int imigrate = 365 * 24 * 3600/45;

        population = population + (years * (birthrate - deathrate + imigrate));

        System.out.println("The population after year " + years + " is " + population);

    }
}
