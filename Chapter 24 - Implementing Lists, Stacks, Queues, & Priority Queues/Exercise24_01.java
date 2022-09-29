package JavaFX;

import java.util.Arrays;

public class Exercise24_01 {
    public static void main(String[] args) {
        // Create two MyArrayLists
        String[] array1 = {"Tom", "George", "Peter", "Jean", "Jane"};
        MyList<String> list1 = new MyArrayList<>(array1);

        String[] array2 = {"Tom", "George", "Michael", "Michelle", "Daniel"};
        MyList<String> list2 = new MyArrayList<>(array2);
        System.out.println("Create two MyArrayLists:");
        print(list1, list2);


        // Invoke list1.addAll(list2), and displays list1 and list2.
        System.out.println("Invoke list1 with list2");
        list1.addAll(list2);
        print(list1, list2);

        // Recreates list1 and list2 with the same initial values,
        // invokes list1.removeAll(list2), and displays list1 and list2.
        System.out.println("Recreate list1 and list2 with the same initial values,"
                + "\ninvokes list one and removes all of list 2. Displays both lists");
        list1.clear();
        list1.addAll(new MyArrayList<>(array1));
        list1.removeAll(list2);
        print(list1, list2);

        // Recreates list1 and list2 with the same initial values,
        // invokes list1.retainAll(list2), and displays list1 and list2.
        System.out.println("Recreate list1 and list2 with the same initial values,"
                + "\ninvokes retains all of list 2. Displays both lists. :");
        list1.clear();
        list1.addAll(new MyArrayList<>(array1));
        list1.retainAll(list2);
        print(list1, list2);
    }

    // Displays list1 and list2
    public static void print(MyList<String> list1, MyList<String> list2) {
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println();
    }
}