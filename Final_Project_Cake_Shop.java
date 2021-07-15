import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.shape.Box;
import javafx.scene.shape.Circle;


public class Final_Project_Cake_Shop extends Application{
	int cakeShape = 1; //1 = round, 2 = rectangle
	int cakeSize = 1; // 1 = small, 2 = medium, 3 = large
	int cakeTiers = 1; // Max 3 tiers
	int cakeFlavor = 1; // 1 = Vanilla, 2 = Chocolate, 3 = Strawberry
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
		Button flavor = new Button("Flavor");
		Button decorate = new Button("Decorate");
		Button updateCake = new Button("Update Cake");
		Button finsh = new Button("Finsh & Get Price");
		HBox menu = new HBox();
		menu.setSpacing(10);
		menu.setAlignment(Pos.CENTER_LEFT);
		menu.getChildren().add(shape);
		menu.getChildren().add(size);
		menu.getChildren().add(tiers);
		menu.getChildren().add(flavor);
		menu.getChildren().add(decorate);
		menu.getChildren().add(updateCake);
		menu.getChildren().add(finsh);
		menu.setVisible(false);
		borderpane.setBottom(menu);

		//Make shape Buttons
		Button shapeRound = new Button("Round Cake");
		Button shapeRectangle = new Button("Rectangle Cake");
		VBox shapeMenu = new VBox();
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
		VBox sizeMenu = new VBox();
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
		VBox tierMenu = new VBox();
		tierMenu.getChildren().addAll(oneTier, twoTier, threeTier);
		tierMenu.setSpacing(5);
		tierMenu.setAlignment(Pos.BOTTOM_RIGHT);
		tierMenu.setVisible(false);
		stackpane.getChildren().add(tierMenu);
		StackPane.setAlignment(tierMenu, Pos.BOTTOM_RIGHT);
		
		
		
		//Make Flavor Buttons
		Button vanilla = new Button("Vanilla");
		Button chocolate = new Button("Chocolate");
		Button strawberry = new Button("Strawberry");
		VBox flavorMenu = new VBox();
		flavorMenu.getChildren().addAll(vanilla, chocolate, strawberry);
		flavorMenu.setSpacing(5);
		flavorMenu.setAlignment(Pos.BOTTOM_RIGHT);
		flavorMenu.setVisible(false);
		stackpane.getChildren().add(flavorMenu);
		StackPane.setAlignment(flavorMenu, Pos.BOTTOM_RIGHT);
		
		//Make Decoration Buttons
		Button frosting = new Button("Frosting");
		Button trim = new Button("Trim");
		Button backToMainMenu = new Button("Back to Menu");
		VBox decorationMenu = new VBox();
		decorationMenu.getChildren().addAll(frosting, trim, backToMainMenu);
		decorationMenu.setSpacing(5);
		decorationMenu.setAlignment(Pos.BOTTOM_LEFT);
		decorationMenu.setVisible(false);
		stackpane.getChildren().add(decorationMenu);
		StackPane.setAlignment(decorationMenu, Pos.BOTTOM_LEFT);
			//Make Frosting Buttons
		
		
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
			//Shape Buttons
			shape.setOnAction(e -> {
				menu.setVisible(false);
				shapeMenu.setVisible(true);
			});
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
			//Size Buttons
			size.setOnAction(e -> {
				menu.setVisible(false);
				sizeMenu.setVisible(true);
			});
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
			//Tier Buttons
			tiers.setOnAction(e -> {
					menu.setVisible(false);
					tierMenu.setVisible(true);
			});
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
			//Flavor Buttons
			flavor.setOnAction(e -> {
				menu.setVisible(false);
				flavorMenu.setVisible(true);
			});
				vanilla.setOnAction(e -> {
					cakeFlavor = 1;
					flavorMenu.setVisible(false);
					menu.setVisible(true);
				});
				chocolate.setOnAction(e -> {
					cakeFlavor = 2;
					flavorMenu.setVisible(false);
					menu.setVisible(true);
				});
				strawberry.setOnAction(e -> {
					cakeFlavor = 3;
					flavorMenu.setVisible(false);
					menu.setVisible(true);
				});
				
			updateCake.setOnAction(e -> {
				stackpane.getChildren().remove(stackpane.lookup("cake"));
				stackpane.getChildren().remove(stackpane.lookup("cake2"));
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
					height = 175;
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
					Circle cake = new Circle(400, -200, radius);
					Label tierOneLabel = new Label("Tier One", cake);
					tierOneLabel.setContentDisplay(ContentDisplay.TOP);
					tierOneLabel.setTextFill(Color.BLACK);
					pane.getChildren().add(cake);
					stackpane.getChildren().add(tierOneLabel);
					StackPane.setAlignment(tierOneLabel, Pos.CENTER_LEFT);
					//Tiers
					if(cakeTiers >= 2) {
						Circle cake2 = new Circle(400, -400, (radius / 2));
						Label tierTwoLabel = new Label("Tier Two", cake2);
						tierTwoLabel.setContentDisplay(ContentDisplay.TOP);
						tierTwoLabel.setTextFill(Color.BLACK);
						pane.getChildren().add(cake2);
						stackpane.getChildren().add(tierTwoLabel);
						StackPane.setAlignment(tierTwoLabel, Pos.CENTER);
					}
					if(cakeTiers == 3) {
						Circle cake3 = new Circle(400, -600, (radius / 4));
					}
				}else if (cakeShape == 2) {
					Rectangle cake = new Rectangle(400, -200, width, height);
					Label tierOneLabel = new Label("Tier One", cake);
					tierOneLabel.setContentDisplay(ContentDisplay.TOP);
					tierOneLabel.setTextFill(Color.BLACK);
					pane.getChildren().add(cake);
					borderpane.setCenter(tierOneLabel);
					//Tiers
					if(cakeTiers == 1) {
						
					}else if(cakeTiers == 2) {
						
					}else if(cakeTiers == 3) {
						
					}
				}
				//Flavor
				//Frosting
				
			});
		borderpane.getChildren().add(pane);
		stackpane.getChildren().add(borderpane);
		Scene scene = new Scene(stackpane, 800, 700);
		scene.setFill(Color.CORNFLOWERBLUE);
		primaryStage.setTitle("Cake Shop");
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}
	public static void main(String[] args) {
		launch(args);
	}

}
