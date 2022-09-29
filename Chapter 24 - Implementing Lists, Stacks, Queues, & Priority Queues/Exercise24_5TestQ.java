package JavaFX;

public class Exercise24_5TestQ {
    public static void main(String[] args) {
        // Create a generic queue
        GenericQueue<String> genQueue = new GenericQueue<String>();

        // Add Starting 3 Elements in the queue to the tail
        genQueue.enQ("Tom");
        genQueue.enQ("Tony");
        genQueue.enQ("Steve");
        System.out.println("(1) " + genQueue); //Print

        // Add the next 3 Elements in the queue to the tail
        genQueue.enQ("Susan");
        genQueue.enQ("Selena");
        genQueue.enQ("Tina");
        System.out.println("(2) " + genQueue);

        // Add 2 more Elements in the queue tail to the tail
        genQueue.enQ("Seth");
        genQueue.enQ("Tiffany");
        System.out.println("(3) " + genQueue);

        // Remove first Elements in queue from the head
        System.out.println("(4) " + genQueue.deQ());
        System.out.println("(5) " + genQueue.deQ()); // remove first

        // Print the queue as it is finally, and show number of stored elements
        System.out.println("(6) " + genQueue); // Print Final
        System.out.println("(7) The number of stored Elements is: " + genQueue.getSize());
    }
}