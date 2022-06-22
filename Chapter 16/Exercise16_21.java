package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.scene.input.KeyCode;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;

public class Exercise16_21 extends Application {

    // Create a TextField, Media File, and Media Player.
    TextField tf = new TextField();
    Media media = new Media("http://cs.armstrong.edu/liang/common/audio/anthem/anthem0.mp3");
    MediaPlayer mp = new MediaPlayer(media);
    Timeline stopWatch = new Timeline();

    @Override
    public void start(Stage primaryStage) {
        //
        tf.setAlignment(Pos.CENTER);
        tf.setFont(Font.font(70));


        // Keep music playing continuously
        mp.setCycleCount(MediaPlayer.INDEFINITE);

        // Create a StackPane for the TextField.
        StackPane pane = new StackPane(tf);

        // Create Stopwatch Animation
        stopWatch = new Timeline(
                new KeyFrame(Duration.millis(1000), e -> countdown()));
        stopWatch.setCycleCount(Timeline.INDEFINITE);

        // Set Enter as Key pressed for playing stopWatch
        tf.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                stopWatch.play();
            }
        });

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise16_21 - Stopwatch Countdown"); // Set the Stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    // Create the countdown logic and MediaPlayer Start/Stop duration
    public void countdown() {
        if (Integer.parseInt(tf.getText()) > 0) {
            mp.pause();
            mp.seek(Duration.ZERO);
            tf.setText(String.valueOf(Integer.parseInt(tf.getText()) - 1));
        }
        if (tf.getText().equals("0")) {
            stopWatch.pause();
            mp.play();
        }
    }

    public static void main(String[] args) {
        launch(args);

    }

}



