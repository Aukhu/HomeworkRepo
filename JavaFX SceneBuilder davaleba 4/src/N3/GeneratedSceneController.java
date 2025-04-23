package N3;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.List;
import java.util.Random;

public class GeneratedSceneController {

    @FXML private Canvas canvas; // drawer

    public void drawShapes(List<Image> images){
        if(images.isEmpty()) return;

        GraphicsContext gc = canvas.getGraphicsContext2D();
        Random rand = new Random();

        for (int i = 0; i < 200; i++) {
            Image img = images.get(rand.nextInt(images.size()));
            double x = rand.nextDouble() * (canvas.getWidth() - 50);
            double y = rand.nextDouble() * (canvas.getHeight() - 50);
            double size = 30 + rand.nextDouble() * 40;
            gc.drawImage(img, x, y, size, size);
        }
    }
}