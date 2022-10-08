package JavaFX;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Exercise33_1Client extends Application {
    // Create a TextField to receive radius
    private TextField annualInterestRateTF = new TextField();
    private TextField numberOfYearsTF= new TextField();
    private TextField loanAmountTF = new TextField();
    private Button btSubmit= new Button("Submit");

    // Text area to display contents
    private TextArea textArea = new TextArea();

    //Socket to connect to the server
    private Socket clientSocket;

    //Reader for input
    private DataInputStream input;

    //OutputStream for writing to server
    private DataOutputStream output;

    @Override // Override the start method in the Application class
    /**
     * This method will create the GUI and will send, gather and append all information to and from the server.
     */
    public void start(Stage primaryStage) {
        textArea.setWrapText(true);

        GridPane gridPane = new GridPane();
        gridPane.add(new Label("Annual Interest Rate"), 0, 0);
        gridPane.add(new Label("Number Of Years"), 0, 1);
        gridPane.add(new Label("Loan Amount"), 0, 2);
        gridPane.add(annualInterestRateTF, 1, 0);
        gridPane.add(numberOfYearsTF, 1, 1);
        gridPane.add(loanAmountTF, 1, 2);
        gridPane.add(btSubmit, 2, 1);

        annualInterestRateTF.setAlignment(Pos.BASELINE_RIGHT);
        numberOfYearsTF.setAlignment(Pos.BASELINE_RIGHT);
        loanAmountTF.setAlignment(Pos.BASELINE_RIGHT);

        loanAmountTF.setPrefColumnCount(5);
        numberOfYearsTF.setPrefColumnCount(5);
        loanAmountTF.setPrefColumnCount(5);

        BorderPane pane = new BorderPane();
        pane.setCenter(new ScrollPane(textArea));
        pane.setTop(gridPane);

        btSubmit.setOnAction(e -> {
            try{

                //Receive incoming info from each variable
                String interest = annualInterestRateTF.getText();
                String  years = numberOfYearsTF.getText();
                String loan = loanAmountTF.getText();

                //Convert info to numbers
                double interestRate = Double.parseDouble(interest);
                int numberYears = Integer.parseInt(years);
                double loanAmount = Double.parseDouble(loan);

                //Write the information to the server
                output.writeDouble(interestRate);
                output.flush();
                output.writeInt(numberYears);
                output.flush();
                output.writeDouble(loanAmount);
                output.flush();

                //Gather the data from the server
                double monthlyPayment = input.readDouble();
                double totalPayment = input.readDouble();
                textArea.appendText("Annual Interest Rate: " + interestRate
                        + "\nNumber of Years: " + numberYears
                        + "\nLoan Amount: $" + loanAmount
                        + "\nMonthly Payment: $" + monthlyPayment
                        + "\nTotal Payment: $" + totalPayment + '\n');
            }
            catch (IOException ex){
                System.err.println(ex);
            }

        });

        try{
            clientSocket = new Socket("localhost", 8000);

            //Input stream for data from server
            input = new DataInputStream(clientSocket.getInputStream());

            //Output stream for data to server
            output = new DataOutputStream(clientSocket.getOutputStream());
        }
        catch (IOException ex){
            textArea.appendText(ex.toString() + '\n');
        }

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 400, 250);
        primaryStage.setTitle("Exercise31_01Client"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}