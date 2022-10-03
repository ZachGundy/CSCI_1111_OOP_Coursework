package JavaFX;

import java.util.Scanner;

public class Exercise3_01{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("The quadratic equation is ax^2 + bx + c = 0");

        System.out.print("Enter your value for a:");
        double a = in.nextDouble();
        System.out.print("Enter your value for b:");
        double b = in.nextDouble();
        System.out.print("Enter your value for c:");
        double c = in.nextDouble();



        double discriminant = Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5);


        if (discriminant > 0){
            double ans_1 = ((b*(-1)) + Math.pow((Math.pow(b,2) - 4 * a * c), 0.5)) / (2 * a);
            double ans_2 = ((b*(-1)) - Math.pow((Math.pow(b,2) - 4 * a * c), 0.5)) / (2 * a);

            System.out.println("\nThe equation has two roots");
            System.out.printf("Root 1 %.5f \nRoot 2 %.5f", ans_1, ans_2);


        }else if(discriminant == 0){
            double ans = ((b*(-1)) + Math.pow((Math.pow(b,2) - 4 * a * c), 0.5)) / (2 * a);
            System.out.println("\nThe equation has one root\n" + "Root 1: " + ans);
        }else{
            System.out.println("\nThe equation has no real roots");

        }
    }
}

