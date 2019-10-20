//package PFinal;

//*****************************************************************
// Name:
// Class: CS 162 Spring 2018
// Class time: 10.00
// Date: 12 June 2018
// Project #: Final
// Driver Name: MagicStrings
// Program Description: Final
//
//  Made with java 10+  --  I believe I have identified everything, but please verify.
//
// *Note*  All buttons will operate without any need to update the text fields.
//         Text fields will modify values of strings 1-3.  No 'strings.txt' will throw error.
//
//  1 - Throughout
//  2 - Throughout
//  3 - idk, maybe
//  4 - (line 123, 144, 158) buttonUpdateStrings (Check TextField), buttonCreateFile (Save File),
//      buttonRecursion (Read File)
//  5 - (line 43, 155, 172) interface1.java
//  6 - (line 175) buttonRecursion
//  7 - (line 197) public final class constant {}
//  8 - (line 184) actionListener and Throughout
//  9 - (line 127) buttonUpdateStrings throws an exception
//  10 - (line 81, 82, 176, 178, 180) emptyTestException demonstrates inheritance.  SSArray1 polymorphism + inheritance
//
//*****************************************************************

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import java.io.*;
import java.util.Scanner;

public class MagicStrings extends Application implements interface1 {

    String [] strArray = new String [constant.numberOfStrings];
    SSArray1 [] SS = new SSArray1[constant.numberOfStrings];
    TextField [] tfieldArray = new TextField [constant.numberOfStrings];

    Label instructions;
    Button buttonStrings;
    Button buttonUpdateStrings;
    Button buttonCreateFile;
    Button buttonRecursion;

    Scanner fileScan;

    reverseString rs = new reverseString();
    Pane pane01 = new Pane ();

    public static void main (String [] args) {
        launch (args);
    }

    @Override
    public void start (Stage theUltimateStage) throws Exception {

        int y = 20;
        for (int i = 0; i < tfieldArray.length; i++) {

            SS[i] = new SSArray1();
            strArray[i] = "Default Sentence xD";

            tfieldArray[i] = new TextField();
            tfieldArray[i].setLayoutX(150);
            tfieldArray[i].setLayoutY(y);
            pane01.getChildren().add(tfieldArray[i]);

            y += 30;
        }

        SS[1] = new SSArray2();
        SS[2] = new SSArray3();

        instructions = new Label ("Enter a sentence in each box below");
        instructions.setLayoutX(150);
        instructions.setLayoutY(0);
        pane01.getChildren().add(instructions);

        buttonStrings = new Button("Print Strings");
        buttonStrings.setLayoutX(10);
        buttonStrings.setLayoutY(20);
        pane01.getChildren().add(buttonStrings);

        buttonUpdateStrings = new Button("Update Strings");
        buttonUpdateStrings.setLayoutX(10);
        buttonUpdateStrings.setLayoutY(50);
        pane01.getChildren().add(buttonUpdateStrings);

        buttonCreateFile = new Button ("Save Strings");
        buttonCreateFile.setLayoutX(10);
        buttonCreateFile.setLayoutY(80);
        pane01.getChildren().add(buttonCreateFile);

        buttonRecursion = new Button ("Recursive Strings");
        buttonRecursion.setLayoutX(10);
        buttonRecursion.setLayoutY(110);
        pane01.getChildren().add(buttonRecursion);

        ChoiceBox<String> dropDown = new ChoiceBox<>();
        dropDown.getItems().addAll("Upside dowN", "Topsy the Elephant", "Trasimene");
        dropDown.setTooltip(new Tooltip("Select a sentence"));
        dropDown.setLayoutX(10);
        dropDown.setLayoutY(150);
        pane01.getChildren().add(dropDown);


        // Button Actions and ChoiceBox
        buttonStrings.setOnAction(e -> {
            System.out.println( "\n" + strArray[0]);
            System.out.println(strArray[1]);
            System.out.println(strArray[2]);
        });
        buttonUpdateStrings.setOnAction(e -> {
            try {
                if (tfieldArray[0].getText().isEmpty() || tfieldArray[1].getText().isEmpty()
                        || tfieldArray[2].getText().isEmpty()) {
                    throw new emptyTextException();
                }
                else {
                    strArray[0] = tfieldArray[0].getText();
                    strArray[1] = tfieldArray[1].getText();
                    strArray[2] = tfieldArray[2].getText();

                    System.out.println("\n" + strArray[0]);
                    System.out.println(strArray[1]);
                    System.out.println(strArray[2]);

                    System.out.println("All strings have been updated");
                }
            }
            catch (emptyTextException alpha){
            }
        });
        buttonCreateFile.setOnAction(e -> {
            try {
                PrintWriter outFile = new PrintWriter ("strings.txt");
                outFile.println(strArray[0]);
                outFile.println(strArray[1]);
                outFile.println(strArray[2]);
                outFile.close();

                System.out.println("\nAll strings have been saved to strings.txt");
            }
            catch (Exception ese) {
                interface1.cantSave();
            }
        });
        buttonRecursion.setOnAction(e -> {

            // Read and update strings
            try {
                fileScan = new Scanner(new File("strings.txt"));
                int x = 0;
                while (fileScan.hasNextLine()) {
                    strArray[x] = fileScan.nextLine();
                    System.out.println(strArray[x]);
                    x += 1;
                }
                System.out.println("\nAll strings have been read from strings.txt");
            }
            catch (Exception aea) {
                interface1.cantRead();
            }

            // Reverse strings
            SS[0].sentenceNumber();
            System.out.println(rs.reverseString(strArray[0]) + " << is #1 in Reverse!!");
            SS[1].sentenceNumber();
            System.out.println(rs.reverseString(strArray[1]) + " << is #2 in Reverse!!");
            SS[2].sentenceNumber();
            System.out.println(rs.reverseString(strArray[2]) + " << is #3 in Reverse!!");
        });

        // ChoiceBox Action
        dropDown.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
            System.out.println(rs.reverseString(newValue));
        });

        // Make Me
        Group root = new Group (pane01);
        Scene scene = new Scene (root, 500, 300);
        theUltimateStage.setTitle("Magic Strings");
        theUltimateStage.setScene (scene);
        theUltimateStage.show();
    }

    public final class constant {
        public static final int numberOfStrings = 3;
    }
}
