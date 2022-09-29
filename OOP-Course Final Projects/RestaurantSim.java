import java.util.Scanner;

public class Restaurant extends RestaurantClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("Please enter a number between 1 and 10");
		int choice = input.nextInt();
		
		if (choice == 1) { 
			Restaurant restaurant = new Restaurant(25.14, 5,"Dumplings and Hamfriend rice", 3);
			System.out.println("********");
			System.out.println(" Awesome you guys are going to a Chinse Restaurant!!! Enjoy :)");
			System.out.println(restaurant);
			System.out.println("********");
		
		}
		
		else if (choice == 2) {
			
			Restaurant restaurant = new Restaurant(13.06, 1, "Western Bacon Cheeseburger Combo", 1);
			System.out.println("********");
			System.out.println(" Mmmm Burger king for lunch!! Nom nom nom");
			System.out.println(restaurant);
			System.out.println("********");
		}
		else if (choice == 3) {
			
			Restaurant restaurant = new Restaurant(150.50, 2, "Full rack of ribs and a 20 oz steak", 2);
			System.out.println("********");
			System.out.println(" What? Treating your wife to the nicest steakhouse in town? Lucky you.");
			System.out.println(restaurant);
			System.out.println("********");
		}
		else if (choice == 4) {
			
			Restaurant restaurant = new Restaurant(37.43, 3, "Spicy Curry Shrimp Pho", 1.5);
			System.out.println("********");
			System.out.println(" Feel free to endulge as you enjoy Vietnam Cafe Pho");
			System.out.println(restaurant);
			System.out.println("********");
		}
		else if (choice == 5) { 
			
			Restaurant restaurant = new Restaurant(10000.00, 30, "24 foot club sandwich", 10);
			System.out.println("********");
			System.out.println(" Good idea having Firehouse Subs Cater!");
			System.out.println(restaurant);
			System.out.println("********");
		}
		else if (choice == 6) { 
			
			Restaurant restaurant = new Restaurant(50.50, 5, "2 combo and 2 pepperoni Pizzas", 8);
			System.out.println("********");
			System.out.println(" Dominoes for delivery!! Be sure to tip ;)");
			System.out.println(restaurant);
			System.out.println("********");
		}
		else if (choice == 7) { 
			
			Restaurant restaurant = new Restaurant(10.00, 2, "Chocolate Chip Cookie Dough", .5);
			System.out.println("********");
			System.out.println(" Shake Shack has the best shakes!! Way to be \"cool\" about it.");
			System.out.println(restaurant);
			System.out.println("********");
		}
		else if (choice == 8) { 
			
			Restaurant restaurant = new Restaurant(0.00, 4, "Roast and Potatoes", 4);
			System.out.println("********");
			System.out.println(" Nothing beast Sunday Dinner at Mom's house! It's free after all :P ");
			System.out.println(restaurant);
			System.out.println("********");
		}
		else if (choice == 9) { 
			
			Restaurant restaurant = new Restaurant(25.25, 3, "Drunken Noodle Pad Thai", 2.5);
			System.out.println("********");
			System.out.println(" Bunisas Thai Cuisine! Best place in town. Nice Choice!");
			System.out.println(restaurant);
			System.out.println("********");
		}
		else if(choice == 10) {
			
			Restaurant restaurant = new Restaurant(18.43, 5, "Whatever you want!", 2);
			System.out.println("********");
			System.out.println(" Sometimes Golden Coral buffet is the only way to please everyone..");
			System.out.println(restaurant);
			System.out.println("********");
		}
		

	}

}
