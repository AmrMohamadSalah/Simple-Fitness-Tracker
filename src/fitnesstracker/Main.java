package fitnesstracker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root1 = FXMLLoader.load(getClass().getResource("simplefitnesstracker.fxml"));
        primaryStage.setTitle("Fitness Tracker");
        primaryStage.setScene(new Scene(root1, 600, 470));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
