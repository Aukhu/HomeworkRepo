import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        // N1

//        FXMLLoader loader = new FXMLLoader(getClass().getResource("N1/animal.fxml"));
//
//        Parent root = loader.load();
//
//        Scene scene = new Scene(root);
//
//        stage.setScene(scene);
//        stage.show();


        // N2

//        FXMLLoader loader = new FXMLLoader(getClass().getResource("N2/gallery.fxml"));
//
//        Parent root = loader.load();
//
//        Scene scene = new Scene(root);
//
//        stage.setScene(scene);
//        stage.show();


        // N3

        FXMLLoader loader = new FXMLLoader(getClass().getResource("N3/cards.fxml"));

        Parent root = loader.load();

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
}