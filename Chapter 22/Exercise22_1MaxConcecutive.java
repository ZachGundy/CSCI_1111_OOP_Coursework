package JavaFX;

import java.util.Scanner;

public class Exercise22_1MaxConcecutive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String value = input.next();

        int point = 0; // point substring
        String max = "";
        for (int n = 1; n < value.length(); n++) {
            String check = value.substring(point, n + 1);

            // Iterate checkSubstring
            if (checkSubstring(check)) {
                if (check.length() > max.length()) {
                    max = check;
                }
            } else {
                point++;
                //If no max increase point
            }
        }
        System.out.println(max);
        input.close();
    }

    // Create a method to check for consecutive substring and display it or the first consecutive combo if there is none.
    static boolean checkSubstring(String s) {
        for (int n = 0; n < s.length() - 1; n++) {
            if (s.charAt(n) > s.charAt(n + 1)) {
                return false;
            }
        }
        return true;
    }
}
