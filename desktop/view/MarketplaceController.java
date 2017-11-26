package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.util.function.Consumer;

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


    public void newMessageButtonClicked(){
        System.out.println("New message clicked.");
    }

    public void allowOthersToDMButtonClicked(){
        System.out.println("Allow others to DM me clicked.");
    }
}
