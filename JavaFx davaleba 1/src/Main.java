import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        // N1

//        Group root = new Group();
//        Scene scene = new Scene(root, 700, 500, Color.CYAN);
//
//        Text txt = new Text("Hello this is application");
//        txt.setX(150);
//        txt.setY(250);
//        txt.setFont(Font.font("Calibri", 30));
//        txt.setFill(Color.rgb(237, 192, 66));
//        root.getChildren().add(txt);
//
//        stage.setResizable(false);
//        stage.getIcons().add(new Image("barcelona.png"));
//        stage.setScene(scene);


        // N2

//        Group root = new Group();
//        Scene scene = new Scene(root, 1000, 700, Color.CYAN);
//
//        Rectangle rectangle = new Rectangle();
//        rectangle.setX(100);
//        rectangle.setY(150);
//        rectangle.setWidth(200);
//        rectangle.setHeight(200);
//        rectangle.setFill(Color.GREEN);
//        root.getChildren().add(rectangle);
//
//        Line line1 = new Line();
//        line1.setStartX(100);
//        line1.setStartY(150);
//        line1.setEndX(300);
//        line1.setEndY(350);
//        line1.setStroke(Color.YELLOW);
//        root.getChildren().add(line1);
//
//        Line line2 = new Line();
//        line2.setStartX(300);
//        line2.setStartY(150);
//        line2.setEndX(100);
//        line2.setEndY(350);
//        line2.setStroke(Color.YELLOW);
//        root.getChildren().add(line2);
//
//
//        Line line11 = new Line();
//        line11.setStartX(500);
//        line11.setStartY(200);
//        line11.setEndX(700);
//        line11.setEndY(200);
//        line11.setStroke(Color.BLUE);
//        root.getChildren().add(line11);
//
//        Line line12 = new Line();
//        line12.setStartX(700);
//        line12.setStartY(200);
//        line12.setEndX(700);
//        line12.setEndY(500);
//        line12.setStroke(Color.BLUE);
//        root.getChildren().add(line12);
//
//        Line line13 = new Line();
//        line13.setStartX(700);
//        line13.setStartY(500);
//        line13.setEndX(500);
//        line13.setEndY(500);
//        line13.setStroke(Color.BLUE);
//        root.getChildren().add(line13);
//
//        Line line14 = new Line();
//        line14.setStartX(500);
//        line14.setStartY(500);
//        line14.setEndX(500);
//        line14.setEndY(200);
//        line14.setStroke(Color.BLUE);
//        root.getChildren().add(line14);
//
//        stage.setScene(scene);


        // N3

        Group root = new Group();
        Scene scene = new Scene(root, 1000, 700, Color.CYAN);

        Circle circle = new Circle();
        circle.setCenterX(500);
        circle.setCenterY(350);
        circle.setRadius(200);
        circle.setStrokeWidth(10);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.YELLOW);
        root.getChildren().add(circle);

        Circle eye1 = new Circle();
        eye1.setCenterX(420);
        eye1.setCenterY(300);
        eye1.setRadius(20);
        eye1.setFill(Color.BLACK);
        root.getChildren().add(eye1);

        Circle eye2 = new Circle();
        eye2.setCenterX(580);
        eye2.setCenterY(300);
        eye2.setRadius(20);
        eye2.setFill(Color.BLACK);
        root.getChildren().add(eye2);

        Line mouth = new Line();
        mouth.setStartX(420);
        mouth.setStartY(400);
        mouth.setEndX(580);
        mouth.setEndY(400);
        mouth.setStrokeWidth(20);
        mouth.setFill(Color.BLACK);
        root.getChildren().add(mouth);


        stage.setScene(scene);

        stage.show();
    }
}