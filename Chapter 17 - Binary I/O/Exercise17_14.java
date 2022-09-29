package JavaFX;

import java.util.Scanner;
import java.io.*;

public class Exercise17_14 {
    public static void main(String[] args) throws IOException {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Have the user enter a file name for input/output files
        System.out.print("Please enter the input file name: ");
        String inFile = input.next();
        System.out.print("Please enter the output file name: ");
        String outFile = input.next();

        try ( // Create random access files
              RandomAccessFile  root = new RandomAccessFile(inFile, "r");
              RandomAccessFile landing = new RandomAccessFile(outFile, "rw");
        ) {
            // Add 5 to every file byte then write it

            int r = 0;
            root.seek(0); // Set file pointer at the start of the file.
            while ((r = root.read()) != -1) {
                landing.write(((byte)r) + 5);
            }
        }

    }
}
