package sample;

import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;

//Use fade transition demo and Path Transition Demo in Java.
public class Animations extends Application {

    @Override
    public void start(Stage primaryStage) {

        //Create a pane
        Pane pane = new Pane();

        //Create Pentagon
        Polygon pentagon = new Polygon();
        ObservableList<Double> list = pentagon.getPoints();

        final double WIDTH = 200;
        final double HEIGHT = 200;
        double centerX = WIDTH / 2;
        double centerY = HEIGHT / 2;
        double radius = Math.min(WIDTH, HEIGHT) *.4;

        // add points to the polygon list

        for (int i = 0; i < 5; i++) {
            list.add(centerX + radius * Math.cos(2 * i * Math.PI / 5 - Math.PI / 8));
            list.add(centerY - radius * Math.sin(2 * i * Math.PI / 5 - Math.PI / 8));
        }

        pentagon.setFill(Color.WHITE);
        pentagon.setStroke(Color.BLACK);

        // Create a rectangle
        Rectangle rectangle = new Rectangle(25, 50);
        rectangle.setFill(Color.GREEN);

        //add shapes to pane
        pane.getChildren().addAll(pentagon, rectangle);

        // Create a path transition
        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(4000));
        pt.setPath(pentagon);
        pt.setNode(rectangle);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(true);
        pt.play(); // Start animation

        // Create a fade transition
        FadeTransition ft = new FadeTransition(Duration.millis(3000), rectangle);
        ft.setFromValue(1.0);
        ft.setToValue(0.1);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play(); // Start animation

        pane.setOnMousePressed(event -> {
                    if (event.getButton() == MouseButton.PRIMARY) {
                        pt.play();
                    } else if (event.getButton() == MouseButton.SECONDARY) {
                        pt.pause();
                    }
                });

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("Chapter 15 - Animations"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        pane.requestFocus();

    }

    public static void main(String[] args) {
        launch(args);
    }
}


