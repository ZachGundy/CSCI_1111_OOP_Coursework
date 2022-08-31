package JavaFX;

import java.util.Scanner;

public class Exercise25_3InOrderTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] numbers = new Integer[10];

        // Prompt the user to enter 10 integers
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();

        // Create Integer BST
        BST<Integer> integerTree = new BST<>(numbers);

        // Traverse tree inorder
        System.out.print("The tree in order is: ");
        // integerTree.nonRecursiveInorder();
        System.out.println();
    }
}