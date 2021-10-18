

public class Rectangle { 
	double width;
	double height;
	
	public Rectangle() {
		width = 1;
		height = 1;
	}
	
	public Rectangle (double w, double h) {
		
		width = w;
		height = h;
	}
	
	double getArea() {
		return width * height;
	}
	
	double getPerimeter() {
		return (2 * width) + (2 * height);

    }	
}
