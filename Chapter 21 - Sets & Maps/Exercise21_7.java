package JavaFX;

import java.util.*;

public class Exercise21_7 {
    public static void main(String[] args) {
        // Set text in a couple strings
        String text = "Good morning. I Have a good time Coding. " +
                "I hope I can understand the Content. I'll have to do my best";

        // Create a map to count value and hold key
        Map<String, Integer> map = new HashMap<>();

        // Compute and store the occurrence of each word
        String[] words = text.split("[ \n\t\r()]");
        for (String word: words) {
            String key = word.toLowerCase();

            if (key.length() > 0) {
                if (!map.containsKey(key)) {
                    map.put(key, 1);
                }
                else {
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
                }
            }
        }

        // Create an ArrayList
        ArrayList<WordOccurrence> list = new ArrayList<>();

        // Store the key and value from each entry in the list
        for (Map.Entry<String, Integer> entry: map.entrySet())
            list.add(new WordOccurrence(entry.getKey(), entry.getValue()));

        // Sort the list
        Collections.sort(list);

        // Display the sorted list
        System.out.println(list);
    }
}
