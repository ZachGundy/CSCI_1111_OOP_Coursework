package JavaFX;

import java.util.Scanner;


public class Exercise4_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the promted information for a regular polygon \nEnter the number of sides: ");
        int numberOfsides = input.nextInt();
        System.out.print("Enter the length of the sides: ");
        double lenghOfsides = input.nextDouble();

        double area = (numberOfsides * Math.pow(lenghOfsides, 2) / (4 * Math.tan(Math.PI / numberOfsides)));

        System.out.println("The area of the regular polygon is: " + area);
    }
}