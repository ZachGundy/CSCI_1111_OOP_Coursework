package JavaFX;

import java.util.ArrayList;

public class Exercise19_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(14);
        list.add(24);
        list.add(14);
        list.add(42);
        list.add(25);
        list.add(14);
        list.add(10);

        for (int i: removeDuplicates(list)) {
            System.out.println(i);
        }
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> byeDuplicates = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            E elements = list.get(i);
            if (!byeDuplicates.contains(elements)) {
                byeDuplicates.add(elements);
            }
        }
        return byeDuplicates;
    }
}
