package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class CreateAccountController {

    @FXML
    private TextField name;
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private TextField email;
    @FXML
    private TextField major;

    public void createAccountButtonClicked() throws Exception{

            Account A = new Account(name.getText(), username.getText(), password.getText(), email.getText(), major.getText());

            System.out.println("Name: " + A.getName());
            System.out.println("Username: " + A.getUsername());
            System.out.println("Password: " + A.getPassword());
            System.out.println("Email: " + A.getEmail());
            System.out.println("Major: " + A.getMajor());

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
