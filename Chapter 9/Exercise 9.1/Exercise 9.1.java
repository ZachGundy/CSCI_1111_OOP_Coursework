public class Exercise9_01 {
	public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle(4,40);
		
		Rectangle rectangle2 = new Rectangle(3.5,35.9);
		
		Rectangle rectangle3 = new Rectangle();
		
		System.out.println("\n Rectangle 1");
				System.out.println("---------------");
				System.out.println("The Width is: " + rectangle1.width);
				System.out.println("The Height is: " + rectangle1.height);
				System.out.println("The Area is: " + rectangle1.getArea());
				System.out.println("The Perimeter is: " + rectangle1.getPerimeter());
		
				System.out.println("\n Rectangle 2");
				System.out.println("---------------");
				System.out.println("The Width is: " + rectangle2.width);
				System.out.println("The Height is: " + rectangle2.height);
				System.out.println("The Area is: " + rectangle2.getArea());
				System.out.println("The Perimeter is: " + rectangle2.getPerimeter());
				
				System.out.println("\n Rectangle 3");
				System.out.println("---------------");
				System.out.println("The Width is: " + rectangle3.width);
				System.out.println("The Height is: " + rectangle3.height);
				System.out.println("The Area is: " + rectangle3.getArea());
				System.out.println("The Perimeter is: " + rectangle3.getPerimeter());
				
								
		
	}
}
