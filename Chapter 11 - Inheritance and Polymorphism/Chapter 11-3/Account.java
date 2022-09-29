import java.util.Date;
import java.sql.*;

class Account{
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	Account (){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	Account (int newId , double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int newId) {
		id = newId;
		
	}
	public double getBalance(){
		return balance;
		
	}
	
	public void setBalance(double newBalance){
		balance = newBalance;
	
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate( double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
		
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate() / 100;
	}
	
	public void withdraw(double number) {
		balance -= number;
	}
	
	public void deposit(double number) {
		balance += number;
	}
	
	public String toString() {
		return "Account current balance is: " + this.getBalance() + 
				"\nAccount date created is: " + this.getDateCreated() + 
				"\nAccount monthly interest is: " + this.getMonthlyInterest();
		
	}

}