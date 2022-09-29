import java.util.Scanner;

public class TriangleTest {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter side one of the triangle as a decimal:");
		double side1 = input.nextDouble();
		System.out.print("Enter side two of the triangle as a decimal:");
		double side2 = input.nextDouble();
		System.out.print("Enter side three of the triangle as a decimal:");
		double side3 = input.nextDouble();

		System.out.println("Enter a color:");
		String color = input.next();

		System.out.println("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();
		
		Triangle2 triangle = new Triangle2(side1, side2, side3, color, filled);

		System.out.println(triangle);
	}
}