package JavaFX;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class Exercise33_1Server extends Application {
    // Text area for displaying contents
    private TextArea textarea = new TextArea();

    //Variables for the socket, input and output streams, and the thread
    private ServerSocket serverSocket;
    private DataInputStream input;
    private DataOutputStream output;
    private Thread thread;

    @Override // Override the start method in the Application class

    public void start(Stage primaryStage) {
        textarea.setWrapText(true);

        // Create a scene and place it in the stage
        Scene scene = new Scene(new ScrollPane(textarea), 400, 200);
        primaryStage.setTitle("Server"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        thread = new Thread(() ->{
            //Initialize the server socket
            try {
                serverSocket = new ServerSocket(8000);
                Platform.runLater(() ->
                        textarea.appendText("Server started at " + new Date() + '\n'));

                //Accept connections
                Socket socket = serverSocket.accept();
                textarea.appendText("Connected to a client at " + new Date() + '\n');

                //Input and Output Stream creation
                input = new DataInputStream(socket.getInputStream());
                output = new DataOutputStream(socket.getOutputStream());

                while (true) { //While server receives input
                    double annualInterestRate = input.readDouble();
                    int numberOfYears = input.readInt();
                    double loanAmount = input.readDouble();

                    //Compute loan payments
                    Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
                    double monthlyPayment = loan.getMonthlyPayment();
                    double totalPayment = loan.getTotalPayment();

                    //Send data to client
                    output.writeDouble(monthlyPayment);
                    output.writeDouble(totalPayment);

                    //Write to server
                    Platform.runLater(()-> {
                        textarea.appendText("Annual Interest Rate: " + annualInterestRate
                                + "\nNumber of Years: " + numberOfYears
                                + "\nLoan Amount: $" + loanAmount
                                + "\nMonthly Payment: $" + monthlyPayment
                                + "\nTotal Payment: $" + totalPayment + '\n');
                    });
                }
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
        });
        thread.start();

    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
