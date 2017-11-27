package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class PasswordRecoveryController {

    public void backButtonClicked() throws Exception{
        Parent scene8 = FXMLLoader.load(getClass().getResource("Forgot Password.fxml"));
        Scene sc8 = new Scene(scene8);
        Main.window.setTitle("Forgot Password");
        Main.window.setScene(sc8);
        Main.window.show();
    }
}
