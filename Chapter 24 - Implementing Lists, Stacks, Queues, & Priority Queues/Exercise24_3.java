package JavaFX;

import java.util.Iterator;
import java.util.ListIterator;

public class Exercise24_3 {
    public static void main(String[] args) {
        Integer[] list = {0, -2, -15, 43};
        TwoWayLinkedList<Integer> linkedList = new TwoWayLinkedList<>(list);

        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        linkedList.addFirst(50);
        System.out.println(linkedList);

        linkedList.addLast(102);
        System.out.println(linkedList);

        linkedList.add(0, 2);
        System.out.println(linkedList);
        linkedList.add(7, -10);
        System.out.println(linkedList);
        linkedList.add(20, -45);
        System.out.println(linkedList);

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList);

        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);

        System.out.println(linkedList.remove(3));
        System.out.println(linkedList);

        System.out.println(linkedList.contains(20));
        System.out.println(linkedList.contains(-10));

        System.out.println(linkedList.size());

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(5));
        System.out.println(linkedList.get(3));

        linkedList.addFirst(102);
        System.out.println(linkedList);

        System.out.println(linkedList.indexOf(102));
        System.out.println(linkedList.lastIndexOf(102));
        System.out.println(linkedList.indexOf(10));

        linkedList.set(2, 69);
        System.out.println(linkedList);

        Iterator<Integer> itr = linkedList.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        ListIterator<Integer> listItr = linkedList.listIterator();
        System.out.println(listItr.nextIndex());
        int count = 0;
        while (listItr.hasNext() && count < 4) {
            System.out.print(listItr.nextIndex() + ": " + listItr.next() + " ");
            count++;
        }
        System.out.println();

        while (listItr.hasPrevious()) {
            System.out.print(listItr.previousIndex() + ": " +
                    listItr.previous() + " ");
        }
        System.out.println();

        System.out.println(listItr.nextIndex());
        System.out.println(listItr.previousIndex());

        linkedList.clear();
        System.out.println(linkedList);
    }
}
