class Exercise9_07 {
	public static void main(String[] args) {
		Account account = new Account(1122, 20.000);
		
		account.setAnnualInterestRate(4.5);
		
		account.withdraw(2500);
		
		account.deposit(3000);
		System.out.println("Account Balance Statement");
		System.out.println("_____________________");
		System.out.printf("The balance is $%.2f: ", account.getBalance());
		System.out.printf("\nThe monthly interest is %.2f: ", account.getMonthlyInterest()) ;
		System.out.println("\nThe account creation date is: " + account.getDateCreated());
		System.out.println("\nThe total annual accumulation amount based on $" + account.getMonthlyInterest() + " per month is: $" + account.getMonthlyInterest() * 12);
	}
}