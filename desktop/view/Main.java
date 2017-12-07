package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;

import java.awt.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.text.ParseException;
import java.util.Iterator;

public class Main extends Application{

        static String posts;
        static String postsParsed[];

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

    public static void printPostsParsed(String URL){
        try {
            posts = getHTML(URL);
            postsParsed = posts.split(",");
            //Used for testing
            for (int i = 0; i < postsParsed.length; i++){
                System.out.println("" + postsParsed[i]);
            }
            System.out.println("postsParsed printed each element separately without relations present");
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        System.out.println(getHTML("https://marketplace-7a251.firebaseio.com/Postings.json"));
        String posts = getHTML("https://marketplace-7a251.firebaseio.com/Postings.json");
        String postsParsed[] = posts.split(",");
        for(int i=0; i < postsParsed.length; i++){
            System.out.println(postsParsed[i]);
        }
    }

    //This block is currently not working and is commented out for demoing purposes
    /*public static void makePost(JSONObject o) throws Exception {
        URL url = new URL("https://marketplace-7a251.firebaseio.com/Postings.json");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        try {
            conn.setDoOutput(true);
            conn.setRequestMethod("Put");
            OutputStreamWriter out = new OutputStreamWriter(
                    conn.getOutputStream());
            out.write(o.toString());
            out.close();
            conn.getInputStream();
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

}

