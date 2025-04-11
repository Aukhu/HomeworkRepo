package n2;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.util.Random;

public class AnchorPaneController {
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private void changeColor(){
        Random rand = new Random();

        int r = rand.nextInt(256); // 0-255
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);

        String color = String.format("-fx-background-color: rgb(%d, %d, %d);", r, g, b); // chasvams rgb s
        anchorPane.setStyle(color);
    }
}