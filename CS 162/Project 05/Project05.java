// Name:
// Class: CS 162 Spring 2018
// Class time: 10.00
// Date: 07 May 2018
// Project #: 05
// Driver Name: Project05
// Program Description: JavaFX
//      Using java 10
//
//      GUI input numbers, please, into text fields. outputs the lowest
//      number to bottom of gui and also in console.  Button array was
//      removed, bc i have not had time to make the int array.  Button array
//      had all buttons doing the same thing.  Adding button.settext would change
//      the button name but i've left it, only changed the label at bottom of gui.
//*****************************************************************

// Remove??
package P5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;

public class Project05 extends Application {

    private Label output;
    int numButton = 5;
    int smallNumber = 0;

    TextField[] tField = new TextField [numButton];
    int [] input = new int [numButton];

    public static void main (String[] args) {
        launch (args);
    }

    public void start (Stage stage) throws Exception {

        stage.setTitle ("Button Sort");

        GridPane pane01 = new GridPane();
        BorderPane mainPane = new BorderPane();

        Button button01 = new Button ("Button 01");
        button01.setOnAction(this::processbutton01Press);
        pane01.add(button01, 0, 0);

        for (int i = 0; i < numButton; i++) {
            tField[i] = new TextField();

            pane01.add(tField[i], 1, i);
            pane01.setHgap(30);
            pane01.setVgap(8);
        }

        output = new Label("Smallest Number");

        // Main Panel
        mainPane.setLeft(pane01);
        mainPane.setBottom(output);

        Scene scene = new Scene (mainPane, 400, 400);
        stage.setScene (scene);
        stage.show ();
    }

    public void processbutton01Press (ActionEvent event) {

        smallNumber = Integer.valueOf(tField[0].getText());
        //System.out.println(smallNumber);

        for (int i = 0; i < numButton; i++) {

            if (smallNumber >= Integer.valueOf(tField[i].getText())) {
                smallNumber = Integer.valueOf(tField[i].getText());
            }
        }
        System.out.println(smallNumber);
        output.setText(Integer.toString(smallNumber));
    }
}

/*
    int base = 0;
    String small = tField[base].getText();
        for (int i = 1; i < numButton; i++){
        if (tField[i].getText() == tfield )


        base ++;
        }
        */