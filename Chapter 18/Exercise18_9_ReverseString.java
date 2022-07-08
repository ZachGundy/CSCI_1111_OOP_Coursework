package JavaFX;

import java.util.Scanner;


public class Exercise18_9_ReverseString{

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a word or phrase to reverse: ");
        String string = input.nextLine();

        // Call the method
        showReverseString(string);
    }

    // Create a method that reverses the string and displays it
    private static void showReverseString(String string) {
        if (string.length() == 1) // Create the base case
            System.out.println(string);
        else {
            System.out.print(string.charAt(string.length() - 1));
            showReverseString(string.substring(0, string.length() - 1)); // Method recursive call
        }
    }
}