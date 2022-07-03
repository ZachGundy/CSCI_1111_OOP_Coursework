package JavaFX;
import java.io.*;

public class Exercise17_7 { // Create file containing "loan" Objects
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        Loan loan1 = new Loan();
        Loan loan2 = new Loan(1.8, 10, 10000);
        try (
                ObjectOutputStream output = new ObjectOutputStream(new
                        FileOutputStream("Exercise17_7.dat"));
        ) { // Write both object file
            output.writeObject(loan1);
            output.writeObject(loan2);
        } catch (IOException ex) { // check for end
            System.out.println("Cannot open file");
        }
        outputData(); // Call Method
    }
        private static void outputData() throws ClassNotFoundException {
            try ( // Create an input stream for file Exercise17.7.dat
                  ObjectInputStream input = new ObjectInputStream(new
                          BufferedInputStream(new FileInputStream("Exercise17_7.dat")))

            ) { // Read Loan objects from file and display the total loan amount
                while (true) {
                    Loan loan = (Loan) input.readObject();
                    System.out.println(loan);
                    System.out.printf("Total loan amount is: $%.2f\n", loan.getTotalPayment());
                    System.out.println();
                }
            } catch (IOException ex) {
                // Ends the loop
            }
        }
    }


