import java.util.*;


public class TestTriangle  {
	public static void main(String[] args) {
		
		Scanner keyboardinput = new Scanner(System.in);
		
		System.out.println("Please enter Side 1:" );
		double side1 = keyboardinput.nextInt();
		System.out.println("Please enter Side 2:");
		double side2 = keyboardinput.nextInt();
		System.out.println("Please enter Side 3:");
		double side3 = keyboardinput.nextInt();
		
		System.out.println("Please enter the color of the triangle:");
		String color = keyboardinput.next();
		
		System.out.println("Please enter true if the triangle is filled or false if it is not:");
			boolean filled = keyboardinput.nextBoolean();
		
		Triangle myTriangle = new Triangle(color,filled, side1, side2, side3);
		System.out.println(myTriangle);
		
		System.out.println("The triangles area is:" + myTriangle.getArea());
		
		System.out.println("The triangles perimeter is:" + myTriangle.getPerimeter());
		
		
	
}

}

