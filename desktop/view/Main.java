package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application{

    static Stage window;

    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        //Labels
        Label login = new Label("GV Marketplace Login");
        Label home = new Label("GV Marketplace");

        //Layouts
        Parent scene1 = FXMLLoader.load(getClass().getResource("Login.fxml"));
        window.setTitle("GV Marketplace Login");
        window.setScene(new Scene(scene1, 850, 600));
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}

