package JavaFX;

public class Exercise1_11 {
    public static void main(String[] args) {

        System.out.println ("Current Population: 312032486");

        System.out.print ("The population at year 1: "); System.out.println ((312032486 + 365 * 24 * 60 * 60 / 7 - 365 * 24 * 60 * 60 / 13 + 365 * 24 * 60 * 60/ 45));

        System.out.print ("The population at year 2: "); System.out.println (312032486 + (2 * 365 * 24 * 60 * 60 / 7) - (2 * 365 * 24 * 60 * 60 / 13) + (2 * 365 * 24 * 60 * 60 / 45));

        System.out.print ("The population at year 3: "); System.out.println (312032486 + 3 * 365 * 24 * 60 * 60 / 7 - 3* 365 * 24 * 60 * 60 / 13 + 3 * 365 * 24 * 60 * 60 / 45);

        System.out.print ("The population at year 4: "); System.out.println (312032486 + 4 * 365 * 24 * 60 * 60 / 7 - 4 * 365 * 24 * 60 * 60 / 13 + 4 * 365 * 24 * 60 * 60 / 45);

        System.out.print ("The population at year 5: "); System.out.println (312032486 + 5 * 365 * 24 * 60 * 60 / 7 - 5 * 365 * 24 * 60 * 60 / 13 + 5 * 365 * 24 * 60 * 60 / 45);
    }
}