package JavaFX;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.util.*;

public class Exercise21_11 extends Application {
    int boysNames = 1;
    int girlsNames = 3;
    protected ComboBox<String> cboYear = new ComboBox<>();
    protected ComboBox<String> cboGender = new ComboBox<>();
    protected TextField tfName = new TextField();
    protected Button btFindRanking = new Button("Find Ranking");
    protected Label lblResults = new Label("");
    protected Map[] boys = getNames(boysNames);
    protected Map[] girls = getNames(girlsNames);

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

        // Create and register handle
        btFindRanking.setOnAction(e -> displayNameRank());

        // Create a Scene and place it in the stage
        Scene scene = new Scene(getPane(), 300, 160);
        primaryStage.setTitle("Exercise_21_11"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /** Displays the ranking for the name of the selected year and gender */
    private void displayNameRank() {
        lblResults.setText(getGender() + " name "
                + tfName.getText() + " is ranked #" + getRank()
                + " in year " + cboYear.getValue());
    }

    /* Returns selected gender of boy or girl */
    private String getGender() {
        return cboGender.getValue().equals("Male") ? "Boy" : "Girl";
    }

    /** Returns the ranking for the name of the selected year and gender */
    private String getRank() {
        int year = Integer.parseInt(cboYear.getValue()) - 2001;

        if (cboGender.getValue().equals("Male")) {
            return boys[year].get(tfName.getText()) + "";
        }
        else
            return girls[year].get(tfName.getText()) + "";
    }

    /** Returns the ranking pane */
    private BorderPane getPane() {
        // Add items to cboYear
        for (int i = 2001; i <= 2010; i++)
            cboYear.getItems().add(i + "");

        // Add items to cboGender
        cboGender.getItems().addAll("Male", "Female");

        // Create a grid pane
        GridPane gridPane = new GridPane();
        gridPane.setVgap(5);
        gridPane.setPadding(new Insets(5, 0, 5, 0));
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(new Label("Select a year: "), 0, 0);
        gridPane.add(cboYear, 1, 0);
        gridPane.add(new Label("Boy or girl?: "), 0, 1);
        gridPane.add(cboGender, 1, 1);
        gridPane.add(new Label("Enter a name: "), 0, 2);
        gridPane.add(tfName, 1, 2);
        gridPane.add(btFindRanking, 1, 3);

        // Create a border pane and place node in it
        BorderPane pane = new BorderPane();
        pane.setCenter(gridPane);
        pane.setBottom(lblResults);
        pane.setAlignment(lblResults, Pos.CENTER);

        return pane;
    }

    protected Map[] getNames(int gender) {
        Map[] array = new Map[10];

        for (int year = 2001, n = 0; year <= 2010 && n < 10; year++, n++) {
            Map<String, String> map = new HashMap<>();
            // Read data from url
            try {
                java.net.URL url = new java.net.URL(
                        "http://www.cs.armstrong.edu/liang/data/babynamesranking"
                                + year + ".txt");

                // Create input file from url
                Scanner input = new Scanner(url.openStream());
                while (input.hasNext()) {
                    ArrayList<String> list = new ArrayList<>();
                    for (int v = 0; v < 5; v++) {
                        list.add(v, input.next());
                    }
                    map.put(list.get(gender), list.get(0));
                }
            }
            catch (java.net.MalformedURLException ex) {
                System.out.println("Invalid URL");
            }
            catch (java.io.IOException ex) {
                System.out.println("I/0 Errors: no such file");
            }
            array[n] = map;
        }

        return array;
    }
}