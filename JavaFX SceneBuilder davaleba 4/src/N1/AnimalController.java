package N1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class AnimalController {
    @FXML
    public ToggleGroup type;

    @FXML
    private Label label;

    @FXML
    private RadioButton cat;

    @FXML
    private RadioButton dog;

    @FXML
    private RadioButton rabbit;

    @FXML
    private RadioButton bird;

    @FXML
    private TextField nameField;

    private String animalType;


    public void getResultInfo(){
        RadioButton selectedChoice = (RadioButton) type.getSelectedToggle();

        String selectedPet = selectedChoice != null ? selectedChoice.getText() : "Unknown";
        String name = nameField.getText();

        if(name.isEmpty()){
            label.setText("Please enter a name for you pet!");
        } else{
            label.setText("You chose "+selectedPet+" named "+name);
        }
    }
}