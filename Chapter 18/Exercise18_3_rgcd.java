package JavaFX;

import java.util.Scanner;

public class Exercise18_3_rgcd {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner userInput = new Scanner(System.in);

        System.out.println("********************************");
        System.out.println("Find the greatest common divisor!");
        System.out.println("********************************");

        //Prompt user to enter two integers
        System.out.println("\nPlease enter the first integer:");
        int m = userInput.nextInt();
        System.out.println("\nPlease enter the second integer:");
        int n = userInput.nextInt();

        // Display GCD of both integers
        System.out.println("The gcd of both numbers is: " + rgcd(m,n));
    }

    // Create a method rgcd
    private static int rgcd(int m, int n) {

        if ( m % n == 0)// States the base case
            return n;
       else
            return rgcd(n,m % n); // Recursive call
        }
}
