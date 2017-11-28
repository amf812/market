package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

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


    public static String getHTML(String urlToRead) throws Exception {
        StringBuilder result = new StringBuilder();
        URL url = new URL(urlToRead);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        rd.close();
        return result.toString();
    }

    public static void getPosts() throws  Exception {
        System.out.println(getHTML("https://jsonplaceholder.typicode.com/posts"));
    }

    /*public static void makePost() throws Exception {
        System.out.println("PLACE GET REQUEST HERE");
    }*/

}

