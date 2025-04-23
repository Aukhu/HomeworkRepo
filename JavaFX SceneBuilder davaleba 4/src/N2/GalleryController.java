package N2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GalleryController {
    @FXML
    private ImageView image;

    @FXML
    private Button previousButton;

    @FXML
    private Button nextButton;

    private Image[] images;
    private int index = 0;

    @FXML
    private void initialize(){
        String[] imageNames = {
                "N2/images/IMG_20240513_165255.jpg",
                "N2/images/IMG_20240518_200643.jpg",
                "N2/images/IMG_20250311_180747.jpg",
                "N2/images/IMG_20250314_120139.jpg",
                "N2/images/IMG_20250314_130128.jpg",
                "N2/images/IMG_20250314_150538.jpg",
                "N2/images/IMG_20250315_134929.jpg",
                "N2/images/IMG_20250315_140628.jpg",
                "N2/images/IMG_20250315_170757.jpg",
                "N2/images/IMG_20250315_172305.jpg"
        };

        images = new Image[10];

        for(int i = 0; i<10; i++){
            images[i] = new Image(imageNames[i]);
        }

        image.setImage(images[index]);
        updateButtons();
    }

    @FXML
    public void previous(){
        index--;
        image.setImage(images[index]);
        updateButtons();
    }

    @FXML
    public void next(){
        index++;
        image.setImage(images[index]);
        updateButtons();
    }


    private void updateButtons(){
        previousButton.setDisable(index == 0);
        nextButton.setDisable(index == 9);
    }
}
