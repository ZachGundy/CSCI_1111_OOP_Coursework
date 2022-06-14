package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class Listeners extends Application {
        private BallPane moveBall = new BallPane();

        @Override
        public void start(Stage primaryStage) {

                HBox hBox = new HBox(8);
                hBox.setAlignment(Pos.CENTER);
                Button btLeft = new Button("Left");
                Button btRight = new Button("Right");
                Button btUp = new Button("Up");
                Button btDown = new Button("Down");
                hBox.getChildren().addAll(btLeft, btRight, btUp, btDown);

                btLeft.setOnAction(e -> moveBall.left());
                btRight.setOnAction(e -> moveBall.right());
                btUp.setOnAction(e -> moveBall.up());
                btDown.setOnAction(e -> moveBall.down());

                BorderPane pane = new BorderPane();
                pane.setPadding(new Insets(2, 2, 15, 2));
                pane.setCenter(moveBall);
                pane.setBottom(hBox);

                Scene scene = new Scene(pane, 200, 200);
                primaryStage.setTitle("Exercise15-03");
                primaryStage.setScene(scene);
                primaryStage.show();
        }
        public static void main(String[] args) {
                launch(args);
        }
}