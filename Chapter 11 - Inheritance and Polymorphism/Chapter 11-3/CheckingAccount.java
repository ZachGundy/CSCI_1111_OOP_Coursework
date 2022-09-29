
public class CheckingAccount extends Account{
private double overdraftLimit;

public CheckingAccount() {
	super();
	overdraftLimit = -50;
}

public CheckingAccount(int id, double balance, double overdraftLimit) {
	super(id, balance);
	this.overdraftLimit = overdraftLimit;
}


public double getOverdraftLimit() {
	return overdraftLimit;
}

public void setOverdraftLimit(double overdraftLimit) {
	this.overdraftLimit = overdraftLimit;
}

public void withdraw(double amount) {
	if (getBalance() - amount > overdraftLimit) {
		setBalance(getBalance() - amount);
	}
	else
		System.out.println("Sorry, Amount entered surpasses overdraft limit of $50:");
}

public String toString() {
	return "Checking Accout: \n" + super.toString() + "" + "\n**Overdraft limit: $" +
	String.format("%.2f", overdraftLimit) + "**";
}
}

