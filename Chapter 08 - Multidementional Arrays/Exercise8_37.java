package JavaFX;

import java.util.Scanner;

public class Exercise8_37 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[][] statesCapitals = listOfTen();

        int count = 0;
        for (int i = 0; i < statesCapitals.length; i++) {
            System.out.print("What is the capital of "
                    + statesCapitals[i][0] + "? ");
            String capital = input.nextLine();

            if (isEqual(statesCapitals[i][1], capital)) {
                System.out.println("Your answer is correct");
                count++;
            }
            else {
                System.out.println("The correct answer should be " +
                        statesCapitals[i][1]);
            }
        }

        System.out.println("\nThe correct count is " + count);
    }

    public static boolean isEqual(String c, String a) {
        if (c.length() != a.length())
            return false;

        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) != a.charAt(i))
                return false;
        }

        return true;
    }

    public static String[][] listOfTen() {
        String[][] d = {
                {"Alabama", "Montgomery"},
                {"Illinois", "Springfield"},
                {"Kansas", "Topeka"},
                {"Louisiana", "Baton Rouge"},
                {"Maine", "Augusta"},
                {"Maryland", "Annapolis"},
                {"New York", "Albany"},
                {"Vermont", "Montpelier"},
                {"Washington", "Olympia"},
                {"West Virginia", "Charleston"}};
        return d;
    }
}
