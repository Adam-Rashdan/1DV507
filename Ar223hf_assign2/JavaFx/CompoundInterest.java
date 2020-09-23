/**
 * 
 */
package JavaFx;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.geometry.Insets;


/**
 * @author Adam
 *
 */
public class CompoundInterest extends Application {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage)
    {
        primaryStage.setTitle("Compound Interest");

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setVgap(20);
        pane.setPadding(new Insets(45, 45, 45, 45));


        Scene scene = new Scene(pane, 600, 400);
        primaryStage.setScene(scene);

        Label heading = new Label("Compound Interest");
        heading.setFont(new Font("Comfortaa", 52));
        pane.add(heading,0,0,2,1);
        pane.add(new Label("Start amount: "),0,1);
        TextField txt1 = new TextField();
        pane.add(txt1,1,1);
        pane.add(new Label("Interest:"),0,2);
        TextField txt2 = new TextField();
        pane.add(txt2,1,2);
        pane.add(new Label("Number of years:"),0,3);
        TextField txt3 = new TextField();
        pane.add(txt3,1,3);
        Label result = new Label();
        pane.add(result,0,6);

        Button calculate = new Button("Calculate");
        pane.add(calculate,0,4);
        GridPane.setHalignment(calculate,HPos.LEFT);

        calculate.setOnAction(e -> {
            if(!txt1.getText().isEmpty() && !txt2.getText().isEmpty() && !txt3.getText().isEmpty()){
              
            	double amount = Double.parseDouble(txt1.getText());
                double Interest = Double.parseDouble(txt2.getText()) / 100;
                double Years = Double.parseDouble(txt3.getText());
                double total = amount*Math.pow((1+Interest), Years);
                int value = (int) Math.round(total);
                 result.setText("It will be: " +Integer.toString(value) + " SEK");
            }
          
            else 
                result.setText("Try again");
            
        });
        primaryStage.show();

    }

}
