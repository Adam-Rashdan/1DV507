package JavaFx_assign3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TinyPainter extends Application {
	
	private static double x , y , height , width;
	

	public void start(Stage primarystage) {
		VBox box = new VBox();

		box.setPadding(new Insets(10, 10, 10, 10));
		box.setSpacing(10);

		ComboBox<String> cBox = new ComboBox<>();
		cBox.getItems().addAll("Line", "Pen", "Rectangle", "Circle");
		ComboBox<String> Size = new ComboBox<>();
		Size.getItems().addAll("5.0", "10.0", "15.0", "20.0", "25.0", "30.0", "35.0");
		ColorPicker picker = new ColorPicker();

		Canvas canvas = new Canvas(1000, 600);
		GraphicsContext gContext = canvas.getGraphicsContext2D();
		Rectangle rectangle = new Rectangle(0, 0, 5, 5);
		gContext.setStroke(Color.BLACK);
		picker.setValue(Color.BLACK);
		rectangle.setFill(Color.BLACK);

		cBox.getSelectionModel().selectedIndexProperty().addListener(s -> {
			int i = cBox.getSelectionModel().getSelectedIndex();
			switch (i) {
			case 0:
				box.setOnMousePressed(event -> {

				});
				box.setOnMouseDragged(event -> {

				});
				box.setOnMouseReleased(event -> {

				});
				box.setOnMousePressed(event -> {
					gContext.beginPath();
					gContext.lineTo(event.getSceneX() - 10, event.getSceneY() - 100);
					gContext.stroke();
				});
				box.setOnMouseReleased(event -> {
					gContext.lineTo(event.getX() - 10, event.getY() - 100);
					gContext.stroke();
				});
				break;
			case 1:
				box.setOnMousePressed(event -> {

				});
				box.setOnMouseDragged(event -> {

				});
				box.setOnMouseReleased(event -> {

				});
				box.setOnMousePressed(event -> {
					gContext.beginPath();
					gContext.lineTo(event.getSceneX() - 10, event.getSceneY() - 100);
					gContext.stroke();
				});
				box.setOnMouseDragged(event -> {
					gContext.lineTo(event.getX() - 10, event.getY() - 100);
					gContext.stroke();
				});
				break;
			case 2:
				box.setOnMousePressed(event -> {

				});
				box.setOnMouseDragged(event -> {

				});
				box.setOnMouseReleased(event -> {

				});
				canvas.setOnMousePressed(event -> {
					x = event.getSceneX() - 10;
					y = event.getSceneY() - 100;
				});
				box.setOnMouseReleased(event -> {
					event.getSceneY();
					event.getSceneX();
					gContext.setFill(picker.getValue());
					if (event.getSceneY() < y) {
						height = y - event.getSceneY();
					}
					if (event.getSceneX() < x) {
						width = x - event.getSceneX();
						if (event.getSceneY() < y) {
							height = y - event.getSceneY();
						}
					} else {
						width = event.getSceneX() - x;
						height = event.getSceneY() - y;
					}
					gContext.fillRect(x, y, width, height);

				});
				break;
			case 3:
				Ellipse ellipse1 = new Ellipse(x, y, 0, 0);
				box.setOnMousePressed(event -> {

				});
				box.setOnMouseDragged(event -> {

				});
				box.setOnMouseReleased(event -> {

				});
				box.setOnMousePressed(event -> {
					x = event.getSceneX() - 10;
					y = event.getSceneY() - 100;
					ellipse1.setCenterX(x);
					ellipse1.setCenterY(y);
				});

				box.setOnMouseReleased(event -> {
					event.getSceneY();
					event.getSceneX();
					gContext.setFill(picker.getValue());
					if (event.getSceneY() < y) {
						height = y - event.getSceneY();
					}
					if (event.getSceneX() < x) {
						width = x - event.getSceneX();
						if (event.getSceneY() < y) {
							height = y - event.getSceneY();
						}
					} else {
						width = event.getSceneX() - x;
						height = event.getSceneY() - y;
					}
					if (height < width) {
						height = width;
					}
					gContext.fillOval(x, y, height, height);

				});

				break;
			}
		});

		Size.getSelectionModel().selectedIndexProperty().addListener(s -> {
			int i = Size.getSelectionModel().getSelectedIndex();
			switch (i) {
			case 1:
				gContext.setLineWidth(5.0);
				break;
			case 2:
				gContext.setLineWidth(10.0);
				break;
			case 3:
				gContext.setLineWidth(15.0);
				break;
			case 4:
				gContext.setLineWidth(20.0);
				break;
			case 5:
				gContext.setLineWidth(25.0);
				break;
			case 6:
				gContext.setLineWidth(30.0);
				break;
			case 7:
				gContext.setLineWidth(35.0);
				break;

			}
		});

		picker.setOnAction(event -> {
			gContext.setStroke(picker.getValue());
			rectangle.setFill(picker.getValue());
		});

		HBox hBox = new HBox(cBox, Size, picker);

		box.getChildren().addAll(hBox, canvas);

		Scene scene = new Scene(box, 1000, 600);
		primarystage.setTitle("Painter");
		primarystage.setScene(scene);
		primarystage.show();
	}

	public static void main(String[] args) {

		launch(args);
	}

}