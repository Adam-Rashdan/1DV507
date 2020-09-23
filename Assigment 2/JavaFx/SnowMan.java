package JavaFx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class SnowMan extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();

        Circle bottom = new Circle (320, 340, 50,Color.WHITE);
        Circle middle = new Circle (320, 270, 30,Color.WHITE);
        Circle upper = new Circle (320, 225, 20,Color.WHITE);

        Circle sun = new Circle(520, 80, 60);
        sun.setFill(Color.YELLOW);

        Circle button1 = new Circle(320, 285, 4,Color.RED);
        Circle button2 = new Circle(320, 270, 4,Color.RED);
        Circle button3 = new Circle(320, 255, 4,Color.RED);

        Circle eye1 = new Circle(312, 220, 3);
        Circle eye2 = new Circle(328, 220, 3);

        Line mouth = new Line(315, 230, 325, 230);
       
    
        Line leftArm = new Line(288, 270, 250, 250);
        leftArm.setStrokeWidth(3);
        Line rightArm = new Line(352, 270, 390, 250);
        rightArm.setStrokeWidth(3);

        Rectangle ground = new Rectangle(0, 380, 640, 100);
        ground.setFill(Color.WHITE);
        
        root.getChildren().addAll(bottom, middle, upper, button1, button2, button3, eye1, eye2, mouth,leftArm, rightArm, sun, ground);

        Scene scene = new Scene(root, 640, 480);
        scene.setFill(Color.DEEPSKYBLUE);
        primaryStage.setTitle("Snowman");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
}