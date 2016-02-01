package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements EventHandler<ActionEvent> {

	@FXML
	private TextField fxtxtUserName;

	@FXML
	private Button fxbtnLogin;

	@FXML
	private Label fxlblLoginMessage;

	@FXML
	private PasswordField fxtxtPassword;

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		// System.out.println("At the top!");
		if (event.getSource() == fxtxtUserName) {
			System.out.println("at a1: " + event.getSource().getClass());
			System.out.println("at a2: " + fxtxtUserName.getText());
		} else if (event.getSource() == fxbtnLogin) {

			System.out.println("at a3: " + event.getSource().getClass());
			System.out.println("at a4: " + fxbtnLogin.getText());
		}

		String userName = fxtxtUserName.getText().toString();
		// System.out.println("Accepted User Name: " + userName);
		String pssd = fxtxtPassword.getText().toString();
		 //System.out.println("Accepted Password: " + pssd);

		if ("Kibrom".equals(userName) && "123".equals(pssd)) {
			fxlblLoginMessage.setText("Login successful");
		} else {
			fxlblLoginMessage.setText("Login Failure!");
		}

	}

}
