package JavaFX;

public class Exercise5_11 {
    public static void main(String[] args) {

        System.out.println("Counting from 100 to 200 \nDivisible by 5 or 6, but not BOTH!\n--------------------------------------");

        final int numbersPerLine = 10;
        int count = 0;

        for (int i = 100; i <= 200; i++) {

            if (i % 5 == 0 ^ i % 6 == 0) {
                count++;

                if (count % numbersPerLine == 0)
                    System.out.println(i);

                else
                    System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
