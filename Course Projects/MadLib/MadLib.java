package JavaFX;

import java.util.Scanner;


public class MadLib {
    public static void main(String[] args) {

        questionsLoop();

    }

    public static void questionsLoop() {

        Scanner input = new Scanner(System.in);
        String blanks[] = {"adjective", "animal", "name", "food", "color", "verb", "place", "adjective", "adjective", "animal", "number"};
        String answers[] = new String[11];

        for (int i = 0; i < blanks.length; i++) {
            System.out.println("Enter a " + blanks[i]);
            answers[i] = input.nextLine();
        }


        System.out.print("There once was a/an " + answers[0] + " " + answers[1] + " " + "who's name was " + answers[2] + ". The one thing " + answers[2] + " enjoyed more than anything else in the world was eating " + answers[3] + ". For some reason " + answers[2] + " " + "could not get enough of " + answers[3] + " . " + answers[2] + " would even eat " + answers[3] + " if it was " + answers[4] + ".\n" + answers[2] + " " + "wasn't only good at eating. " + answers[2] + " was very very good at " + answers[5] + " " + "because the " + answers[1] + "practiced 3 hours every day. " + answers[5] + " " + "wasn't easy but " + answers[2] + " " + "stuck to it and became the best!\n" + answers[2] + " " + "also had dream of traveling the world and decided" + answers[6] + " " + "would be the first place to visit!\n" + answers[2] + " " + "had a best friend who was a/an " + answers[7] + " " + answers[8] + " " + answers[9] + " " + ".\nThe two of them would do everything together including eating " + answers[3] + ", practicing" + answers[5] + ", going to " + answers[6] + " " + "and much much more!\nEventually the " + answers[1] + " and " + answers[9] + " " + "got married and had " + answers[10] + " " + "kids. They lived happily ever after! THE END! :)");

    }
}