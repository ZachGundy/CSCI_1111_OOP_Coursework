package JavaFX;

import java.util.ArrayList;

public class Exercise19_9 {
    public static void main(String[] args) {

        // Create and Integer array list and add shown integers to the list
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(14);
        list.add(24);
        list.add(4);
        list.add(42);
        list.add(5);
        list.add(3);
        list.add(10);

        //Method Call
        Exercise19_9.<Integer>sort(list);

        // Display list
        System.out.println(list);
        }

    // Create a static Generic void method that sorts a Generic list and extends Generic comparable.
    // Use Listing 7.8 from the book.
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        E Minimum;
        int minimumIndex;

        // Find the minimum in the list
        for (int i = 0; i < list.size() - 1; i++) {

            Minimum = list.get(i);
            minimumIndex = i;

            // Sort the list using j and compareTo list i
            for (int j = i + 1; j < list.size(); j++) {
                if (Minimum.compareTo(list.get(j)) > 0) {
                    Minimum = list.get(j);
                    minimumIndex = j;
                }
            }

            // Swap list i with list[minimumIndex] if needed
            if (minimumIndex != i) {
                list.set(minimumIndex, list.get(i));
                list.set(i, Minimum);
            }
        }
    }
}