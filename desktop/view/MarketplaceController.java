package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;


import static view.Main.getPosts;
import static view.Main.printPostsParsed;

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

        Post p = new Post("test@test.com", sellCategory.getValue(), title.getText(), description.getText(), price.getText());

        System.out.println("Category: " + p.getCategory());
        System.out.println("Title: " + p.getTitle());
        System.out.println("Description: " + p.getDescription());
        System.out.println("Price: $" + p.getPrice());

        //Sends the post to the database
        /*try{
            makePost();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        //Update the posts section
        try {
            getPosts();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        //Used for Testing
        printPostsParsed("https://marketplace-7a251.firebaseio.com/Postings.json");
    }

}
