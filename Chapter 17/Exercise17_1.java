package JavaFX;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise17_1 {
    public static void main(String[] args) throws FileNotFoundException {
        // Create a string Array list
        ArrayList<String> aList = new ArrayList<>();

        // Check if file exists
        File textFile = new File("Exercise17_01.txt");
        if ( textFile.exists()) {
            try (
                    // Create input file reader
                    Scanner input = new Scanner(textFile);
            ) {
                // Read data from file
                while (input.hasNext()) {
                    aList.add(input.nextLine());
                }
            }
        }
        // Create 100 integers randomly
        for (int i = 0; i < 100; i++) {
            aList.add(((int)(Math.random() * 100)) + " ");
        }

        try (
                // Create output writer file
                PrintWriter output = new PrintWriter(textFile);
        ) {
            // write to full array of files
            for (String s: aList) {
                output.print(s);
            }
        }
    }
}