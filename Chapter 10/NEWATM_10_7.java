import java.util.Scanner;

public class NEWATM_10_7 {

		// Get a scanner to read in from the console.
		static Scanner keyboardInput = new Scanner(System.in);

		static void print(String message) {
			System.out.println(message);
		}

		public static void main(String[] args) {

			// All the accounts we'll have to deal with.
			Account[] accounts = new Account[10];

			// Hook people up with cash!
			int balanceStart = 100;
			setStartingBalance(accounts, balanceStart);

			while (true) {
				print("*************************");
				print("Enter your ID:");
				int accountID = keyboardInput.nextInt();

				if (isValidID(accountID, accounts)) {

					Account thisAccount = accounts[accountID];

					while (actionChoices(thisAccount)) {
						// Nothing to do here.
					}

				}

			}
		}

		// Create our 10 accounts with $100 each.
		private static void setStartingBalance(Account[] accounts, double balanceStart) {
			for (int i = 0; i < accounts.length; i++) {
				accounts[i] = new Account(i, balanceStart);							}
		}

		// Check ID to see if the array of accounts.
		private static boolean isValidID(int id, Account[] accounts) {
			for (int i = 0; i < accounts.length; i++) {
				if (id == accounts[i].getId())
					return true;
			}
			print("Please enter a valid ID.");
			return false;
		}

		// Show display for user to select option.
		private static int mainMenu() {
			print("*************************");
			print("Main menu:");
			print("1 - Withdraw");
			print("2 - Deposit");
			print("3 - Check Balance");
			print("4 - Exit");

			return keyboardInput.nextInt();
		}

		private static boolean actionChoices(Account account) {
			int userSelection = mainMenu();
			switch (userSelection) {
			case 1:
				print("Enter an amount to withdraw: ");
				account.withdraw(keyboardInput.nextDouble());
				print("The new account balance is " + account.getBalance());
				return true;

			case 2:
				print("Enter an amount to deposit: ");
				account.deposit(keyboardInput.nextDouble());
				print("The new account balance is " + account.getBalance());
				return true;

			case 3:
				print("The balance is " + account.getBalance());
				return true;

			case 4:
				print("Thanks for choosing Zachs ATM, Goodbye!");
				return false;

			default:
				print("Nice try. Enter a valid choice.");
				return true;

			}
		}
	}
