package P6;

// Name:
//
// Class: CS 162 Spring 2018
// Class time: 10.00
// Date: 21 May 2018
// Project #: 06
// Driver Name: P62
// Support Files:
// Program Description:
//
//  sorting and search program.
//
//  search will find an integer value entered in the textfield and
//  highlight a rectangle green if the length matches.
//
//  the command prompt will print the length of all rectangles and
//  reflect the sorting process every 300 ms.  Then the final sorted array will print.
//
//
//*****************************************************************


import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import java.util.Random;
import javafx.scene.paint.Color;
import java.util.Arrays;
import javafx.scene.control.Button;

public class P6 extends Application {

    int numRectangles = 100;

    private int[] unsorted = new int[numRectangles];
    private int[] sortedArray = new int[numRectangles];
    private Rectangle[] rect = new Rectangle[numRectangles];


    private Button searchButton;
    private Button swapButton;
    private Button resetButton;
    private TextField searchField;

    private int randomNumberY;
    Random rand = new Random();

    public static void main (String[] args) {
        launch (args);
    }

    @Override
    public void start (Stage stage) {

        stage.setTitle("Project 06");

        // array - random numbers used for rectangle height
        for (int i = 0; i < unsorted.length; i++) {

            randomNumberY = rand.nextInt(70)+25;
            unsorted[i] = randomNumberY;

        }

        System.out.print(Arrays.toString(unsorted) + " \n");


        // rectangle stats
        int x = 0;
        int recWidth = 7;
        for (int i = 0; i < rect.length; i++) {

            rect[i] = new Rectangle (x,0,recWidth,unsorted[i]);
            rect[i].setFill(Color.RED);



            System.out.println(rect[i].getHeight());

            x += recWidth + 2;
        }

        searchButton = new Button ("Search");
        searchButton.setLayoutX(135);
        resetButton = new Button ("Reset Colors");
        swapButton = new Button (" Swap ");
        swapButton.setLayoutY(40);
        searchField = new TextField();
        searchField.setPrefWidth(40);
        searchField.setLayoutX(190);

        searchButton.setOnAction(e -> {
            for (int i=0; i < rect.length; i++) {
                int barCheck = Integer.parseInt(searchField.getText());;
                if (barCheck == rect[i].getHeight()) {
                    rect[i].setFill(Color.GREEN);
                }
            }
        });

        resetButton.setOnAction(e -> {
            for (int i=0; i < rect.length; i++) {
                rect[i].setFill(Color.RED);
            }
        });

        swapButton.setOnAction(e -> {
            // Call Sort Method  -- Sorts the unsorted integer list
            sort(unsorted);
            System.out.println(Arrays.toString(unsorted));
        });


        Pane pane01 = new Pane(rect);
        pane01.setLayoutX(50);
        pane01.setLayoutY(50);

        Pane pane02 = new Pane(searchButton, resetButton, swapButton, searchField);
        pane02.setLayoutX(50);
        pane02.setLayoutY(400);

        Group root = new Group (pane01, pane02);
        Scene mainScene = new Scene(root, 1000, 500);
        stage.setScene(mainScene);
        stage.show();
    }

    // i < A.length-1
    // i <= A.length-1

    // Sorting method
    public  int[] sort(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int minIndex = i;

            //rect[i].setFill(Color.BLUE);


            for (int j = i+1; j < A.length; j++) {
                if (A[j] < A[minIndex]) {
                    minIndex = j;

                    //rect[j].setFill(Color.BLUE);

                }
            }

            /*
            myTask task = new myTask<Void>() {
                @Override
                public Void call() throws Exception {
                    int temp = A[minIndex];
                    A[minIndex] = A[i];
                    A[i] = temp;
                }
            }
            new Thread(task).start();
            */


            int temp = A[minIndex];
            A[minIndex] = A[i];
            A[i] = temp;

            // Apply sort to change height
            rect[i].setHeight(A[i]);

            System.out.println(A[i]);

            // Time Delay
            try {
                Thread.sleep(300);
            }
            catch (Exception a) {
            }
        }

        return A;
    }
}
