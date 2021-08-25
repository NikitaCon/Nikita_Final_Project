package application;
	
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//arraylist to store data of players
			ArrayList <Player> player = new ArrayList<Player>();
			//Code for javafx Screen
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Sample.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			root.setId("pane");
			//Setting Screen Size to 600 by 400
			Scene scene = new Scene(root,600,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			//Giving value to buttons with the help of id
			Button add = (Button) root.lookup("#add");
			Button remove = (Button) root.lookup("#remove");
			Button search = (Button) root.lookup("#search");
			
			//Giving value to textfield with the help of id
			TextField addName = (TextField) root.lookup("#AddName");
			TextField addTeam = (TextField) root.lookup("#AddTeam");
			TextField removeName = (TextField) root.lookup("#RemoveName");
			TextField searchName = (TextField) root.lookup("#SearchName");
			
			//When the add button will be pressed
			add.setOnAction(e->{
				//if any of the field will be empty will show the error message
				if(addName.getText().isEmpty() || addTeam.getText().isEmpty())
				{
					Alert alert = new Alert(Alert.AlertType.INFORMATION);
					alert.initStyle(StageStyle.UTILITY);
					alert.setTitle("Error");
					alert.setHeaderText(null);
					alert.setContentText("Please Fill All Details");
					alert.showAndWait();
				}
				else
				{
					boolean flag = false;
					//if arraylist already have name you entered it will not store and display the error message
					for(int i=0;i<player.size();i++)
					{
						if(player.get(i).getName().equalsIgnoreCase(addName.getText()))
						{
							Alert alert = new Alert(Alert.AlertType.INFORMATION);
							alert.initStyle(StageStyle.UTILITY);
							alert.setTitle("Error");
							alert.setHeaderText(null);
							alert.setContentText("This Name is already added");
							alert.showAndWait();
							flag = true;
						}
						
					}
					//if name is not already present in the list
					if(!flag)
					{
						//Player will be added to the arraylist
						player.add(new Player(addName.getText(),addTeam.getText()));
						//Success Message will be displayed that Player is added
						Alert alert = new Alert(Alert.AlertType.INFORMATION);
						alert.initStyle(StageStyle.UTILITY);
						alert.setTitle("Success");
						alert.setHeaderText(null);
						alert.setContentText("Player Added Successfully");
						alert.showAndWait();
					}
				}
			});
			//When remove button will be pressed
			remove.setOnAction(e->{
				//if the textfield is empty than it will display error message
				if(removeName.getText().isEmpty())
				{
					Alert alert = new Alert(Alert.AlertType.INFORMATION);
					alert.initStyle(StageStyle.UTILITY);
					alert.setTitle("Error");
					alert.setHeaderText(null);
					alert.setContentText("Please Enter Name");
					alert.showAndWait();
				}
				else
				{
					//If the entered name is present in the list, than it will remove that player details
					boolean flag = false;
					String name = removeName.getText();
					for(int i=0;i<player.size();i++)
					{
						if(name.equalsIgnoreCase(player.get(i).getName()))
						{
							player.remove(i);
							flag = true;
							break;
						}
					}
					if(flag)
					{
						//If the player found than it will display the success message
						Alert alert = new Alert(Alert.AlertType.INFORMATION);
						alert.initStyle(StageStyle.UTILITY);
						alert.setTitle("Success");
						alert.setHeaderText(null);
						alert.setContentText("Player Removed Successfully");
						alert.showAndWait();
					}
					else
					{
						//if player is not present than it will display error message
						Alert alert = new Alert(Alert.AlertType.INFORMATION);
						alert.initStyle(StageStyle.UTILITY);
						alert.setTitle("Error");
						alert.setHeaderText(null);
						alert.setContentText("Player Not Found in the list");
						alert.showAndWait();
					}
				}
				
			});
			
			//if search button is pressed
			search.setOnAction(e->{
				//It will show error message if textfield is empty
				if(searchName.getText().isEmpty())
				{
					Alert alert = new Alert(Alert.AlertType.INFORMATION);
					alert.initStyle(StageStyle.UTILITY);
					alert.setTitle("Error");
					alert.setHeaderText(null);
					alert.setContentText("Please Enter Name");
					alert.showAndWait();
				}
				else
				{
					boolean flag = false;
					String name = searchName.getText();
					//it will search for the given name
					for(int i=0; i<player.size();i++)
					{
						//if the given name is present than it will display all the details of the player
						if(name.equalsIgnoreCase(player.get(i).getName()))
						{
							Alert alert = new Alert(Alert.AlertType.INFORMATION);
							alert.initStyle(StageStyle.UTILITY);
							alert.setTitle("Player Found");
							alert.setHeaderText(null);
							alert.setContentText("Player Name: "+name+"\nPlayer Team: "+player.get(i).getTeam());
							alert.showAndWait();
							flag = true;
							break;
						}
					}
					//if player is not present than it will display the error message
					if(!flag)
					{
						Alert alert = new Alert(Alert.AlertType.INFORMATION);
						alert.initStyle(StageStyle.UTILITY);
						alert.setTitle("Error");
						alert.setHeaderText(null);
						alert.setContentText("Player Not Found in the list");
						alert.showAndWait();
					}
				}
			});
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
