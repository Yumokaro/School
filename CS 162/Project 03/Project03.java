// Name:
// Class: CS 162 Spring 2018
// Class time: 10.00
// Date: 23 April 2018
// Project #: 03
// Driver Name: Project03
// Program Description: JavaFX Part 01
//      Basic part of gui.  text field.
//  I've been using java 10 if it doesnt run for some reason
//
//
//
//
//*****************************************************************

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.ChoiceBox;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Project03 extends Application{
    public static void main (String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Text field input");

        TextField textName = new TextField();
        textName.setLayoutX(50);
        textName.setLayoutY(50);
        TextField textFur = new TextField();
        textFur.setLayoutX(50);
        textFur.setLayoutY(150);

        Button buttonName = new Button ("Enter Name");
        buttonName.setOnAction(e -> System.out.println( textName.getText() ) );
        buttonName.setLayoutX(50);
        buttonName.setLayoutY(100);
        Button buttonFur = new Button ("Enter Fur Color");
        buttonName.setOnAction(e -> System.out.println( textFur.getText() ) );
        buttonFur.setLayoutX(50);
        buttonFur.setLayoutY(200);

        //combobox
        //ChoiceBox<String> dropDown = new ChoiceBox<>();
        //dropDown.getItems().add("yellow");


        Group root = new Group(textName, textFur, buttonName, buttonFur);
        Scene scene = new Scene (root,400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();



        //StackPane root = new StackPane();
        //root.getChildren().add(textName);
        //root.getChildren().add(buttonName);



    }
}

