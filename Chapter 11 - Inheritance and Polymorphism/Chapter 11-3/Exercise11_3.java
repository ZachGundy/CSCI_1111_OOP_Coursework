
public class Exercise11_3 {

	public static void main(String[] args) {

		Account account = new Account (1,1000);
		SavingsAccount savings = new SavingsAccount(2,1500);
		CheckingAccount checking = new CheckingAccount(3,700,-50);
		
		account.setAnnualInterestRate(1.5);
		savings.setAnnualInterestRate(1.5);
		checking.setAnnualInterestRate(1.5);
		
		account.withdraw(500);
		savings.withdraw(1000);
		checking.withdraw(100);
		
		account.deposit(0);
		savings.deposit(1000);
		checking.deposit(0);
		
		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());

	}

}
