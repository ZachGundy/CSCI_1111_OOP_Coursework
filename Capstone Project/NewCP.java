/**
 * Author: Zach Gunderson
 * Date Created: 02/09/2023
 * Project Name: ?Ready
 */
package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;


public class NewCP extends Application {
    private static int counter = 0;
    private static int currentQuestion = 0;
    private static ArrayList<Question> questions = new ArrayList<>();
    private static ComboBox<String> qSelect = new ComboBox<>();
    private static ComboBox<String> answers = new ComboBox<>();
    private static VBox center = new VBox();
    private static HBox centerButtons = new HBox();
    private static Button yes = new Button("Yes");
    private static Button no = new Button("No");
    private static Button next = new Button("Next");
    private static Button submit = new Button("Submit");
    private static HBox leftBox = new HBox();
    private static HBox rightBox = new HBox();
    private static Button exit = new Button("Exit");
    private static Button back = new Button("Back");
    private static Label text = new Label();

    private static BorderPane borderPane = new BorderPane();

    private static CheckBox viewRisks = new CheckBox("Risk Poster");
    private static Image riskPoster = new Image("C:\\Users\\zachp\\OneDrive\\Desktop\\Risk Poster.jpg");
    private static Image checkIcon = new Image("C:\\Users\\zachp\\OneDrive\\Desktop\\CheckIcon.jpg");


    /**
     * Calling all methods used in project.
     * @param Stage
     */
    @Override
    public void start(Stage Stage) {
        donorGuiWindow();
        qLabel();
        answerBox();
        selectionBoxDisplay();
        comboBoxSelection();
        yesButton();
        noButton();
        backButton();
        exitButton();
        submitButton();
        nextButton();
    }


// Create a GUI to encompass all objects

    /**
     * This Method is set up to display all gui formatting needed for main application
     */
    public static void donorGuiWindow() {

        //Create Border Pane


        // Create Vbox in Center containing two buttons and text
        yes.setPrefSize(100, 50);
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
        qSelect.setPrefSize(100, 50);
        qSelect.setValue("Jump To");

        // Create Combo Box to store answers
        answers.setPrefSize(100, 50);
        answers.setValue("Answers");


        // Create HBox for bottom left corner containing Back and Exit buttons, and Combo Box functionality
        exit.setPrefSize(100, 50);
        back.setPrefSize(100, 50);
        leftBox.getChildren().addAll(exit,answers);
        leftBox.setAlignment(Pos.CENTER_LEFT);
        leftBox.setSpacing(10);
        HBox.setHgrow(leftBox, Priority.ALWAYS);

        // Bottom right H box containing Next and Submit Buttons - Plus checkbox layout
        viewRisks.setGraphic(new ImageView(checkIcon));
        viewRisks.setTextFill(Color.BLUE);
        viewRisks.setStyle("−fx−border−color: black");
        viewRisks.setSelected(false);
        viewRisks.setPadding(new Insets(5, 5, 5, 5));
        viewRisks.setPrefSize(100, 50);
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

        Scene scene = new Scene(borderPane, 1000, 350);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Capstone Project"); // Set the window title
        primaryStage.setScene(scene); // Place the scene in the window
        primaryStage.show(); // Display the window

    }

    /**
     * qLabel() is for displaying the the array of questions.
     * Display is set in center of stage above center buttons in Vbox format.
     * center is cleared, text of questiion starting at index 0 is displayed.
     */
    // Create Label containing question text.
    public static void qLabel() {
        questionArray();
        center.getChildren().clear();
        text = new Label(questions.get(currentQuestion).getQuestion());
        center.getChildren().addAll(text, centerButtons);

    }

    /**
     * Question array is an array of 29 preselected questions.
     */
    // Create an array list containing all asked questions for plasma doner
    public static void questionArray() {

        questions.add(new Question("1. Are you feeling healthy and well today"));
        questions.add(new Question("2. Since you last donated plasma, you have not taken any new medications"));
        questions.add(new Question("3. Since you last donated plasma, you have not had any new medical problems or diagnoses"));
        questions.add(new Question("4. Since you last donated plasma, you have not had any new medical treatments, vaccinations, or medications"));
        questions.add(new Question("5. Since you last donated plasma, you have not had contact with someone who had a smallpox vaccination"));
        questions.add(new Question("6. Since you last donated plasma, you have not donated whole blood, platelets, or plasma at another center"));
        questions.add(new Question("7. Please review our Risk Poster. Did you review the Risk Poster"));
        questions.add(new Question("8. Please review our Risk Poster. You don't have questions about anything mentioned on the risk poster"));
        questions.add(new Question("9. Please review our Risk Poster. Since you last donated plasma, nothing on anything on the Risk poster apply to you"));
        questions.add(new Question("11. Since you last donated plasma, you have not had an ear or body piercing"));
        questions.add(new Question("12. Since you last donated plasma,  you have not had surgery or a diagnostic, medical, or dental procedure"));
        questions.add(new Question("13. Since you last donated plasma,  you have not had acupuncture"));
        questions.add(new Question("14. In the past 14 days,  you have not had a fever of more than 100.4 degrees Fahrenheit or 38 degrees Celsius"));
        questions.add(new Question("15. Since you last donated plasma, have you have not had a flare-up of asthma or another l ung disease requiring you to use an inhaler"));
        questions.add(new Question("16. Since you last donated plasma, have you have not taken part in a medical research study that required you to sign an informed consent"));
        questions.add(new Question("17. Since you last donated plasma, your address has not changed"));
        questions.add(new Question("18. Since you last donated plasma, the mailing address where we can contact you for the next 8 weeks after today's donation has not changed"));
        questions.add(new Question("19. Since you last donated plasma, there has not been any change of people living at your residence"));
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
    }

    /**
     * selectionBoxDisplay() displays a ComboBox called qSelect by iteration.
     * A for loop is used to iterate through questions array and display them as 29 items in combo box.
     */
    // Create Combo Box to go to selected questions
    public static void selectionBoxDisplay() {
        // Create Combo Box to go to selected questions
        for (int i = 0; i < questions.size(); i++) {
            qSelect.getItems().addAll("Question #" + (i + 1));
        }
    }

    /**
     * comboBoxSelection method is specific to the getSelectionModel()
     * It clears center. creates and int that is equal to what is selected.
     * collects that int and stores it as a text display.
     * It jumps to the question selected and displays that question in the center.
     */
    // get selected question and change display to that question
    public static void comboBoxSelection() {

        qSelect.setOnAction(e -> {

            center.getChildren().clear();

            int selected = qSelect.getSelectionModel().getSelectedIndex();
            text = new Label(questions.get(selected).getQuestion());
            center.getChildren().addAll(text, centerButtons);
            counter = selected;
        });
    }

    /**
     * answerBox() simply displays the users answers by using a forloop to display the number of questions.
     *
     */
    // Answer Box Display
    public static void answerBox() {
        for (int i = 0; i < questions.size(); i++) {
            answers.getItems().addAll("Question #" + (i + 1));
        }

        answers.setValue("Answers");
    }

    /**
     * yesButton() says when yes buttons is clicked clear the answers combo box
     * Show only 10 rows at a time. Use questions setAnswer to make that specific counter = Yes
     * Counter is determined by next/ back buttons.
     * Using a forloop it iterates through the question array by size.
     * Displays a new answer combo box, checks for null and doesn't display those. Collect the answer and displays
     *
     */
    // Yes Button functionality
    public static void yesButton() {

        yes.setOnAction(e -> {
            answers.getItems().clear();
            answers.setValue("Answers");
            answers.setVisibleRowCount(10);
            questions.get(counter).setAnswer("Y");
            for (int i = 0; i < questions.size(); i++) {
                if (questions.get(i).getAnswer() == null || counter == qSelect.getSelectionModel().getSelectedIndex()) {
                    answers.getItems().addAll("Question #" + (i + 1));
                } else answers.getItems().addAll("Question #" + (i + 1) + ": " + questions.get(i).getAnswer());
            }
        });
    }
    /**
     * NoButton() says when yes buttons is clicked clear the answers' combo box
     * Show only 10 rows at a time. Use questions setAnswer to make that specific counter = No
     * Counter is determined by next/ back buttons.
     * Using a forloop it iterates through the question array by size.
     * Displays a new answer combo box, checks for null and doesn't display those. Collect the answer and displays
     *
     */
// No Button functionality
    public static void noButton() {

        no.setOnAction(e -> {
            answers.getItems().clear();
            answers.setValue("Answers");
            answers.setVisibleRowCount(10);
            questions.get(counter).setAnswer("N");
            for (int i = 0; i < questions.size(); i++) {
                if (questions.get(i).getAnswer() == null || counter == qSelect.getSelectionModel().getSelectedIndex()) {
                    answers.getItems().addAll("Question #" + (i + 1));
                } else answers.getItems().addAll("Question #" + (i + 1) + ": " + questions.get(i).getAnswer());
            }
        });
    }

    /**
     * nextButton() is designed to create a counter variable that tracks what question user is on
     * creates a case for when Submit button appears by when counter reaches last questions.
     * Makes sure that all buttons and gui objects stay constant as the next button is click.
     * Whichever question is current is displayed as text in GUI
     */
// Next Button Functionality
    public static void nextButton() {
        next.setOnAction(e -> {

            String q = questions.get(counter).getQuestion();

            //Incremental iterator through questions
            if (q.length() > 0) {

                counter++;

                String nextQuestion = String.valueOf(counter);
                rightBox.getChildren().clear();
                leftBox.getChildren().clear();

                //Submit button contingency
                if (counter < questions.size() - 1) {
                    rightBox.getChildren().add(next);

                } else
                    rightBox.getChildren().add(submit);
                Label displayQ = new Label(questions.get(Integer.parseInt(nextQuestion)).getQuestion());
                center.getChildren().clear();
                center.getChildren().addAll(displayQ, centerButtons);

                // Create Questions Combo Box contingency
                if (counter >= 1) {
                    answers.setValue("Answers");
                    leftBox.getChildren().clear();
                    leftBox.getChildren().addAll(back, answers);
                }
            }
        });
    }
/**
 * backButton is designed to create a counter variable that tracks what question user is on
 * creates a case for when Exit button appears by when counter reaches first question.
 * Makes sure that all buttons and gui objects stay constant as the back button is click.
 * Whichever question is current is displayed as text in GUI
     */
    // Back Button Functionality
    public static void backButton() {

        // Back button functionality
        back.setOnAction(e -> {

            String q = questions.get(counter).getQuestion();
            // Decremental Iterator through questions.
            if (q.length() > 0) {

                counter--;

                String nextQuestion = String.valueOf(counter);

                Label displayQ = new Label(questions.get(Integer.parseInt(nextQuestion)).getQuestion());

                center.getChildren().clear();
                center.getChildren().addAll(displayQ, centerButtons);

                // Create exit button on first questions
                if (counter == 0) {
                    leftBox.getChildren().clear();
                    leftBox.getChildren().addAll(exit, answers);

                } else ;

                // create next button on back click after full iteration
                if (counter <= 29) {
                    rightBox.getChildren().clear();
                    rightBox.getChildren().add(next);
                } else ;
            } else ;
        });
    }

    /**
     * submitButton() collects all answers stored. If all answers are yes. User Passes and is prompted to proceed
     * If any No is answered user is prompted to meet with a member of the medical staff
     * Null pointer exceptions are caught in try block and if a question goes unanswered
     * User will then be prompted to answer all questions to proceed.
     */
    //Submit Button Functionality
    public static void submitButton() {

        submit.setOnAction( e -> {
            try {

                boolean outcome = true;

                for (int i = 0; i < questions.size(); i++) {
                    if (questions.get(i).getAnswer().equals("N")) {
                        outcome = false;
//                    } else if (questions.get(i).getAnswer() == null) {
//                        Text text1 = new Text("Please answer all the questions");
//                        text1.setFill(Color.RED);
//                        center.getChildren().clear();
//                        center.getChildren().addAll(text1, text, centerButtons);
//                        submit.cancelButtonProperty();
                    }
                }
                if (outcome) {
                    borderPane.getChildren().clear();
                    Label pass = new Label("Congratulations! You are all done. Please have a seat and wait for your name to be called.");
                    pass.setLayoutX(50);
                    pass.setLayoutY(50);
                    pass.setFont(Font.font(25));
                    Pane pane = new Pane(pass);
                    Scene scene = new Scene(pane, 1200, 350);
                    Stage primaryStage = new Stage();
                    primaryStage.setTitle("Capstone Project"); // Set the window title
                    primaryStage.setScene(scene); // Place the scene in the window
                    primaryStage.show(); // Display the window


                } else {
                    borderPane.getChildren().clear();
                    Label pass = new Label("Please be seated and wait to speak with a member of our medical staff.");
                    pass.setLayoutX(50);
                    pass.setLayoutY(50);
                    pass.setFont(Font.font(25));
                    Pane pane = new Pane(pass);
                    Scene scene = new Scene(pane, 1000, 350);
                    Stage primaryStage = new Stage();
                    primaryStage.setTitle("Capstone Project"); // Set the window title
                    primaryStage.setScene(scene); // Place the scene in the window
                    primaryStage.show(); // Display the window
                }
            } catch (NullPointerException ex) {

                Text text1 = new Text("Please check the answer drop down and answer all the questions");
                text1.setFill(Color.RED);
                center.getChildren().clear();
                center.getChildren().addAll(text1, text, centerButtons);
                submit.cancelButtonProperty();
            }
        });
//        rightBox.getChildren().clear();
//
//        //Submit button contingency
//        if (counter < questions.size() - 2) {
//            rightBox.getChildren().add(next);
//
//        } else
//            rightBox.getChildren().add(submit);
    }

    /**
     * exitButton quickly closed down the application as exit buttion is click with escape path 0
     */
    //Exit Button Functionality
    public static void exitButton() {
        exit.setOnAction(e -> {
            System.exit(0);
        });
    }

/**
 * viewRisks will be used to as a prompt for the user to view as they hit a certain point in the questions
 * Questsion will be determined by counter.
 * User can proceed once the prompt is viewed
 */
        // Create Risk Poster
    public static void viewRisks () {

//        if (counter == 8) {
//            leftBox.getChildren().clear();
//            leftBox.getChildren().addAll(back, qSelect, answers, viewRisks);
//
//        }
//
//        viewRisks.setOnAction(e -> {
//
//            ImageView imageView = new ImageView(riskPoster);
//            imageView.setFitHeight(600);
//            imageView.setFitWidth(600);
//        });
        }

    /** main method used in Java to launch program
     *
     * @param args
     */
    public static void main(String[] args) {

        launch(args);
    }
}
