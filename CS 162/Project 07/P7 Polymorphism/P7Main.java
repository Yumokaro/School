package P7Polymorphism;

//*****************************************************************
// Name:
// Class: CS 162 Spring 2018
// Class time: 10.00
// Date: 30 May 2018
// Project #: 07
// Driver Name: P7Main
// Program Description: Polymorphism
//
//  Made with java 10
//
//  Each button was created of the super class spaceship
//  and then runs its own class of engine
//
//  Engine description prints out to console
//
//*****************************************************************

import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;

public class P7Main extends Application {

    int numships = 4;
    Button [] buttonArray = new Button [numships];
    spaceship [] spaceshipArray = new spaceship [numships];



    public static void main (String [] args) {
        launch (args);
    }

    @Override
    public void start (Stage stage) throws Exception {

        stage.setTitle("SpaceTravel");

        Pane pane01 = new Pane();

        int y = 50;
        for (int i=0; i < numships; i++ ) {

            buttonArray[i] = new Button ("Spaceship " + (i + 1));

            buttonArray[i].setLayoutX(50);
            buttonArray[i].setLayoutY(y);
            y += 50;

            pane01.getChildren().add(buttonArray[i]);
        }

        spaceshipArray[0] = new spaceship();
        spaceshipArray[1] = new starburst();
        spaceshipArray[2] = new hyper();
        spaceshipArray[3] = new warp();


        buttonArray[0].setOnAction(e -> spaceshipArray[0].engine());
        buttonArray[1].setOnAction(e -> spaceshipArray[1].engine());
        buttonArray[2].setOnAction(e -> spaceshipArray[2].engine());
        buttonArray[3].setOnAction(e -> spaceshipArray[3].engine());


        Group root = new Group(pane01);
        Scene scene = new Scene (root, 400, 400);
        stage.setScene (scene);
        stage.show ();

    }

}

