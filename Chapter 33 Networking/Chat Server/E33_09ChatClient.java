package JavaFX;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.*;
import java.net.Socket;
import java.util.Date;

public class E33_09ChatClient extends Application {
    private TextArea taServer = new TextArea();
    private TextArea taClient = new TextArea();
    // IO Streams
     DataInputStream serverInput = null;
     DataOutputStream clientOutput = null;

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        taServer.setWrapText(true);
        taClient.setWrapText(true);
        taServer.setDisable(true);

        BorderPane pane1 = new BorderPane();
        pane1.setTop(new Label("History"));
        pane1.setCenter(new ScrollPane(taServer));
        BorderPane pane2 = new BorderPane();
        pane2.setTop(new Label("New Message"));
        pane2.setCenter(new ScrollPane(taClient));

        VBox vBox = new VBox(5);
        vBox.getChildren().addAll(pane1, pane2);

        // Create a scene and place it in the stage
        Scene scene = new Scene(vBox, 200, 200);
        primaryStage.setTitle("E33_09ChatClient"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        taClient.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                try {
                    // Get message from text area
                    String serverMsg = taClient.getText().trim();
                    clientOutput.writeUTF(serverMsg);
                    clientOutput.flush();
                    taClient.setText("");
                    taServer.appendText("C: " + serverMsg + "\n");
                } catch (IOException ex) {
                    System.err.println(ex);
                }
            }
        });
        try {
            Socket socket = new Socket("localhost", 8000);

            //Create input and output streams
            serverInput = new DataInputStream(socket.getInputStream());
            clientOutput = new DataOutputStream(socket.getOutputStream());

            // A new thread to recieve messages
            new Thread(() -> {
                try {
                    while (true) {
                        // Get message from server
                        String serverMsg = serverInput.readUTF();

                        // Display to history or text area
                        taServer.appendText("S: " + serverMsg + '\n');
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }).start();
        } catch (IOException ex) {
            taServer.appendText(ex.toString() + '\n');
        }
    }
    /**
 * The main method is only needed for the IDE with limited
 * JavaFX support. Not needed for running from the command line.
 */
    public static void main(String[] args) {
        launch(args);
    }
}