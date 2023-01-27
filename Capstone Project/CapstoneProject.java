package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class CapstoneProject extends Application {

    int counter = 0;
    int currentQueuedQuestion = 0;

    @Override
    public void start(Stage primaryStage) {

        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question("1. Are you feeling healthy and well today"));
        questions.add(new Question("2. Please read the medication List. Since you last donated plasma, have you taken any medications on the medication list"));
        questions.add(new Question("3. Since you last donated plasma, have you had any new medical problems or diagnoses"));
        questions.add(new Question("4. Since you last donated plasma, have you had any new medical treatments, vaccinations, or medications"));
        questions.add(new Question("5. Since you last donated plasma, have you had contact with someone who had a smallpox vaccination"));
        questions.add(new Question("6. Since you last donated plasma, have you donated whole blood, platelets, or plasma at another center"));
        questions.add(new Question("7. Please review our Risk Poster. Did you review the Risk Poster"));
        questions.add(new Question("8. Please review our Risk Poster. Do you have any questions about anything mentioned on the risk poster"));
        questions.add(new Question("9. Please review our Risk Poster. Since you last donated plasma, does anything on the Risk poster apply to you"));
        questions.add(new Question("10. Since you last donated plasma, have you gotten a tattoo or had one touched up"));
        questions.add(new Question("11. Since you last donated plasma, have you had an ear or body piercing"));
        questions.add(new Question("12. Since you last donated plasma, have you had surgery or a diagnostic, medical, or dental procedure"));
        questions.add(new Question("13. Since you last donated plasma, have you had acupuncture"));
        questions.add(new Question("14. In the past 14 days, have you had a fever of more than 100.4 degrees Fahrenheit or 38 degrees Celsius"));
        questions.add(new Question("15. Since you last donated plasma, have you had a flare-up of asthma or another l ung disease requiring you to use an inhaler"));
        questions.add(new Question("16. Since you last donated plasma, have you taken part in a medical research study that required you to sign an informed consent"));
        questions.add(new Question("17. Since you last donated plasma, has your address changed"));
        questions.add(new Question("18. Since you last donated plasma, has the mailing address where we can contact you for the next 8 weeks after today's donation changed"));
        questions.add(new Question("19. Since you last donated plasma, has there been any change of people living at your residence"));
        questions.add(new Question("20. I have reviewed the educational materials regarding infections that can be transmitted by my donation, such as, Syphilis, HIV, Hepatitis B and C"));
        questions.add(new Question("21. I agree not to donate if my donation could result in a potential risk to people who receive plasma products"));
        questions.add(new Question("22. I acknowledge that a sample of my blood will be tested for infections that can be transmitted by my donation, such as Syphilis, HIV, Hepatitis B and C"));
        questions.add(new Question("23. I understand you will attempt to notify me if for any reason I cannot donate and records will be maintained indicating the reason for deferral and the deferral time period"));
        questions.add(new Question("24. I have reviewed the information regarding the potential risks and hazards of donating Source Plasma. (Please, review the resource document)"));
        questions.add(new Question("25. I have been given the opportunity to ask questions and understand that I may withdraw from the donation procedure at any time"));
        questions.add(new Question("26. I have answered the online questions and they are true to the best of my knowledge"));
        questions.add(new Question("27. I hereby certify that I am voluntarily being plasmapheresed and agree that this blood and/or derivatives from it may be used in any manner decided by the plasma center"));
        questions.add(new Question("28. I accept the cash fee in full settlement of services rendered"));
        questions.add(new Question("29. I have reviewed the content for all resources: DE-0041 - Medications List, De-004E - Risk poster, and DE-013K - Risks and Hazards of the Donations Procedure"));

        //Create Border Pane
        BorderPane borderPane = new BorderPane();

        int currentQuestion = 0;

        // Create Label containing question text.

        Label text = new Label(questions.get(currentQuestion).getQuestion());

        // Create Vbox in Center containing two buttons and text
        VBox center = new VBox();
        HBox centerButtons = new HBox();
        Button yes = new Button("Yes");
        yes.setPrefSize(100, 50);
        Button no = new Button("No");
        no.setPrefSize(100, 50);
        centerButtons.getChildren().addAll(yes, no);
        centerButtons.setAlignment(Pos.CENTER);
        centerButtons.setSpacing(40);
        centerButtons.setPadding(new Insets(5, 5, 5, 5));
        center.setAlignment(Pos.CENTER);
        center.setSpacing(10.0);
        center.setPadding(new Insets(5, 5, 5, 5));
        center.getChildren().addAll(text, centerButtons);
        VBox.setVgrow(center, Priority.ALWAYS);

        // Create Combo Box to go to selected questions
        ComboBox < String > qSelect = new ComboBox<>();
        qSelect.setValue("Jump To");

        // Iterate through questions to display all questions asked.
        int iterator = questions.size();
        for ( int i = 0; i < iterator; i++) {
            qSelect.getItems().addAll("Question #" + (i + 1));
        }
        // get selected question and change display to that question
        qSelect.setOnAction(e -> {

            int selected = qSelect.getSelectionModel().getSelectedIndex();
            System.out.println("here");

            Label displayQ = new Label(questions.get(selected).getQuestion());
            System.out.println(selected);
            center.getChildren().clear();
            center.setAlignment(Pos.CENTER);
            center.setSpacing(10.0);
            center.setPadding(new Insets(5, 5, 5, 5));
            center.getChildren().addAll(displayQ, centerButtons);

        });

        qSelect.setPrefSize(100, 50);

        // Create HBox for bottom left corner containing Back and Exit buttons, and Combo Box functionality
        HBox leftBox = new HBox();
        Button exit = new Button("Exit");
        Button back = new Button("Back");
        exit.setPrefSize(100, 50);
        back.setPrefSize(100, 50);
        leftBox.getChildren().addAll(exit,qSelect);
        leftBox.setAlignment(Pos.CENTER_LEFT);
        HBox.setHgrow(leftBox, Priority.ALWAYS);

        // Bottom right H box containing Next and Submit Buttons
        HBox rightBox = new HBox();
        Button next = new Button("Next");
        Button submit = new Button("Submit");
        next.setPrefSize(100, 50);
        submit.setPrefSize(100, 50);
        rightBox.getChildren().addAll(next);
        rightBox.setAlignment(Pos.CENTER_RIGHT);
        HBox.setHgrow(rightBox, Priority.ALWAYS);

        // Bottom HBox to contain Right and left boxes for bottom of screen
        HBox bottom = new HBox(leftBox, rightBox);
        bottom.setPadding(new Insets(10));
        borderPane.setBottom(bottom);
        borderPane.setCenter(center);

        // YES Button functionality
        yes.setOnAction(e -> {


                    // Iterate through questions to display all questions asked.
            qSelect.getItems().clear();
            qSelect.setValue("Jump To");
            questions.get(currentQueuedQuestion).setAnswer("Y");

                    for ( int i = 0; i< questions.size(); i++) {
                        if(questions.get(i).getAnswer() == null){
                            qSelect.getItems().addAll("Question #" + (i + 1));
                        }
                       else qSelect.getItems().addAll("Question #" + (i + 1) +": " + questions.get(i).getAnswer());
                    }

           // yes.setStyle("-fx-background-color:Silver ");
           // no.setStyle("-fx-background-color: default");
                });

        // No Button functionality
        no.setOnAction(e1 -> {
            qSelect.getItems().clear();
            qSelect.setValue("Jump To");
            questions.get(currentQueuedQuestion).setAnswer("N");

            for ( int i = 0; i< questions.size(); i++) {
                if(questions.get(i).getAnswer() == null){
                    qSelect.getItems().addAll("Question #" + (i + 1));
                }
                else qSelect.getItems().addAll("Question #" + (i + 1) +": " + questions.get(i).getAnswer());
            }
           // no.setStyle("-fx-background-color: Silver");
           // yes.setStyle("-fx-background-color: default");

        });



        // Next Button Functionality
        next.setOnAction(e -> {

            String q = questions.get(counter).getQuestion();

            //Incremental iterator through questions
            if (q.length() > 0) {

                counter++;
                currentQueuedQuestion = counter;

                String nextQuestion = String.valueOf(counter);
                rightBox.getChildren().clear();
                leftBox.getChildren().clear();

                //Submit button contingency
                if (counter < questions.size() - 2) {
                    rightBox.getChildren().add(next);

                } else
                    rightBox.getChildren().add(submit);
                Label displayQ = new Label(questions.get(Integer.parseInt(nextQuestion)).getQuestion());
                center.getChildren().clear();
                center.getChildren().addAll(displayQ, centerButtons);

                //Back button contingency
                if (counter > 0) {
                    leftBox.getChildren().add(back);

                } else
                    leftBox.getChildren().add(exit);

                // Create Questions Combo Box contingency
                if (counter >= 1) {
                    leftBox.getChildren().clear();
                    leftBox.getChildren().addAll(back, qSelect);
                } else ;

            } else ;

            centerButtons.getChildren().clear();
            centerButtons.getChildren().addAll(yes, no);
            centerButtons.setAlignment(Pos.CENTER);
            centerButtons.setSpacing(40);
            centerButtons.setPadding(new Insets(5, 5, 5, 5));
            no.setStyle("fx-background-color: default");
            yes.setStyle("fx-background-color: default");

        });


        // Back button functionality
        back.setOnAction(e -> {

            String q = questions.get(counter).getQuestion();
            // Decremental Iterator through questions.
            if (q.length() > 0) {

                counter--;
                currentQueuedQuestion = counter;


                String nextQuestion = String.valueOf(counter);

                Label displayQ = new Label(questions.get(Integer.parseInt(nextQuestion)).getQuestion());

                center.getChildren().clear();
                center.getChildren().addAll(displayQ, centerButtons);

                // Create exit button on first questions
                if (counter == 0) {
                    leftBox.getChildren().clear();
                    leftBox.getChildren().add(exit);

                } else ;

                // create next button on back click after full iteration
                if (counter <= 28) {
                    rightBox.getChildren().clear();
                    rightBox.getChildren().add(next);
                } else ;

            } else;


        });

        Scene scene = new Scene(borderPane, 700, 350);
        primaryStage.setTitle("Capstone Project"); // Set the window title
        primaryStage.setScene(scene); // Place the scene in the window
        primaryStage.show(); // Display the window
    }
    public static void main (String[]args){
        launch(args);
    }
}


