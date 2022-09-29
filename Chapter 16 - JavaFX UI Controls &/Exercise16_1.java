package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise16_1 extends Application {


    @Override
    public void start(Stage primaryStage) {
        //Create a Border Pane for the Layout
        BorderPane bPane = new BorderPane();

        //Create a Text Object
        Text text = new Text(150, 150, "Programming is fun :)");

        //Create Radio buttons with following text.
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbYellow = new RadioButton("Yellow");
        RadioButton rbBlack = new RadioButton("Black");
        RadioButton rbOrange = new RadioButton("Orange");
        RadioButton rbGreen = new RadioButton("Green");

        //Create an eventHandler for each RadioButton using isSelected to Change text Color.
        rbRed.setOnAction(e -> {
            if (rbRed.isSelected()) {
                text.setFill(Color.RED);
            }
        });

        rbYellow.setOnAction(e -> {
            if (rbYellow.isSelected()) {
                text.setFill(Color.YELLOW);
            }
        });

        rbBlack.setOnAction(e -> {
            if (rbBlack.isSelected()) {
                text.setFill(Color.BLACK);
            }
        });

        rbGreen.setOnAction(e -> {
            if (rbGreen.isSelected()) {
                text.setFill(Color.GREEN);
            }
        });

        rbOrange.setOnAction(e -> {
            if (rbOrange.isSelected()) {
                text.setFill(Color.ORANGE);
            }
        });

        //Group RadioButtons into one group using ToggleGroup Class
        ToggleGroup rbGroup = new ToggleGroup();
        rbRed.setToggleGroup(rbGroup);
        rbYellow.setToggleGroup(rbGroup);
        rbBlack.setToggleGroup(rbGroup);
        rbOrange.setToggleGroup(rbGroup);
        rbGreen.setToggleGroup(rbGroup);

        //Create Hbox layout for RadioButtons and
        HBox rbBox = new HBox();
        rbBox.getChildren().addAll(rbRed, rbYellow, rbBlack, rbOrange, rbGreen);
        rbBox.setAlignment(Pos.CENTER);
        rbBox.setSpacing(10.0);
        rbBox.setPadding(new Insets(5, 5, 5, 5));

        // Create a text pane to add the text into
        Pane textPane = new Pane();
        textPane.setPadding(new Insets(10));
        textPane.getChildren().add(text);

        // Create Left and Right Buttons with arrows
        Button left = new Button("<--");
        Button right = new Button("-->");

        // Create action handler for ButtonClicked and define when it stops
        left.setOnAction (e -> {
            text.setX(text.getX() > 0 ? text.getX() - 5 : 0);

        });

        right.setOnAction(e -> {
            text.setX(text.getX() < textPane.getWidth() - 100 ? text.getX() + 5 : textPane.getWidth() -100);

         });

        // Create and Hbox Layout for Bottom Buttons
        HBox buttonBox = new HBox();
        buttonBox.getChildren().add(left);
        buttonBox.getChildren().add(right);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(10);

        //Alight BorderPane with Button Objects and Layout
        bPane.setBottom(buttonBox);
        bPane.setTop(rbBox);
        bPane.setCenter(textPane);
        bPane.setPadding(new Insets(15,15,15,15));

        // Create a Scene containing the border pane, place the Scene in the Stage
        Scene scene = new Scene(bPane, 100,100);
        primaryStage.setScene(scene);
        primaryStage.show();  // Display Stage

    }
}
