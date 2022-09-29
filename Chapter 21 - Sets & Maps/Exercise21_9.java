package JavaFX;
import java.util.*;

public class Exercise21_9 {
    /** Main method */
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Store 50 states and their capitals
        Map<String, String> statesAndCapitals = getData();

        String state = "";

        // Prompt the user to enter a state
        while (!state.equalsIgnoreCase("Exit")) {

        System.out.print("Enter a state: ");
        state = input.nextLine();

        // Display the capital for the state
        if (statesAndCapitals.get(state) != null) {
            System.out.println("The capital of " + state + " is "
                    + statesAndCapitals.get(state));
            }
        }
    }

    /** Method getData stores the 50 states and their capitals in a map */
    public static Map<String, String> getData() {

        // Create a Container like storage for the array
        Map<String, String> scMap = new HashMap<>();


        String[][] statesAndCapitals = {
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


        for (int i = 0; i < statesAndCapitals.length; i++) {
            scMap.put(statesAndCapitals[i][0],statesAndCapitals[i][1]);
        }

        return scMap;
    }
}