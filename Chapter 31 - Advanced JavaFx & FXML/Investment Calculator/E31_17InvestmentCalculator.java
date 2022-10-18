package JavaFX;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class E31_17InvestmentCalculator extends Application {
    public Pane pane = new Pane();
    public VBox vBox = new VBox();

    public Button calculate = new Button("Calculate");
    public GridPane gridPane = new GridPane();
    public MenuItem calculateItem = new MenuItem("Calculate");
    public MenuItem exit = new MenuItem("Exit");
    public TextField investmentAmounttf= new TextField();
    public TextField numOfYearstf = new TextField();
    public TextField annualInterestRatetf = new TextField();
    public TextField futureValuetf = new TextField();

    public Investing investment = new Investing();

    public static void main(String[] args){
        launch(args);
    }

    @Override

    public void start(Stage primaryStage) throws Exception {
        futureValuetf.setEditable(false);
        investmentAmounttf.setAlignment(Pos.BOTTOM_RIGHT);
        numOfYearstf.setAlignment(Pos.BOTTOM_RIGHT);
        annualInterestRatetf.setAlignment(Pos.BOTTOM_RIGHT);
        futureValuetf.setAlignment(Pos.BOTTOM_RIGHT);

        MenuBar operation = new MenuBar();
        vBox.getChildren().add(operation);
        pane.getChildren().add(vBox);
        Menu menuOperation = new Menu("Operation");
        operation.getMenus().add(menuOperation);
        menuOperation.getItems().addAll(
                calculateItem, exit);



        Scene scene = new Scene(pane, 300, 200); //Create a scene with the pane set inside
        primaryStage.setTitle("E31_17InvestmentCalculator"); //Set the title of the stage
        primaryStage.setScene(scene); //Set scene inside the stage
        primaryStage.show(); //Show the stage

        calculateItem.setOnAction(e->{ //When the calculateItem menu item is selected
            displayCalculator(); //Display the Investment calculator

        });
        exit.setOnAction(e ->{ //When the exit menu item is selected
            System.exit(0); //Exit with code 0
        });

        calculate.setOnAction(e ->{ //When calculate is pressed
            //Collect all information and Parse it from string to double or int
            String investmentText = investmentAmounttf.getText();
            investment.setAmountInvested(Double.parseDouble(investmentText));
            String yearsText = numOfYearstf.getText();
            investment.setNumberOfYears(Integer.parseInt(yearsText));
            String interestText = annualInterestRatetf.getText();
            investment.setAnnualInterestRate(Double.parseDouble(interestText));

            //Get monthly interest and set the Future Value text field to the investment string
            investment.getMonthlyInterestRate();
            futureValuetf.setText(investment.getFutureValue());
        });
    }

    public void displayCalculator(){
        HBox hBox = new HBox(); //HBox for the button placement
        gridPane.setHgap(5); //Gap between labels and text fields
        gridPane.setVgap(5); //Gap between different labels/text fields

        //Label and field for Investment Amount
        gridPane.add(new Label("Investment Amount:"),0,0);
        gridPane.add(investmentAmounttf,1,0);

        //Label and field for Number of Years
        gridPane.add(new Label("Number of Years:"), 0 ,1);
        gridPane.add(numOfYearstf, 1,  1);

        //Label and field for Annual Interest Rate
        gridPane.add(new Label("Annual Interest Rate:"), 0, 2);
        gridPane.add(annualInterestRatetf, 1, 2);

        //Label and field for Future Value
        gridPane.add(new Label("Future Value:"), 0, 3);
        gridPane.add(futureValuetf, 1, 3);

        //Set each area into the respective spot
        vBox.getChildren().add(gridPane);
        hBox.getChildren().add(calculate);
        hBox.setAlignment(Pos.BOTTOM_RIGHT);
        vBox.getChildren().add(hBox);
    }
}