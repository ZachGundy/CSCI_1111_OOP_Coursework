package JavaFX;

import java.util.Scanner;

public class Exercise6_37 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        int number = input.nextInt();
        System.out.print("Now enter a width to display for that number: ");
        int width = input.nextInt();

        System.out.println(number + " formatted to width " + width + " is: " + format(number, width));
    }

    public static String format(int number, int width) {
        String num = number + "";

        if (num.length() < width) {
            for (int i = width - num.length(); i > 0; i--) {
                num = 0 + num;
            }
        }
        return num;
    }
}



