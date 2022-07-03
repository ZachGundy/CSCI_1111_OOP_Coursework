package JavaFX;

import java.io.*;
import java.util.Scanner;

public class Exercise17_15 {
    public static void main(String[] args) throws IOException {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Have the user Enter file names for the encrypted/decrypted files.
        System.out.print("Please enter the encrypted file name: ");
        String fileInput = input.next();
        System.out.print("Please enter the decrypted file name: ");
        String fileOutput = input.next();

        try ( // Create random access files
              RandomAccessFile encRaf = new RandomAccessFile(fileInput, "r");
              RandomAccessFile decRaf = new RandomAccessFile(fileOutput, "rw");
        ) {
            // Subtract 5 from every file byte then write it
            int r;
            encRaf.seek(0); // Set the file pointer at the start of the file
            while ((r = encRaf.read()) != -1) {
                decRaf.write(((byte)r) - 5);
            }
        }
    }
}