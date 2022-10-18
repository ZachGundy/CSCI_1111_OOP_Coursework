package JavaFX;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TabPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class E31_20TabnRadioDemo extends Application {

    @Override

    public void start(Stage primaryStage) {

        //Create a border pane
        BorderPane borderPane = new BorderPane();

        // Radio button Hbox
        HBox hBox = new HBox();

        // Create a tab pane and their shapes
        TabPane tabPane = new TabPane();
        Tab tab1 = new Tab("Line");
        StackPane pane1 = new StackPane();
        pane1.getChildren().add(new Line(10, 10, 80, 80));
        tab1.setContent(pane1);
        Tab tab2 = new Tab("Rectangle");
        tab2.setContent(new Rectangle(10, 10, 200, 200));
        Tab tab3 = new Tab("Circle");
        tab3.setContent(new Circle(50, 50, 20));
        Tab tab4 = new Tab("Ellipse");
        tab4.setContent(new Ellipse(10, 10, 100, 80));
        tabPane.getTabs().addAll(tab1, tab2, tab3, tab4);

        //RadioButtons for direction of the tab Pane
        RadioButton top = new RadioButton("Top ");
        RadioButton bottom = new RadioButton("Bottom ");
        RadioButton right = new RadioButton("Right ");
        RadioButton left = new RadioButton("Left ");

        //Set the RadioButtons into the HBox
        hBox.getChildren().addAll(top, left, bottom, right);
        hBox.setAlignment(Pos.CENTER);

        //Radio Button Toggle group for one select option.
        ToggleGroup side = new ToggleGroup();
        top.setToggleGroup(side);
        left.setToggleGroup(side);
        bottom.setToggleGroup(side);
        right.setToggleGroup(side);

        
        borderPane.setCenter(tabPane);
        borderPane.setBottom(hBox);


        Scene scene = new Scene(borderPane, 300, 250);
        primaryStage.setTitle("E31_20Tab&RadioDemo"); // Set the window title
        primaryStage.setScene(scene); // Place the scene in the window
        primaryStage.show(); // Display the window

        // When Clicking on "Top"
        top.setOnAction(e ->{
            tabPane.setSide(Side.TOP); // Set Radiobuttons to topside.

            //Resize the program window
            primaryStage.setWidth(300);
            primaryStage.setHeight(250);
        });

        // When Clicking on "Left"
        left.setOnAction(e ->{
            tabPane.setSide(Side.LEFT); // Set Radiobuttons to Leftside.


            primaryStage.setWidth(250);
            primaryStage.setHeight(300);
        });

        // When Clicking on "Bottom"
        bottom.setOnAction(e ->{
            tabPane.setSide(Side.BOTTOM); // Set Radiobuttons to Bottomside.


            primaryStage.setWidth(300);
            primaryStage.setHeight(250);
        });

        // When Clicking on "Right? "
        right.setOnAction(e ->{
            tabPane.setSide(Side.RIGHT); // Set Radiobuttons to Rightside.


            primaryStage.setWidth(250);
            primaryStage.setHeight(300);
        });
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     * line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
