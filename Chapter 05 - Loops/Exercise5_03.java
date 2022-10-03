package JavaFX;

public class Exercise5_03 {
    public static void main(String[] args) {
        final double POUNDS_PER_KILOGRAM = 2.2;


        System.out.println("Kilograms      Pounds");


        for (int i = 1; i <= 199; i += 1) {
            System.out.printf("%-15d%6.1f\n", i, (i * POUNDS_PER_KILOGRAM));
        }
    }
}
