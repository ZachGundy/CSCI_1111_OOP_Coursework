package JavaFX;

import java.util.*;

public class Exercise22_3Substring {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two strings
        System.out.print("Enter the first String: ");
        String string1 = input.nextLine();
        System.out.print("Enter the second String: ");
        String string2 = input.nextLine();

        int index = -1; // Stores index of string2 as a substring of string 1
        int match = 0;  // Check number of matches

        // checks whether the second String is a substring of the first.
        for (int i = 0; i < string1.length(); i++) {

            if (string1.charAt(i) == string2.charAt(0) && match== 0) {
                index = i;
                match++;
            } else if (string1.charAt(i) == string2.charAt(match)) {
                match++;
            }
            else {

                match = 0;
                index = -1;

            }

            if (match == string2.length())
                break;
        }

        // Display results
        if (index > 1)
            System.out.println("The Substring matched at index " + index);
        else
            System.out.println("The second String is not a substring of the first String");
    }
}