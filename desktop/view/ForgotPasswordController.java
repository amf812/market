package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ForgotPasswordController {

    public void nextButtonClicked() throws Exception{
            Parent scene9 = FXMLLoader.load(getClass().getResource("Password Recovery.fxml"));
            Scene sc9 = new Scene(scene9);
            Main.window.setTitle("Password Recovery");
            Main.window.setScene(sc9);
            Main.window.show();
        }

    public void backButtonClicked() throws Exception{
        Parent scene6 = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene sc6 = new Scene(scene6);
        Main.window.setTitle("GV Marketplace Login");
        Main.window.setScene(sc6);
        Main.window.show();
    }
}
