package JavaFX;

import java.io.*;

public class Exercise17_3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        writeFile();
        readFile();
    }
    public static void writeFile() throws IOException {

        try ( // dreate a file stream and if it exists append it
              FileOutputStream output = new FileOutputStream("Exercise17_03.dat", true);
                    
        ) { for (int i = 0; i <100; i++) // Write 100 random integers into the file
            output.write((int)(1 + Math.random() *100 ));

        }

    }

    public static void readFile() throws IOException {
        int sum = 0;

        try ( // Create a data input stream for file Exercise17_03.dat
              DataInputStream input =
                      new DataInputStream(new FileInputStream("Exercise17_03.dat"));
        ) {
            // Read the file and then print the sum of them
            while (true)
                sum += input.readInt();
        } catch (EOFException ex) { // Finding the end of file
            System.out.println("The sum of the integers is: " + sum);
        }
    }
}