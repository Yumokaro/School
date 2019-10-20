package P4;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.layout.*;
import javafx.scene.shape.*;


public class AlexPane {

    GridPane AlexGridPane;
    GridPane outputLabelPane;

    private Label centerName;
    private Label centerColor;
    private TextField textNameInput;

    private ComboBox<String> furComboBox;
    private String textNameOutput;
    private String textColor;

    private Rectangle furRec;

    public AlexPane () {

        AlexGridPane = new GridPane();
        outputLabelPane = new GridPane();

        // Name
        textNameInput = new TextField();
        AlexGridPane.add(textNameInput, 0, 0);

        Button buttonName = new Button("Enter Name");
        buttonName.setOnAction(this::processbuttonNamePress);
        AlexGridPane.add(buttonName, 0, 1);

        // Fur
        furComboBox = new ComboBox<>();
        furComboBox.getItems().addAll("yellow", "red", "black");
        furComboBox.setPromptText("Select a fur color");
        furComboBox.setOnAction(this::processcolorSelect);
        AlexGridPane.add(furComboBox, 0, 2);

        // Center Label - Name Output
        centerName = new Label(textNameOutput);
        centerColor = new Label(textColor);
        outputLabelPane.add(centerName, 0, 0);
        outputLabelPane.add(centerColor, 0, 1);

        // Center Color Block
        furRec = new Rectangle();
        furRec.setWidth(200);
        furRec.setHeight(100);
        furRec.setFill(Color.BLACK);
        outputLabelPane.add(furRec, 0, 3);
    }

    public GridPane getAlexGridPane () {
        return AlexGridPane;
    }

    public GridPane getoutputLabelPane () {
        return outputLabelPane;
    }

    public void processbuttonNamePress (ActionEvent event) {
        textNameOutput = textNameInput.getText();
        centerName.setText(textNameOutput);
    }

    public void processcolorSelect (ActionEvent event2) {
        textColor = furComboBox.getValue();
        centerColor.setText(textColor);

        // Update Colors
        if (textColor == "red") {
            furRec.setFill(Color.RED);
        }
        else if (textColor == "yellow") {
            furRec.setFill(Color.YELLOW);
        }
        else if (textColor == "black") {
            furRec.setFill(Color.BLACK);
        }
    }
}
