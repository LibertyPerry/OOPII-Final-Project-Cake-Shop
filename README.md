# OOPII-Final-Project-Cake-Shop

## Synopsis
This project is disigned for a cake shop. A custom can simply run the program and design a cake (ex. Flavor, Cake Shape, Color of frosting and trim)

## Motivation
I wanted to build this project so that the customer could see a rough image of what the cake they made would look like, and the price that the cake would be. 
## How to run
To run this project you just need the file, and access to Javafx to run the program.
![image](https://user-images.githubusercontent.com/77160908/126360772-09876219-2db7-494d-91ec-7c5ffd31073e.png)
[This is and example of the code running]
## Code Example
I am proud of this snippet of code because when the "Finshed" button is pressed this code will display the final screen.
```
finsh.setOnAction(e -> {
				menu.setVisible(false);
				double price = priceRate * cakeTiers * 10.0;
				String stringPrice = String.valueOf(price);
				String CakeFlavor = new String(" ");
				// 1 = Vanilla, 2 = Chocolate, 3 = Strawberry
				if(cakeFlavor == 1) {
					CakeFlavor = "Vanilla";
				}else if(cakeFlavor == 2) {
					CakeFlavor = "Chocolate";
				}else if(cakeFlavor == 3) {
					CakeFlavor = "Strawberry";
				}
				Text cakeSummary = new Text("The Total Price of Your "+ cakeTiers+ " tier " + CakeFlavor + " Cake is : $" + stringPrice + "0");
				cakeSummary.setFont(Font.font("Times New Roman", 35));
				stackpane.getChildren().add(cakeSummary);
				StackPane.setAlignment(cakeSummary, Pos.BOTTOM_CENTER);
			});
```

 ## Contributors
 I wrote this code by myself got my final project. 
