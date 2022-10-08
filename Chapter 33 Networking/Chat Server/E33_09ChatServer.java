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
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


public class E33_09ChatServer extends Application {
    private TextArea taServer = new TextArea();
    private TextArea taClient = new TextArea();
    DataInputStream clientInput= null;
    DataOutputStream serverOutput = null;

    @Override

    public void start(Stage primaryStage) {
        taServer.setWrapText(true);
        taServer.setEditable(false);
        taClient.setWrapText(true);

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
        primaryStage.setTitle("E33_09ChatServer"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        taClient.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                try {
                    String hostMsg = taClient.getText().trim();
                    serverOutput.writeUTF(hostMsg);
                    serverOutput.flush();
                    taClient.setText("");
                    taServer.appendText("S: " + hostMsg + "\n");
                } catch (IOException ex) {
                    System.err.println(ex);
                }
            }
        });

        new Thread(() -> {
            try {
                // Create server socket
                ServerSocket serverSocket = new ServerSocket(8000);

                // Listen for connection request
                Socket socket = serverSocket.accept();

                // Create input and output streams for data
                clientInput = new DataInputStream(socket.getInputStream());
                serverOutput = new DataOutputStream(socket.getOutputStream());

                // While info goes into server
                while (true) {

                    //Receive message from client
                    String clientMsg = clientInput.readUTF();

                    //Write to server
                    Platform.runLater(() -> {
                        taServer.appendText("C: " + clientMsg + "\n");
                    });
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }).start();
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
