package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class CreateAccountController {

    public void createAccountButtonClicked() throws Exception{
            Parent scene10 = FXMLLoader.load(getClass().getResource("Marketplace.fxml"));
            Scene sc10 = new Scene(scene10);
            Main.window.setTitle("GV Marketplace");
            Main.window.setScene(sc10);
            Main.window.show();
        }

    public void backButtonClicked() throws Exception{
        Parent scene5 = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene sc5 = new Scene(scene5);
        Main.window.setTitle("GV Marketplace Login");
        Main.window.setScene(sc5);
        Main.window.show();
    }
}
