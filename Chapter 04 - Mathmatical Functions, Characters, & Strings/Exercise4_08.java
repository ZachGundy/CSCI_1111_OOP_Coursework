package JavaFX;

import java.util.Scanner;

public class Exercise4_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer 0-127: ");

        int number = input.nextInt();


        if (number > 0 && number <128) {
            System.out.println("The ASCII Code entered is " + number + " \nThe corresponding character is " + ((char)number));}

        else {	System.out.println("Sorry the number entered is out of range");}

    }
}