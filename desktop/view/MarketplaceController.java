package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class MarketplaceController {

    ObservableList<String> sellCategoryList = FXCollections.observableArrayList("Textbooks","Electronics","Dorm Items","Housing","Tutoring");

    //Fields
    @FXML
    private ChoiceBox sellCategory;
    @FXML
    private TextField title;
    @FXML
    private TextField price;
    @FXML
    private TextField description;


    //Intitialize
    @FXML
    private void initialize(){
        sellCategory.setItems(sellCategoryList);
    }

    //Testing
    public void createPostButtonClicked() {
        System.out.println("Category: " + sellCategory.getValue());
        System.out.println("Title: " + title.getText());
        System.out.println("Price: $" + price.getText());
        System.out.println("Description: " + description.getText());
    }

    public void logOutButtonClicked() throws Exception{
        Parent scene7 = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene sc7 = new Scene(scene7);
        Main.window.setTitle("GV Marketplace Login");
        Main.window.setScene(sc7);
        Main.window.show();
    }


    public void newMessageButtonClicked(){
        System.out.println("New message clicked.");
    }

    public void allowOthersToDMButtonClicked(){
        System.out.println("Allow others to DM me clicked.");
    }

    public void reportButtonClicked(){
        System.out.println("Report");
    }


}
