import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Cylinder;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.shape.Box;


public class Final_Project_Cake_Shop extends Application{
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		BorderPane borderpane = new BorderPane();
		//Input Order Name
		BorderPane paneForName = new BorderPane();
		paneForName.setPadding(new Insets(5, 5, 5, 5));
		paneForName.setStyle("-fx-border-color: black");
		paneForName.setLeft(new Label("Enter Name for Order: "));
		TextField name = new TextField();
		name.setAlignment(Pos.TOP_LEFT);
		paneForName.setCenter(name);
		borderpane.setTop(paneForName);
		
		//Make menu Buttons
		Button shape = new Button("Shape");
		Button tiers = new Button("Tiers");
		Button size = new Button("Size");
		HBox menu = new HBox();
		menu.setSpacing(10);
		menu.setAlignment(Pos.CENTER_LEFT);
		menu.getChildren().add(shape);
		menu.getChildren().add(tiers);
		menu.getChildren().add(size);
		borderpane.setBottom(menu);
		menu.setVisible(false);
		//Make shape Buttons
		Button shapeRound = new Button("Round Cake");
		Button shapeRectangle = new Button("Rectangle Cake");
		HBox shapeMenu = new HBox();
		shapeMenu.getChildren().add(shapeRound);
		shapeMenu.getChildren().add(shapeRectangle);
		shapeMenu.setSpacing(5);
		shapeMenu.setAlignment(Pos.CENTER_RIGHT);
		shapeMenu.setVisible(false);
		borderpane.setRight(shapeMenu);
		//Make Cake Shapes
		
		//Event Handlers
		name.setOnAction(e -> {
			name.setVisible(false);
			paneForName.setVisible(false);
			Text Ordername = new Text(0, 23, " ");
			Ordername.setText("Order Name: " + name.getText());
			Ordername.setFont(Font.font("Courier", 25));
			Ordername.setFill(Color.BLACK);
			pane.getChildren().add(Ordername);
			menu.setVisible(true);
		});
			//Menu Buttons
			shape.setOnAction(e -> {
				menu.setVisible(false);
				shapeMenu.setVisible(true);
			});
				//Shape Buttons
				shapeRound.setOnAction(e -> {
				
				});
				shapeRectangle.setOnAction(e -> {
					
				});
		borderpane.getChildren().add(pane);
		Scene scene = new Scene(borderpane, 800, 400);
		primaryStage.setTitle("Cake Shop");
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}
	public static void main(String[] args) {
		launch(args);
	}

}
