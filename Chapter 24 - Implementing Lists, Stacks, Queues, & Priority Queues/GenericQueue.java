package JavaFX;

public class GenericQueue<E> extends java.util.LinkedList<E> {

    public void enQ(E e) {

        addLast(e);
    }

    public E deQ() {


        return removeFirst();
    }

    public int getSize() {


        return size();

    }

    // public String toString() { return "Queue: " + list.toString();
}
