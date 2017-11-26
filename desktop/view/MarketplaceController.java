package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

public class MarketplaceController {

    ObservableList<String> sellCategoryList = FXCollections.observableArrayList("Textbooks","Electronics","Dorm Items","Housing","Tutoring");

    //Fields
    @FXML
    private ChoiceBox sellCategory;

    //Intitialize
    @FXML
    private void initialize(){
        sellCategory.setItems(sellCategoryList);
    }

    //Testing
    public void createPostButtonClicked(){
        System.out.println("Create post clicked.");
    }

    public void newMessageButtonClicked(){
        System.out.println("New message clicked.");
    }

    public void allowOthersToDMButtonClicked(){
        System.out.println("Allow others to DM me clicked.");
    }
}
