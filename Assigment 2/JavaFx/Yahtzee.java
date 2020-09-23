/**
 * 
 */
package JavaFx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Yahtzee extends Application {
	
	public static void main(String[] args) {
		launch(args);

	}

	
	ImageView img1 = new ImageView();
	ImageView img2 = new ImageView();
	ImageView img3 = new ImageView();
	ImageView img4 = new ImageView();
	ImageView img5 = new ImageView();

	CheckBox cBox1 = new CheckBox();
	CheckBox cBox2 = new CheckBox();
	CheckBox cBox3 = new CheckBox();
	CheckBox cBox4 = new CheckBox();
	CheckBox cBox5 = new CheckBox();

	public void start(Stage primaryStage) throws FileNotFoundException {

		
		primaryStage.setTitle("Yahtzee");
		Group root = new Group();

		
		Label head = new Label("Yahtzee");
		head.setFont(new Font("SansSerif", 42));

		
		HBox picBox = new HBox();
		picBox.setPadding(new Insets(50, 90, 5, 5));
		picBox.setSpacing(22);

		
		img1.setFitHeight(50);
		img1.setFitWidth(50);
		randomDice(1);

		img2.setFitHeight(50);
		img2.setFitWidth(50);
		randomDice(2);

		img3.setFitHeight(50);
		img3.setFitWidth(50);
		randomDice(3);

		img4.setFitHeight(50);
		img4.setFitWidth(50);
		randomDice(4);

		img5.setFitHeight(50);
		img5.setFitWidth(50);
		randomDice(5);

		picBox.getChildren().addAll(img1, img2, img3, img4, img5);

		
		HBox checkBox = new HBox();
		checkBox.setLayoutX(15);
		checkBox.setPadding(new Insets(105, 50, 5, 5));
		checkBox.setSpacing(50);
		checkBox.getChildren().addAll(cBox1, cBox2, cBox3, cBox4, cBox5);

		
		HBox box = new HBox();
		box.setPadding(new Insets(130, 5, 5, 5));
		box.setSpacing(5);

		
		Label printOut = new Label();
		printOut.setText("You have 3 rolls left.");

		
		
		Button roll = new Button("Please roll the dice");
		roll.setOnAction(e -> {

			try {

				if (cBox1.isSelected() == false)
					randomDice(1);
				if (cBox2.isSelected() == false)
					randomDice(2);
				if (cBox3.isSelected() == false)
					randomDice(3);
				if (cBox4.isSelected() == false)
					randomDice(4);
				if (cBox5.isSelected() == false)
					randomDice(5);

			} catch (FileNotFoundException ex) {

				ex.printStackTrace();
			}
			rollCounter();

			if (count == 1)
				printOut.setText("You still have 2 rolls left.");

			if (count == 2)
				printOut.setText("You still have 1 rolls left.");

			if (count == 3) {
				initializeArray();				
				roll.setDisable(true);
				for (int i = 1; i < array.length; i++) {
					if (array[i] == 5) {
						printOut.setText("YAHTZEE");
					}
					if (array[i] == 4) {
						printOut.setText("Four of a kind");
					}
				}
				
				 if ((array[1] == 2) || (array[2] == 2) || (array[3] == 2) || (array[4] == 2) || (array[5] == 2)
						|| (array[6] == 2)) {
					printOut.setText("Pair");
				}
				
				
				 else if ((array[1] == 3) || (array[2] == 3) || (array[3] == 3) || (array[4] == 3) || (array[5] == 3)
						|| (array[6] == 3)) {

					if ((array[1] == 2) || (array[2] == 2) || (array[3] == 2) || (array[4] == 2) || (array[5] == 2)
							|| (array[6] == 2)) {
						printOut.setText("Full House");
					} else {
						printOut.setText("There of a kind");
					}
				}
				
				if ((array[1] == 1) && (array[2] == 1) && (array[3] == 1) && (array[4] == 1) && (array[5] == 1)) {
					printOut.setText("Small Straight");
				}
				// Large Straight
				if ((array[6] == 1) && (array[2] == 1) && (array[3] == 1) && (array[4] == 1) && (array[5] == 1)) {
					printOut.setText("Large Straight");
				}
			}
		}

		);

		box.getChildren().addAll(roll, printOut);
		Scene scene = new Scene(root, 350, 200);
		root.getChildren().addAll(box, head, picBox, checkBox);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	
	private int count;

	private void rollCounter() {
		count++;
	}

	
	
	private int firstDice, seconDice, thirdDice, fourthDice, fifthDice;
	int[] array = new int[7];

	public void initializeArray() {

		array[firstDice]++;
		array[seconDice]++;
		array[thirdDice]++;
		array[fourthDice]++;
		array[fifthDice]++;

	}

	public void randomDice(int x) throws FileNotFoundException {

		Image diceImg1 = new Image(
				new FileInputStream("/Users/Adam/Desktop/LNU/1DV507/Dice/1_die.png"));
		Image diceImg2 = new Image(
				new FileInputStream("/Users/Adam/Desktop/LNU/1DV507/Dice/2_die.png"));
		Image diceImg3 = new Image(
				new FileInputStream("/Users/Adam/Desktop/LNU/1DV507/Dice/3_die.png"));
		Image diceImg4 = new Image(
				new FileInputStream("/Users/Adam/Desktop/LNU/1DV507/Dice/4_die.png"));
		Image diceImg5 = new Image(
				new FileInputStream("/Users/Adam/Desktop/LNU/1DV507/Dice/5_die.png"));
		Image diceImg6 = new Image(
				new FileInputStream("/Users/Adam/Desktop/LNU/1DV507/Dice/6_die.png"));

		
		if (x == 1) {
			Random rand = new Random();
			int random = rand.nextInt(6) + 1;

			switch (random) {
			case 1:
				img1.setImage(diceImg1);
				break;
			case 2:
				img1.setImage(diceImg2);
				break;
			case 3:
				img1.setImage(diceImg3);
				break;
			case 4:
				img1.setImage(diceImg4);
				break;
			case 5:
				img1.setImage(diceImg5);
				break;
			case 6:
				img1.setImage(diceImg6);
				break;
			default:
				break;
			}

			firstDice = random;

		}

		if (x == 2) {
			Random rand = new Random();
			int random = rand.nextInt(6) + 1;

			switch (random) {
			case 1:
				img2.setImage(diceImg1);
				break;
			case 2:
				img2.setImage(diceImg2);
				break;
			case 3:
				img2.setImage(diceImg3);
				break;
			case 4:
				img2.setImage(diceImg4);
				break;
			case 5:
				img2.setImage(diceImg5);
				break;
			case 6:
				img2.setImage(diceImg6);
				break;
			default:
				break;

			}

			seconDice = random;

		}

		if (x == 3) {
			Random rand = new Random();
			int random = rand.nextInt(6) + 1;

			switch (random) {
			case 1:
				img3.setImage(diceImg1);
				break;
			case 2:
				img3.setImage(diceImg2);
				break;
			case 3:
				img3.setImage(diceImg3);
				break;
			case 4:
				img3.setImage(diceImg4);
				break;
			case 5:
				img3.setImage(diceImg5);
				break;
			case 6:
				img3.setImage(diceImg6);
				break;
			default:
				break;
			}

			thirdDice = random;

		}
		if (x == 4) {
			Random rand = new Random();
			int random = rand.nextInt(6) + 1;

			switch (random) {
			case 1:
				img4.setImage(diceImg1);
				break;
			case 2:
				img4.setImage(diceImg2);
				break;
			case 3:
				img4.setImage(diceImg3);
				break;
			case 4:
				img4.setImage(diceImg4);
				break;
			case 5:
				img4.setImage(diceImg5);
				break;
			case 6:
				img4.setImage(diceImg6);
				break;
			default:
				break;
			}

			fourthDice = random;

		}
		if (x == 5) {
			Random rand = new Random();
			int random = rand.nextInt(6) + 1;

			switch (random) {
			case 1:
				img5.setImage(diceImg1);
				break;
			case 2:
				img5.setImage(diceImg2);
				break;
			case 3:
				img5.setImage(diceImg3);
				break;
			case 4:
				img5.setImage(diceImg4);
				break;
			case 5:
				img5.setImage(diceImg5);
				break;
			case 6:
				img5.setImage(diceImg6);
				break;
			default:
				break;
			}

			fifthDice = random;

		}

	}

}