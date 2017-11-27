package view;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.*;

public class Main extends Application{

    /*FirebaseOptions options = new FirebaseOptions.Builder()
            .setCredentials(GoogleCredentials.getApplicationDefault())
            .setDatabaseUrl("https://postings.firebaseio.com/")
            .build();

    FirebaseApp.initializeApp(options);



    @Override*/
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

    /*public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Marketplace.fxml"));
        primaryStage.setTitle("GV Marketplace");
        primaryStage.setScene(new Scene(root, 850, 700));
        primaryStage.show();
    }*/


    public static void main(String[] args) {
        launch(args);
    }

    //Create Post



}

