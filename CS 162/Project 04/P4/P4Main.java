// Name:
// Name:

// Class: CS 162 Spring 2018
// Class time: 10.00
// Date: 30 April 2018
// Project #: 04
// Driver Name: P4Main
// Support Files: AlexPane, KadePane
// Program Description:
//
//  Written with Javac 10
//  P4 is the folder, may need to comment out import. ??
//
//  Javafx Project 04
//  Combination of 2 gui's into 1
//  All buttons work
//
//
//*****************************************************************
import P4.AlexPane;
import P4.KadePane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;

public class P4Main extends Application {

    public static void main (String[] args) {
        launch (args);
    }

    @Override
    public void start (Stage primaryStage) {
        primaryStage.setTitle ("Project04 Main Program Initiated");

        BorderPane mainPane = new BorderPane ();

        // AlexPane
        AlexPane paneLeft = new AlexPane ();
        mainPane.setTop (paneLeft.getAlexGridPane() );

        // Kade Pane
        KadePane paneRight = new KadePane ();
        mainPane.setBottom (paneRight.getKadeGridPane() );

        // Center Output
        mainPane.setLeft (paneLeft.getoutputLabelPane ());
        mainPane.setCenter (paneRight.getoutputLabelPane2 ());

        Scene mainScene = new Scene (mainPane, 500, 400);

        primaryStage.setScene (mainScene);
        primaryStage.show ();
    }
}
