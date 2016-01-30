package application;

import java.awt.Color;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("JavaFx Welcome");
			GridPane grid = new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setVgap(10);
			grid.setHgap(10);
			grid.setPadding(new Insets(25, 25, 25, 25));

			Text sceneTitle = new Text("Welcome");
			sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			sceneTitle.setId("welcome");

			grid.add(sceneTitle, 0, 0, 2, 1);

			//grid.setGridLinesVisible(true);

			Label lbluserName = new Label("User Name:");
			grid.add(lbluserName, 0, 1);

			TextField txtUserName = new TextField();
			grid.add(txtUserName, 1, 1);

			Label lblpssword = new Label("Password:");
			grid.add(lblpssword, 0, 2);

			PasswordField txtpssword = new PasswordField();
			grid.add(txtpssword, 1, 2);

			Button btnSignin = new Button("Sign In");
			// Button btnLogOut = new Button("Log out");
			HBox hbxbtn = new HBox(10);
			hbxbtn.setAlignment(Pos.BOTTOM_RIGHT);
			hbxbtn.getChildren().add(btnSignin);
			// hbxbtn.getChildren().add(btnLogOut);
			grid.add(hbxbtn, 1, 4);

			Text actionText = new Text();
			actionText.setId("actionText");
			grid.add(actionText, 1, 6);

			btnSignin.setOnAction(e -> {
				actionText.setText("Button Clicked");
				actionText.setFill(javafx.scene.paint.Color.FIREBRICK);
				btnSignin.setText("Button Clicked");
			});

			Scene scene = new Scene(grid, 350, 320);
			scene.getStylesheets().add(getClass().getResource("login.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
