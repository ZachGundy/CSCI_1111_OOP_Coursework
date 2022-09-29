package JavaFX;

import java.util.*;

public class Exercise20_3 {
    public static List<String> states = new ArrayList<>();
    public static List<String> capitals = new ArrayList<>();

    /** Main method */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Store 50 states and their capitals in two lists
        statesCaps();

        int count = 0;
        //

        // Get user input return correct or not
        for (int i = 0; i < states.size(); i++) {
            System.out.print("What is the capital of "
                    + states.get(i) + "? ");
            String capital = input.nextLine();

            if (isEqual(capitals.get(i), capital)) {
                System.out.println("Great Job! That is correct");
                count++;
            }
            else {
                System.out.println("The correct answer should be " +
                        capitals.get(i));
            }
        }

        // Display the total correct count
        System.out.println("\nThe correct count is " + count);
    }

  // Create is equal method to return true if a = b
    public static boolean isEqual(String a, String b) {
        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }

        return true;
    }

    /** getData initializes the array with the 50 states and their capitals */
    public static void statesCaps() {
        String[][] s = {
                {"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"}, {"California", "Sacramento"},
                {"Colorado", "Denver"}, {"Connecticut", "Hartford"},
                {"Delaware", "Dover"}, {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},{"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
                {"Illinois", "Springfield"}, {"Indiana", "Indianapolis"},
                {"Iowa Des", "Moines"}, {"Kansas", "Topeka"}, {"Kentucky","Frankfort"},
                {"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"},
                {"Maryland", "Annapolis"}, {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"},
                {"Mississippi", "Jackson"}, {"Missouri", "Jefferson City"},
                {"Montana", "Helena"}, {"Nebraska", "Lincoln"},
                {"Nevada	", "Carson City"}, {"New Hampshire", "Concord"},
                {"New Jersey", "Trenton"}, {"New Mexico", "Santa Fe"},
                {"New York", "Albany"}, {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismarck"},{"Ohio", "Columbus"},
                {"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"},
                {"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"}, {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"}, {"Texas", "Austin"},
                {"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"}, {"Washington", "Olympia"},
                {"West Virginia", "Charleston"}, {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}};

        // Create two lists for capitals and states
        for (int i = 0; i < s.length; i++) {
            states.add(s[i][0]);
            capitals.add(s[i][1]);
        }

        // Shuffle lists randomly
        long numberGenerator = System.currentTimeMillis();
        Collections.shuffle(states, new Random(numberGenerator));
        Collections.shuffle(capitals, new Random(numberGenerator));
    }
}