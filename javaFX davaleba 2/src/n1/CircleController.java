package n1;

import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CircleController {
    @FXML
    private Circle circle;
    private double x;
    private double y;

    @FXML
    private void up(){
        circle.setCenterY(y -= 5);
    }

    @FXML
    private void down(){
        circle.setCenterY(y += 5);
    }

    @FXML
    private void left(){
        circle.setCenterX(x -= 5);
    }

    @FXML
    private void right(){
        circle.setCenterX(x += 5);
    }

    @FXML
    private void UL(){
        up();
        left();
    }

    @FXML
    private void UR(){
        up();
        right();
    }

    @FXML
    private void DR(){
        down();
        right();
    }

    @FXML
    private void DL(){
        down();
        left();
    }


    @FXML
    private void turnRed(){
        circle.setFill(Color.RED);
    }
}