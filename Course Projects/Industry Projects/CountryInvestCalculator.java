package JavaFX;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


import java.text.DecimalFormat;
import java.util.concurrent.atomic.AtomicReference;

public class CountryInvestCalculator extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // create a table
        TableView<Country> tableView = new TableView<>();
        ObservableList<Country> data =
                FXCollections.observableArrayList(
                        new Country("USA", "Washington DC", 280, true, "US Dollars", 1000, 10, 10),
                        new Country("Canada", "Ottawa", 32, true, "Canadian Dollars", 1000, 10, 10),
                        new Country("United Kingdom", "London", 60, true, "Pounds", 1000, 10, 10),
                        new Country("Germany", "Berlin", 83, true, "Euros", 1000, 10, 10),
                        new Country("France", "Paris", 60, true, "Francs", 1000, 10, 10));
        tableView.setItems(data);

        TableColumn countryColumn = new TableColumn("Country");
        countryColumn.setMinWidth(100);
        countryColumn.setCellValueFactory(
                new PropertyValueFactory<Country, String>("country"));

        TableColumn capitalColumn = new TableColumn("Capital");
        capitalColumn.setMinWidth(100);
        capitalColumn.setCellValueFactory(
                new PropertyValueFactory<Country, String>("capital"));

        TableColumn populationColumn = new TableColumn("Population (million)");
        populationColumn.setMinWidth(100);
        populationColumn.setCellValueFactory(
                new PropertyValueFactory<Country, Double>("population"));

        TableColumn democraticColumn = new TableColumn("Democratic?");
        democraticColumn.setMinWidth(100);
        democraticColumn.setCellValueFactory(
                new PropertyValueFactory<Country, Boolean>("democratic"));

        TableColumn currencyColumn = new TableColumn("Currency");
        currencyColumn.setMinWidth(100);
        currencyColumn.setCellValueFactory(
                new PropertyValueFactory<Country, String>("currency"));

        TableColumn invAmountColumn = new TableColumn("Investment Amount");
        invAmountColumn.setMinWidth(100);
        invAmountColumn.setCellValueFactory(
                new PropertyValueFactory<Country, Double>("amountInvested"));

        TableColumn annualInterestRateColumn = new TableColumn("Annual Interest Rate");
        annualInterestRateColumn.setMinWidth(100);
        annualInterestRateColumn.setCellValueFactory(
                new PropertyValueFactory<Country, Double>("annualInterestRate"));

        TableColumn numOfYearsColumn = new TableColumn("Number of Years");
        numOfYearsColumn.setMinWidth(100);
        numOfYearsColumn.setCellValueFactory(
                new PropertyValueFactory<Country, Integer>("numberOfYears"));


        tableView.getColumns().addAll(countryColumn, capitalColumn,
                populationColumn, democraticColumn, currencyColumn, invAmountColumn, annualInterestRateColumn, numOfYearsColumn);


        FlowPane flowPane = new FlowPane(3, 3);
        TextField tfCountry = new TextField();
        TextField tfCapital = new TextField();
        TextField tfPopulation = new TextField();
        TextField tfCurrency = new TextField();
        TextField tfInvestmentAmount = new TextField();
        TextField tfAnnualInterestRate = new TextField();
        TextField tfNumberOfYears = new TextField();
        CheckBox chkDemocratic = new CheckBox("Is Democratic?");
        Button btAddRow = new Button("Add New Row");
        Button btDeleteSRow = new Button("Delete Selected Row");
        Button btCalculate = new Button("Calculate");
        tfCountry.setPrefColumnCount(8);
        tfCapital.setPrefColumnCount(8);
        tfPopulation.setPrefColumnCount(8);
        tfCurrency.setPrefColumnCount(8);
        tfInvestmentAmount.setPrefColumnCount(8);
        tfAnnualInterestRate.setPrefColumnCount(8);
        tfNumberOfYears.setPrefColumnCount(8);
        flowPane.getChildren().addAll(new Label("Country: "),
                tfCountry, new Label("Capital: "), tfCapital,
                new Label("Population: "), tfPopulation, new Label("Currency"), tfCurrency, new Label("Investment Amount: "), tfInvestmentAmount,
                new Label("Annual Interest Rate: "), tfAnnualInterestRate, new Label("Number of Years: "), tfNumberOfYears, chkDemocratic,
                btAddRow, btDeleteSRow, btCalculate);

        btAddRow.setOnAction(e -> {
            data.add(new Country(tfCountry.getText(), tfCapital.getText(),
                    Double.parseDouble(tfPopulation.getText()), chkDemocratic.isSelected(), tfCurrency.getText(),
                    Double.parseDouble(tfInvestmentAmount.getText()), Double.parseDouble(tfAnnualInterestRate.getText()), Integer.parseInt(tfNumberOfYears.getText())));


            tfCountry.clear();
            tfCapital.clear();
            tfPopulation.clear();
            tfCurrency.clear();
            tfInvestmentAmount.clear();
            tfAnnualInterestRate.clear();
            tfNumberOfYears.clear();
        });
        // When button is clicked - Delete selected row
        btDeleteSRow.setOnAction(e -> {
            data.remove(tableView.getSelectionModel().getSelectedItem());
        });

        btCalculate.setOnAction(e -> {
            double calcInvAmount = tableView.getSelectionModel().getSelectedItem().getAmountInvested();
            double calcInterest = tableView.getSelectionModel().getSelectedItem().getAnnualInterestRate();
            double calcNumberOfYears = tableView.getSelectionModel().getSelectedItem().getNumberOfYears();
            double calculationTotal = calcInvAmount * calcInterest * calcNumberOfYears;

            System.out.println(calculationTotal);
            Label total = new Label(" Your ROI is: $" + calculationTotal);
            flowPane.getChildren().add(total);

        });

        BorderPane pane = new BorderPane();
        pane.setCenter(tableView);
        pane.setBottom(flowPane);

        Scene scene = new Scene(pane, 500, 250);
        primaryStage.setTitle("CountryInvestCalculator"); // Set the window title
        primaryStage.setScene(scene); // Place the scene in the window
        primaryStage.show(); // Display the window

    }

    public class Country {
        private final String country;
        private final String capital;
        private final double population;
        private final boolean democratic;

        private final String currency;

        private double amountInvested;
        private double annualInterestRate;
        private int numberOfYears;


        Country(String country, String capital,
                double population, boolean democratic, String currency, double amountInvested, double annualInterestRate, int numberOfYears) {
            this.country = country;
            this.capital = capital;
            this.population = population;
            this.democratic = democratic;
            this.currency = currency;
            this.amountInvested = amountInvested;
            this.annualInterestRate = annualInterestRate;
            this.numberOfYears = numberOfYears;

        }

        public String getCountry() {
            return country;
        }

        public String getCapital() {
            return capital;
        }

        public double getPopulation() {
            return population;
        }

        public boolean isDemocratic() {
            return democratic;
        }

        public String getCurrency() {
            return currency;
        }

        public double getAmountInvested() {
            return amountInvested;
        }

        public void setAmountInvested(double amountInvested) {
            this.amountInvested = amountInvested;
        }

        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }

        public int getNumberOfYears() {
            return numberOfYears;
        }

        public void setNumberOfYears(int numberOfYears) {
            this.numberOfYears = numberOfYears;
        }

        //Formula for calculating Value

        //return calculate;

        // DecimalFormat df = new DecimalFormat("0.00");
        //return "$" + df.format(calculate);
        public static void main(String[] args) {
            launch(args);
        }
    }
}


