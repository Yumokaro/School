package P4;

import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.event.ActionEvent;
import javafx.scene.layout.*;

public class KadePane {

    GridPane KadeGridPane;
    GridPane outputLabelPane2;

    private int age;
    private Text curAge;
    private Button btn1;
    private Button btn2;

    private Text status,start;
    private String fullBowl;
    private String emptyBowl;
    private RadioButton emptyButton, fullButton;

    public KadePane() {

        KadeGridPane = new GridPane();
        outputLabelPane2 = new GridPane();

        fullBowl = " Dog Bowl has food";
        emptyBowl = "Dog Bowl has no food";

        // Age Text
        Text realTime = new Text(" Dog's Age: ");
        realTime.setUnderline(true);
        KadeGridPane.add(realTime, 0, 0);

        // Age +
        btn1 = new Button();
        btn1.setText("Age +");
        btn1.setOnAction(this::processBtnPushadd);
        KadeGridPane.add(btn1, 0, 1);

        // Age -
        btn2 = new Button();
        btn2.setText("Age -");
        btn2.setOnAction(this::processBtnPushsub);
        KadeGridPane.add(btn2, 1, 1);

        // Food Bowl Text
        Text realTime2 = new Text("Dog's Food Bowl Status");
        realTime2.setUnderline(true);
        KadeGridPane.add(realTime2, 0, 2);

        // Radio Button Group
        ToggleGroup group = new ToggleGroup();

        emptyButton = new RadioButton("Empty");
        emptyButton.setToggleGroup(group);
        emptyButton.setOnAction(this::HandleRadioButtonAction);
        KadeGridPane.add(emptyButton, 0, 3);

        fullButton = new RadioButton("Full");
        fullButton.setToggleGroup(group);
        fullButton.setOnAction(this::HandleRadioButtonAction);
        KadeGridPane.add(fullButton, 1, 3);

        // Center Text Age
        curAge = new Text("Age: 0");
        outputLabelPane2.add(curAge, 0,0);

        // Center Text Food Bowl Status
        start = new Text("");
        outputLabelPane2.add(start, 0,1);
    }

    public GridPane getKadeGridPane() {
        return KadeGridPane;
    }

    public GridPane getoutputLabelPane2 () {
        return outputLabelPane2;
    }

    public void processBtnPushadd(ActionEvent event) {
        age++;
        curAge.setText("Age: " + age);
    }

    public void processBtnPushsub(ActionEvent event) {
        age--;
        curAge.setText("Age: " + age);
    }

    public void HandleRadioButtonAction(ActionEvent event)
    {
        if(emptyButton.isSelected())
            start.setText(emptyBowl);
        else
            start.setText(fullBowl);

    }
}
