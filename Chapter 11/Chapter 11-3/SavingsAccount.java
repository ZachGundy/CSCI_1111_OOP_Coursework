public class SavingsAccount
		extends Account {
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}

	public void withdraw(double amount) {
		if (amount < getBalance()) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println(
				"Sorry, Amount entered surpasses overdraft limit of $50.\nTransaction Denied");
	}
	public String toString() {
		return "\nSavings Acount: \n" + super.toString() + 
"\n**Cannot overdraft or transaction will be denied**" + "\n";
}
}