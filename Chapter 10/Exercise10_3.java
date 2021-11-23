/** Author: Zach Gunderson
Date: 10/26/2021

**/

public class Exercise10_3 {

	public static void main(String[] args) {

		int[] values = {3,4,5,6,7}; 

		
		System.out.println("\nTests if values are even using isEven(int) method:");
		for (int n = 0; n < values.length; n++) {
		System.out.println(values[n] + " " + MyInteger.isEven(values[n]));
		}

		System.out.println("\nTests if values are odd using isOdd(int) method:");
		for (int n = 0; n < values.length; n++) {
			System.out.println(values[n] + " " + MyInteger.isOdd(values[n]));
		}

		System.out.println("\nTests if values are prime using isPrime(int) method:");
		for (int n = 0; n < values.length; n++) {
			System.out.println(values[n] + " " + MyInteger.isPrime(values[n]));
		}

		System.out.println("\nTests if values are even using isEven() method:");
		for (int n = 0; n < values.length; n++) {

			MyInteger value = new MyInteger(values[n]);
			System.out.println(value.getValue() + " " + value.isEven());
		}

		System.out.println("\nTests if values are odd using isOdd() method:");
		for (int n = 0; n < values.length; n++) {

			MyInteger value = new MyInteger(values[n]);
			System.out.println(value.getValue() + " " + value.isOdd());
		}

		System.out.println("\nTests if values are prime using isPrime() method:");
		for (int n = 0; n < values.length; n++) {

			MyInteger value = new MyInteger(values[n]);
			System.out.println(value.getValue() + " " + value.isPrime());
		}

		System.out.println("\nTests if values are even using isEven(MyInteger) method:");
		for (int n = 0; n < values.length; n++) {

			MyInteger value = new MyInteger(values[n]);
			System.out.println(value.getValue() + " " + MyInteger.isEven(value));
		}

		System.out.println("\nTests if values are odd using isOdd(MyInteger) method:");
		for (int n = 0; n < values.length; n++) {

			MyInteger value = new MyInteger(values[n]);
			System.out.println(value.getValue() + " " + MyInteger.isOdd(value));
		}

		System.out.println("\nTests if values are prime using isPrime(MyInteger) method:");
		for (int n = 0; n < values.length; n++) {

			MyInteger value = new MyInteger(values[n]);
			System.out.println(value.getValue() + " " + MyInteger.isPrime(value));
		}

		int[] values2 = {2, 3, 4};
		MyInteger value = new MyInteger(3);
		System.out.println("\nTests if " + value.getValue() + 
			" is equal to the stated value:");
		for (int n = 0; n < values2.length; n++) {
			System.out.println(values2[n] + " " + value.equals(values2[n]));
		}

		System.out.println("\nTests if " + value.getValue() + 
			" is equal to the stated value:");
		
		
		for (int n = 0; n < values2.length; n++) {
			MyInteger myInteger = new MyInteger(values2[n]);	
			System.out.println(values2[n] + " " + value.equals(myInteger));
		}

		System.out.println("\nTests parseInt(char[]), parseInt(String) methods simotaneoulsy :");

		char[] numberChar = {'2', '3', '4'};

		String numberString= "567";
		
		System.out.print("\'");
		
		for (int n = 0; n < numberChar.length; n++) {
		 	System.out.print(numberChar[n]);
		} 
		System.out.print("\'");
		
		System.out.println("\' + \"" + numberString + "\" = " + 
			(MyInteger.parseInt(numberChar) + 
			MyInteger.parseInt(numberString)));
	}
}