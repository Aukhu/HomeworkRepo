package n3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.util.Random;

public class ButtonController {
    @FXML
    private Button button;

    @FXML
    private void moveButton(){
        Random random = new Random();

        double x = random.nextInt(710); // max x
        double y = random.nextInt(510); // max y

        button.setLayoutX(x);
        button.setLayoutY(y);
    }
}
