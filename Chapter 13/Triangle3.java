
public class Triangle3 extends GeometricObject implements Colorable {
	private double side1; 
	private double side2; 
	private double side3;

	public Triangle3(){
	} 

	public Triangle3(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle3(double side1, double side2, double side3, 
		String color, boolean filled) {
		this(side1, side2, side3);
		setColor(color);
		setFilled(filled); 
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	@Override
	public double getArea() {
		double a = (side1 + side2 + side3) / 2;
		return Math.sqrt(a * (a - side1) * (a - side2) * (a - side3));
	}

	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	@Override
	public String howToColor() {
		return "color all three sides";
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nArea: " + getArea() + 
			"\nPerimeter: " + getPerimeter(); 
	}
}