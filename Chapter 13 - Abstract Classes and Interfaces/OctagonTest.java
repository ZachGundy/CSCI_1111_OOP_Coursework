public class OctagonTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Octagon octagon1 = new Octagon(5);


		System.out.println("\nOctagon #1:\nThe area is: " + octagon1.getArea() + 
			"\nThe perimeter is: " + octagon1.getPerimeter());


		System.out.println("Cloning Octagon #1 for Octagon #2.");
		Octagon octagon2 = (Octagon)octagon1.clone();


		int result = (octagon1.compareTo(octagon2));
		if (result == 1)
			System.out.println("Octagon #2 is greather than its clone.");
		else if (result == -1)
			System.out.println("Octagon #2 is less than its clone."); 
		else
			System.out.println("Octagon #2 is equal to its clone.");
	}
}