package JavaFX;

public class Exercise25_1 {
    public static void main(String[] args) {
        BST<String> tree = new BST<String>();
        System.out.print("The height of tree after creation is: " + tree.height());

        tree.insert("Red");
        System.out.print("\nThe height of tree after adding \"Red\"  is: " + tree.height());

        tree.insert("Green");
        System.out.print("\nThe height of tree after \"Green\" is added to red is: " + tree.height());

        BST<String> tree1 = new BST<String>(new String[]
                {"Tom", "George", "Jean", "Jane", "Kevin", "Peter", "Susan",
                        "Jen", "Kim", "Michael", "Michelle"});

        System.out.print("\nThe breadth-first traversal for tree1 is ");
        tree1.breadthFirstTraversal();

        System.out.print("\nThe height of tree1 is " + tree1.height());

        BST<Integer> tree2 = new BST<Integer>(new Integer[]{50, 45, 35, 48, 59, 51, 58});
        System.out.print("\nThe breadth-first traversal for tree2 is ");
        tree2.breadthFirstTraversal();
        System.out.print("\nThe height of tree2 is " + tree2.height());
    }
}



