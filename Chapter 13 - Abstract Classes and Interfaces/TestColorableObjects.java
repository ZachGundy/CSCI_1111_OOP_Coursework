
public class TestColorableObjects extends Triangle3 implements Colorable{
	public static void main(String[] args) {
		
		Triangle3[] geoObjects = {new Triangle3(2.0,2.0,2.0), new Triangle3(4.0,4.0,4.0), 
			new Triangle3(6.0,6.0,6.0), new Triangle3(8.0,8.0,8.0), new Triangle3(10.0,10.0,10.0)};
		
		for (int i = 0; i < geoObjects.length; i++) {
		 	System.out.println("\nTriangle #" + (i + 1));
		 	System.out.println("The area is: " + geoObjects[i].getArea());
		 	System.out.println("How to color this triangle: " + ((Triangle3)geoObjects[i]).howToColor());
				
				
		}
	}


}
