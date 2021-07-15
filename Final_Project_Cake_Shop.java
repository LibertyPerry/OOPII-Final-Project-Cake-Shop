package application;

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
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Cylinder;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.shape.Box;


public class Final_Project_Cake_Shop extends Application{
	int cakeShape = 1; //1 = round, 2 = rectangle
	int cakeSize = 1; // 1 = small, 2 = medium, 3 = large
	int cakeTiers = 1; // Max 3 tiers
	double length = 0;
	double width = 0;
	double height = 0;
	double radius = 0;
	double height2 = 0;
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		BorderPane borderpane = new BorderPane();
		StackPane stackpane = new StackPane();
		
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
		Button size = new Button("Size");
		Button tiers = new Button("Tiers");
		Button updateCake = new Button("Update Cake");
		HBox menu = new HBox();
		menu.setSpacing(10);
		menu.setAlignment(Pos.CENTER_LEFT);
		menu.getChildren().add(shape);
		menu.getChildren().add(size);
		menu.getChildren().add(tiers);
		menu.getChildren().add(updateCake);	
		menu.setVisible(false);
		borderpane.setBottom(menu);

		//Make shape Buttons
		Button shapeRound = new Button("Round Cake");
		Button shapeRectangle = new Button("Rectangle Cake");
		HBox shapeMenu = new HBox();
		shapeMenu.getChildren().add(shapeRound);
		shapeMenu.getChildren().add(shapeRectangle);
		shapeMenu.setSpacing(5);
		shapeMenu.setAlignment(Pos.BOTTOM_RIGHT);
		shapeMenu.setVisible(false);
		stackpane.getChildren().add(shapeMenu);
		StackPane.setAlignment(shapeMenu, Pos.BOTTOM_RIGHT);
		
		//Make Size Buttons
		Button small = new Button("Small");
		Button medium = new Button("Medium");
		Button large = new Button("Large");
		HBox sizeMenu = new HBox();
		sizeMenu.getChildren().addAll(small, medium, large);
		sizeMenu.setSpacing(5);
		sizeMenu.setAlignment(Pos.BOTTOM_RIGHT);
		sizeMenu.setVisible(false);
		stackpane.getChildren().add(sizeMenu);
		StackPane.setAlignment(sizeMenu, Pos.BOTTOM_RIGHT);
		
		//Make tier Buttons 
		Button oneTier = new Button("One");
		Button twoTier = new Button("Two");
		Button threeTier = new Button("Three");
		HBox tierMenu = new HBox();
		tierMenu.getChildren().addAll(oneTier, twoTier, threeTier);
		tierMenu.setSpacing(5);
		tierMenu.setAlignment(Pos.BOTTOM_RIGHT);
		tierMenu.setVisible(false);
		stackpane.getChildren().add(tierMenu);
		StackPane.setAlignment(tierMenu, Pos.BOTTOM_RIGHT);
		
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
					cakeShape = 1;
					shapeMenu.setVisible(false);
					menu.setVisible(true);
				});
				shapeRectangle.setOnAction(e -> {
					cakeShape = 2;
					shapeMenu.setVisible(false);
					menu.setVisible(true);
				});	
			size.setOnAction(e -> {
				menu.setVisible(false);
				sizeMenu.setVisible(true);
			});
				//Size Buttons
				small.setOnAction(e -> {
					cakeSize = 1;
					sizeMenu.setVisible(false);
					menu.setVisible(true);
				});
				medium.setOnAction(e -> {
					cakeSize = 2;
					sizeMenu.setVisible(false);
					menu.setVisible(true);
				});
				large.setOnAction(e -> {
					cakeSize = 3;
					sizeMenu.setVisible(false);
					menu.setVisible(true);
				});
			tiers.setOnAction(e -> {
					menu.setVisible(false);
					tierMenu.setVisible(true);
			});
				//Tier Buttons
				oneTier.setOnAction(e -> {
					cakeTiers = 1;
					tierMenu.setVisible(false);
					menu.setVisible(true);
				});
				twoTier.setOnAction(e -> {
					cakeTiers = 2;
					tierMenu.setVisible(false);
					menu.setVisible(true);
				});
				threeTier.setOnAction(e -> {
					cakeTiers = 3;
					tierMenu.setVisible(false);
					menu.setVisible(true);
				});
			updateCake.setOnAction(e -> {
				//Size
				if(cakeSize == 1) {
					length = 150;
					width = 150;
					height = 100;
					radius = 50;
					height2 = 100;
				}else if(cakeSize == 2) {
					length = 300;
					width = 300;
					height = 200;
					radius = 100;
					height2 = 100;
				}else if(cakeSize == 3) {
					length = 450;
					width = 450;
					height = 150;
					radius = 150;
					height2 = 125;
				}
				// Shape
				if(cakeShape == 1) {
					Cylinder cake = new Cylinder(radius, height2);
					borderpane.setCenter(cake);
					
				}else if (cakeShape == 2) {
					Box cake = new Box(width, height, length);
					borderpane.setCenter(cake);
					
				}
				//Tiers
				if(cakeTiers == 1) {
					
				}else if(cakeTiers == 2) {
					
				}else if(cakeTiers == 3) {
					
				}
				
			});
		borderpane.getChildren().add(pane);
		stackpane.getChildren().add(borderpane);
		Scene scene = new Scene(stackpane, 800, 400);
		primaryStage.setTitle("Cake Shop");
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}
	public static void main(String[] args) {
		launch(args);
	}

}
