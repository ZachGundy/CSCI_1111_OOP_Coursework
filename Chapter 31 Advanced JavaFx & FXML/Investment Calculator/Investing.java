package JavaFX;

import java.text.DecimalFormat;

public class Investing {
    //Creating Investing Variables
    private double amountInvested;
    private double annualInterestRate;
    private double monthlyInterestRate;
    private int numberOfYears;

    //Constructor
    Investing(){
    }

    void setAmountInvested(double investmentAmount){
        this.amountInvested = investmentAmount;
    }


    void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }


    void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }


    double getMonthlyInterestRate(){
        return this.monthlyInterestRate = (annualInterestRate / 100) / 12;
    }

    // Getter for future value
    // Formula fo calculating FutureValue
    String getFutureValue(){
        double futureValue = amountInvested * Math.pow((1 + monthlyInterestRate), (numberOfYears * 12));
        DecimalFormat df = new DecimalFormat("0.00");
        return "$"+ df.format(futureValue);
    }
}