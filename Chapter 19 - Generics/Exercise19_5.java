package JavaFX;

public class Exercise19_5 {

        public static void main(String[] args) {

            // Create and Integer array and print the max method numbers
            Integer[] numbers = {1, 2, 3};
            System.out.println(max(numbers));

            // Create and Integer array and print the max method words
            String[] words = {"red", "green", "blue"};
            System.out.println(max(words));

            // Create a circles array and print the max method for circles.
            Circle[] circles = {new Circle(3), new Circle(2.9), new Circle(5.9)};
            System.out.println(max(circles));
        }

        // Create a Circle Class that is comparable
        static class Circle implements Comparable<Circle> {
            double radius;

            // Circle constructor.
            public Circle(double radius) {
                this.radius = radius;
            }

            // Create a compare to method for circle that returns integer
            @Override
            public int compareTo(Circle c) {
                if (radius < c.radius)
                    return -1;
                else if (radius == c.radius)
                    return 0;
                else
                    return 1;
            }

            // Circle toString method to display circle radius
            @Override
            public String toString() {
                return "Circle radius: " + radius;
            }

        }

            // Create a generic method that returns the maximum element in a generic array
            public static <E extends Comparable<E>> E max(E[] list) {
                E maxElements = list[0];
                for (int i = 1; i < list.length; i++) {
                    if (list[i].compareTo(maxElements) > 0) {
                        maxElements = list[i];
                    }
                }
                // Return MaxElements list
                return maxElements;
            }
        }
