package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.awt.*;

import static view.Main.getPosts;


public class LoginController {

    //Changes scenes.
    public void loginButtonClicked() throws Exception{

            Parent scene2 = FXMLLoader.load(getClass().getResource("Marketplace.fxml"));
            Scene sc2 = new Scene(scene2);
            Main.window.setTitle("GV Marketplace");
            Main.window.setScene(sc2);
            Main.window.show();

            try {
                getPosts();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    public void forgotPasswordButtonClicked() throws Exception{
        Parent scene3 = FXMLLoader.load(getClass().getResource("Forgot Password.fxml"));
        Scene sc3 = new Scene(scene3);
        Main.window.setTitle("Forgot Password");
        Main.window.setScene(sc3);
        Main.window.show();
    }

    public void createAccountButtonClicked() throws Exception{
        Parent scene4 = FXMLLoader.load(getClass().getResource("CreateAccount.fxml"));
        Scene sc4 = new Scene(scene4);
        Main.window.setTitle("Account Creation");
        Main.window.setScene(sc4);
        Main.window.show();
    }
}
