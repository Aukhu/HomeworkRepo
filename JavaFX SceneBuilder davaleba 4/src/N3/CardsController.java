package N3;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardsController {
    @FXML private CheckBox balloonsCheck;
    @FXML private CheckBox heartsCheck;
    @FXML private CheckBox starsCheck;
    @FXML private Button generateButton;
    @FXML private Canvas canvas;   // dasaxatad gamogvadgeba

    private Image balloonImage = new Image("N3/images/balloon.png");
    private Image heartImage = new Image("N3/images/heart.png");
    private Image starImage = new Image("N3/images/star.png");

    private Random rand = new Random();

    @FXML
    private void generateCard() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("generatedScene.fxml"));

        Parent root = loader.load();

        GeneratedSceneController controller = loader.getController();


        List<Image> selected = new ArrayList<>();

        if(balloonsCheck.isSelected()) selected.add(balloonImage);
        if(heartsCheck.isSelected()) selected.add(heartImage);
        if(starsCheck.isSelected()) selected.add(starImage);

        controller.drawShapes(selected);

        Stage stage = (Stage) balloonsCheck.getScene().getWindow();  // random node dan scene
        stage.setScene(new Scene(root));
    }
}