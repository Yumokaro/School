package P7InheritanceExceptions;

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

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class P7Main extends Application {

    int numships = 4;
    Button [] buttonArray = new Button [numships];
    TextField [] tfieldArray = new TextField [numships];
    spaceship[] spaceshipArray = new spaceship[numships];

    int ship1;
    int ship2;
    int ship3;
    int ship4;


    public static void main (String [] args) {
        launch (args);
    }

    @Override
    public void start (Stage stage) throws Exception {

        stage.setTitle("SpaceTravel");

        Pane pane01 = new Pane();

        spaceshipArray[0] = new spaceship();
        spaceshipArray[1] = new starburst();
        spaceshipArray[2] = new hyper();
        spaceshipArray[3] = new warp();

        int y = 75;
        for (int i=0; i < numships; i++ ) {

            buttonArray[i] = new Button ("Spaceship " + (i + 1));
            buttonArray[i].setLayoutX(60);
            buttonArray[i].setLayoutY(y);

            tfieldArray[i] = new TextField ();
            tfieldArray[i].setLayoutX(150);
            tfieldArray[i].setLayoutY(y);

            y += 30;

            pane01.getChildren().add(buttonArray[i]);
            pane01.getChildren().add(tfieldArray[i]);
        }

        Label speedLabel = new Label ("Enter Speeds Below :  (1-100)" +
                "\n(each subsequent ship must be faster than the previous)");
        speedLabel.setLayoutX(150);
        speedLabel.setLayoutY(25);
        pane01.getChildren().add(speedLabel);

        Button engageButton = new Button ("Engage");
        engageButton.setLayoutX(150);
        engageButton.setLayoutY(200);
        pane01.getChildren().add(engageButton);

        engageButton.setOnAction(event -> {

            ship1 = Integer.parseInt(tfieldArray[0].getText());
            ship2 = Integer.parseInt(tfieldArray[1].getText());
            ship3 = Integer.parseInt(tfieldArray[2].getText());
            ship4 = Integer.parseInt(tfieldArray[3].getText());

            try {

                if (ship1 < 1 || ship1 > 100) {
                    throw new monkeyWrenchException();
                }
                else if (ship2 < 1 || ship2 > 100) {
                    throw new monkeyWrenchException();
                }
                else if (ship3 < 1 || ship3 > 100) {
                    throw new monkeyWrenchException();
                }
                else if (ship4 < 1 || ship4 > 100) {
                    throw new monkeyWrenchException();
                }
                else if (ship1 > ship2) {
                    throw new speedException();
                }
                else if (ship2 > ship3) {
                    throw new speedException();
                }
                else if (ship3 > ship4) {
                    throw new speedException();
                }
                else {
                    System.out.println(":: Thrusters Engaged ::");
                    System.out.println(":: Ship 1 is traveling at " + ship1 + " units/day :: " +
                            "will reach Proxima Centauri in " + (10000/ship1) + " earth days");
                    System.out.println(":: Ship 2 is traveling at " + ship2 + " units/day :: " +
                            "will reach Proxima Centauri in " + (10000/ship2) + " earth days");
                    System.out.println(":: Ship 3 is traveling at " + ship3 + " units/day :: " +
                            "will reach Proxima Centauri in " + (10000/ship3) + " earth days");
                    System.out.println(":: Ship 4 is traveling at " + ship4 + " units/day :: " +
                            "will reach Proxima Centauri in " + (10000/ship4) + " earth days");

                }

            }
            catch (speedException | monkeyWrenchException e1){

            }

        });

        buttonArray[0].setOnAction(e -> {
            spaceshipArray[0].engine();
        });
        buttonArray[1].setOnAction(e -> {
            spaceshipArray[1].engine();
        });
        buttonArray[2].setOnAction(e -> {
            spaceshipArray[2].engine();
        });
        buttonArray[3].setOnAction(e -> {
            spaceshipArray[3].engine();
        });




        Group root = new Group(pane01);
        Scene scene = new Scene (root, 600, 400);
        stage.setScene (scene);
        stage.show ();

    }

}

