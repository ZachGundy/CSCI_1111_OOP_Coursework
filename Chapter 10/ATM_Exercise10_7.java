import java.util.Scanner;

	public class ATM_Exercise10_7 {
		public static void main(String[] args) {
	
			Scanner input = new Scanner(System.in);

			
			Account[] accounts = new Account[10];

		
			balanceStart(accounts);
			

			do {

				System.out.print("Enter your ID: ");
				int id = input.nextInt();

				if (validID(id, accounts)) {
					int selection;
					do {	

						selection = mainMenu(input);
						if (transactionSelection(selection)) {
								choiceDisplay(selection, accounts, id, input);
						}
					} while (selection != 5 && selection != 4 && 
							selection != 3 && selection !=2 && selection !=1); 
				}

			} while (true); 
		}


		public static void balanceStart(Account[] bal) {
			int balanceStart = 100;
			for (int n = 0; n < bal.length; n++) {
				bal[n] = new Account(n, balanceStart);
			}
		}


		public static boolean transactionSelection(int selection) {
			return selection > 0 && selection < 4;
		}


		public static boolean validID(int id, Account[] bal) {
			for (int n = 0; n < bal.length; n++) {
				if (id == bal[n].getId())
					return true;
			}
			return false;
		}


		public static int mainMenu(Scanner input) {
			System.out.print(
				"\nMain menu\n1: withdraw\n2: deposit" +
				"\n3: checkbalance\n4: exit\nEnter a choice: ");
			return input.nextInt();
		}

		public static void choiceDisplay(int number, Account[] bal, int id, Scanner input) {
			switch (number) {
				
				case 1: System.out.print("Enter an amount to withdraw: "); 
				  bal[id].withdraw(input.nextDouble());
						  
				case 2: System.out.print("Enter an amount to deposit: "); 
				  bal[id].deposit(input.nextDouble());
						  
				case 3: System.out.println("The balance is " + bal[id].getBalance());
				  
				break;
						 
			}
		}
	}
